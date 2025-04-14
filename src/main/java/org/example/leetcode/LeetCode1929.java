package org.example.leetcode;

import java.util.Arrays;

/**
 * 1929. Concatenation of Array
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.
 * Return the array ans.
 * Example 1:
 * <p>
 * Input: nums = [1,2,1]
 * Output: [1,2,1,1,2,1]
 * Explanation: The array ans is formed as follows:
 * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
 * - ans = [1,2,1,1,2,1]
 */
public class LeetCode1929 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] output = new int[nums.length * 2];
        for (int i = 0, j = 0; i < output.length; i++, j++) {
            if (j == nums.length) {
                j = 0;
            }
            output[i] = nums[j];
        }
        return output;
    }
}
