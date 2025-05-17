class Solution {
    public boolean isPalindrome(String input) {
        String cleaned_input = removeSpacesAndToLowerCase(input);
        if( cleaned_input.equals( reverseString(cleaned_input) ) ) { return true; }
        return false;
    }

    private String removeSpacesAndToLowerCase(String input) {
        StringBuilder corrected_string = new StringBuilder();

        char current_character;
        for(int i = 0; i < input.length(); i++) {
            current_character = input.charAt(i);
            //if( current_character.isUppercase() ) { current_character = current_character.toLowerCase(); }
            if(65 <= current_character && current_character <= 90) { current_character += 32;}
            //if( current_character.isAlphaNumberic() ) { continue; }
            if(  !( (97 <= current_character && current_character <= 122) || (48 <= current_character && current_character <= 57) )  ) { continue; }
            corrected_string.append(current_character);
        }

        return corrected_string.toString();
    }
    private String reverseString(String lowercase_alphanumeric_input) {
        StringBuilder reversed_string = new StringBuilder();

        char current_character;
        for(int i = lowercase_alphanumeric_input.length()-1; 0 <= i; i--) {
            current_character = lowercase_alphanumeric_input.charAt(i);
            reversed_string.append( current_character );
        }

        return reversed_string.toString();
    }
}