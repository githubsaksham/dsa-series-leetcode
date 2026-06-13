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
    public ListNode middleNode(ListNode head) {
        ListNode current = new ListNode();
        ListNode result = new ListNode();
        current = head;
        result  = head;

        int count =0;

        while(current!=null){
            current = current.next;
            count++;
        }
        int run = 0 ;
        while(run<(count/2)){
            result = result.next;
            run++;
        }


        return result;

        
    }
}