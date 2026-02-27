class Solution {
    public int[] sortArray(int[] numbers) {
        return mergeSort(numbers, 0, numbers.length-1);
    }
    private int[] mergeSort(int[] array, int start_index, int end_index) {
        if(start_index == end_index) {
            return new int[]{ array[start_index] };
        }

        int middle_index = start_index + (end_index-start_index)/2;

        int[] left_side = mergeSort(array, start_index, middle_index);
        int[] right_side = mergeSort(array, middle_index+1, end_index);

        return merge(left_side,right_side);
    }
    private int[] merge(int[] left, int[] right) {
        int[] array = new int[left.length + right.length];

        int i = 0, j = 0, position = 0;
        while( (i < left.length) && (j < right.length) ) {
            if(left[i] < right[j]) {
                array[position++] = left[i++];
            } else {
                array[position++] = right[j++];
            }
        }

        while(i < left.length) {
            array[position++] = left[i++];
        }
        while(j < right.length) {
            array[position++] = right[j++];
        }

        return array;
    }
}