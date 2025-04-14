package org.example.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        //           0  1  2  3  4
        long start = System.currentTimeMillis();
        insertionSort(arr);
        long end = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("Time: " + (end - start) + "ms");
    }

    public static void insertionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i <= len - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j -1);
                } else {
                    break;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
