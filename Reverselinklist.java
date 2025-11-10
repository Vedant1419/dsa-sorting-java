// leetcode 206 reverse of linklist 
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
        ListNode prev = null;
        ListNode temp = head;
        
        while(temp != null){
            ListNode nxt = temp.next;
            temp.next = prev;   // for the iteration and changing of elements
            prev = temp;
            temp = nxt; // for the movement of pointers nxt temp and prev.
        }
        return prev;  // head node will be previous
    }
}