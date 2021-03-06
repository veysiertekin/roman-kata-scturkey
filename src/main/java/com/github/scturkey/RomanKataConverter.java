package com.github.scturkey;

public class RomanKataConverter {

    public String convert(int decimal) {
        if (decimal == 4) {
            return "IV";
        } else if (decimal == 9) {
            return "IX";
        } else if (decimal == 40) {
            return "XL";
        } else if (decimal == 90) {
            return "XC";
        } else if (decimal == 400) {
            return "CD";
        } else if (decimal == 900) {
            return "CM";
        } else if (decimal == 5) {
            return "V";
        } else if (decimal == 50) {
            return "L";
        } else if (decimal == 500) {
            return "D";
        } else if (decimal < 4) {
            return getConcatRepetativeRomanNumber("I", decimal);
        } else if (decimal < 10) {
            return getDiscreteParts(decimal, 5);
        } else if (decimal < 40) {
            return getConcatRepetativeRomanNumber("X", decimal / 10) + convert(decimal % 10);
        } else if (decimal < 50) {
            return getDiscreteParts(decimal, 40);
        } else if (decimal < 90) {
            return getDiscreteParts(decimal, 50);
        } else if (decimal < 100) {
            return getDiscreteParts(decimal, 90);
        } else if (decimal < 400) {
            return getConcatRepetativeRomanNumber("C", decimal / 100) + convert(decimal % 100);
        } else if (decimal < 500) {
            return getDiscreteParts(decimal, 400);
        } else if (decimal < 900) {
            return getDiscreteParts(decimal, 500);
        } else if (decimal < 1000) {
            return getDiscreteParts(decimal, 900);
        } else {
            return getConcatRepetativeRomanNumber("M", decimal / 1000);
        }
    }

    private String getDiscreteParts(int decimal, int number) {
        return convert(number) + convert(decimal - number);
    }

    private String getConcatRepetativeRomanNumber(String romanNumber, int repeatCount) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeatCount; ++i) {
            sb.append(romanNumber);
        }
        return sb.toString();
    }
}
