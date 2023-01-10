package org.Selenium;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class palindrom {
	static int r,sum;
	public static void main(String args[]) {
		int a=11;
		int temp=a;
		
		while(temp>0) {
			r=temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
		}
		if(a==sum) {
			
			System.out.println(sum+" Yes it palindrom");
		}
		else {
			System.out.println(sum+" No");
		}
	}

}
