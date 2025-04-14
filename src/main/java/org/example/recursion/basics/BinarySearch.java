package org.example.recursion.basics;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11, 23, 32, 41, 57, 90}; // Assume it is sorted for binary search

        int search = 1;
        int index = search(arr, 0, arr.length - 1, search);
        System.out.println("Index position of " + search + " is " + index);
    }

    private static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1; // Element not found
        }

        int mid = start + (end - start) / 2;
        int element = arr[mid];

        if (element == target) {
            return mid; // Element found
        } else if (element < target) {
            return search(arr, mid + 1, end, target); // Search in the right half
        } else {
            return search(arr, start, mid - 1, target); // Search in the left half
        }
    }
}
