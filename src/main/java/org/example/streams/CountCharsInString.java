package org.example.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * program to print the count of each character in a String?
 * Input: String s = "string data to count each character";
 * Output: {s=1, t=5, r=3, i=1, n=2, g=1,  =5, d=1, a=5, o=2, c=4, u=1, e=2, h=2}
 */
public class CountCharsInString {
    public static void main(String[] args) {
        String s = "string data to count each character";
        findCountOfChars(s);
    }

    public static void findCountOfChars(String s) {
        Map<Character, Long> map = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
