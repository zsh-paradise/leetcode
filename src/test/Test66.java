package test;

import java.math.BigInteger;

/**
 * Created by zsh_paradise on 2018/9/14.
 */
public class Test66 {
    public  static int[] plusOne(int[] digits) {
        long x  = 0 ;
        for(int i =0 ;i<digits.length;i++){
            x +=digits[i]*Math.pow(10,digits.length-i-1);
        }
        x = x +1 ;
        String[] arr = Long.toString(x).split("");
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            result[i] = Integer.parseInt(arr[i]);
        }
        return  result;
    }


    public static void main(String[] args) {
        int[] test ={9,8,7,6,5,4,3,2,1,0};
        plusOne(test);
    }
}
