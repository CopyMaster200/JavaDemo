package org.example.recursion.basics;

public class ReverseOfN {
    public static int sum = 0;

    public static void main(String[] args) {
        int num = 1234;
        reverse(num);
        System.out.println("Reverse of " + num + " is: " + sum);

        System.out.println((int) Math.pow(10, String.valueOf(num).length() - 1));
        System.out.println("Reverse of " + num + " with base 10 is: " + reverseWithBase(num, (int) Math.pow(10, (int) Math.log10(num))));
    }

    private static int reverseWithBase(int num, int pos) {
        int temp = 0;
        if (num < 10) {
            return num;
        }
        int last = num % 10;
        temp = temp + last * pos;
        return temp + reverseWithBase(num / 10, pos / 10);
    }

    private static void reverse(int n) {
        if (n < 10) {
            sum = (sum * 10) + n;
            return;
        }
        sum = (sum * 10) + (n % 10);
        reverse(n / 10);
    }
}
