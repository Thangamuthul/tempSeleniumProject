package org.Selenium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class printCharOccurence {

	public static void printOccurence(String str) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i))== null) {
				map.put(str.charAt(i),1);
			}
			else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		//Iterator<Map.Entry<Character,Integer>> en = map.entrySet().iterator();
		
		PriorityQueue<Character> maxoccurent = new PriorityQueue<>( (a,b)-> map.get(b)-map.get(a) );
		maxoccurent.addAll(map.keySet());
		System.out.println(maxoccurent);
		/*
		 * while (en.hasNext()) { Map.Entry<Character,Integer> iter =en.next();
		 * System.out.println(iter.getKey()+"'s Value is "+iter.getValue());
		 * 
		 * }
		 */

		StringBuilder stringvalue = new StringBuilder();
		while (!maxoccurent.isEmpty()) {
			char current =maxoccurent.remove();
			for(int i=0;i<map.get(current);i++) {
			stringvalue.append(current);
			}
		}
		System.out.println(stringvalue);
	}
	public static void main(String args[]) {
		printOccurence("tttestadss");
		WebDriver driver = new ChromeDriver();
		Alert alert =driver.switchTo().alert();
		Select select = new Select(driver.findElement(By.className("")));
		
	}
}

