package org.example.dsa;

import java.util.Arrays;

public class FindMissingPositive {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 0};
        int[] arr = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
            System.out.println(Arrays.toString(nums));
        }

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                return k + 1;
            }
        }
        return nums.length + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
