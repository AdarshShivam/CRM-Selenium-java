package pageEvents;
import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents
{
	ElementFetch ele = new ElementFetch();
	
	public void verifyLoginPageLoaded() 
	{
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginButton).size() > 0, "Element not found");
	}
	
	public void enterCredentials() 
	{
		ele.getWebElement("NAME", LoginPageElements.emailField).sendKeys("adarshschmidt123@gmail.com");
		ele.getWebElement("NAME", LoginPageElements.passwordField).sendKeys("test123");
	}
}
