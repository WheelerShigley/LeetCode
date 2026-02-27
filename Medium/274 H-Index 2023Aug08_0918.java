class Solution {
    public int hIndex(int[] citations) {
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < citations.length; i++) {
            if(maximum < citations[i]) { maximum = citations[i]; }
        }
        //System.out.println("maximum = "+maximum);

        int maximum_h = 0, count;
        for(int i = 0; i <= maximum; i++) {
            count = 0;
            for(int j = 0; j < citations.length; j++) {
                if(i <= citations[j]) { count++; }
            }
            //System.out.println("for h="+i+": "+count);
            if(i <= count) { maximum_h = i; }
        }

        return maximum_h;
    }
}
