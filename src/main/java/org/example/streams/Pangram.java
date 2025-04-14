package org.example.streams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(sentence);
        System.out.println(isPangram);
        System.out.println(isPan(sentence));
    }

    private static boolean isPangram(String sentence) {
        return sentence.toLowerCase()
                .chars()
                .mapToObj(x -> (char) x)
                .filter(Character::isAlphabetic)
                .collect(Collectors.toSet())
                .size() == 26;
    }

    private static boolean isPan(String sentence) {
        char[] chars = sentence.toLowerCase().toCharArray();
        Set<Character> charSet = new HashSet<>();
        for (Character c : chars) {
            if (Character.isAlphabetic(c))
                charSet.add(c);
        }
        return charSet.size() == 26;
    }
}
