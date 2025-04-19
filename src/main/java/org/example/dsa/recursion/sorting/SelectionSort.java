package org.example.dsa.recursion.sorting;

import java.util.Arrays;

/**
 * Selection Sort:
 * Every time it will select the max element and keep it at the end of the array
 * and it doesn't disturb the correctly placed element
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
//        selection(arr);
        selection(arr, 0, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] selection(int[] arr, int i, int j, int max) {
        if (i == arr.length - 1) return arr;

        if (j < arr.length - i) {
            if (arr[max] < arr[j]) {
                max = j;
            }
            selection(arr, i, j + 1, max);
        } else {
            swap(arr, max, arr.length - 1 - i);
            selection(arr, i + 1, 0, 0);
        }
        return arr;
    }

    /**
     * Selection sort with loops
     *
     * @param arr
     */
    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[max] <= arr[j]) {
                    max = j;
                }
            }
            swap(arr, max, arr.length - 1 - i);
        }
    }

    /**
     * Just to swap the elements in the array
     *
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
