package com.github.scturkey;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanKataConverterTest {
	
	
    @Test
    public void one_shouldConvertTo_I() throws Exception {
    	RomanKataConverter converter = new RomanKataConverter();
    	assertEquals(converter.convert(1),"I");
    }
}
