package org.example.recursion.basics;

public class OneToN {
    public static void main(String[] args) {
        fun(5);
    }

    private static void fun(int n) {
        if (n == 0)
            return;
        fun(n - 1);
        System.out.println(n);
    }

}
