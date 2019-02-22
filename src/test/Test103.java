package test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import static test.TestTool.stringToTreeNode;

/**
 * Created by zsh_paradise on 2019/2/15.
 * 二叉树的锯齿形层次遍历
 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。

 例如：
 给定二叉树 [3,9,20,null,null,15,7],

 思路， 第一种思路用了2个双向队列进行处理。
   先把第一层的放到队列1  ， 获取值， 获取val，并把子节点放到第二个队列中，poll后情况改队列
   然后把poll 第二个队列，获取的val值，并把他们的子节点放到第一个队列中，直到清空队列。
 */
public class Test103 {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list  = new ArrayList<>();
        if(root ==null ){
            return  list ;
        }

        Deque<TreeNode> odd = new LinkedList<>();
        Deque<TreeNode>  even = new LinkedList<>();
        odd.push(root);

        while(!odd.isEmpty() || !even.isEmpty()){
            List<Integer> subList = new ArrayList<>();
            if(!odd.isEmpty()){
                while(!odd.isEmpty()){
                    TreeNode node = odd.poll();
                    subList.add(node.val);
                    if(node.left != null){
                        even.push(node.left);
                    }
                    if(node.right !=null){
                        even.push(node.right);
                    }
                }

            }else{
                while(!even.isEmpty()){
                    TreeNode node = even.poll();
                    subList.add(node.val);
                    if(node.left !=null){
                        odd.push(node.left);
                    }
                    if(node.right !=null){
                        odd.push(node.right);
                    }
                }
            }
            list.add(subList);
        }


        return list ;
    }


    public static void main(String[] args) {
        String s = "[3,9,20,null,null,15,7]";
        TreeNode root = stringToTreeNode(s);
        List<List<Integer>> list = zigzagLevelOrder(root);
    }
}
