package org.example.dsa.patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int range = 5;
        for (int row = 1; row <= range; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
