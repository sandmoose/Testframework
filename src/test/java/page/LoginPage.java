package page;

import core.TestBase;
import map.LoginMap;

public class LoginPage extends LoginMap {
	
	public void getUrl()
	{
		TestBase.driver.get("http://www.newtours.demoaut.com");
	}
	
	public void verifySignIn(String username, String password) {
		sendKeys(userName(), username);
		sendKeys(password(), password);
		click(loginSubmit());
	}
	
}
