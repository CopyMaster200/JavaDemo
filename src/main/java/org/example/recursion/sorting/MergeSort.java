package org.example.recursion.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 9, 19, 32}, arr2 = {4, 6, 8};
        int[] merge = new int[arr1.length + arr2.length];
        mergeSort(arr1, arr2, merge, 0, 0, 0);
        System.out.println(Arrays.toString(merge));
    }

    private static void mergeSort(int[] arr1, int[] arr2, int[] mix, int p1, int p2, int p3) {

        if (p1 == arr1.length) {
            System.arraycopy(arr2, p2, mix, p3, arr2.length - p2);
            return;
        }

        if (p2 == arr2.length) {
            System.arraycopy(arr1, p1, mix, p3, arr1.length - p1);
            return;
        }

        if (arr1[p1] < arr2[p2]) {
            mix[p3] = arr1[p1];
            mergeSort(arr1, arr2, mix, p1 + 1, p2, p3 + 1);
        } else if (arr1[p1] > arr2[p2]) {
            mix[p3] = arr2[p2];
            mergeSort(arr1, arr2, mix, p1, p2 + 1, p3 + 1);
        }

    }
}
