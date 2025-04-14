package org.example.dsa.patterns;

import java.util.Arrays;

public class Pattern2 {
    public static void main(String[] args) {
        int range = 4;
        pattern(range);
//        patternWithMatrix();
    }

    private static void pattern(int range) {
        for (int row = 0; row < range; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void patternWithMatrix() {
        char[][] mat = new char[3][3];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col <= row; col++) {
                mat[row][col] = '*';
            }
        }

        System.out.println("Using for loop:");
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("Using Arrays: ");
        for (int row = 0; row < mat.length; row++) {
            System.out.println(Arrays.toString(mat[row]));
        }
    }
}
