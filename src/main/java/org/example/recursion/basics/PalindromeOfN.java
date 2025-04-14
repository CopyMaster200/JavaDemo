package org.example.recursion.basics;

import java.util.Scanner;

public class PalindromeOfN {
    public static void main(String[] args) {
        System.out.println("Enter a string to check palindrome:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char arr[] = input.toCharArray();
        System.out.println(palindrome(arr, 0, arr.length - 1));
    }

    private static boolean palindrome(char[] arr, int start, int end) {
        if ((start == end || start > end) && arr[start] == arr[end]) {
            return true;
        } else if (start < end && arr[start] == arr[end]) {
            return palindrome(arr, start + 1, end - 1);
        } else
            return false;
    }
}
