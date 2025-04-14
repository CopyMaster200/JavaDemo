package org.example.recursion.basics;

import java.util.Scanner;

public class ZerosInN {
    private static int count = 0;

    public static void main(String[] args) {
        System.out.println("Enter a string to check palindrome:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        zero(num);
        System.out.println("Count if zero's (Method1): " + count);
        System.out.println("Count if zero's (Method2): " + zero(num, 0));
        System.out.println("Count if zero's (Method3): " + zeroMethod3(num, 0));
    }

    private static int zero(int num, int counter) {
        int rem = num % 10;
        if (rem == num) {
            if (rem == 0)
                ++counter;
            return counter;
        }
        if (rem == 0)
            counter++;
        return zero(num / 10, counter);
    }

    private static void zero(int num) {
        int rem = num % 10;
        if (rem == num) {
            if (num == 0) {
                ++count;
            }
            return;
        }
        if (rem == 0)
            count++;
        zero(num / 10);
    }

    private static int zeroMethod3(int num, int counter) {
        if (num == 0)
            return counter;
        int rem = num % 10;
        if (rem == 0) {
            return zeroMethod3(num / 10, counter + 1);
        }
        return zeroMethod3(num / 10, counter);
    }
}
