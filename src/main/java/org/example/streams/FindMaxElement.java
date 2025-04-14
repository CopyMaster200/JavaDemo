package org.example.streams;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        int max = myList.stream().mapToInt(x -> x).max().getAsInt();
        int maxStat = myList.stream().mapToInt(x -> x).summaryStatistics().getMax();
        System.out.println(maxStat);
    }
}
