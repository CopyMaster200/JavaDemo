package org.example.dsa.recursion;

public class FactorialOfN {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n) {
        if (n <= 1) return n;
        return n * fact(n - 1);
    }
}
