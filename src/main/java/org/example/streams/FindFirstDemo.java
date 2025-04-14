package org.example.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Given the list of integers, find the first element of the list using Stream functions?
 */
public class FindFirstDemo {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        myList.stream().findFirst().ifPresent(System.out::println);
    }
}
