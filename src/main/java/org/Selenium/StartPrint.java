package org.Selenium;

public class StartPrint {
	
	public static void printStar(int a) {
		for(int i=a;i>=1;i--) {
			for(int j=1;j<=a-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1||j==2*i-1) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}				
			}
			System.out.println();			
		}
		for (int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	
		
	}
public static void main(String args[]) {
	printStar(5);
}
}
