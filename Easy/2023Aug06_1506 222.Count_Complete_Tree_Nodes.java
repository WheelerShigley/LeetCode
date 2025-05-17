/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0;

    public int countNodes(TreeNode root) {
        if(root == null) { return 0; }
        inOrderTraversal(root);

        return count;
    }
    private void inOrderTraversal(TreeNode node) {

        if(node.left != null) { inOrderTraversal(node.left); }
        if(node.right != null) { inOrderTraversal(node.right); }

        count++;
        return;
    }
}