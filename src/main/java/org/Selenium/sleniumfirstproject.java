package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sleniumfirstproject {
	
	WebDriver driver;
	public void launchBrowser() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Digital Suppliers\\\\Desktop\\\\Chrome Driver\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	WebElement ele=driver.findElement(By.id("email"));
	ele.sendKeys("Test");
	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.close();
}
public static void main(String args[]) {
	sleniumfirstproject sle = new sleniumfirstproject();
	try {
		sle.launchBrowser();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
