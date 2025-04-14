package org.example;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Enter a string to check palindrome:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(palindrome(input.toLowerCase()));
    }

    private static boolean palindrome(String input) {
        boolean flag = true;
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                return false;
            }
        }
        return flag;
    }
}
