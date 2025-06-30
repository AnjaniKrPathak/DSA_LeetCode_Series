package com.dsa.leetcode.linkedlist;

public class LeetCode141 {
    public static void main(String[] args) {
        ListNode head = null;
        boolean res =hasCycle(head);

    }
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode curr = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;

    }
}
