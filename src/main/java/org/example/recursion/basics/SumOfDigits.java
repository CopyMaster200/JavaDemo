package org.example.recursion.basics;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1234;
        System.out.println("Sum of digits in " + number + " is: " + sumOfN(number));
        System.out.println("product of digits in " + number + " is: " + productOfN(number));
        System.out.println("reverse of digits for " + number + " is: " + reverseOfN(number));

    }

    private static int sumOfN(int number) {
        if (number == 0)
            return 0;
        return (number % 10) + sumOfN(number / 10);
    }

    private static int productOfN(int n) {
        if (n % 10 == n)
            return n;
        return (n % 10) * productOfN(n / 10);
    }

    private static String reverseOfN(int n) {
        if (n % 10 == n)
            return "" + n;
        return (n % 10) + reverseOfN(n / 10);
    }
}
