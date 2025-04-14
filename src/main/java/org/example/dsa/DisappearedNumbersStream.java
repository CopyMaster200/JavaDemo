package org.example.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DisappearedNumbersStream {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        boolean[] present = new boolean[nums.length + 1]; // Track numbers from 1 to n

        // Mark numbers that exist in the array
        for (int num : nums) {
            present[num] = true;
        }

        // Collect missing numbers
        for (int i = 1; i <= nums.length; i++) {
            if (!present[i]) {
                missing.add(i);
            }
        }
        return missing;
    }

}