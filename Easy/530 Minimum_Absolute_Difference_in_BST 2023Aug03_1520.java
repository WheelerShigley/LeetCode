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
    public int getMinimumDifference(TreeNode root) {
        int[] linear_tree = binaryTreeToArray(root);

        int smallest = Integer.MAX_VALUE, difference = Integer.MAX_VALUE;
        for(int i = 0; i < linear_tree.length-1; i++) {
            if( linear_tree[i] == Integer.MIN_VALUE) { continue; }

            for(int j = i+1; j < linear_tree.length; j++) {
                if( linear_tree[j] == Integer.MIN_VALUE) { continue; }

                difference = Math.abs( linear_tree[i]-linear_tree[j] );
                if( difference < smallest) { smallest = difference;}
            }
        }
        return smallest;
    }
    private int[] binaryTreeToArray(TreeNode node) {
        int[] current_array = new int[]{node.val};

        if(node.left == null && node.right == null) { return current_array; }

        if(node.left != null) {
            current_array = combineArrays( current_array, binaryTreeToArray(node.left) );
        } else {
            current_array = combineArrays( current_array, new int[]{Integer.MIN_VALUE});
        }

        if(node.right != null) {
            current_array = combineArrays( current_array, binaryTreeToArray(node.right) );
        } else {
            current_array = combineArrays( current_array, new int[]{Integer.MIN_VALUE} );
        }

        return current_array;
    }
    private int[] combineArrays(int[] primary, int[] secondary) {
        int[] result = new int[primary.length+secondary.length];

        for(int i = 0; i < primary.length; i++) {
            result[i] = primary[i];
        }
        for(int i = primary.length; i < primary.length+secondary.length; i++) {
            result[i] = secondary[i-primary.length];
        }

        return result;
    }
}