package com.anu.codingQuestions.InstaceFinding;

class TypeChecker {

	public void checkType(Object obj) {
		if (obj instanceof String) {
			System.out.println("The object is an instance of String");
		} else if (obj instanceof Integer) {
			System.out.println("The object is an instance of Integer");
		} else if (obj instanceof Double) {
			System.out.println("The object is an instance of Double");
		} else if (obj instanceof Boolean) {
			System.out.println("The object is an instance of Boolean");
		} else if (obj == null) {
			System.out.println("The object is Null");
		} else {
			System.out.println("The object is an instance of some other class");
		}
	}

}

public class Runner {

	public static void main(String[] args) {

		TypeChecker chk = new TypeChecker();
		chk.checkType(10);
		chk.checkType("abbc");
		chk.checkType(new Object());
		chk.checkType(null);
		chk.checkType();

	}

}
