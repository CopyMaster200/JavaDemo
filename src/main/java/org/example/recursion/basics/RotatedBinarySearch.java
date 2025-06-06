package org.example.recursion.basics;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 1, 2};
        int target = 6;
        int result = search(arr, target, 0, arr.length - 1);
        System.out.println(result);
    }

    private static int search(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid])
                return search(arr, target, start, mid - 1);
            else
                return search(arr, target, mid + 1, end);
        }

        if (target >= arr[start] && target <= arr[mid])
            return search(arr, target, mid + 1, end);
        return search(arr, target, start, mid - 1);

    }
}
