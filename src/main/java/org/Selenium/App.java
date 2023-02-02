package org.Selenium;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] a = new int[26];
        for(int i=0;i<26;i++) {
        	if(i%2==0) {
        		a[i]++;
        	}
        	
        }
        for(int i=0;i<26;i++) {
        System.out.println((char)(a[i]+'a')+" "+a[i]);	
        }
    }
}
