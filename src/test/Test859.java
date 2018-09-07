package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsh_paradise on 2018/9/6.
 * 给定两个由小写字母构成的字符串 A 和 B ，
 * 只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。

 示例 1：
 输入： A = "ab", B = "ba"
 输出： true
 示例 2：
 输入： A = "ab", B = "ab"
 输出： false
 示例 3:
 输入： A = "aa", B = "aa"
 输出： true
 示例 4：
 输入： A = "aaaaaaabc", B = "aaaaaaacb"
 输出： true
 示例 5：
 输入： A = "", B = "aa"
 输出： false


 提示：

 0 <= A.length <= 20000
 0 <= B.length <= 20000
 A 和 B 仅由小写字母构成。
 */
public class Test859 {
    //这个逻辑少了判断如果都是a
    public static boolean buddyStrings(String A, String B) {
        boolean bl = false;
        int times  = 0 ;
        String[] arrA = A.split("");
        String[] arrB = B.split("");
        int size = arrA.length>=arrB.length?arrB.length: arrA.length ;
        for (int i = 0; i <size-1 ; i++) {
            if(arrA[i].equals(arrB[i+1])&&arrA[i+1].equals(arrB[i])&&!arrA[i].equals(arrB[i])){
                bl=  true;
                times ++ ;
            }
        }
        if(times >1){
            bl = false ;
        }
        return bl;
    }


    public static boolean buddyStrings1(String A, String B) {
        if(A.length()!= B.length()){
            return  false ;
        }
        if(A.equals(B)){
            int[] count = new int[26];
            for(int i= 0 ;i <A.length(); ++i){
                count[A.charAt(i)-'a']++;
            }
            for(int c : count){
                if(c>1 ) {
                    return true ;
                }
            }
            return false ;


        }else{
            int first = -1 ,second = -1 ;
            for (int i = 0; i <A.length() ; i++) {
                if(A.charAt(i) !=  B.charAt(i)){
                    if(first == -1 ){
                        first = i ;
                    }
                    else if(second == -1 ){
                        second = i ;
                    } else {
                        return  false ;
                    }
                }
            }
            return(second != -1 && A.charAt(first) == B.charAt(second) &&
                    A.charAt(second) == B.charAt(first));
        }



    }


    public static void main(String[] args) {
        String A = "aaaaacd" , B="aaaaadc";
        System.out.println(buddyStrings1(A,B));
    }
}
