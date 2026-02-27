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
    public TreeNode sortedArrayToBST(int[] linear_tree) {
        return explore(linear_tree, 0, linear_tree.length-1);
    }
    private TreeNode explore(int[] tree, int left, int right) {
        if(right < left) { return null; }

        int middle = (right+left)/2;
        return new TreeNode( tree[middle], explore(tree, left, middle-1), explore(tree, middle+1, right) );
    }
}