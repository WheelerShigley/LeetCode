class Solution {
    public void setZeroes(int[][] matrix) {
        //create list effected rows and collums
        List<Integer> zero_rows = new ArrayList<>();
        List<Integer> zero_collums = new ArrayList<>();

        for(int x = 0; x < matrix.length; x++) {
            int y;
            for(y = 0; y < matrix[x].length; y++) {
                if(matrix[x][y] == 0) {
                    zero_rows.add(x);
                    zero_collums.add(y);
                }
            }
        }

        //effect rows and collums
        for(int row : zero_rows) {
            Arrays.fill(matrix[row],0);
        }
        for(int collum : zero_collums) {
            for(int dx = 0; dx < matrix.length; dx++) {
                matrix[dx][collum] = 0;
            }
        }
    }
}