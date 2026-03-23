class Solution {
    public static int candy(int[] ratings) {
        //candies allocated, starting as all ones
        int[] candies = new int[ratings.length];
        for(int index = 0; index < ratings.length; index++) {
            candies[index] = 1;
        }

        //going through the list, checking the left-side neighbors
        for(int index = 1; index < ratings.length; index++) {
            if( ratings[index-1] < ratings[index] ) {
                candies[index] = candies[index-1]+1;
            }
        }
        //again, but checking the right-side neighbors
        for(int index = ratings.length-2; 0 <= index; index--) {
            if(
                ratings[index+1] < ratings[index]
                && candies[index] <= candies[index+1]
            ) {
                candies[index] = candies[index+1]+1;
            }
        }

        //return the count
        int candy_sum = 0;
        for(int candy : candies) {
            candy_sum += candy;
        }
        return candy_sum;
    }
}