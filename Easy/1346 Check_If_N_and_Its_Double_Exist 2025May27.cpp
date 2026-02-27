class Solution {
public:
    bool checkIfExist(const vector<int>& array) {
        /*
         * O(n^2) Time-complexity
         * O(C)   Space-complexity
         */
        for(int index = 0; index < array.size(); index++) {
            for(int inner_index = 0; inner_index < array.size(); inner_index++) {
                if(index == inner_index) {
                    continue;
                }
                if( array[index] == array[inner_index]<<1 ) {
                    return true;
                }
            }
        }
        return false;
    }
};