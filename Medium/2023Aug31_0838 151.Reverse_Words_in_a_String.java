class Solution {
    public String reverseWords(String sentence) {
        //ensure the sentence can be used
        if(sentence.length() < 1) { return ""; }

        StringBuilder buffer = new StringBuilder();

        //seperate the individual words into a list
        List<String> words = new ArrayList<String>();
        char previous = sentence.charAt(0);
        for(char current : sentence.toCharArray() ) {
            if(current == ' ' && previous == ' ') { continue; }
            if(current == ' ' && previous != ' ') {
                words.add( buffer.toString() );
                System.out.println("\""+buffer.toString()+"\"");
                buffer.setLength(0);

                previous = current;
                continue;
            }

            buffer.append(current);
            previous = current;
        }
        //the last word likely lacks a postfix space
        if(0 < buffer.length() ) { words.add( buffer.toString() ); }

        //reconstruct the sentence, with words reversed
        buffer.setLength(0);
        for(int i = words.size()-1; 0 <= i; i--) {
            buffer.append( words.get(i) );
            if(0 < i) { buffer.append(" "); }
        }

        return buffer.toString();
    }
}