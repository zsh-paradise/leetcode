package test;

/**正则表达式
 * Created by zsh_paradise on 2019/4/8.
 * 给定一个字符串 (s) 和一个字符模式 (p)。实现支持 '.' 和 '*' 的正则表达式匹配。

 '.' 匹配任意单个字符。
 '*' 匹配零个或多个前面的元素。
 匹配应该覆盖整个字符串 (s) ，而不是部分字符串。

 说明:

 s 可能为空，且只包含从 a-z 的小写字母。
 p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
 示例 1:

 输入:
 s = "aa"
 p = "a"
 输出: false
 解释: "a" 无法匹配 "aa" 整个字符串。
 示例 2:

 输入:
 s = "aa"
 p = "a*"
 输出: true
 解释: '*' 代表可匹配零个或多个前面的元素, 即可以匹配 'a' 。因此, 重复 'a' 一次, 字符串可变为 "aa"。
 示例 3:

 输入:
 s = "ab"
 p = ".*"
 输出: true
 解释: ".*" 表示可匹配零个或多个('*')任意字符('.')。
 示例 4:

 输入:
 s = "aab"
 p = "c*a*b"
 输出: true
 解释: 'c' 可以不被重复, 'a' 可以被重复一次。因此可以匹配字符串 "aab"。
 示例 5:

 输入:
 s = "mississippi"
 p = "mis*is*p*."
 输出: false
 这个应该是仿照正则的算法思想来出题的。
 具体的集体思路：
 4月8号。  无
 */
public class Test10 {
    public static boolean isMatch(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        boolean[][] memory = new  boolean[sLen+1][pLen+1];
        memory[0][0] = true;
        for(int i = 0  ; i <=sLen ; i++){
            for(int j = 1 ; j <=pLen; j ++){
                if('*' == p.charAt(j - 1)){
                    memory[i][j] = memory[i][j-2]||((i>0&&(s.charAt(i-1)==p.charAt(j-2))||p.charAt(j-2)=='.')&&memory[i-1][j]);
                }else {
                    memory[i][j] = i>0&&(s.charAt(i-1) ==p.charAt(j-1) ||p.charAt(j-1)=='.')&&memory[i-1][j-1];
                }
            }
        }
        System.out.println("==========================");
        return memory[sLen][pLen];
    }


    public static void main(String[] args) {
        String a ="abnabn" , b ="a.abn*b";
        System.out.println(isMatch(a,b));
    }

    /***
     * 这个思路就很清楚，把整个字符串变成数组，我们需要对别的就是每次数组的第一个是否匹配
     * 如果当出现*的时候，p跳2个游标，就是跳过*的位置，或者s跳一个游标进行对比
     * 通常的情况就是s跳一个游标，p跳一个游标。
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch1(String s, String p) {
        if(s==null || p==null){
            return false;
        }
        char[] sc=s.toCharArray();
        char[] pc=p.toCharArray();
        return dp(sc,pc,0,0);
    }
    boolean dp(char[] s,char[] p,int i,int j){
        int n=s.length;
        int m=p.length;
        if(j>=m) {
            return i==n;
        }
        //判断第一个字符匹配结果
        boolean j_match=i<n &&(s[i]==p[j] || p[j]=='.');
        if(j+1<m && p[j+1]=='*'){
            return dp(s,p,i,j+2)||(j_match &&dp(s,p,i+1,j));
        }
        return j_match && dp(s,p,i+1,j+1);
    }
}

