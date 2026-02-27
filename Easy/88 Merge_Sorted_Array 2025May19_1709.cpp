class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int position1 = m-1, position2 = n-1, end_position = m+n-1;
        while(0 <= position2) {
            if(0 <= position1 && nums2[position2] < nums1[position1]) {
                nums1[end_position--] = nums1[position1--];
            } else {
                nums1[end_position--] = nums2[position2--];
            }
        }
    }
};