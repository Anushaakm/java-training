package com.anu.codes;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1 (between 10 and 100): ");
        String num1Str = scanner.nextLine();
        int num1;
        try {
            num1 = Integer.parseInt(num1Str);
            if (num1 < 10 || num1 > 100) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Error: Bad Number");
            return;
        }

        // Read in second number
        System.out.print("Enter num2 (between -10 and 10): ");
        String num2Str = scanner.nextLine();
        int num2;
        try {
            num2 = Integer.parseInt(num2Str);
            if (num2 < -10 || num2 > 10) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Error: Bad Number");
            return;
        }

        // Read in operator
        System.out.print("Enter operator (+, -, *, or /): ");
        String operator = scanner.nextLine();
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            System.out.println("Error: Bad Operator");
            return;
        }

        // Perform calculation and print result
        int result = 0;
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("Error: Division by zero");
                return;
            }
            result = num1 / num2;
        }
        System.out.println("Result: " + result);
    }
}
