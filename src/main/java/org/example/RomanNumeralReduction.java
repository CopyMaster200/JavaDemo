package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralReduction {
    public static void main(String[] args) {
        String input = "LLLXXXVVVV"; // Example input LLLXXXVVVV, DDLL
        String reduced = reduceRomanNumerals(input);
        System.out.println("Reduced Roman Numerals: " + reduced);
    }

    private static String reduceRomanNumerals(String input) {
        // Map of Roman numeral values
        Map<Character, Integer> romanValues = new LinkedHashMap<>();
        romanValues.put('M', 1000);
        romanValues.put('D', 500);
        romanValues.put('C', 100);
        romanValues.put('L', 50);
        romanValues.put('X', 10);
        romanValues.put('V', 5);
        romanValues.put('I', 1);

        int sum = 0;
        for(char c : input.toCharArray()) {
            sum += romanValues.get(c);
        }

        System.out.println(sum);

        StringBuilder reduce = new StringBuilder();
        for(Map.Entry<Character, Integer> entry: romanValues.entrySet()) {
            while(sum >= entry.getValue()) {
                reduce.append(entry.getKey());
                sum-= entry.getValue();
            }
        }
        return reduce.toString();
    }
}
