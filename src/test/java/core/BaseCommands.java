package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseCommands extends TestBase {
	
	public void sendKeys(By by,String text)	{
		findElement(by).sendKeys(text);
	}
	
	public WebElement findElement(By by) {
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(by));
		return driver.findElement(by);
	}
	
	public void click(By by)	{
		findElement(by).click();
	}

}
