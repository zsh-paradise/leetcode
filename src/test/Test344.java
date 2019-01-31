package test;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by zsh_paradise on 2018/10/9.
 */
public class Test344 {
    public String reverseString(String s) {
        String[] arr = s.split("");
        StringBuffer sb = new StringBuffer();
        for(String snew :arr){
            sb.append(snew);

        }

        return sb.reverse().toString();
    }
}
