package ru.technicalExcellence.codingDojo;

class GreetingBot {
    public String sayHello(String name) {
        var n1 = "";
        if (name == null) {
            n1 = "Mr. Dart";
        } else {
            n1 = name;
        }
        if (isUpperCase(n1)) {
            return "HELLO, " + n1 + "!";
        }
        return "Hello, " + n1;
    }

    private boolean isUpperCase(String n1) {
        return n1.toUpperCase().equals(n1);
    }
}
