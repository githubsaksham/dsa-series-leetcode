/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head == null) return null;

        Node curr = head;
        while(curr != null){
            Node clone = new Node(curr.val);
            clone.next = curr.next;
            curr.next = clone;
            curr = clone.next;

        }
        curr = head;
        while(curr != null){
            if(curr.random != null)
            {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;

        }

        curr = head;
        Node dummy =  new Node(0);
        Node clone = dummy;

        while(curr != null) {
            clone.next = curr.next;
            clone = clone.next;
            curr.next  =curr.next.next; // you have to go and also we are restoring the adress value of node sir 
            curr = curr.next; // reached to that addresS)
        }

        return dummy.next;
    }
}