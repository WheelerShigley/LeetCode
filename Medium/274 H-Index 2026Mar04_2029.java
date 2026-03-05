class Solution {
    public static int hIndex(int[] citations) {
        int length = citations.length;

        //parallel array of citation-count_counts
        int[] citation_buckets = new int[length+1]; {
            for(int citation : citations) {
                if(length <= citation) {
                    citation_buckets[length]++;
                } else {
                    citation_buckets[citation]++;
                }
            }
        }

        //backwards-iterating through citation-count_counts until
        // the accumulated minimum is greater than or equal to the index of the citation-count
        int accumulator = 0;
        for(int index = length; 0 <= index; index--) {
            accumulator += citation_buckets[index];
            if(index <= accumulator) {
                return index;
            }
        }
        return 0;
    }
}