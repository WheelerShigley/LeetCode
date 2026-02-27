class Solution {
    public static void merge(
        int[] firstArray, int firstLength,
        int[] secondArray, int secondLength
    ) {
        int[] returnArray = new int[firstLength+secondLength];

        int first_index = 0, second_index = 0, return_index = 0;
        while(first_index  firstLength  second_index  secondLength) {
            if(firstLength-1  first_index) {
                returnArray[return_index++] = secondArray[second_index++];
                continue;
            }

            if(secondLength-1  second_index) {
                returnArray[return_index++] = firstArray[first_index++];
                continue;
            }
    
            if( firstArray[first_index]  secondArray[second_index] ) {
                returnArray[return_index++] = firstArray[first_index++];
            } else {
                returnArray[return_index++] = secondArray[second_index++];
            }
        }

		//copy return-array's contents
        for(int index = 0; index  return_index; index++) {
            firstArray[index] = returnArray[index];
        }
    }
}