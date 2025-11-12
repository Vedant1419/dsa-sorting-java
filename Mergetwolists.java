// leetcode merge two linkedlist
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
        if (list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode aH = null;
        ListNode aT = null;
        
        ListNode i = list1;
        ListNode j = list2;
        
        
        
        while(i != null && j != null){
            if(i.val < j.val){
                if(aH == null && aT == null){
                    aH = i;
                    aT = i;
                }
                else {
                    aT.next = i;
                    aT = i;
                }
                i = i.next;
            }
            else {
                if(aH == null && aT == null){
                    aH = j;
                    aT = j;
                }
                else {
                    aT.next = j;
                    aT = j;
                }
                j = j.next;
            }
        }
        if(i != null){
                aT.next = i;
            }
            
            if(j != null){
                aT.next = j;
            }
            return aH;
    }
}    