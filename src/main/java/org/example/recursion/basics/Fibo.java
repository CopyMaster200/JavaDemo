package org.example.recursion.basics;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        System.out.println("Enter a number to find nth fibo:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long startTime = System.currentTimeMillis();
        System.out.println("The "+n+"th fibo is: "+fibo(n));

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Execution time in milliseconds: " + duration);
        System.out.println("Execution time in seconds: " + duration / 1000);
    }

    private static long fibo(int n) {
        //Base condition which helps us to break recursion.
        if(n < 2)
            return n;
        return fibo(n-1) + fibo(n-2);
    }
}
