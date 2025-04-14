package org.example.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2};
        bubbleSort(arr);
        System.out.println("Final: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean sorted = true;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    sorted = false;
                    System.out.println(Arrays.toString(arr));
                }
            }
            if(sorted) {
                break;
            }
            System.out.println("outer");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

