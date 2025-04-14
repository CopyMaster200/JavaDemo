package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeOfStream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
        List<Integer> cubes = integerList.stream()
                .map(x -> x * x * x)
                .filter(x -> x > 50)
                .collect(Collectors.toList());
        System.out.println(cubes);
    }
}
