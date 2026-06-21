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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        PriorityQueue<Integer> minHeap   = new PriorityQueue<>();
        while(list1 != null){
            minHeap.offer(list1.val);
            list1 = list1.next;
        }
        while(list2 !=  null) {
            minHeap.offer(list2.val);
            list2 = list2.next;
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(!minHeap.isEmpty()){
            current.next = new ListNode(minHeap.poll());
            current = current.next;
        }

        return dummy.next;
        
    }
}