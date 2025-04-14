package org.example.dsa;

import java.util.Arrays;

/**
 * 1️⃣ Create an array of 5 numbers and print all elements using a loop.
 * 2️⃣ Modify an element in the array and print the updated array.
 * 3️⃣ Try to access an out-of-bounds index and see what happens (Hint: It will throw an ArrayIndexOutOfBoundsException).
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //created an int array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        //modify the element in the middle and print array
        numbers[2] = 10;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //IndexOutOfBoundException
        System.out.println(numbers[5]);
    }
}
