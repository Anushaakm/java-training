package com.anu.codingQuestions.YearValidation;

import java.time.LocalDate;
import java.util.Scanner;

public class YearValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        while (true) {
            System.out.print("Enter a year (not a future year and not older than 23 years): ");

            try {
                year = scanner.nextInt();

                if (isFutureYear(year)) {
                    throw new Exception("Year cannot be a future year");
                }

                if (isOlderThan23Years(year)) {
                    throw new Exception("Year cannot be older than 23 years");
                }

                break;
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
                scanner.nextLine(); // clear input buffer
            }
        }

        System.out.println("Year entered: " + year);
    }

    public static boolean isFutureYear(int year) {
        return year > LocalDate.now().getYear();
    }

    public static boolean isOlderThan23Years(int year) {
        int currentYear = LocalDate.now().getYear();
        return currentYear - year > 23;
    }
}
