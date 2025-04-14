package org.example.interview.ivanti;

import java.util.HashSet;
import java.util.Set;

public class DuplicateSubsetSumDP {
    public static boolean hasDuplicateSubsetSum(int[] arr) {
        Set<Integer> sumSet = new HashSet<>();
        sumSet.add(0); // Initialize with sum 0 (empty subset)

        for (int num : arr) {
            Set<Integer> newSums = new HashSet<>();

            // Generate new sums based on existing subset sums
            for (int existingSum : sumSet) {
                int newSum = existingSum + num;

                // If the sum is already present, return true
                if (sumSet.contains(newSum)) {
                    return true;
                }

                newSums.add(newSum);
            }

            // Add all new sums to the main sumSet
            sumSet.addAll(newSums);
        }

        return false; // No duplicate subset sum found
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 1, 5, -6, 6, 5, 1, -9, 3};
        System.out.println(hasDuplicateSubsetSum(arr));  // Output: true
    }
}
