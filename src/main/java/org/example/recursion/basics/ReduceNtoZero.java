package org.example.recursion.basics;

/***
 * Given integer num, return the number of steps to reduce it to zero.
 * In one step, if the number is even, you have to divide it by 2, otherwise you have to subtract it by 1.
 */
public class ReduceNtoZero {
    private static int steps = 0;

    public static void main(String[] args) {
        int num = 14;
        int result = numberOfSteps(num);
        System.out.println("Method1 steps count: " + result);

        int res = numberOfSteps2(num, 0);
        System.out.println("Method2 steps count: " + res);
    }

    private static int numberOfSteps2(int num, int count) {
        if (num == 0)
            return count;
        if (num % 2 == 0) {
            return numberOfSteps2(num / 2, count + 1);
        }
        return numberOfSteps2(num - 1, count + 1);
    }

    private static int numberOfSteps(int num) {
        if (num == 0)
            return steps;
        if (num % 2 == 0) {
            num = num / 2;
            steps++;
        } else {
            num = num - 1;
            steps++;
        }
        return numberOfSteps(num);
    }
}
