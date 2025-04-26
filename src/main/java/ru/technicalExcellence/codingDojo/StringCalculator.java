package ru.technicalExcellence.codingDojo;

public class StringCalculator {

    public int add(String value) {
        if (value == null || value.isEmpty()) {
            return 0;
        } else {
            return Integer.parseInt(value);
        }
    }
}
