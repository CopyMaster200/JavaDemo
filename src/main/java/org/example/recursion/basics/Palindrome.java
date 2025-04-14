package org.example.recursion.basics;

public class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        int res = reverse(n, (int) Math.pow(10, (int) Math.log10(n)));
        System.out.println("Reverse of " + n + " is: " + res);
        System.out.println("Is palindrome ? " + (res == n));

    }

    private static int reverse(int n, int pos) {
        if (n < 10)
            return n;
        int sum = n % 10 * pos;
        return sum + reverse(n / 10, pos / 10);
    }
}
