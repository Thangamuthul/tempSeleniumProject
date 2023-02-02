package testSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class base {
	public static WebDriver driver;
	public void launchBrowserInstance(String Browsername) {
		switch (Browsername) {
		case "Chrome":
			System.out.println("Launched Chrome Browser");
			break;
		case "FireFox":
			System.out.println("Launched Firefox Browser");
			break;
		default :
			System.out.println("Selected out of supporeted broser");
			break;
		}
	}
	
	private WebDriver chromeBrowserInstance() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Digital Suppliers\\Desktop\\Chrome_Extention\\Chrome Driver\\chromedriver.exe");
		DesiredCapabilities chromeDC = new DesiredCapabilities();
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("diable-infobars");
		chromeoption.addArguments("start-maximized");
		//chromeoption.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		driver = new ChromeDriver(chromeoption);
		driver.get("http://the-internet.herokuapp.com/");
		//driver.quit();
		return driver;
			
	}
	public WebDriver getChromeInstance() {
		return chromeBrowserInstance();
	}
	public void TearDown() {
		driver.quit();
	}
}
