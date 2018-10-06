package com.company;
//输入一个链表，输出该链表中倒数第k个结点。
public class FindKthToTailTesst {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode current = head;
        ListNode result = null;
        if(head==null||k==0) return null;
        try {
            for(int i = 1 ; i < k ; i++) current = current.next;
            while(current.next != null){
                current = current.next;
                result = result.next;
            }
            return result;
        }catch (Exception ex){
            return null;
        }
    }
}
