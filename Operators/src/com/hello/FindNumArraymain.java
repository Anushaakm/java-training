package com.hello;

public class FindNumArraymain {
    public static void main(String[] args) {
    	Array a=new Array();
        int[] myArray = {2, 3, 5, 7, 11};
        int numberToFind = 5;
        int position = a.findNumber(myArray, numberToFind);
        if (position != -1) {
            System.out.println("Number found at position " + position);
        } else {
            System.out.println("Number not found in the array.");
        }
    }}
class Array{
    public static int findNumber(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i; // found the number at position i
            }
        }
        return -1; // number not found in the array
    }}


