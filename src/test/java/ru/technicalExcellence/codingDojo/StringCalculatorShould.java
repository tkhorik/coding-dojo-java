package ru.technicalExcellence.codingDojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldShould {

    private HelloWorld helloWorld;

    @BeforeEach
    void setUp() {
        helloWorld = new HelloWorld();
    }

    @ParameterizedTest()
    @MethodSource("stringProvider")
    void return_0_when_null_is_given(int expected, String value) {
        assertEquals(expected, stringCalculator.add(value));
    }
}
