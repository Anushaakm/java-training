package com.hello;

public class StringRunner {
	public static void longestSubString() {
		PrintSubStringRunner ls = new PrintSubStringRunner();
        // System.out.println("Longest " + ls.longestSubString("abcabbccbbr") );
        // ls.longestSubString("rarxbzatyrqw");
        System.out.println("Longest " + ls.longestSubString("dfehiejfd") );
    }
	public static void rotationEquality() {

        RotationEqaulity roEq = new RotationEqaulity();

        String sts1 = roEq.isRotationEqual("abc", "bbc") ? "bbc is rotation of abc" : "bbc is not a roatation of abc";
        System.out.println(sts1);

        String sts2 = roEq.isRotationEqual("aa", "aa") ? "aa is rotation of aa" : "aa is not a roatation of aa";
        System.out.println(sts2);

        String sts3 = roEq.isRotationEqual("a", "b") ? "b is rotation of a" : "b is not a roatation of a";
        System.out.println(sts3);

        String sts4 = roEq.isRotationEqual("a", "a") ? "a is rotation of a" : "a is not a roatation of a";
        System.out.println(sts4);

        String sts5 = roEq.isRotationEqual("abcpqr", "rqpcba") ? "rqpcba is rotation of abcpqr" : "rqpcba is not a roatation of abcpqr";
        System.out.println(sts5);
    }
	
	 public static void remChar() {
	
	        RemChar rc= new RemChar();
		
	        System.out.println("Answer (abcpqr) "+ rc.removeNthCharacter("abcxpqr", 'x'));
	        System.out.println("There is no x in string "+ rc.removeNthCharacter("abcpqr", 'x'));
	        System.out.println("Invalid String "+ rc.removeNthCharacter("", 'x'));
	        System.out.println("Specify the character to be removed "+ rc.removeNthCharacter("abcxpqr", 'a'));
	        System.out.println("Answer (ab) "+ rc.removeNthCharacter("axb", 'x'));
	        System.out.println("Answer (nothing remains) "+ rc.removeNthCharacter("x", 'x'));
	        System.out.println("Answer (x) "+ rc.removeNthCharacter("xx", 'x'));
	        System.out.println("Answer (abcxpqr) "+rc.removeNthCharacter("axbcxpqr", 'x'));
	    }
	 

	
	public static void main(String[] args) {
		 System.out.println("🔥 General Solutions 🔥");
	      // rotationEquality();
	       remChar();
	}

}
