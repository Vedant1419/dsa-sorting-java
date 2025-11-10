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
class Swapnodepairlinklist {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        ListNode nxt = head.next;
        ListNode aage = head.next.next;

        nxt.next = head;
        head.next = swapPairs(aage);
        return nxt;
    }
}