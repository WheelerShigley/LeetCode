class Solution {
    public int searchInsert(int[] array, int target) {
        int left = 0, right = array.length-1, middle = 0;
        int current_value;
        while(left <= right) {
            middle = left + (right-left)/2;
            current_value = array[middle];
            if(current_value == target) { return middle; }
            if(current_value < target) { left = middle+1; } else { right = middle-1; }
        }
        return left;
    }
}