package test;

import com.google.common.primitives.Ints;

import java.util.*;

/**
 * Created by zsh_paradise on 2019/2/20.
 * 从前序于中序遍历序列构造二叉树
 * 根据一棵树的前序遍历与中序遍历构造二叉树。

 注意:
 你可以假设树中没有重复的元素。

 例如，给出

 前序遍历 preorder = [3,9,20,15,7]
 中序遍历 inorder = [9,3,15,20,7]
 返回如下的二叉树：

    3
  / \
 9   20
   /  \
  15   7
 在真实的面试中遇到过这道题？

 关键在于前序遍历和中序遍历的特性

 前序遍历：根节点是首元素s
 中序遍历：根节点左侧的值是其左子树，右侧的值是其右子树
   每次遇到既需要角标信息，有需要val的情况，使用游标来处理
 */
public class Test105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       if(preorder ==null || inorder ==null||preorder.length ==0){
           return null;
       }
       return buildCode(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    private TreeNode buildCode(int[] preorder,int preST,int preEnd,int[] inorder,int inST,int inEnd){
        //前序遍历第一个节点是根节点
        int rootVal = preorder[preST];
        TreeNode root = new TreeNode(rootVal);
        //前序只有根节点
        if(preEnd==preST){
            return  root ;
        }
        //遍历中序，查找根节点位置
        int rootInorde = inST;
        while(inorder[rootInorde] !=rootVal &&rootInorde<inEnd){
            rootInorde++;
        }
        //左子树的长度
        int  leftLength = rootInorde - inST;
        //前序中左左子树的最后一个节点
        int leftPreEnd = preST + leftLength;

        //左子树非空
        if(leftLength>0){
            //重建左子树
            root.left = buildCode(preorder,preST+1,leftPreEnd,inorder,inST,inEnd);
        }
        //右子树非空
        if(leftLength < preEnd - preST){
            //重建右子树
            root.right = buildCode(preorder,leftPreEnd +1,preEnd,inorder,rootInorde+1,inEnd);
        }

        return  root ;
    }
}
