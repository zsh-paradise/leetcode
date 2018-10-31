package test;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zsh_paradise on 2018/10/15.
 * 给定一个二叉树，找出其最大深度。

 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

 说明: 叶子节点是指没有子节点的节点。
      树的遍历是把一个层级节点的数据方法当Linklist中，然后一个一个的拿出来再删除。
      每个节点又通过lift和right来分析。 最终扫描到需要的数据。
 示例：
 给定二叉树 [3,9,20,null,null,15,7]，
 */
public class Test104 {
    public int maxDepth(TreeNode root) {
        if(root ==null){
            return 0 ;
        }
        int res = 0 ;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            ++res;
            int n = q.size();
            for(int i = 0 ;i<n;i++){
                TreeNode t =q.poll();
                if(t.left != null){
                    q.offer(t.left);
                }
                if(t.right != null){
                    q.offer(t.right);
                }
            }
        }
        return res ;
    }
}
