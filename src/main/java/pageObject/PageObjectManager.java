package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public JQueryUIMenuPageObjects jQueryUIMenuPageObjects;
	public PageObjectManager(WebDriver driver) {
	this.driver=driver;
	}
	public JQueryUIMenuPageObjects getJQueryUIMenuPageObjects() {
	return (jQueryUIMenuPageObjects == null) ? jQueryUIMenuPageObjects = new JQueryUIMenuPageObjects(driver) : jQueryUIMenuPageObjects;
	}
}
