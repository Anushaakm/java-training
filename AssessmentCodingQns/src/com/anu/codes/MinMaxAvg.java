package com.anu.codes;

import java.util.Scanner;
import java.util.Arrays;

public class MinMaxAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] values = input.split(",");
        int[] arr = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            arr[i] = Integer.parseInt(values[i].trim());
        }

      
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        double avg = Arrays.stream(arr).average().getAsDouble();

        
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);
    }
}