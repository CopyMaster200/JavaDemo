package org.example.dsa.recursion;

public class ReverseNumber {
    public static int sum = 0;

    public static void main(String[] args) {
        int n = 123;
        reverse(n);
        System.out.println(sum);
    }

    static void reverse(int n) {
        if (n == 0) return;
        sum = (sum*10) + (n % 10);
        reverse(n / 10);
    }
}
