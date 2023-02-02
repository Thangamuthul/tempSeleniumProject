package testSuite;
import java.time.Duration;

import org.Selenium.ItestListentImplmentation;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObject.JQueryUIMenuPageObjects;
import pageObject.PageObjectManager;

@Listeners(org.Selenium.ItestListentImplmentation.class)
public class herokuappTestCase extends base{
	PageObjectManager pom =new PageObjectManager(getChromeInstance());
	JQueryUIMenuPageObjects jqueryPage =pom.getJQueryUIMenuPageObjects();
	WebDriverWait eait = new WebDriverWait(driver,Duration.ofSeconds(10));
	Actions action = new Actions(driver);
	@Test 
	public void clickonJaqueylink() throws InterruptedException {
		jqueryPage.lnkJQueryUIMenus.click();
		jqueryPage.ddEnabled.click();
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		eait.until(ExpectedConditions.visibilityOf(jqueryPage.ddDownload));
		jqueryPage.ddDownload.click();
		action.clickAndHold(jqueryPage.ddDownload);
		Thread.sleep(5000);
		TearDown();
	}
}
