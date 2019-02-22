package test;

/**
 * Created by zsh_paradise on 2019/2/13.
 * 最长回文子串
 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 */
public class Test5 {
    public String longestPalindrome(String s) {

        if(s.isEmpty()){
            return  "null";
        }
        for(int i = s.length();i>0;i--){
            for(int j =0 ; i+j<=s.length();j++){
                String temp = s.substring(j,j+i);
                if(ifPalindrome(temp)){
                    return temp;
                }
            }
        }
        return s.substring(0,1);
    }

    public static  boolean ifPalindrome(String s){
        for(int i = 0 ; i <s.length()/2;i++){
            if(s.charAt(i) !=s.charAt(s.length()-i-1)){
                return false ;
            }
        }
        return  true ;
    }

    public static void main(String[] args) {
        String s = "babad";
        if(1>2){
            System.out.println("1");
        }else  if(1 <2){
            System.out.println("2");
        }else if(2<3){
            System.out.println("3");
        }
    }
}
