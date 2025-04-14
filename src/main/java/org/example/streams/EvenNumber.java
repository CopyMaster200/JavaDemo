package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a list of integers, find out all the even numbers that exist in the list using Stream functions
 */
public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        Map<Boolean, List<Integer>> list2 = list.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("List2: "+list2);
    }
}
