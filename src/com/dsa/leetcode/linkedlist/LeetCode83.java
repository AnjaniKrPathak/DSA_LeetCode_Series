package com.dsa.leetcode.linkedlist;

public class LeetCode83 {
    public static void main(String[] args) {
        ListNode  head = null;
        deleteDuplicate(head);
    }

    /**
     *
     * @param head
     * @return
     */
    private static ListNode deleteDuplicate(ListNode head) {

        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){

                curr.next = curr.next.next;

            }
            else{
                curr = curr.next;

            }

        }

        return head;


    }
}
 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; 
      }
  }
