class Solution {
    public String intToRoman(int number) {
        StringBuilder numeral = new StringBuilder();
        int current_count;

        current_count = number/1000; number -= 1000*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("M"); }
        current_count = number/900; number -= 900*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("CM"); }
        current_count = number/950; number -= 950*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("LM"); }
        current_count = number/990; number -= 990*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("XM"); }
        current_count = number/995; number -= 995*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("VM"); }
        current_count = number/999; number -= 999*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("IM"); }

        current_count = number/500; number -= 500*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("D"); }
        current_count = number/400; number -= 400*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("CD"); }
        current_count = number/450; number -= 450*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("LD"); }
        current_count = number/490; number -= 490*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("XD"); }
        current_count = number/495; number -= 495*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("VD"); }
        current_count = number/499; number -= 499*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("ID"); }

        current_count = number/100;  number -= 100*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("C"); }
        current_count = number/90;  number -= 90*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("XC"); }
        current_count = number/95;  number -= 95*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("VC"); }
        current_count = number/99;  number -= 99*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("IC"); }

        current_count = number/50;   number -= 50*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("L"); }
        current_count = number/40;   number -= 40*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("XL"); }
        current_count = number/45;   number -= 45*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("VL"); }
        current_count = number/49;   number -= 49*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("IL"); }

        current_count = number/10;   number -= 10*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("X"); }
        current_count = number/9;   number -= 9*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("IX"); }

        current_count = number/5;    number -= 5*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("V"); }
        current_count = number/4;    number -= 4*current_count;
        for(int i = 0; i < current_count; i++) { numeral.append("IV"); }

        for(int i = 0; i < number; i++) { numeral.append("I"); }

        return numeral.toString();
    }
}