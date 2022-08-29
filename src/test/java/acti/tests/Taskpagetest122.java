package acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Taskpagetest122 extends Basetests12{
	@Test
	public void testcreatecustomer() {
		lp.enterusername("admin");
		lp.enterpassword("manager");
		lp.loginclick();
		String expected="John Doe";
		String actual = ep.Userloggedin();
		Assert.assertEquals(actual, expected);
	    ep.Taskmenu();
	    tp.clickaddnew();
	    tp.clicknewcusto();
	    tp.createnewcusto("TestCustomer");
	    tp.customerdescri("This customer is for customer description");
	    tp.createcustomer();
	  String message = tp.successmessage();
	  Assert.assertTrue(message.contains("has been created"));
	  ep.logout();
	  	 
		
	}
	
	@Test
	public void testdeletecustomer() {
		
		lp.enterusername("admin");
		lp.enterpassword("manager");
		lp.loginclick();
		String expected = "John Doe";
		String actual = ep.Userloggedin();
		Assert.assertEquals(actual, expected);
	    ep.Taskmenu();
	    tp.enterCustomerType("TestCustomer");
		tp.clickSearchedCustomer();
		tp.clickEditButton();
		tp.clickAction();
		tp.clickDelete();
		tp.clickDeletePermanently();
		String message = tp.successmessage();
	    Assert.assertTrue(message.contains("has been deleted"));
		ep.logout();
		  	 
		
		
		
		
		
		
		
		
	}

}
