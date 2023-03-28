package com.anu.codes;

import java.util.Scanner;

public class CirclePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double centerX = scanner.nextDouble();
        double centerY = scanner.nextDouble();
        double radius = scanner.nextDouble();
        double pointX = scanner.nextDouble();
        double pointY = scanner.nextDouble();
        double distance = Math.sqrt(Math.pow(pointX - centerX, 2) + Math.pow(pointY - centerY, 2));
        if (distance > radius) {
            System.out.println("The point is outside the circle.");
        } else if (distance < radius) {
            System.out.println("The point is inside the circle.");
        } else {
            System.out.println("The point is on the circumference of the circle.");
        }
       
    }
}