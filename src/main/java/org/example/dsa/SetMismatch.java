package org.example.dsa;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
//        int[] arr = {1,1};
        System.out.println("Mismatch set: " + Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                return new int[]{nums[k], k + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
