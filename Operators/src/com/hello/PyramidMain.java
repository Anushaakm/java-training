package com.hello;
class Shap{
	public void pyShap(int rows) {
		for(int i=1;i<=rows;i++) {
			int spaces=rows-i;
			int stars=2*i-1;
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=stars;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void leftPy(int rows) {
		for(int i=1;i<=rows;i++) {
			int spaces=rows-i;
			int stars=i;
			//for(int j=1;j<=spaces;j++) {
				//System.out.print(" ");
			//}
			
			for(int k=1;k<=stars;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public void rightPy(int rows) {
		for(int i=0;i<=rows;i++) {
			int spaces=i;
			int stars=2*(rows-i);
			for(int j=spaces;j<=0;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=spaces;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
}
public class PyramidMain {

	public static void main(String[] args) {
		Shap sh=new Shap();
		sh.pyShap(5);
		sh.leftPy(5);
sh.rightPy(5);
}}
