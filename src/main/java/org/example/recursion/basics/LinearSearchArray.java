package org.example.recursion.basics;

public class LinearSearchArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = search(arr, 0, 5);
        System.out.println(index);
    }

    private static int search(int[] arr, int index, int target) {
        if (index == arr.length - 1 && arr[index] != target)
            return -1;
        if (arr[index] != target)
            return search(arr, index + 1, target);
        return index;
    }
}
