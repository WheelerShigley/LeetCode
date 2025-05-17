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
    HashMap<Integer, List<Integer> > values = new HashMap<Integer, List<Integer> >();
    int current_level = 0;

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> averages = new ArrayList<Double>();
        explore(root);

        //find averages at each level
        int j;
        double current_count, accumulator;
        for(int i = 0; i < values.size(); i++) {
            accumulator = 0.0;
            current_count = (double)values.get(i).size();
            for(j = 0; j < current_count; j++) {
                accumulator += ( (double)values.get(i).get(j) );
            }
            averages.add(accumulator / current_count );
        }

        return averages;
    }

    private void explore(TreeNode node) {

        if(node.left != null) { current_level++; explore(node.left); }
        if(node.right != null) { current_level++; explore(node.right); }

        //add value to list
        if( !values.containsKey(current_level) ) { values.put(current_level, new ArrayList<Integer>() ); }
        values.get(current_level).add(node.val);

        current_level--;
        return;
    }
}