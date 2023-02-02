package org.Selenium;
//Maximum occurring lexicographically smallest character in a String
public class Maximumoccurringlsmallestcharacter {
		  
	static String str ="ttttzzzzzzzzzzzzzzzesting is in progress";
	public static void maximumoccurent(String str) {
		
		int[] freq = new int[26];
		int max=0;
		char result =' ';
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				freq[str.charAt(i)-'a']++;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(max<freq[i]) {
				max=freq[i];
				result=(char)(i+'a');
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		maximumoccurent(str);
	}
	
	
		} 
