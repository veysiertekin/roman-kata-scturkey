package com.github.scturkey;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanKataConverterTest {


    @Test
    public void one_shouldConvertTo_I() throws Exception {
        RomanKataConverter converter = new RomanKataConverter();
        assertEquals(converter.convert(1),"I");
    }
    @Test
    public void two_shouldConvertTo_II() throws Exception {
        RomanKataConverter converter = new RomanKataConverter();
        assertEquals(converter.convert(2),"II");
    }
    @Test
    public void three_shouldConvertTo_III() throws Exception {
        RomanKataConverter converter = new RomanKataConverter();
        assertEquals(converter.convert(3),"III");
    }
    
    @Test
    public void five_shouldConvertTo_V() throws Exception {
        RomanKataConverter converter = new RomanKataConverter();
        assertEquals(converter.convert(5),"V");
    }
    
    @Test
    public void ten_shouldConvertTo_X() throws Exception {
        RomanKataConverter converter = new RomanKataConverter();
        assertEquals(converter.convert(10),"X");
    }

}
