package org.example.recursion.basics;

public class FactorialOfN {
    public static void main(String[] args) {
        int range = 5;
        System.out.println("Factorial of " + range + " is: " + fact(range));
    }

    private static long fact(long n) {
        if (n <= 1)
            return 1; // BASE CONDITION: to cover 0! = 1
        return n * fact(n - 1);
    }
}
