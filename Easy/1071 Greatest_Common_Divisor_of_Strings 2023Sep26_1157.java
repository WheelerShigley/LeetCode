class Solution {
    private int gcd(int int1, int int2) {
        return (int2 == 0) ? int1 : gcd(int2, int1%int2);
    }
    public String gcdOfStrings(String str1, String str2) {
        if( (str1+str2).equals(str2+str1) ) {
            return str1.substring(  0, gcd(str1.length(), str2.length() )  );
        }
        return "";
    }
}