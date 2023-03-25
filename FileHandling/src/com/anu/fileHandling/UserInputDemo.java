package com.anu.fileHandling;

import java.io.*;

public class UserInputDemo {

	
	    public static void userInputDemo(){
	        
	        try( // Create an InputStreamReader to read input from the console
		            InputStreamReader isr = new InputStreamReader(System.in);
		            
		            // Create a BufferedReader to read text from the InputStreamReader
		            BufferedReader br = new BufferedReader(isr);) {
	           
	            
	            // Prompt the user for input
	            System.out.print("Enter some text: ");
	            
	            // Read the user's input
	            String userInput = br.readLine();
	            
	            // Close the BufferedReader and InputStreamReader
	           // br.close();
	            //isr.close();
	            
	            // Write the user's input to a text file
	            File file = new File("src/com/anu/fileHandling/abc.txt");
	            System.out.println(file.getAbsolutePath());
	            FileWriter fw = new FileWriter(file);
	            fw.write(userInput);
	            fw.close();
	            
	            System.out.println("User input written to file.");
	            
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

	}


