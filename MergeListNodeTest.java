package com.company;
//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class MergeListNodeTest {
    public static ListNode Merge(ListNode list1, ListNode list2){
        ListNode newList = new ListNode(-1);
        ListNode ls1 = list1;
        ListNode ls2 = list2;
        ListNode current = newList;
        while(ls1!=null&&ls2!=null){
            if(ls1.val <= ls2.val){
                current.next = ls1;
                ls1 = ls1.next;
            }else{
                current.next = ls2;
                ls2 = ls2.next;
            }
            current = current.next;
        }
        if (ls1 != null) current.next = ls1;
        if (ls2 != null) current.next = ls2;
        return newList.next;
    }
}
