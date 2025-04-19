package org.example.dsa.recursion;

public class SumOfDigitsOfN {
    public static void main(String[] args) {
        int digit = 12345;
        System.out.println("Digit: " + digit);
        System.out.println("Sum of digits: " + sumOfDigits(digit));
        System.out.println("Product of digits: " + productOfDigits(digit));
    }

    private static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    private static int productOfDigits(int n) {
        if (n % 10 == n) return n;
        return (n % 10) * productOfDigits(n / 10);
    }
}
