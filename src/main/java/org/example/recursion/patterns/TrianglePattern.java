package org.example.recursion.patterns;

public class TrianglePattern {
    public static void main(String[] args) {
//        triangle(4, 0);
        triangleNormal(4, 0);
    }

    private static void triangleNormal(int row, int col) {
        if (row == 0)
            return;
        if (row > col) {
            triangleNormal(row, col + 1);
            System.out.print("* ");
        } else {
            triangleNormal(row - 1, 0);
            System.out.println();
        }
    }

    private static void triangle(int row, int col) {
        if (row == 0)
            return;
        if (row > col) {
            System.out.print("* ");
            triangle(row, col + 1);
        } else {
            System.out.println();
            triangle(row - 1, 0);
        }
    }
}
