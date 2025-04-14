package org.example.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * How to find duplicate elements in a given integers list in java using Stream functions?
 */
public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        Set<Integer> resultSet = new HashSet<>(myList);
        System.out.println(resultSet);

        Set<Integer> unique = new HashSet<>();
        List<Integer> duplicates = myList.stream().filter(x -> !unique.add(x)).collect(Collectors.toList());
        System.out.println("Unique: " + unique + "\nDuplicates: " + duplicates);
    }
}
