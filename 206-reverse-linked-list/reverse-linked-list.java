/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode reverse  = null, curr = head ;
      // while(curr != null){
     //   ListNode temp = curr.next;
     //   curr.next =  reverse;
     //   reverse =  curr;
      //  curr = temp;
      // }


      // return reverse;
      if(head == null){
        return head;
      }
      ListNode temp = head,  next_next = null;
      ListNode prev = null;
      while(temp!=  null){
        next_next = temp.next;
        temp.next = prev;
        prev = temp;
        temp  = next_next;
      }
      head = prev;
      return head;


        
    }
}