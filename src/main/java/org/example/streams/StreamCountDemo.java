package org.example.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integers, find the total number of elements present in the list using Stream functions?
 */
public class StreamCountDemo {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println("count: "+myList.stream().count());
    }
}
