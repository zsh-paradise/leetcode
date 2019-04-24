package test;

/**
 * Created by zsh_paradise on 2019/3/8.
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。

 示例：

 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()

 sumRange(0, 2) -> 1
 sumRange(2, 5) -> -1
 sumRange(0, 5) -> -3
 */

public class Test303 {

    private int[] sums ;

    public Test303(int[] nums) {
        sums = new int[nums.length];
        if(nums.length ==0){
            return;
        }
        sums[0] = nums[0];
        for(int i = 1 ; i<nums.length;i++){
            sums[i] +=sums[i-1]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if(i ==0){
            return sums[j];
        }else {
            return sums[j]-sums[i-1];
        }
    }
}
