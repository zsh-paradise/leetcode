package test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列
 * Created by zsh_paradise on 2019/2/28.
 *
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。

 示例:

 输入: [1,2,3]
 输出:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]
 */
public class Test46 {
    public List<List<Integer>> permute(int[] nums) {
        int num = nums.length;
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        lists.add(list);
        List<Integer> list1 = new LinkedList<>();
        list1.remove(0);

        return lists ;
    }
}
