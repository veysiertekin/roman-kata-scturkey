package com.github.scturkey;

public class RomanKataConverter {

    public String convert(int decimal) {
    	if (decimal<4){
    		StringBuilder sb = new StringBuilder();
    		for (int i=0;i<decimal;++i){
    			sb.append("I");
    		}
    		return sb.toString();
    	} else if (decimal == 4){
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
