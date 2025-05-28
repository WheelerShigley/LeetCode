class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        bool first_row_contains_zero = false;
        // use first row&column as markers for if the rows&columns should be zero-ed
        for(int row_index = 0; row_index < matrix.size(); row_index++) {
            if( matrix[row_index][0] == 0 ) {
                first_row_contains_zero = true;
            }
            for(int column_index = 1; column_index < matrix.at(row_index).size(); column_index++) {
                if( matrix[row_index][column_index] == 0 ) {
                    matrix[row_index][0] = 0;
                    matrix[0][column_index] = 0;
                }
            }
        }

        //zero the rows&columns which are marked
        for(int row_index = matrix.size()-1; 0 <= row_index; row_index--) {
            for(int column_index = matrix.at(row_index).size()-1; 1 <= column_index; column_index--) {
                if( matrix[row_index][0] == 0 || matrix[0][column_index] == 0 ) {
                    matrix[row_index][column_index] = 0;
                }
            }
            if(first_row_contains_zero) {
                matrix[row_index][0] = 0;
            }
        }
    }
};