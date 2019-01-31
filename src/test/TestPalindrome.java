package test;

/**
 * 请判断一个链表是否为回文链表。

 示例 1:

 输入: 1->2
 输出: false
 示例 2:

 输入: 1->2->2->1
 输出: true
 进阶：
 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 * Created by zsh_paradise on 2019/1/25.
 */
public class TestPalindrome {
    public boolean isPalindrome(ListNode head) {
        if(head ==null ||head.next ==null){
            return  true ;
        }
        ListNode fast =head ;
        ListNode slow = head ;
        while(fast.next != null && fast.next.next != null){
            slow = head.next;
            fast = head.next.next;
        }
        //linklist 是没法赋值的，只能把指针向后指，然后不断更新自己的链表。
        ListNode reverseNode = reverseList(slow.next);
        //如何翻转后的数据和原始数据的的val都一样，那么就是回文链表
        while(head != null && reverseNode != null){
            if(head.val != reverseNode.val){
                return  false;
            }
            head = head.next;
            reverseNode = reverseNode.next;
        }
        return true ;
    }

    private ListNode reverseList(ListNode head) {
        if(head ==null || head.next ==null){
            return head ;
        }
        ListNode q = null;
        ListNode p = null ;
        while(head.next != null){
            //使用q 保存到下一个
            q = head.next ;
            //head.next 的指针定义到p
            head.next = p ;
            //p定位为head
            p = head ;
            //更新head内容？    我这个理解有没有问题？
            head = q ;
        }
        return p ;
    }
}
