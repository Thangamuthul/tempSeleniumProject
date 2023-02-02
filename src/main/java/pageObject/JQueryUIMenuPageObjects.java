package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class JQueryUIMenuPageObjects {
	public JQueryUIMenuPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//a[text()='JQuery UI Menus']")
	public WebElement lnkJQueryUIMenus;
	@FindBy(how=How.XPATH,using="//a[@class='ui-corner-all' and text()='Enabled']")
	public WebElement ddEnabled;
	@FindBy(how=How.XPATH,using="//a[@class='ui-corner-all ui-state-focs']")
	public WebElement ddDownload;
	@FindBy(how=How.XPATH,using="//a[text()='Back to JQuery UI']")
	public WebElement lnkBacktoHome;
	
}
