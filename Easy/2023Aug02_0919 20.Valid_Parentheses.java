class Solution {
    public boolean isValid(String nestings) {
        Stack<Character> nest_check = new Stack<>();

        char previous;
        for( char current : nestings.toCharArray() ) {

            if(current == '(' || current == '{' || current == '[') {
                nest_check.push(current);
            } else {
                if( nest_check.isEmpty() ) { return false; }

                previous = nest_check.peek();
                if( (previous == '(' && current == ')') || (previous == '{' && current == '}') || (previous == '[' && current == ']') ) { nest_check.pop(); } else { return false; }
            }

        }
        return nest_check.isEmpty();
    }
}