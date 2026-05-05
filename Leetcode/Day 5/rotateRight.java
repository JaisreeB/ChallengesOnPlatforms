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
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null)
            return head;
        for (int i = 0; i < k; i++) {
            ListNode curr = head;
            ListNode prev = null;    
            while (curr.next != null) {
                prev = curr;            
                curr = curr.next;
            }
            curr.next = head;          
            head = curr;                
            prev.next = null;           
        }

        return head;
    }
}
