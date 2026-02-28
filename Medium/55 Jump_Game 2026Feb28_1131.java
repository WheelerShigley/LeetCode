import java.util.Arrays;

class Solution {
    public static boolean canJump(int[] lengths) {
        //parallel array which stores if a given index is reach-able
        boolean[] reachable = new boolean[lengths.length];
        Arrays.fill(reachable, false);
        reachable[0] = true;

        //go through each position in the array, making further positions reachable if the current position is
        for(int index = 0; index < lengths.length-1; index++) {
            if(reachable[index]) {
                for(int jndex = 1; jndex <= lengths[index]; jndex++) {
                    if(index+jndex < reachable.length) {
                        reachable[index+jndex] = true;
                    }
                }
            }
        }

        return reachable[lengths.length-1];
    }
}