package ru.technicalExcellence.codingDojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {
    @Test
    public void shouldConvert1ToI() {
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        assertEquals("I", converter.convert(1));
    }
    @Test
    public void shouldConvert2ToII() {
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        assertEquals("II", converter.convert(2));
    }
    @Test
    public void shouldConvert4ToIV() {
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        assertEquals("IV", converter.convert(4));
    }
    @Test
    public void shouldConvert5ToV() {
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        assertEquals("V", converter.convert(5));
    }
    @Test
    public void shouldConvert6ToVI() {
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        assertEquals("VI", converter.convert(6));
    }
}
