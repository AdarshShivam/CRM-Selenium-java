package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class Testcase1 extends BaseTest{
  
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents(); 
	
	@Test
	  public void enteringCredentials() 
	  {
			logger.info("Going into log in page");
			homePage.signInButton();
			logger.info("Verify if page is loaded");
			loginPage.verifyLoginPageLoaded();
			logger.info("Entering credentials");
			loginPage.enterCredentials();
	  }
}
