package com.myl.algorithm;

/**
 *
 * @author bean-program
 */
public class ListNode {
    private int val;

    private ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        //指定哑结点
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummyHead;

        int carry = 0;
        while (p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            int mod = sum % 10;
            curr.next = new ListNode(mod);
            curr = curr.next;
            if (p != null){
                p = p.next;
            }
            if (q != null){
                q = q.next;
            }
        }
        if (carry > 0){
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
