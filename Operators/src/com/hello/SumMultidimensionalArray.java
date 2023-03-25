package com.hello;

public class SumMultidimensionalArray {

    public static void main(String[] args) {

        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;

        // iterate over each row
        for (int i = 0; i < array.length; i++) {
            // iterate over each column in the row
            for (int j = 0; j < array[i].length; j++) {
                // add the element to the sum
                sum += array[i][j];
            }
        }

        System.out.println("Sum of the array is: " + sum);
    }
}

