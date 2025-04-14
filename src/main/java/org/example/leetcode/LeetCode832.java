package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 832. Flipping an Image
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * For example, inverting [0,1,1] results in [1,0,0].
 * Example 1:
 * Input: image = [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class LeetCode832 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        for (int[] arr : flipAndInvertImage(image)) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int left = 0;
            int right = row.length - 1;

            while (left <= right) {
                // Flip by swapping the elements at left and right
                // Invert by XORing with 1
                int temp = row[left] ^ 1;
                row[left] = row[right] ^ 1;
                row[right] = temp;

                left++;
                right--;
            }
        }
        return image;
    }
    /*public static int[][] flipAndInvertImage(int[][] image) {
        List<Integer> temp = null;
        for (int[] pixel : image) {
            temp = new ArrayList<>();
            //reverse the row
            for (int i = pixel.length - 1; i >= 0; i--) {
                temp.add(pixel[i]);
            }
            // update 1's with 0's & vice-versa
            for (int k = 0; k < temp.size(); k++) {
                if (temp.get(k).equals(0))
                    temp.set(k, 1);
                else
                    temp.set(k, 0);
            }
            //re-assigning it back to image obj
            for (int i = 0; i < pixel.length; i++) {
                pixel[i] = temp.get(i);
            }
        }
        return image;
    }*/
}
