package org.example.dsa.recursion.sorting;

import java.util.Arrays;

/**
 * InsertionSort
 * It will sort the sub array incrementally(i+1) and
 * places the larger element at the end in the sub array.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
//        insertionSort(arr);
        int i = 0;
        insertionSort(arr, i, i + 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int i, int j) {
        if (i == arr.length - 1) return;

        if (j > 0) {
            if (arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
            }
            insertionSort(arr, i, j - 1);
        } else {
            insertionSort(arr, i + 1, i + 2);
        }
    }

    /**
     * Insertion sort using loops
     *
     * @param arr
     */
    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
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
