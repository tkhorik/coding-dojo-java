package ru.technicalExcellence.codingDojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {

    private StringCalculator stringCalculator;

    public static Stream<Arguments> stringProvider() {
        return Stream.of(
                Arguments.of(0, null),
                Arguments.of(0, ""),
                Arguments.of(1, "1"),
                Arguments.of(3, "1,2")
        );
    }

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @ParameterizedTest()
    @MethodSource("stringProvider")
    void return_0_when_null_is_given(int expected, String value) {
        assertEquals(expected, stringCalculator.add(value));
    }
}
