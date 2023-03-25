package com.anu.codingQuestions.Collection;

public class Runner {
	
	 public static void containsDuplicate() {
	        Duplicate cd = new Duplicate();
	        System.out.println( cd.containsDuplicates(new Integer[]{1 ,8, 9, 7}));;
	        System.out.println( cd.containsDuplicates(new Integer[]{1 , 7 ,8, 9,8}));;
	    }
public static void main(String[] args) {
	 containsDuplicate();
}
}
