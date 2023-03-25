package com.hello;

public class RemChar {
	public String removeNthCharacter(String str, char ch) {
		 int index = str.indexOf(ch); 
	        if (index == -1) { 
	            return str;
	        }
	        if (index == 0) { 
	            return str.substring(1); 
	        }
	        if (index == str.length() - 1) { 
	            return str.substring(0, str.length() - 1);
	        }
	        // If character is in the middle of the string
	        String firstPart = str.substring(0, index); 
	        String secondPart = str.substring(index + 1); 
	        return firstPart + secondPart; 
	    }
}
