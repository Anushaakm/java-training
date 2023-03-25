package com.anu.exceptionHandling.boot;

import com.anu.exceptionHandling.Custom.InvalidAgeException;
import com.anu.exceptionHandling.Custom.UserInputting;
import com.anu.exceptionHandling.Custom.WrongFileFormatException;

public class WrongFileRunner {
   
    public static void demo1() {
        UserInputting ip = new UserInputting();

        try {
            int age = ip.askForUserAge();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            ip.createUserFromFile("abc.txt");
        } catch (WrongFileFormatException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
    public static void demo4() {
        UserInputting ip = new UserInputting();
        try {
            ip.askForAmount();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        demo4();
    }
}