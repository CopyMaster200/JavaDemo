package org.example.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class ThirdMax {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1};  // Third max is 1
        int[] nums2 = {2, 2, 3, 1};  // Third max is 1
        int[] nums3 = {1, 2};  // No third max, return max (2)

        System.out.println(thirdMax(nums1)); // Output: 1
        System.out.println(thirdMax(nums2)); // Output: 1
        System.out.println(thirdMax(nums3)); // Output: 2
    }

    public static int thirdMax(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElse(Arrays.stream(nums).max().getAsInt());
    }
}
