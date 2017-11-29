package map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.BaseCommands;

public class LoginMap extends BaseCommands {
	
	WebDriver driver;
	
	public By userName()
	{
		return By.name("userName");
	}
	
	public By password()
	{
		return By.name("password");
	}
	
	public By loginSubmit()
	{
		return By.name("login");
	}
}
