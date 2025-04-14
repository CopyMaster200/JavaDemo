package org.example;

import java.util.HashSet;
import java.util.Set;

public class DistinctList {

    public static void main(String[] args) {
        int[] arr = {0, -2, -2, 3, 3, 3}; // {100, 2, 101, 4}
        int count = duplicateCount(arr);
        System.out.println(count);
    }

    private static int duplicateCount(int[] arr) {
        int dupCount=0;
        Set<Integer> distinct = new HashSet<>();
        for(int i: arr) {
            dupCount += distinct.add(i) ? 0 : 1;
        }
        return dupCount;
    }
}
