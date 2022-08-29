package acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import acti.pages.Enterpage12;
import acti.pages.Loginpag12;

public class Loginpagetests12 extends Basetests12 {

	@Test(priority=1,enabled=true)
	public void testLoginPageTitle() {
		lp = new Loginpag12();
		String actual = "actiTIME - Login";
		//String actual = "actiTIME";
		String expected = lp.loginpagetitle();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
	}
	@Test(priority=2,enabled=true)
	public void testForgotPasswordLink() {
	boolean flag = lp.forgotpasswordlink();

		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	@Test(priority=3,enabled=true)
	public void testActiveLogoisDisplayed() {

		boolean flag = lp.actiimage();
		System.out.println(flag);
		Assert.assertTrue(flag);

	}

	
@Test(priority=4,dataProvider="Actitimedata")    
public void  testLoginFunction(String username,String password)  {

		
		lp.enterusername(username);
		lp.enterpassword(password);
		lp.loginclick();
        ep = new Enterpage12();
        String actual  ="John Doe";
       	String expected = ep.Userloggedin();
       	System.out.println(expected);
     	Assert.assertEquals(actual, expected);
		
	}

} 


