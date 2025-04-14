package org.example.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2}; // 1 2 3 4 5
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int maxIndex = findMaxIndex(arr, start, end);
            swap(arr, maxIndex, end);
            end--;
        }
    }

    private static void swap(int[] arr, int maxIndex, int end) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[end];
        arr[end] = temp;
    }

    public static int findMaxIndex(int[] arr, int start, int end) {
        int max = arr[start];
        int index = start;
        while (start < end) {
            if (arr[start] > max) {
                max = arr[start];
                index = start;
            }
            if (arr[end] > max) {
                max = arr[end];
                index = end;
            }
            start++;
            end--;
        }
        return index;
    }
}
