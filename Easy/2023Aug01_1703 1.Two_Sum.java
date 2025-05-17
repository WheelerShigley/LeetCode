class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> index_map = new HashMap<>();

        int compliment;
        for(int i = 0; i < numbers.length; i++) {
            compliment = target - numbers[i];
            if( index_map.containsKey(compliment) ) { return new int[]{i, index_map.get(compliment)}; }
            index_map.put(numbers[i],i);
        }

        return new int[]{};
    }
}