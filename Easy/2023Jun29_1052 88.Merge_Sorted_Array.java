class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int m_pos = 0, n_pos = 0, t_pos = 0;

        for(int i = 0; i < n+m; i++) {

            if(nums1.length == 0) { merge(nums1, m, nums2, 0); return; }
            if(nums2.length == 0) { merge(nums1, 0, nums2, n); return; }

            if(m <= m_pos) {
                for(int j = n_pos; j < n; j++) {
                    temp[t_pos++] = nums2[n_pos++];
                }
                copy(nums1, temp); return;
            }
            if(n <= n_pos) {
                for(int j = m_pos; j < m; j++) {
                    temp[t_pos++] = nums1[m_pos++];
                }
                copy(nums1, temp); return;
            }

            if( nums1[m_pos] < nums2[n_pos] ) {
                temp[t_pos++] = nums1[m_pos++];
            } else {
                temp[t_pos++] = nums2[n_pos++];
            }
        }

        copy(nums1, temp); return;
    }

    private void copy(int[] to, int[] from) {
        for(int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
        return;
    }
}