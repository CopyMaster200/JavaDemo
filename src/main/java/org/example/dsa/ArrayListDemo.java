package org.example.dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Cherry");

        List<String> sortedAsc = fruits.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> sortedDesc = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        List<String> lengthGT5 = fruits.stream()
                .filter(x -> x.length() > 5)
                .collect(Collectors.toList());

        System.out.println("Ascending order: " + sortedAsc);
        System.out.println("Descending order: " + sortedDesc);
        System.out.println("Length greater than 5: " + lengthGT5);
    }
}
