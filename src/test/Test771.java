package test;

/**宝石和石头
 * Created by zsh_paradise on 2019/2/25.
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。

 J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。

 示例 1:

 输入: J = "aA", S = "aAAbbbb"
 输出: 3
 示例 2:

 输入: J = "z", S = "ZZ"
 输出: 0
 思路很简单， 但是是否存在更好的思路

 */
public class Test771 {
    public static int numJewelsInStones(String J, String S) {
        int result = 0  ;
        int[] arr = new int[S.length()];
        char[] Jchar = J.toCharArray();
        char[] Schar = S.toCharArray();
        int Jsize = Jchar.length;
        boolean[] bl = new boolean[128];
        for(int i = 0 ;i<Jchar.length;i++){
            bl[Jchar[i]] =true ;
        }
        for(int i = 0 ; i<Schar.length;i++){
            if(bl[Schar[i]]){
                result++;
            }
        }

        return  result  ;
    }


    public static void main(String[] args) {
        String s = "aA";
        String j = "aAAvBBAA";
        int num = numJewelsInStones(s,j);
        System.out.println(num);
    }
}
