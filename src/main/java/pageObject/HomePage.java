package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
By BacktoWaiting = By.cssSelector("i[class*='chevron circle left icon']");

public HomePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement getBacktoWaiting()
{
	return driver.findElement(BacktoWaiting);
	}
}
