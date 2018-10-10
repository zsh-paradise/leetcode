package test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by zsh_paradise on 2018/10/9.
 */
public class Test242 {
    public static boolean  isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i <s.length() ; i++) {
            System.out.println("------------");
            System.out.println(s.charAt(i));
            System.out.println(s.charAt(i)-'a');

            alphabet[s.charAt(i)-'a']++;
            System.out.println("-------------");
        }
        System.out.println(Arrays.toString(alphabet));
        for(int j =0 ; j<t.length();j++){
            System.out.println("------------");
            System.out.println(s.charAt(j));
            System.out.println(s.charAt(j)-'a');
            alphabet[t.charAt(j)-'a']--;
            System.out.println("------------");
        }
        System.out.println(Arrays.toString(alphabet));
        return true ;
    }

    public static void main(String[] args) {
        String s ="anagram";
        String t ="nagaram";
        isAnagram(s,t);


    }
}
