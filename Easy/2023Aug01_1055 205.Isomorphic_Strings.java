class Solution {
    public boolean isIsomorphic(String first, String second) {
        int[] formatted_first = wordToFormat(first);
        int[] formatted_second = wordToFormat(second);

        //printIntArray( ("\""+first+"\""), formatted_first);
        //printIntArray( ("\""+second+"\""), formatted_second);

        return isEqual(formatted_first, formatted_second);
    }
    private int[] wordToFormat(String word) {
        int word_length = word.length();
        int current_value;

        int[] format = new int[word_length];
        int[] mapping = new int[128]; Arrays.fill(mapping, -1);

        int current_remap_position = 0;
        for(int i = 0; i < word_length; i++) {
            current_value = mapping[ word.charAt(i) ];
            if(current_value < 0) {
                format[i] = current_remap_position;
                mapping[ word.charAt(i) ] = current_remap_position++;
                continue;
            }
            format[i] = current_value;
        }

        return format;
    }
    private boolean isEqual(int[] first, int[] second) {
        int first_length = first.length;

        if( first_length != second.length ) { return false; }

        for(int i = 0; i < first_length; i++) {
            if( first[i] != second[i] ) { return false; }
        }
        return true;
    }
    /*
    private void printIntArray(String prefix, int[] array) {
        StringBuilder buffer = new StringBuilder();

        buffer.append(prefix+" = {");
        for(int i = 0; i < array.length; i++) {
            buffer.append( array[i] );
            if(i < array.length-1) { buffer.append(","); }
        }
        buffer.append("}");

        System.out.println( buffer.toString() );
    }
    */
}