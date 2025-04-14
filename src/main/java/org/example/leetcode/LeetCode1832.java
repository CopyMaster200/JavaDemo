package org.example.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 1832. Check if the Sentence Is Pangram
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 * Example 1:
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 */
public class LeetCode1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        String sentence = "leetcode";
        System.out.println("IS " + sentence + " a PANGRAM? " + checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        Set<Character> uniqueChars = new HashSet<>();

        // Add each character in the sentence to the set
        for (char c : sentence.toCharArray()) {
            uniqueChars.add(c);
        }

        // Check if the set contains all 26 letters of the English alphabet
        return uniqueChars.size() == 26;
    }
}
