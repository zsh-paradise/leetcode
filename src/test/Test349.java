package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zsh_paradise on 2018/10/31.
 *
 * 给定两个数组，编写一个函数来计算它们的交集。

 示例 1:

 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 输出: [2]
 示例 2:

 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 输出: [9,4]
 说明:

 输出结果中的每个元素一定是唯一的。
 我们可以不考虑输出结果的顺序。
 */
public class Test349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int cur1 = 0 , cur2= 0 ;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList();
        while(cur1< nums1.length && cur2<nums2.length){
            int num1 =nums1[cur1];
            int num2 = nums2[cur2];
            if(num1 == num2){
                list.add(num1);
                cur1++;
                cur2++;
            }else if(num1 <num2){
                cur1++;
            }else{
                cur2++;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i]=list.get(i);
        }
        return  result;
    }
}
