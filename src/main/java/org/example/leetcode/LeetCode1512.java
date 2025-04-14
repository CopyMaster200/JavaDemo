package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1512. Number of Good Pairs
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 * Example 1:
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */

public class LeetCode1512 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println("Number of Identical Pairs: " + numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    map.put(count, Arrays.asList(i, j));
                    count++;
                }
            }
        }
        System.out.println(map);
        return count;
    }
}
