package org.example.dsa.sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicate(arr));
    }

    public static List<Integer> findDuplicate(int[] nums) {
        int i = 0;
        List<Integer> duplicates = new ArrayList<>();
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
                duplicates.add(nums[k]);
            }
        }
        return duplicates;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
