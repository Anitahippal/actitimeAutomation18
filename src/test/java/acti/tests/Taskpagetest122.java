package acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Taskpagetest122 extends Basetests12{
	
	
	@Test(priority=1)
	
	public void testcreatecustomer() {
		lp.enterusername("admin");
		lp.enterpassword("manager");
		lp.loginclick();
		String expected="John Doe";
		String actual = ep.Userloggedin();
		Assert.assertEquals(actual, expected);
	    ep.Taskmenu();
	    tp.clickAddNew();
	    tp.clickNewCustomer();
	    tp.enterCustomerName("Test Customer"); //creation of new customer
	    tp.enterCustomerDescription("adrey kell road");
	    tp.clickCreateCustomer(); 
	   
	  String message = tp.getSuccessMessage();
	  Assert.assertTrue(message.contains("has been created"));
	  ep.logout();
	  	 
		
	}
	
	@Test(priority=2)
	public void testdeletecustomer() {
		
		lp.enterusername("admin");
		lp.enterpassword("manager");
		lp.loginclick();
		String expected = "John Doe";
		String actual = ep.Userloggedin();
		Assert.assertEquals(actual, expected);
	    ep.Taskmenu();
	    tp.enterCustomerType("Test Customer");
		tp.clickSearchedCustomer();
		tp.clickEditButton();
		tp.clickAction();
		tp.clickDelete();
		tp.clickDeletePermanently();
		String message = tp.getSuccessMessage();
	    Assert.assertTrue(message.contains("has been deleted"));
		ep.logout();
		  	 
	
		
	}

}
