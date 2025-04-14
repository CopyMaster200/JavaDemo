package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenFromList {
    public static void main(String[] args) {
        removeEvenInList();
        usingCollection();
    }

    private static void usingCollection() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        nums.removeIf(num -> num % 2 == 0);
        System.out.println(nums);
    }

    private static void removeEvenInList() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(nums);
    }
}
