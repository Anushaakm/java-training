package com.anu.anno.GetSet;

public class Runner {
	 public static void demo() {
	        Account ac = new Account();
	        GetSetProcessor.generateAccessors(ac);
	    }
	 public static void main(String[] args) {
		 System.out.println("🔥 Annotations 🔥");

	        demo();
	}
}
