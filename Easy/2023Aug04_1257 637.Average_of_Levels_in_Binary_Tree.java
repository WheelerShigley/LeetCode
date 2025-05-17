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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<Double>();
        if(root == null) { return averages; }

        Queue<TreeNode> current_level = new LinkedList<>();
        current_level.add(root);

        int level_size; double level_average;
        TreeNode current_node;
        while( !current_level.isEmpty() ) {
            level_average = 0.0;

            level_size = current_level.size();
            for(int i = 0; i < level_size; i++) {
                current_node = current_level.poll();
                level_average += (double)current_node.val;

                if(current_node.left  != null) { current_level.add(current_node.left );}
                if(current_node.right != null) { current_level.add(current_node.right); }
            }
            averages.add(  level_average/( (double)level_size )  );
        }

        return averages;
    }
}