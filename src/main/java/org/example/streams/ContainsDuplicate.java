package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Integer temp = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x)).findFirst().orElse(null);
        return Objects.nonNull(temp);
    }
}
