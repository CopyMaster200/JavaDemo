package org.example.recursion.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 4, 3, 2, 8};
        selectionSort(arr, 0, arr.length - 1, arr[arr.length - 1]);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] selectionSort(int[] arr, int start, int end, int max) {
        if (end == 0)
            return arr;

        if (arr[start] < max) {
            return selectionSort(arr, start + 1, end, max);
        }

        if (arr[start] > max) {
            swap(arr, start, end);
        }

        return selectionSort(arr, 0, end - 1, arr[end - 1]);

//        if (start == end) {
//            return selectionSort(arr, 0, end-1, arr[end-1]);
//        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}
