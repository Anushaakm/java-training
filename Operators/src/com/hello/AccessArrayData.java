package com.hello;

import java.util.Scanner;

public class AccessArrayData {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Enter the position to access (1-" + numbers.length + "): ");
        int position = scanner.nextInt();
        
        if (position >= 1 && position <= numbers.length) {
            int data = numbers[position - 1];
            System.out.println("Data at position " + position + " is " + data);
        } else {
            System.out.println("Invalid position. Please enter a number between 1 and " + numbers.length + ".");
        }
    }
}
