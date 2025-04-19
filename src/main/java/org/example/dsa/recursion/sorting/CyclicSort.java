package org.example.dsa.recursion.sorting;

import java.util.Arrays;

/**
 * Cyclic sort
 * When you are given with 1 to n elements we can apply cyclic sort.
 * correct index is based on the number start with range
 * suppose if numbers are from 1 to N then correct index = index - 1;
 * suppose if numbers are from 0 to N then correct index = index;
 * <p>
 * Here we will try to place the element at the correct index.
 */
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 4, 1};
//        cyclic(arr);
        cyclic(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclic(int[] arr, int i) {
        if (i == arr.length - 1) return;
        int correct = arr[i] - 1;
        if (arr[i] != arr[correct]) {
            swap(arr, i, correct);
            cyclic(arr, i);
        } else {
            cyclic(arr, i + 1);
        }
    }


    /**
     * Cyclic sort
     *
     * @param arr
     */
    private static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                swap(arr, i, correct);
            } else {
                i++;
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
