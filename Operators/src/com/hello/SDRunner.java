package com.hello;

class SD {

	void sd() {
			double[] input={10,12,23,23,16,23,21,16};
			double n=8,sum=0,mean;
			for(int i=0;i<input.length;i++) 
			{
				sum=sum+input[i];
			}
			mean=sum/n;
	       	System.out.println("Mean :"+mean);
	       	sum=0;  
	    	for(int i=0;i<input.length;i++) 
	    	{
	    		sum+=Math.pow((input[i]-mean),2);
	    	
	    	}
	    	mean=sum/(n-1);
	    	double deviation=Math.sqrt(mean);
	    	System.out.println("standard deviation :"+deviation);
	}}
public class SDRunner{
	public static void main(String[] args) {
		SD sd=new SD();
		sd.sd();

}}
