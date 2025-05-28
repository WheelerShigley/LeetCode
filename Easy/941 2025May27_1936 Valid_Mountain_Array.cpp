class Solution {
public:
    /*
     * O(n) Time-Complexity
     * O(C) Space-Complexity
     */
    bool validMountainArray(const vector<int>& array) {
        if( array.size() <= 2 ) {
            return false;
        }

        int index = 0, size = array.size()-1;
        while( index < size && array[index] < array[index+1] ) {
            index++;
        }
        //index is at peak
        if(index == 0 || index == size) {
            return false;
        }
        while( index < size && array[index+1] < array[index] ) {
            index++;
        }

        //check that the end doesn't plateau
        return index == size;
    }
};