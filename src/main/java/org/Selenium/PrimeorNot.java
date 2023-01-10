package org.Selenium;

public class PrimeorNot {

	public static void PrintPrimeorNot(int a) {
		int b=a/2;
		if (a==0||a==1) {
			System.out.println(a+" Is not prime number");
		
		}
		else {
		boolean flag=false;
			for(int i=2;i<=b;i++) {
				if(a%i==0) {
					
					flag=true;
					break;
				}
				else {
					
					flag=true;
				}
			}
			if(flag) {
				System.out.print(a+" Is not prime number");
			}
			else {
				System.out.print(a+" Is not prime number");
			}
		}
		
	}
	
	public static void main(String args[]) {
		PrintPrimeorNot(2);
	}
	
}
