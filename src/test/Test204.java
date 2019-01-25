package test;

/**
 * Created by zsh_paradise on 2018/11/20.
 * 统计所有小于非负整数 n 的质数的数量。

 示例:

 输入: 10
 输出: 4
 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 埃拉托斯特尼筛法Sieve of Eratosthenes
 埃拉托斯特尼
 */
public class Test204 {
    public static  int countPrimes(int n) {
        Boolean[] arr = new Boolean[n-1];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = true;
        }
        //1不是质数
        arr[0] = false;
        int count =0 ;
        int temp = (int) Math.sqrt(n);
        for (int i = 2; i <= temp ; i++) {
            if(arr[i-1]){
                for(int j =i*i; j<n;j+=i){
                    arr[j-1] = false;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]){++count;}
        }
        return  count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
