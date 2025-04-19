package org.example.dsa.recursion.sorting;

import java.util.Arrays;

/**
 * Compares adjacent elements and keeps the highest element at the right corner
 * For each iteration.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
//        bubble(arr);
        bubble(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Recursion bubble sort
     *
     * @param arr
     * @param i
     * @param j
     * @return
     */
    private static int[] bubble(int[] arr, int i, int j) {
        if (i == arr.length - 1) return arr;

        if (j < arr.length - 1 - i) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
            }
            return bubble(arr, i, j + 1);
        }
        return bubble(arr, i + 1, 0);
    }

    /**
     * Normal bubble sort
     *
     * @param arr
     */
    private static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = false;
                }
            }
            if (flag)
                break;
        }
    }

    /**
     * Just to swap the elements in the array
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
