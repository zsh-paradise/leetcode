package test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zsh_paradise on 2018/8/29.
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

 示例:

 给定 nums = [2, 7, 11, 15], target = 9

 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]
 */
public class Test1 {
    //时间复杂度O(n*n)  空间复杂度 O（1）
    public static int[] twoSum1(int[] nums, int target) {
        int size = nums.length;
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j <size ; j++) {
                if (nums[i] + nums[j] == target) {
                    return  new int[]{i,j};
                }
            }
        };
        throw  new IllegalArgumentException("no solution");
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>(16);
        //遍历一次，把所有的数据放到哈希表中。可以将第二次的查询时间O(n)变成O（1）
        for (int i = 0; i < nums.length ; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i <nums.length ; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        throw new IllegalArgumentException("no solution");
    }

    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>(16);
        //遍历一次，把所有的数据放到哈希表中。并且在已经放到数据的里的数据进行查找。
        for (int i = 0; i < nums.length ; i++) {
            int tow = target-nums[i];
            if(map.containsKey(tow)){
                return new int[]{map.get(tow),i};
            }
            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("no solution");
    }

    public static void main(String[] args) {
        int[] num={2,4,3};
        int[] nums = twoSum2(num,6);
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }
}
