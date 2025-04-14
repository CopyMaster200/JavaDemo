package org.example.recursion.basics;

public class FindArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 7};
        boolean isSorted = isSorted(arr, 0);
        System.out.print("ARRAY IS ");
        System.out.println(isSorted ? "sorted".toUpperCase() : "unsorted".toUpperCase());
    }

    private static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;
        return arr[index] <= arr[index + 1] && isSorted(arr, index + 1);
    }
}
