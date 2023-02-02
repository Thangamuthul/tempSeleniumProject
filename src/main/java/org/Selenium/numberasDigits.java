package org.Selenium;
public class numberasDigits {
static String[] singleDigits = {"Zero","one","two","Three","Four","Five","six","Seven","Eight","Nine"};	
String[] elevenSerious= {"10","11","12","13","14","15","16","17","18","19"};
static String[] doubleDigits = { "","","Twenty","Thrity","fourty","Firty","Sixty","Seventy","Eighty","Ninety"};
static String[] TripleDigits = { "Zero","Hundred","Two Hundred","Three Hundred","Four Hundred","Five Hundred","Six Hundred","Seven Hundred","800","900"};	

public static String numberasString(int number) {
	int temp =number;
	int numbersize=0;
	String numberString ="";
	while(temp!=0) {
		temp=temp/10;
		numbersize++;
	}
	System.out.println("Number size"+numbersize);
	int temp1=number;
	System.out.println(temp1);
	for(int i=1;i<=numbersize;i++) {
		int nummberis =temp1%10;
		if(i==1) {
			numberString=singleDigits[nummberis]+" "+numberString;
		}
		else if(i==2) {
			numberString=doubleDigits[nummberis]+" "+numberString;
		}
		else if(i==3) {
			numberString=TripleDigits[nummberis]+" "+numberString;
		}
		temp1=temp1/10;
	}
	return numberString;
}
public static void main(String args[]) {
	
	System.out.println(numberasString(322));
}
}