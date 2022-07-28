package acti.tests;

import org.testng.Assert;

import acti.driver.Test;
import acti.pages.EnterPage;
import acti.pages.LoginPage;

public class Loginpagetests extends BaseTests {
	      
	@Test 
	public void testLoginPageTitle() {
		lp = new LoginPage();
		String actual = "actiTIME - Login";
		String expected = lp.validateLoginPageTitle();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
	}

   @Test 

	public void testForgotPasswordLink() {
		boolean flag = lp.validateForgotPasswordlink();

		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	@Test 
	public void testActiveLogoisDisplayed() {

		boolean flag = lp.validateActiImg();
		System.out.println(flag);
		Assert.assertTrue(flag);

	}

	@Test 
	
	public void  testLoginFunction() {

		
		lp.enterUserName("admin");
		lp.enterpassword("manager");
		lp.clicklogin();
        ep = new EnterPage();
        String actual = "John Doe";
       	String expected = ep.validateuserLoggedin();
       	System.out.println(expected);
     	Assert.assertEquals(actual, expected);
		ep.clickLogout();
	}

} 



