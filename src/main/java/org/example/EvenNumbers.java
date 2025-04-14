package org.example;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 6, 3};
        int result = collectMinNotInArray(array);
        System.out.println(result);
        evenNumbers();
    }

    private static int collectMinNotInArray(int[] array) {
        List<Integer> list = Arrays.stream(array)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);
        for (int i = 1; i < list.get(list.size() - 1); i++) {
            if (!list.contains(i)) {
                return i;
            }
        }
        return list.get(list.size() - 1)+1;
    }

    private static void evenNumbers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream()
                .filter(x -> x % 2 == 0) // Filter even numbers
                .map(x -> x * 2)         // Multiply each by 2
                .forEach(System.out::println); // Print each number

        IntSummaryStatistics summary = list.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(summary);
    }
}
