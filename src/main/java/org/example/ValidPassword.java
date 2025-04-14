package org.example;

import java.util.Scanner;

public class ValidPassword {
    private static final int MIN_LEN = 7;
    private static final int MAX_LEN = 31;

    public static void main(String[] args) {
        System.out.println("Please enter the password for validation: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean valid = SimplePassword(password);
        System.out.println("Password is: "+(valid ? "VALID" : "INVALID"));
    }

    private static boolean SimplePassword(String password) {
        boolean valid = true;
        String capitalCheck = ".*[A-Z].*";
        String numCheck = ".*[0-9].*";
        String symbolCheck = ".*[\\p{Punct}+\\-*/=<>].*";

        boolean hasCap = password.matches(capitalCheck);
        boolean hasNum = password.matches(numCheck);
        boolean hasSymbol = password.matches(symbolCheck);

        if (null == password) {
            return false;
        } else if (!(password.length() > MIN_LEN && password.length() < MAX_LEN)) {
            return false;
        } else if (!(hasCap && hasNum && hasSymbol)) {
            return false;
        } else if (password.toLowerCase().contains("password")) {
            return false;
        }
        return valid;
    }
}
