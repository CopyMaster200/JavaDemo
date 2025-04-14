package org.example.recursion.basics;

public class NtoOne {
    public static void main(String[] args) {
        fun(5);
    }

    private static void fun(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        fun(n - 1);
    }
}
