package org.example.dsa.sorting;

import java.util.Arrays;

/**
 * It will be used only when we know that we are dealing with continues range of numbers
 */
public class CyclicSort {
    public static void main(String[] args) {
//        int[] arr = {8, 10, 7, 6, 9};
//        int[] arr = {3, 5, 2, 1, 4};
//        int[] arr = {4, 6, 7, 5, 3};
        int[] arr = {4,0,1,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
