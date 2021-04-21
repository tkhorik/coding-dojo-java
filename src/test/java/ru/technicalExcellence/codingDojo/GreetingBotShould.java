package ru.technicalExcellence.codingDojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingBotShould {

    private GreetingBot greetingBot;

    @BeforeEach
    void setUp() {
        greetingBot = new GreetingBot();
    }

    @Test
    void sayHelloToMe() {
        assertEquals("Hello, Artem", greetingBot.sayHello("Artem"));
    }

    @Test
    void sayHelloToEveryone() {
        assertEquals("Hello, Vasya", greetingBot.sayHello("Vasya"));
    }

    @Test
    void sayHelloToAnon() {
        assertEquals("Hello, Mr. Dart", greetingBot.sayHello(null));
    }

    @Test
    void sayHelloTUpperCase() {
        assertEquals("HELLO, SASHA!", greetingBot.sayHello("SASHA"));
    }

}
