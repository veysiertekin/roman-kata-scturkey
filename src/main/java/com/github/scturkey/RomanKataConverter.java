package com.github.scturkey;

public class RomanKataConverter {

    public String convert(int decimal) {
        if (decimal < 4) {
            return getConcatRepetativeRomanNumber("I", decimal);
        } else if (decimal == 4) {
            return "IV";
        } else if (decimal == 5) {
            return "V";
        } else if (decimal == 6) {
            return "VI";
        } else {
            return getConcatRepetativeRomanNumber("X", decimal / 10);
        }
    }

    private String getConcatRepetativeRomanNumber(String romanNumber, int repeatCount) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeatCount; ++i) {
            sb.append(romanNumber);
        }
        return sb.toString();
    }
}
