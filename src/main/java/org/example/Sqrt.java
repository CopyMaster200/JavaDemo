package org.example;

/**
 * 69. Sqrt(x)
 */
public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }

    public static int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }
}
