package acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import acti.pages.EnterPage;

public class LoginPagescreen extends BaseTests{
	
	@Test
public void  testLoginFunction(String username,String password)  {

		
	
	Logger=report.createTest("test login function");
	lp.enterUserName(username);
	Logger.info("entered username");
	lp.enterpassword(password);
	Logger.info("entered password");
	lp.clicklogin();
	Logger.info("clicked login button");
	ep = new EnterPage();
	String actual ="John";
	String expected = ep.validateuserLoggedin();
	Assert.assertEquals(actual, expected);
	Logger.pass("logged in successfully");
	ep.clickLogout();
	Logger.info("clicked logout");
}
}