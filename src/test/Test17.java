package test;

import java.util.ArrayList;
import java.util.List;

/**电话号码的字母组合
 * Created by zsh_paradise on 2019/2/22.
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。

 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。

 输入："23"
 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

 回溯法的特点
 1.选择，  如何选择十分重要。
 2.条件  判断条件不符合条件的情况就要回溯
 3.结束   需要一个全局变量，并且还会作为一个参数传给递归函数
 */
public class Test17 {
    private  static  String[] a =new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    private static  StringBuffer sb = new StringBuffer();
     public  static  List<String> letterCombinations(String digits) {
        if(digits.length() ==0){
            return null ;
        }
        List<String> result = new ArrayList<>();
        decodeNum(digits,0,result);
        return result   ;
    }

    public static  void decodeNum(String digits,int n , List<String> result){
        if(digits.length() ==n){
            result.add(sb.toString());
            return ;
        }
        for(int i=0 ;i<a[digits.charAt(n)-'0'].length();i++){
            sb.append(a[digits.charAt(n)-'0'].charAt(i));
            decodeNum(digits,n+1,result);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        String s = "23";
        List<String> ss = letterCombinations(s);
        System.out.println("finish");
    }
}
