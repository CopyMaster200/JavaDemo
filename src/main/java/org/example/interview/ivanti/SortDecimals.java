package org.example.interview.ivanti;

import java.util.Arrays;

public class SortDecimals {
    public static void main(String[] args) {
        Number[] arr = {1, 5, 2, 1.0, 5.0, 2.0};

        for (Number num : arr) {
            System.out.println(num + " is of type " + num.getClass());
        }

        Arrays.stream(arr).filter(x -> x instanceof Double)
                .sorted()
                .forEach(System.out::println);
    }
}
