package com.github.scturkey;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanKataConverterTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void roman_number_test(int given, String expected) throws Exception {
        RomanKataConverter converter = new RomanKataConverter();
        assertEquals(converter.convert(given), expected);
    }
}
