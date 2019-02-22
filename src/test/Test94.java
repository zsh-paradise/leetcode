package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by zsh_paradise on 2019/2/13.
 * 二叉树的中序遍历
 *
 * 给定一个二叉树，返回它的中序 遍历。

 示例:

 输入: [1,null,2,3]
 1
  \
   2
  /
 3

 输出: [1,3,2]
 进阶: 递归算法很简单，你可以通过迭代算法完成吗？

 这个使用就是树的深度搜索     分别是先序，中序和后序。  使用栈对这个进行详细的说明
 */
public class Test94 {
    List<Integer> list = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {

        while(root != null){
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return  list ;
    }


    //先序 使用栈实现
    public void preorderTraversal(TreeNode root){
        //用户暂存数据的栈
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        //新建一个游标节点为根节点
        TreeNode node = root ;
        //当遍历到最后一个节点的时候，左右节点应该为空，并且栈里也为空
        //所以如果不满足这2个条件就需要不断的循环
        while(node !=null && treeNodeStack != null){
            //改节点不为空则输出值，按照先序的要求，一直向左走。
            while (node !=null){
                System.out.println(node.val);
                //为了以后能找到该节点的右节点，暂存于栈中
                treeNodeStack.push(node);
                node = node.left;
            }
            //一直到左子树为空，则开始考虑右子树
            //如果栈已经空了，则不需要考虑，
            //弹出栈中顶元素，将游标等于该节点的右子树
            if(treeNodeStack != null){
                node = treeNodeStack.pop();
                node = node.right;
            }
        }
    }


    //中序
    public void midorderTraversal(TreeNode root){
        //创建一个栈来暂存数据
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        //创建一个游标
        TreeNode node = root ;
        while(node != null && treeNodeStack != null ){
            while(node != null ){
                treeNodeStack.push(node);
                node = node.left;
            }

            if(treeNodeStack != null){
                node = treeNodeStack.pop();
                System.out.println(node.val);
                node = node.right;
            }
        }
    }

}
