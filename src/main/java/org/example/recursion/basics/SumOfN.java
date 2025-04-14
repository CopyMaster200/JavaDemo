package org.example.recursion.basics;

public class SumOfN {
    public static void main(String[] args) {
        int range = 5;
        System.out.println("Sum of " + range + " is: " + sum(range));
    }

    private static int sum(int n) {
        if (n <= 1)
            return 1;
        return n + sum(n - 1);
    }
}
