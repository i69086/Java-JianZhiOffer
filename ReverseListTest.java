package com.company;

//输入一个链表，反转链表后，输出新链表的表头。
public class ReverseListTest {
    public ListNode ReverseList(ListNode head){
        ListNode current = head;
        ListNode nxt = null;
        ListNode pre = null;
        while(current != null){
            nxt = current.next;
            current.next = pre;
            pre = current;
            current = nxt;
        }
        return pre;
    }
}
