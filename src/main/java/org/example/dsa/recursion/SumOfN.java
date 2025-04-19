package org.example.dsa.recursion;

public class SumOfN {
    public static void main(String[] args) {
        System.out.println("Recursion: " + sumOfN(9));
        System.out.println("Formula: " + sumOfNFormula(9));
    }

    private static int sumOfN(int n) {
        if (n <= 1) return 1;
        return n + sumOfN(n - 1);
    }

    private static int sumOfNFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}
