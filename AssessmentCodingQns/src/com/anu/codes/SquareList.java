package com.anu.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquareList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        //System.out.print("Enter the list of numbers (max length 10): ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(",");
        
        if (inputArray.length > 10) {
            System.out.println("Error: Bad-Array");
            return;
        }
        
        for (String number : inputArray) {
            numbers.add(Integer.parseInt(number.trim()));
        }
        
        numbers.stream()
            .map(n -> n * n)
            .forEach(n -> System.out.print(n + " "));
            
        scanner.close();
    }
}