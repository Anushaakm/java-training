package com.anu.codingQuestions.Arrays;

 class ArraySearcher {

	public static int isExists(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
}

 public class ArrayRunner {
	public static void main(String[] args) {
		ArraySearcher a = new ArraySearcher();

		int[] arr = { 1,2,3,4,5,6,7,8,9 };
		int num = 2;
		int found = a.isExists(arr, num);
		if (found==-1) {
			System.out.println(num + " is found in the array"+);
		} else {
			System.out.println(num + " is not found in the array");
		}
	}

}
