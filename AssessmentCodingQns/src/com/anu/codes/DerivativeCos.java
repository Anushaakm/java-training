package com.anu.codes;

import java.util.Scanner;

public class DerivativeCos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double radians = Math.toRadians(x);
		double derivative = -Math.cos(radians);
		System.out.println(derivative);
	}

}
