package ru.technicalExcellence.codingDojo;

public class RomanNumeralsConverter {
    public String convert(int number) {
        if (number == 4) {
            return "IV";
        }

        String result = "";

        if (number >= 5) {
            result += "V";
            number -= 5;
        }

        for (int i = 0; i < number; i++) {
            result += "I";
        }

        return result;
    }
}
