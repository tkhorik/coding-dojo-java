package ru.technicalExcellence.codingDojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicToRomanConverterShould {

    private ArabicToRomanConverter arabicToRomanConverter;

    public static Stream<Arguments> provideRomanAndExpectedArabicValues() {
        return Stream.of(
            Arguments.of("I", 1),
            Arguments.of("V", 5),
            Arguments.of("X", 10),
            Arguments.of("L", 50),
            Arguments.of("II", 2)
        );
    }

    @BeforeEach
    void setUp() {
        arabicToRomanConverter = new ArabicToRomanConverter();
    }

    @ParameterizedTest
    @MethodSource("provideRomanAndExpectedArabicValues")
    void return_I_when_1_is_given(String romanExpected, Integer arabic) {
        assertEquals(romanExpected, arabicToRomanConverter.convert(arabic));
    }

    @Test
    @Disabled("TODO: Can't handle null values")
    void return_null_when_null_is_given() {
        assertEquals(null, arabicToRomanConverter.convert(null));
    }


}
