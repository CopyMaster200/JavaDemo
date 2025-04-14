package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoTest {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java 8 introduces functional programming",
                "Functional programming is powerful",
                "Learn Java 8 features"
        );

//        getDuplicateWords(sentences);
//        zerosToCornerPreserveOrder();
//        listOfList();
//        convertNumbersTocharsWithFlatMap();
//        MultiArrayWithFlatMap();
//        listOfOptionalItems();
        List<EmployeeDTO> employees = Arrays.asList(
                new EmployeeDTO("Alice", Arrays.asList("Java", "Spring")),
                new EmployeeDTO("Bob", Arrays.asList("Python", "Django")),
                new EmployeeDTO("Charlie", Arrays.asList("Java", "Microservices"))
        );

        //extract unique skills from employees
        List<String> skills = employees.stream()
                .flatMap(emp -> emp.skills.stream() )
                .distinct()
                .collect(Collectors.toList());
        System.out.println(skills);
    }

    private static void listOfOptionalItems() {
        List<Optional<String>> optionalList = Arrays.asList(
                Optional.of("Java"),
                Optional.empty(),
                Optional.of("Python"),
                Optional.of("C++")
        );

        List<String> filteredList = optionalList.stream()
                .flatMap(Optional::stream)  // Removing empty optionals
                .collect(Collectors.toList());

        System.out.println(filteredList);
    }

    private static void MultiArrayWithFlatMap() {
        String[][] data = {{"a", "b"}, {"c", "d"}, {"e", "f"}};
        List<String> result = Arrays.stream(data)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    private static void convertNumbersTocharsWithFlatMap() {
        List<Integer> numbers = Arrays.asList(123, 45, 678);
        List<Character> chars = numbers.stream()
                .map(Object::toString)
                .flatMap(str -> str.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println(chars);
    }

    private static void listOfList() {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Java", "Python"),
                Arrays.asList("C++", "JavaScript"),
                Arrays.asList("Go", "Rust")
        );

        nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }

    private static void zerosToCornerPreserveOrder() {
        int[] arr = {0, 4, 1, 0, 0, 0, 0, 9, 0};
        //output    {4,1,9,0,0,0}
        int len = arr.length;
        int zeroIndex = 0;
        int nonZero = 0;
        int temp;
        while (zeroIndex < len && nonZero < len) {
            if (arr[zeroIndex] == 0 && arr[nonZero] != 0) {
                temp = arr[zeroIndex];
                arr[zeroIndex] = arr[nonZero];
                arr[nonZero] = temp;
                zeroIndex++;
                nonZero++;
            }
            if (arr[zeroIndex] != 0) {
                zeroIndex++;
            }
            if (arr[nonZero] == 0) {
                nonZero++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    private static void getDuplicateWords(List<String> sentences) {
        // LOGIC
        Optional.ofNullable(sentences).ifPresent(strings -> {
            sentences.stream()
                    .flatMap(str -> Arrays.stream(str.split(" "))) // Correct way to split sentences into words
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() > 1) // Keep only duplicate words
                    .map(Map.Entry::getKey)
                    .forEach(System.out::println);
        });
    }
}

class EmployeeDTO {
    String name;
    List<String> skills;

    EmployeeDTO(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }
}
