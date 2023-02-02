package org.Selenium;

public class AutomorphicNumber {
public static void main (String args[]) {
	int a=7;
	int squrateofnumber=a*a;
	int modular=String.valueOf(squrateofnumber).length();
	String str="0";
	String str1="1";
	while((modular-1)>0) {
		str1=str1+str;
		modular--;
	}
	int findreminder=Integer.valueOf(str1);
	int finalnumber=squrateofnumber%findreminder;
	if(a==finalnumber) {
	System.out.println("Automorphonic number");
	
	}
	else {
		System.out.println("Not automa number");
	}
	
}
	
	
}
