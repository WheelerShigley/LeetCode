class Solution {
    public boolean containsNearbyDuplicate(int[] numbers, int k) {
        HashMap<Integer, Integer> last_occurances = new HashMap<>();

        int current;
        for(int i = 0; i < numbers.length; i++) {
            current = numbers[i];
            if( last_occurances.containsKey(current) && Math.abs( i - last_occurances.get(current) ) <= k) { return true; }
            last_occurances.put(current,i);
        }
        return false;
    }
}