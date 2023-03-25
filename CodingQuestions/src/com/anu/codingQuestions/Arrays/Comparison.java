package com.anu.codingQuestions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Comparison {
	void compArrays() {
	 Integer[] array1 = {1, 2, 3, 4, 5};
     Integer[] array2 = {4, 5, 6, 7, 8};
     
     ArrayList<Integer> commonElements = new ArrayList<>(Arrays.asList(array1));
     commonElements.retainAll(Arrays.asList(array2));
     System.out.println("Common elements: " + commonElements);
     
     
	ArrayList<Integer> uniqueElements = new ArrayList<>(Arrays.asList(array1));
    uniqueElements.removeAll(Arrays.asList(array2));
    uniqueElements.addAll(Arrays.asList(array2));
    System.out.println("Unique elements: " + uniqueElements);
}
}