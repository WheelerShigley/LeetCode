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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current_node = head; //starts at head

        while(current_node != null && current_node.next != null) {
            if(current_node.val == current_node.next.val) {
                current_node.next = current_node.next.next; //skip next node
            } else {
                current_node = current_node.next;
            }
        }

        return head;
    }
}