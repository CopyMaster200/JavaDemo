package org.example.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        int len = nums.length;
        while (i < len) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
            System.out.println(Arrays.toString(nums));
        }
        List<Integer> missing = new ArrayList<>();
        for (int k = 0; k < len; k++) {
            if (nums[k] != k+1)
                missing.add(k+1);
        }
        return missing;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}