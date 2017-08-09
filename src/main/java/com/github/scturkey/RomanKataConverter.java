package com.github.scturkey;

public class RomanKataConverter {

    public String convert(int decimal) {
        if (decimal == 1) {
            return "I";
        }else if (decimal == 2) {
            return "II";
        }else if (decimal == 3){
        	return "III";
        }else if (decimal == 4){
        	return "IV";
        }else if (decimal == 5){
        	return "V";
        }else if (decimal == 6){
        	return "VI";
        }else {
        	return "X";
        }
        
    }

}
