class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maximum = getMaximumInt(candies);

        ArrayList<Boolean> greatests = new ArrayList<>();
        for(int i = 0; i < candies.length; i++) {
            greatests.add(maximum <= candies[i]+extraCandies);
        }

        return greatests;
    }

    private int getMaximumInt(int[] array) {
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(maximum < array[i]) {
                maximum = array[i];
            }
        }
        return maximum;
    }
}