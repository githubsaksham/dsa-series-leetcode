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
        ListNode prev = new ListNode();
        ListNode current = new ListNode();
        ListNode fast = new ListNode();
        if(head==null || head.next==null) return head;
        prev = null;
        current = head;
        fast = head.next;
        while(fast!=null){
            current.next = prev;
            prev = current;
            current =fast;
            fast=fast.next;
            current.next=prev;

        }
        return current;
        
    }
}