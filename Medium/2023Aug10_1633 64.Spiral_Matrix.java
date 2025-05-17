class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int linear_length = matrix.length * matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int current = 0, i;
        for(;;) {
            /*top row*/ {
                int[] top_row = Arrays.copyOfRange( matrix[current], current, matrix[0].length-current);
                for(int element : top_row) {
                    result.add( element );
                }
            }
            if(linear_length <= result.size()) { return result; }

            /*right column*/ {
                for(i = current+1; i < matrix.length-current; i++) {
                    result.add( matrix[i][ matrix[0].length-1-current ]);
                }
            }
            if(linear_length <= result.size()) { return result; }

            /*bottom row*/ {
                for(i = matrix[0].length-1-current-1; current <= i; i--) {
                    result.add( matrix[ matrix.length-1-current ][i] );
                }
            }
            if(linear_length <= result.size()) { return result; }

            /*left column*/ {
                for(i = matrix.length-1-current-1; current < i; i--) {
                    result.add( matrix[i][current] );
                }
            }
            if(linear_length <= result.size()) { return result; }

            current++;
        }
    }
}