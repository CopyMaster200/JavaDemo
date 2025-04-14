package org.example.interview.ice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String str = "dabbcabcd"; // expected: 4
//        String str = "bab"; // expected: 2
        shortestSubstring(str);
    }

    public static int shortestSubstring(String givenString) {
        Set<Character> uniq = givenString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        System.out.println("Uniq chars: " + uniq);

        if (uniq.size() <= 1) {
            return givenString.length();
        }

        int len = givenString.length();
        int min = len;
        // Iterate through all possible start positions
        Set<Character> temp = new HashSet<>();
        for (int start = 0; start < givenString.length(); start++) {

            // Find the shortest substring starting from 'start'
            for (int end = start; end < givenString.length(); end++) {
                temp.add(givenString.charAt(end));

                // If we've captured all unique characters
                if (temp.size() == uniq.size()) {
                    int subLen = end - start + 1;
                    min = Math.min(min, subLen);
                    temp.clear();
                    break;  // Stop searching once we find a valid substring
                }
            }
        }

        System.out.println(min);
        return min;
    }

    public static int shortestSubstringAI(String givenString) {
        Set<Character> uniq = new HashSet<>();
        for (char c : givenString.toCharArray()) {
            uniq.add(c); // Collect all unique characters
        }
        System.out.println("Uniq chars: " + uniq);

        if (uniq.size() <= 1) {
            return givenString.length();
        }

        // Sliding window logic
        int min = givenString.length();
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int start = 0;

        for (int end = 0; end < givenString.length(); end++) {
            char endChar = givenString.charAt(end);
            freqMap.put(endChar, freqMap.getOrDefault(endChar, 0) + 1);

            // Check if the current window contains all unique characters
            while (freqMap.size() == uniq.size()) {
                // Update minimum length
                min = Math.min(min, end - start + 1);

                // Shrink the window from the left
                char startChar = givenString.charAt(start);
                freqMap.put(startChar, freqMap.get(startChar) - 1);
                if (freqMap.get(startChar) == 0) {
                    freqMap.remove(startChar);
                }
                start++;
            }
        }

        System.out.println(min);
        return min;
    }

}
