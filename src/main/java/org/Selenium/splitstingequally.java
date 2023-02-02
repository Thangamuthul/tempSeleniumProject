package org.Selenium;

public class splitstingequally {
	public static void splitequally(String str,int equall) {
		int len=str.length();
		String[] temp=new String[equall];
		int equallen=len/equall;
		System.out.println(equallen);
		int count=0;
		if(len%equall!=0) {
			System.out.println("Cannot split equally");
		}
		else {
			for(int i=0;i<len;i=i+equallen) {
				String str1=str.substring(i,i+equallen);
				temp[count]=str1;
				count++; 
			}
			for(int i=0;i<equall;i++) {
				System.out.println(temp[i]);
			}
		}
	}
	public static void main(String args[]) {
		splitequally(new String("aaaaabbbbbbbbgfg3qds"),20);
	}

}
