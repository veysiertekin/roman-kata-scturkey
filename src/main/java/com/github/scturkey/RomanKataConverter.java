package com.github.scturkey;

public class RomanKataConverter {

    public String convert(int decimal) {
        if (decimal == 1) {
            return "I";
        }
        else if (decimal == 2) {
            return "II";
        }
        return "III";
    }

}
