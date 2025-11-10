// remove nth node from the linklist leetcode 19
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        
        while(n > 0){
            n--;
            fast = fast.next;  // keeping fast pointer 2 steps ahead
        }
        
        while(fast != null){
            prev = slow;      // keeping prev one step before slow pointer
            fast = fast.next;
            slow = slow.next;  // traversing every element 
        }
        
        if(prev == null){
            head = head.next;
        }
        else {
            prev.next = prev.next.next;
        }
        return head;
    }  
}