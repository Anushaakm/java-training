package com.anu.exceptionHandling.types;

public class ExceptionDemo {
	public void demo1() {
		int op1=10;
		int op2=10;
		int res1=op1+op2;
		System.out.println("Addition:"+res1);
		
		int res2=op1-op2;
		System.out.println("Sub:"+res2);
		int res3=op1*op2;
		System.out.println("Mul:"+res3);
		int res4=op1/op2;
		System.out.println("Div:"+res4);

	}
	 public void demo4() {
	        // ClassNotFoundException
	       // Class.forName("CarUtil"); // loads the class
	        try {
	            // expected event is, it will load CarUtil class
	            // unexpected is CarUtil is not available
	            Class.forName("com.ani.CarUtil");   // 🫳 throw new ClassNotFoundException(); 👈 
	        } catch (Exception e/*🤌*/) {
	            System.out.println("❌ CarUtil class is not available");
	        } finally {
	            System.out.println("⌛️ I will execute in all cases");
	        }
	    }

	    public void demo5() {
	        while(true) {
	            while(true) {
	                new String();
	            }
	        }
	    }
	    
	    public void demo6(int a, int b) {
	    	
	    }
	}

