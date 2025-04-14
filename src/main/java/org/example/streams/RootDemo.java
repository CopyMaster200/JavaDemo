package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RootDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 9, 16, 25, 36);
        System.out.println("Square root: "+numbers.stream().map(Math::sqrt).collect(Collectors.toList()));

        List<Integer> cubes = Arrays.asList(8, 27, 64, 125, 216);
        System.out.println("Cube root: "+cubes.stream().map(Math::cbrt).collect(Collectors.toList()));
    }
}
