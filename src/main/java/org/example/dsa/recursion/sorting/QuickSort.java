package org.example.dsa.recursion.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * In Quick sort we will try to place the pivot at the correct position first
     * Then we will try to
     *
     * @param arr
     * @param low
     * @param high
     */
    private static void quickSort(int[] arr, int low, int high) {

        if (low >= high) return;

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);
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
