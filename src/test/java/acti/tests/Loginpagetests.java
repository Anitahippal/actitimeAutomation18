package acti.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import acti.driver.Test;
import acti.pages.EnterPage;
import acti.pages.LoginPage;

public class Loginpagetests extends BaseTests {

	@org.testng.annotations.Test 
	
	public void testLoginPageTitle() {
		lp = new LoginPage();
		String actual = "actiTIME - Login";
		//String actual = "actiTIME";
		String expected = lp.validateLoginPageTitle();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
	}

   @org.testng.annotations.Test

	public void testForgotPasswordLink() {
		boolean flag = lp.validateForgotPasswordlink();

		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	@org.testng.annotations.Test 
	public void testActiveLogoisDisplayed() {

		boolean flag = lp.validateActiImg();
		System.out.println(flag);
		Assert.assertTrue(flag);

	}

	@org.testng.annotations.Test (dataProvider = "actidata")
	
	public void  testLoginFunction(String username,String password) {

		
		lp.enterUserName(username);
		lp.enterpassword(password);
		lp.clicklogin();
        ep = new EnterPage();
        String actual = "John Doe";
       	String expected = ep.validateuserLoggedin();
       	System.out.println(expected);
     	Assert.assertEquals(actual, expected);
		ep.clickLogout();
	}

} 



