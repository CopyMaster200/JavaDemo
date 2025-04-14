package org.example;

import java.util.Stack;

public class Calculator {

    public static void main(String[] args) {
        String expression1 = "3+(4*5)-6"; // Example input
        String expression2 = "(6/3)+(2*3)"; // Another example

        System.out.println("Result for '" + expression1 + "': " + calculator(expression1));
        System.out.println("Result for '" + expression2 + "': " + calculator(expression2));
    }

    public static int calculator(String str) {
        return evaluateExpression(str);
    }

    private static int evaluateExpression(String expression) {
        Stack<Integer> values = new Stack<>();
        Stack<Character> operators = new Stack<>();
        int number = 0;
        boolean buildingNumber = false;

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // Skip spaces
            if (ch == ' ') {
                continue;
            }

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
                buildingNumber = true;
            } else {
                if (buildingNumber) {
                    values.push(number);
                    number = 0;
                    buildingNumber = false;
                }

                if (ch == '(') {
                    operators.push(ch);
                } else if (ch == ')') {
                    while (!operators.isEmpty() && operators.peek() != '(') {
                        values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
                    }
                    operators.pop(); // Remove '('
                } else if (isOperator(ch)) {
                    while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek())) {
                        values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
                    }
                    operators.push(ch);
                }
            }
        }

        // Push the last number if applicable
        if (buildingNumber) {
            values.push(number);
        }

        // Apply remaining operations
        while (!operators.isEmpty()) {
            values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    private static int applyOperation(char operator, int b, int a) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return a / b;
        }
        return 0;
    }
}

