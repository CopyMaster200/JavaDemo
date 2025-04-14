package org.example.dsa.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 22, 65, 90};
        int target = 4;
        System.out.println(BS(arr, target, 0, arr.length - 1));
    }

    private static int BS(int[] arr, int target, int start, int end) {

        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            return mid;
        }

        if (target > arr[mid]) {
            return BS(arr, target, mid + 1, end);
        }
        return BS(arr, target, start, mid - 1);
    }
}
