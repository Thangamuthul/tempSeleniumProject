package org.Selenium;

public class KeithNumber {
	
	public static void main(String args[]) {
		int a=197,numbDuplicate=a;
		
		int size=String.valueOf(a).length();
		//System.out.println(size);
		//int incrementSize=size;
		int c=size,count=0;
		
		int[] numbertoAdd = new int[100];
		 while (numbDuplicate>0) {
		 numbertoAdd[--size]=numbDuplicate%10;
		 numbDuplicate=numbDuplicate/10;
				 
		  }
		while (true) {
			int sum = 0;
			for(int i=count;i<c;i++) {
				sum+=numbertoAdd[i];
			}
			System.out.println("Sume Is "+sum);
			if(a<sum) {
			System.out.println(sum+"  "+"Number Is Not Keith number");	
			System.exit(0);
			}
			else if(a==sum) {
				System.out.println(sum+"  "+"Number Is Keith number");
				System.exit(0);
			}
			numbertoAdd[c]=sum;
			count++;
			c++;
			System.out.println("c valid is "+c+"count us "+count);
		}
	}

}
