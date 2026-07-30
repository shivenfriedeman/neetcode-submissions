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
    public boolean hasCycle(ListNode head) {
        ListNode two = head;
        ListNode one = head;

        if(head == null){ return false; }

        while(two.next != null && two.next.next != null){
            two = two.next.next;
            one = one.next;

            if(one == two){ return true; }
        }
        return false;
    }
}
