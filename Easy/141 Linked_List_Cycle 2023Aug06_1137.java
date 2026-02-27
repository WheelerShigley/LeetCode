/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode node) {
        if(node == null) { return false; }

        while(node != null) {
            if(node.val == Integer.MIN_VALUE) { return true; }
            node.val = Integer.MIN_VALUE;

            node = node.next;
        }

        return false;
    }
}