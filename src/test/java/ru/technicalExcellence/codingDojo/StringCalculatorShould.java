package ru.technicalExcellence.codingDojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldShould {

    private HelloWorld helloWorld;

    @BeforeEach
    void setUp() {
        helloWorld = new HelloWorld();
    }

    @Test
    void returnHelloWorld() {
        final var expected = "Hello World";

        final var actual = helloWorld.helloWorld();

        assertEquals(expected, actual);
    }

    @Test
    void return_0_when_empty_string_is_given() {
        assertEquals(0, stringCalculator.add(""));
    }
}
