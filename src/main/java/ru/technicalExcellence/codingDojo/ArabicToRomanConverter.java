package ru.technicalExcellence.codingDojo;

import java.util.Map;

public class ArabicToRomanConverter {

    private Map<Integer, String> arabicToRoman = Map.of(
            1, "I",
            5, "V",
            10, "X",
            50, "L"
    );

    public String convert(Integer value) {

        return arabicToRoman.getOrDefault(value, null);
    }
}
