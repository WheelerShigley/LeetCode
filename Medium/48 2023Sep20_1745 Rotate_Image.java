class Solution {
    private void transpose(int[][] matrix) {
        int temp;
        for(int x = 0; x < matrix.length; x++) {
            for(int y = x; y < matrix[0].length; y++) {
                temp = matrix[x][y];
                matrix[x][y] = matrix[y][x];
                matrix[y][x] = temp;
            }
        }
    }
    private void reverse(int[] array) {
        int opposite_position, temp;
        for(int position = 0; position < array.length/2; position++) {
            opposite_position = array.length-1 - position;

            temp = array[position];
            array[position] = array[opposite_position];
            array[opposite_position] = temp;
        }
    }
    private void reverse(int[][] matrix) {
        for(int collum = 0; collum < matrix.length; collum++) {
            reverse( matrix[collum] );
        }
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
}