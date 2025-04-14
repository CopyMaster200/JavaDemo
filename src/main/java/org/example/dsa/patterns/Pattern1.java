package org.example.dsa.patterns;

import java.util.Arrays;

public class Pattern1 {
    public static void main(String[] args) {
        char[][] mat = new char[3][3];
        for (int row = 0; row < mat.length; row++) {
            System.out.println(Arrays.toString(mat[row]));
            for (int col = 0; col < mat[row].length; col++) {
                mat[row][col] = '*';
            }
        }

        System.out.println("Print using for loop: ");
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println("Print using Arrays: ");
        for (int row = 0; row < mat.length; row++) {
            System.out.println(Arrays.toString(mat[row]));
        }
    }
}
