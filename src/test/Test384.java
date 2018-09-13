package test;

import java.util.*;

/**
 * Created by zsh_paradise on 2018/9/13.
 * 打乱一个没有重复元素的数组。

 示例:

 // 以数字集合 1, 2 和 3 初始化数组。
 int[] nums = {1,2,3};
 Solution solution = new Solution(nums);

 // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
 solution.shuffle();

 // 重设数组到它的初始状态[1,2,3]。
 solution.reset();

 // 随机返回数组[1,2,3]打乱后的结果。
 solution.shuffle();
 */
public class Test384 {

    private List<Integer> income = new LinkedList<>();

    public Test384(int[] nums){
        for(int num :nums){
            this.income.add(num);
        }
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        Iterator<Integer> iterator = income.iterator();
        int i = 0  ;
        int[] arr = new int[income.size()];
        while (iterator.hasNext()){
            arr[i] = (int)iterator.next();
            i++;
        }
        return  arr;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random random = new Random();
        int[] arr = reset();
        for (int i = arr.length-1; i >= 0  ; i--) {
            exchange(arr,random.nextInt(i+1),i);
        }
        return  arr;

    }

    private void exchange(int[] arr, int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}
