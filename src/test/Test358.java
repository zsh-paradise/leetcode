package test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，
 * 使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 例如：
 输入: 二叉搜索树:
     5
 /   \
 2     13
 输出: 转换为累加树:
    18
 /   \
 20     13
 * Created by zsh_paradise on 2019/3/15.
 *
 */
public class Test358 {
    ArrayList<Integer> list = new ArrayList<>();
    private void inorder(TreeNode root){
        if(root ==null){
            return ;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.left);
    }

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int min = Integer.MAX_VALUE;

        Integer[] arr = (Integer[]) list.toArray(new Integer[0]);
        Arrays.sort(arr);
        for(int i = 0 ; i<list.size()-1;i++){
            min =Math.min(min,Math.abs(arr[i+1]-arr[i]));
        }
        return min ;

    }
}
