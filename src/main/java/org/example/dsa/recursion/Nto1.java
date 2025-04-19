package org.example.dsa.recursion;

public class Nto1 {
    public static void main(String[] args) {
        System.out.println("Printing from N to 1: ");
        printNto1(5);
        System.out.println("\n" + "#".repeat(30));
        System.out.println("Printing from 1 to N: ");
        print1toN(5);
        System.out.println();
    }

    /**
     * Forward Recursion
     */
    private static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " "); // normal / forward recursion
        printNto1(n - 1);
    }

    /**
     * Tail Recursion
     */
    private static void print1toN(int n) {
        if (n == 0) {
            return;
        }
        print1toN(n - 1);
        System.out.print(n + " "); // tail recursion
    }
}
