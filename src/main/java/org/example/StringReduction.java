package org.example;

/**
 * String Reduction
 * Have the function (str) take the str parameter being passed and return the smallest
 * number you can get through the following reduction method. The method is: Only the letters a, b, and c will
 * be given in str and you must take two different adjacent characters and replace it with the third. For
 * example "ace can be replaced with "b' but naan cannot be replaced with anything. This method is done
 * repeatedly until the string cannot be further reduced, and the length of the resulting string is to be
 * outputted.
 * For example: if str is "cab", then 'can can be reduced
 * to 'b' and you get "bb" (you can also reduce it to "cc").
 * The reduction is done so the output should be 2. If
 * str is 'bcab', "bc" reduces to so you have •aab",
 * then •ab' reduces to and the final string •ac' is
 * reduced to "bV so the output should be 1.
 */
public class StringReduction {
    public static void main(String[] args) {
        System.out.println(stringReduction("abc")); // test input: aaaa, bcab
    }

    private static int stringReduction(String input) {
        if(null == input)
            return 0;
        input = input.replaceAll("ab|ba", "c");
        input = input.replaceAll("bc|cb", "a");
        input = input.replaceAll("ca|ac", "b");
        return input.length();
    }
}
