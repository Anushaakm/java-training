package com.hello;

public class Star {

	public static void main(String args[]) {
		
		int i, j, row = 6;
		// Outer loop work for rows
		for (i = 0; i < row; i++) {
			// inner loop work for space
			for (j = row - i; j > 1; j--) {
				// prints space between two stars
				//System.out.print(" ");
			}
			// inner loop for columns
			for (j = 0; j <= i; j++) {
				// prints star
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


class MSD 
{
   public static void main(String args[]) 
    { 
	double[] input={5,10,15,20,25};
	double n=5,sum=0,mean;
	for(int i=0;i<n;i++) 
	{
		sum=sum+input[i];
	}
	mean=sum/n;
       	System.out.println("Mean :"+mean);
	sum=0;  
	for(int i=0;i<n;i++) 
	{
		sum+=Math.pow((input[i]-mean),2);
	
	}
	mean=sum/(n-1);
	double deviation=Math.sqrt(mean);
	System.out.println("standard deviation :"+deviation);
 
   }
}
