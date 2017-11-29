package test;

import org.testng.annotations.Test;

import core.TestBase;
import page.LoginPage;

public class LoginTest extends TestBase {
	
	
	@Test(groups = "login")
	public void loginTest()
	{
		LoginPage loginPage = new LoginPage();
		loginPage.getUrl();
		loginPage.verifySignIn("mercury", "mercury");
	}
}
