package test;

import java.util.Arrays;

/**
 * Created by zsh_paradise on 2019/3/28.
 * 已知一个数组，输出数组的排序数组
 *  1.先备份一个顺序数组
 *  2.把原数组的每个数据和顺序数组进行对比，使用二分查找找到对应的位置
 *  3.计算出了排序的位置。
 */
public class Test506 {
    public String[] findRelativeRanks(int[] nums) {
        int length = nums.length;
        int[] nums1 = Arrays.copyOf(nums,length);
        String[] result = new String[length];
        Arrays.sort(nums1);
        for (int i = 0; i <length ; i++) {
            int index = Arrays.binarySearch(nums1,nums[i]);
            result[i] =   length-index+"";
            if(index == length-1){
                result[i] ="Gold Medal";
            }
            if(index ==length-2){
                result[i] ="Silver Medal";

            }
            if(index ==length-3){
                result[i] ="Silver Medal";
            }

        }
        return  result;
    }
}
