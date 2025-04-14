package org.example.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortValues {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println(myList.stream().sorted().collect(Collectors.toList()));
        System.out.println(myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
    }
}
