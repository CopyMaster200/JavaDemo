package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public class Java11Features {
    public static final String MID_BORDER = "#".repeat(15);

    public static void main(String[] args) throws IOException {
        lambdaDemo();
        StringDemo();
        optionalDemo();
        filesDemo();
    }

    /**
     * Files API Enhancements: The Files class was enhanced with methods to read and write strings directly.
     * writeString(Path, CharSequence)
     * readString(Path)
     */
    private static void filesDemo() throws IOException {
        System.out.println(MID_BORDER + " FILES DEMO " + MID_BORDER);
        Path filePath = Files.createTempFile("test", ".txt");

        // Write a string to a file
        Files.writeString(filePath, "Hello, Java 11!");

        // Read the string from the file
        String content = Files.readString(filePath);
        System.out.println(content); // "Hello, Java 11!"
    }

    /**
     * Java 11 introduced new methods to the Optional class.
     * isEmpty(): Returns true if the Optional is empty.
     * orElseThrow(): Throws NoSuchElementException if the Optional is empty (default behavior).
     */
    private static void optionalDemo() {
        System.out.println(MID_BORDER + " OPTIONAL DEMO " + MID_BORDER);
        Optional<String> optional = Optional.ofNullable("Java 11");
        // isEmpty()
        System.out.println(optional.isEmpty()); // false
        // orElseThrow()
        System.out.println(optional.orElseThrow()); // "Java 11"
    }

    /**
     * String Methods Enhancements
     * isBlank(): Checks if a string is empty or contains only whitespace.
     * lines(): Converts a multiline string into a Stream of lines.
     * strip(): Removes leading and trailing whitespaces (enhanced version of trim()).
     * repeat(int n): Repeats the string n times.
     */
    private static void StringDemo() {
        System.out.println(MID_BORDER + "STRING DEMO" + MID_BORDER);
        String str = "  Hello World  ";

        // isBlank()
        System.out.println(str.isBlank()); // false

        // lines()
        String multiline = "Hello\nJava\n11";
        multiline.lines().forEach(System.out::println);

        // strip()
        System.out.println(str.strip()); // "Hello World"

        // repeat()
        System.out.println("Java".repeat(3)); // "JavaJavaJava"
    }

    /**
     * Java 11 allows you to use var in lambda expressions to declare parameters
     */
    private static void lambdaDemo() {
        System.out.println(MID_BORDER + " LAMBDA DEMO " + MID_BORDER);
        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.stream()
                .map((var name) -> name.toUpperCase())
                .forEach(System.out::println);
    }
}
