class Solution {
public:
    bool isZeroArray(vector<int>& input, vector< vector<int> >& decrement_bounds) {
        int size = input.size();
        vector<int> difference(size+1);

        //using "const auto&" instead of "vector<int>" is faster.
        for(const auto& decrement_bound : decrement_bounds) {
            difference[ decrement_bound[0]   ]++;
            difference[ decrement_bound[1]+1 ]--;
        }

        int running_total = 0;
        for(int index = 0; index < size; index++) {
            running_total += difference[index];
            if( running_total < input[index] ) {
                return false;
            }
        }
        return true;
    }
};