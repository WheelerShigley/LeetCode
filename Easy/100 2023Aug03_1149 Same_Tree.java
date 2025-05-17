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
    public boolean isSameTree(TreeNode first, TreeNode second) {
        int[] first_order = (first == null) ? new int[0] : binaryTreeToIntegerArray(first);
        int[] second_order = (second == null) ? new int[0] : binaryTreeToIntegerArray(second);

        //printArray(first_order);
        //printArray(second_order);

        //verify equivelence
        if(first_order.length != second_order.length) { return false; }
        for(int i = 0; i < first_order.length; i++) {
            if( first_order[i] != second_order[i] ) { return false; }
        }
        return true;
    }
    private int[] binaryTreeToIntegerArray(TreeNode node) {
        int[] current_array = new int[]{node.val};

        if(node.left == null && node.right == null) { return current_array; }

        if(node.left != null) {
            current_array = combineArrays( current_array, binaryTreeToIntegerArray(node.left) );
        } else {
            current_array = combineArrays( current_array, new int[]{Integer.MIN_VALUE});
        }
        if(node.right != null) {
            current_array = combineArrays( current_array, binaryTreeToIntegerArray(node.right) );
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
    /*
    private void printArray(int[] array) {
        StringBuilder buffer = new StringBuilder();

        buffer.append("[");
        for(int i = 0; i < array.length; i++) {
            buffer.append( array[i] );
            if(i < array.length-1) { buffer.append(","); }
        }
        buffer.append("]");

        System.out.println( buffer.toString() );
        return;
    }
    */
}