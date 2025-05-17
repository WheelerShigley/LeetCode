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
    private int maximum_found_depth = 1;
    private int current_depth = 1;

    public int maxDepth(TreeNode root) {
        if(root == null) { return 0; }

        exploreNode(root);
        return maximum_found_depth;
    }
    private void exploreNode(TreeNode node) {
        if(node.left == null && node.right == null) { current_depth--; return; } //ascend before explore

        if(node.left != null) { incrementDepth(); exploreNode(node.left); }
        if(node.right != null) { incrementDepth(); exploreNode(node.right); }

        current_depth--; //ascend after explore
        return;
    }
    private void incrementDepth() {
        current_depth++;
        if(maximum_found_depth < current_depth) { maximum_found_depth = current_depth; } //update maximum
        return;
    }
}