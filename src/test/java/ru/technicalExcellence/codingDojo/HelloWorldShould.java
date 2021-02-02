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
        assertEquals("Hello World", helloWorld.helloWorld());
    }

}
