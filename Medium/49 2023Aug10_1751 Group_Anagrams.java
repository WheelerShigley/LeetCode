class Solution {
    public List< List<String> > groupAnagrams(String[] strings) {
        Map<String, List<String> > map = new HashMap<>();

        char[] new_word; String newer_word; List<String> word_list;
        for(String word : strings) {
            //alphabetize word
            new_word = word.toCharArray(); Arrays.sort(new_word);
            newer_word = new String(new_word);

            //add to map
            if( !map.containsKey(newer_word) ) {
                map.put( newer_word, new ArrayList<String>() );
            }
            map.get(newer_word).add(word);
        }

        return new ArrayList<>( map.values() );
    }

    /*
    private void printArray(int[] array) {
        StringBuilder buffer = new StringBuilder();

        buffer.append("[");
        for(int i = 0; i < 26; i++) {
            if( array[i] < 1) { continue; }
            buffer.append( array[i] );
            buffer.append( (char)(i+97) );
        }
        buffer.append("]");

        System.out.println( buffer.toString() );
    }
    */
}