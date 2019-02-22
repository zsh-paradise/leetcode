package test;

import com.sun.deploy.util.StringUtils;

/**
 * Created by zsh_paradise on 2019/2/13.
 * 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 输出：7 -> 0 -> 8
 原因：342 + 465 = 807
 */
public class Test2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //定义满10进1的数
        int num = 0 ;
        //定义一个ListNode作为链表头
        ListNode proNode = new ListNode(0);
        //定义一个ListNode 接受两个数据之和
        ListNode currentNode = new ListNode(0);
        //连接连个node
        proNode.next = currentNode;

        do{
            //两数相加
            int sum =(l1!=null?l1.val:0)+(l2!=null?l2.val:0)+num;
            //是否满十
            num =sum/10;
            //获得各位数
            int result = sum%10 ;
            currentNode.val = result;
            l1 = l1!=null?l1.next:l1;
            l2 = l2!=null?l2.next:l2;
            if(l1!=null ||l2!=null ||num!=0 ){
                currentNode.next = new ListNode(0);
                currentNode = currentNode.next;

            }
        }while(l1!=null || l2!=null ||num !=0 );
        return proNode.next;

    }

    public static void main(String[] args) {
        ListNode  p1 = new ListNode(2);
        ListNode  p2 = new ListNode(4);
        ListNode  p3 = new ListNode(3);
        p1.next = p2;
        p2.next =p3;
        p3.next = null ;

        ListNode q1 = new ListNode(5);
        ListNode q2 = new ListNode(6);
        ListNode q3 = new ListNode(4);
        q1.next = q2;
        q2.next = q3;
        q3.next = null ;

        ListNode result = addTwoNumbers(p1,q1);
        while (result.next != null || result  != null   ){
            System.out.println(result.val);
            result = result.next;

        }
    }
}
