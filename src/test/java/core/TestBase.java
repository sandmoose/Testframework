package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public void init()
	{
		System.out.println("Before Method");
		chromeDriver();
		driver.manage().window().maximize();
	}
	
	protected WebDriver chromeDriver()
	{
		ChromeDriverManager.getInstance().setup();
		return driver = new ChromeDriver();
	}
	
	
	@AfterMethod
	public void finish() {
		driver.quit();
	}
	
}
