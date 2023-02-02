package org.Selenium;

import java.util.ArrayList;
import java.util.List;

public class Maxsubstring {
public static void maxsubstring(String str ) {
	int maxofOccureence=0;
	StringBuilder maxstring = new StringBuilder();
	for(int i=0;i<str.length();i++) {
	for(int j=i;j<str.length();j++) {
		
		if(maxstring.indexOf(String.valueOf(str.charAt(j)))!=-1) {
			break;
		}
		else {
			maxstring.append(str.charAt(j));
			if(maxofOccureence<maxstring.length()) {
				maxofOccureence=maxstring.length();
			}
		}
	}
	}
	System.out.println("Maximum sub string is "+maxstring);
}

public static void main(String args[]) {
	maxsubstring("abcababcabcde");
}
}
