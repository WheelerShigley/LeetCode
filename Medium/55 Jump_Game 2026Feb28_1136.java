class Solution {
    public static boolean canJump(int[] lengths) {
        int reach = 0;
        for(int index = 0; index < lengths.length; index++) {
            if(reach < index) {
                return false;
            }
            reach = Math.max(reach, index+lengths[index]);
        }
        return true;
    }
}