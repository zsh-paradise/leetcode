package test;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。

 假设一个二叉搜索树具有如下特征：

 节点的左子树只包含小于当前节点的数。
 节点的右子树只包含大于当前节点的数。
 所有左子树和右子树自身必须也是二叉搜索树。
 示例 1:

 输入:
 2
 / \
 1   3
 输出: true
 示例 2:

 输入:
 5
 / \
 1   4
 / \
 3   6
 输出: false
 解释: 输入为: [5,1,4,null,null,3,6]。
 根节点的值为 5 ，但是其右子节点值为 4 。
 在真实的面试中遇到过这道题？

 是

 否

 判断的条件。
 当树的层数超过2层。 如果有一个null 就返回false  , 没有null ， 必须满足树的规则， 才会返回true
 当树是一层或者为null的时候返回true  其他什么情况都返回false
 * Created by zsh_paradise on 2018/10/15.
 */
public class Test98 {
    public boolean isValidBST(TreeNode root) {
        if(root == null ){
            return true ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int n = q.size();

            for (int i = 0; i < n ; i++) {
                TreeNode t = q.poll();
                TreeNode left = t.left;
                TreeNode right = t.right;

                if( left != null && right != null && left.val <t.val && right.val > t.val){
                    q.offer(left);
                    q.offer(right);
                }else {
                    if(n >1){
                        return  false ;
                    }

                }
            }
        }

        return  true;


    }
}
