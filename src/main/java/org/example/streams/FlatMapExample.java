package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        example1();
        example2();
    }

    private static void example2() {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        // Using map to get the size of each list
        List<Integer> sizes = listOfLists.stream()
                .map(List::size)
                .collect(Collectors.toList());
        System.out.println("Sizes: " + sizes);  // Output: [3, 2, 4]

        // Using flatMap to flatten all integers into a single list
        List<Integer> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened List: " + flatList);  // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

    private static void example1() {
        List<String> sentences = Arrays.asList("hello world", "java streams", "flatMap example");
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());
        System.out.println(words);  // Output: [hello, world, java, streams, flatMap, example]
    }
}
