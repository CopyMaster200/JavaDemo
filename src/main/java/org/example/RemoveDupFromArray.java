package org.example;

import java.util.Arrays;

public class RemoveDupFromArray {
    public static void main(String[] args) {
//        80. Remove Duplicates from Sorted Array II
//        NOT WORKING.
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println("Count: "+removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int k = 0, count = 0, target = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                count++;
                if(count <=2) {
                    nums[k++] = nums[i];
//                    System.out.println(k);
                } else {
                    count = 0;
                }
            } else {
                target = nums[i--];
                count = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
