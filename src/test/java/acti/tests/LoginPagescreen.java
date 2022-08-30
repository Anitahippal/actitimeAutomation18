package acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import acti.pages.EnterPage;
import acti.pages.Enterpage12;
public class LoginPagescreen extends Basetests12{
	
	
	
	  
	
	        @Test(priority=4,dataProvider = "Actitimedata")
            public void  testLoginFunction(String username,String password)  {

		
			logger=report.createTest("test login function");
			lp.enterusername(username);
			logger.info("entered username");
			lp.enterpassword(password);
			logger.info("entered password");
			lp.loginclick();
			logger.info("clicked login button");
		    ep	= new Enterpage12();
			String actual ="John";
			String expected = ep.Userloggedin();
			Assert.assertEquals(actual, expected);
			logger.pass("logged in successfully");
			ep.logout();
			logger.info("clicked logout");
	}
		}


