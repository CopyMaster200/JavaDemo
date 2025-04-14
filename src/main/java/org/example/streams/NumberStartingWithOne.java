package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, find out all the numbers starting with 1 using Stream functions?
 */
public class NumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        myList.stream().map(String::valueOf).filter(x -> x.startsWith("1")).forEach(System.out::println);
        List<Integer> result = myList.stream().filter(num -> {
            int n = num;
            while (n >= 10) {
                n /= 10;
            }
            return n == 1;
        }).collect(Collectors.toList());
        System.out.println("List start's with 1:" + result);
    }
}
