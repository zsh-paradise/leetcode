package test;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

 注意：给定 n 是一个正整数。

 示例 1：

 输入： 2
 输出： 2
 解释： 有两种方法可以爬到楼顶。
 1.  1 阶 + 1 阶
 2.  2 阶
 示例 2：

 输入： 3
 输出： 3
 解释： 有三种方法可以爬到楼顶。
 1.  1 阶 + 1 阶 + 1 阶
 2.  1 阶 + 2 阶
 3.  2 阶 + 1 阶
 * Created by zsh_paradise on 2018/11/19.
 * 动态规划 就是使用内层来获取存储值，
 */
public class Test70 {
    public int climbStairs(int n) {
        if(n==1){
            return 1 ;
        }
        int[] num = new int[n+1];
        num[0] =0;
        num[1] =1;
        num[2] =2 ;
        for (int i = 3; i <n ; i++) {
            num[i]= num[i-2] +num[i-1];
        }
        return  num[n];
    }
}
