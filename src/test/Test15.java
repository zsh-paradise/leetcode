package test;

import java.util.*;

/**
 * 三数之和
 * Created by zsh_paradise on 2019/1/28.
 *
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

 注意：答案中不可以包含重复的三元组。

 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

 满足要求的三元组集合为：
 [
 [-1, 0, 1],
 [-1, -1, 2]
 ]
 */
public class Test15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result  = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {

            List<Integer> list = new ArrayList<>(3);
        }
        return  result ;
    }
}
