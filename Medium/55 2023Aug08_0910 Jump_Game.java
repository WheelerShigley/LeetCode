class Solution {
    public boolean canJump(int[] numbers) {
        int target_index = numbers.length-1;
        for(int i = numbers.length-1; 0 <= i; i--) {
            if(target_index <= numbers[i]+i) { target_index = i; }
        }

        return (target_index == 0);
    }
}