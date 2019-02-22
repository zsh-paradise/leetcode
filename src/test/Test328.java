package test;

/**
 * Created by zsh_paradise on 2019/2/13.
 * 奇偶链表
 *
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。

 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。

 示例 1:

 输入: 1->2->3->4->5->NULL
 输出: 1->3->5->2->4->NULL
 示例 2:

 输入: 2->1->3->5->6->4->7->NULL
 输出: 2->3->6->7->1->5->4->NULL
 说明:应当保持奇数节点和偶数节点的相对顺序。
 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 */
public class Test328 {
    public static  ListNode oddEvenList(ListNode head) {
        if(head == null ){
            return head ;
        }
        ListNode parityNode  = head ,even = head.next ,evenhead = even ;
        while(parityNode.next != null && even.next != null){
            parityNode.next = parityNode.next.next;
            even.next = even.next.next;
            parityNode = parityNode.next;
            even = even.next;

        }
        parityNode.next = evenhead;
        return  head ;
    }

    public static void main(String[] args) {
        ListNode q1 = new ListNode(1);
        ListNode q2 = new ListNode(2);
        ListNode q3 = new ListNode(3);
        ListNode q4 = new ListNode(4);
        ListNode q5 = new ListNode(5);
        q1.next = q2;
        q2.next = q3;
        q3.next = q4;
        q4.next = q5;
        q5.next = null ;
        ListNode result = oddEvenList(q1);
        System.out.println("finish");
    }
}
