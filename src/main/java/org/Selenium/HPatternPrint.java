package org.Selenium;

public class HPatternPrint {

	public static void printHshape(int a) {
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=i;j++) {
			
				System.out.print("*");
		
		}
		for(int k=1;k<=a-i;k++) {
			System.out.print(" ");
		}
		for(int k=1;k<=a-i;k++) {
			System.out.print(" ");
		}
		for(int j=i;j>=0;j--) {
			
			System.out.print("*");
	}
		

		System.out.println();
	}

		
		
	}
	public static void main(String args[]) {
		printHshape(9);
	}
}
