package org.example.streams;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeated {
    public static void main(String[] args) {
        String input = "Java Articles are Awesome";

        Character repeat = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) != input.lastIndexOf(c))
                .findFirst().orElse(null);

        System.out.println(repeat);

        Set<Character> seenCharacters = new HashSet<>();

        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !seenCharacters.add(c))
                .findFirst()
                .orElse(null);
        System.out.println(result);
    }
}
