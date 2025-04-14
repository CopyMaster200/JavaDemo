package org.example.streams;

import org.example.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDept {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT"),
                new Employee("Bob", "HR"),
                new Employee("Charlie", "IT")
        );

        Map<String, List<String>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(map);

        List<String> names = Arrays.asList("Suresh", "Ramesh");
        String result = String.join(", ", names);
        System.out.println(result);
    }
}
