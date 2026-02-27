class Solution {
    public int removeDuplicates(int[] nums) {

        int position = 1;
        for(int i = 1; i < nums.length; i++) {
            if( nums[position-1] != nums[i] ) { nums[position++] = nums[i]; }
        }

        return position;
    }

}