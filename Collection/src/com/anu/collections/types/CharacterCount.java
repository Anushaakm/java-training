package com.anu.collections.types;


import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	 public String countChars(String ip) {
		 
		 Map<Character, Integer> charCount = new HashMap<>();
		 for (char c : ip.toCharArray()) {
	            if (charCount.containsKey(c)) {
	                charCount.put(c, charCount.get(c) + 1);
	            } else {
	                charCount.put(c, 1);
	            }
	        }
	        
	        // Print result
	        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
	            System.out.print(entry.getKey() + "" + entry.getValue());
	        }
			return ip;
	    }
	}
	        
