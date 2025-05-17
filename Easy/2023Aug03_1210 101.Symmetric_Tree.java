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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) { return true; }

        return isMirrored(root.left, root.right);
    }
    private boolean isMirrored(TreeNode left, TreeNode right) {
        if(left == null && right == null) { return true; }
        if(left == null || right == null) { return false; }

        return ( (left.val == right.val) && ( isMirrored(left.left, right.right) && isMirrored(left.right, right.left) ) );
    }
}