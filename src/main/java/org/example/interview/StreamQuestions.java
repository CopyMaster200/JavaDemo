package org.example.interview;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamQuestions {
    public static void main(String[] args) {
        String str = "abc";

        IntStream.range(0,str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .forEach(System.out::print);

        System.out.println();

        String reversed = IntStream.range(0,str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(reversed);
    }
}
