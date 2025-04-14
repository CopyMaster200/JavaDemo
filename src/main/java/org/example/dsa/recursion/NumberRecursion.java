package org.example.dsa.recursion;

public class NumberRecursion {
    public static void main(String[] args) {
        numberRecursion(1);
    }

    public static void numberRecursion(int n) {
        System.out.println(n);
        if (n == 5) {
            return;
        }
        numberRecursion(n + 1);
    }
}
