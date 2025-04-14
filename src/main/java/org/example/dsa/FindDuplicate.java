package org.example.dsa;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("Duplicate Number: " + findDuplicate(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
