package org.example.streams;

/***
 * Given a String, find the first non-repeated character in it using Stream functions?
 */
public class FirstNonRepeated {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        Character nonRepeat = input.chars().mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst().orElse(null);

        System.out.println("First non repeated character: "+nonRepeat);
    }
}
