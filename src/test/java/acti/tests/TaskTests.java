package acti.tests;

import org.bouncycastle.i18n.MessageBundle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskTests extends BaseTests{
	
	@Test
	public void createcustomer() {
		lp.enterUserName("admin");
		lp.enterpassword("manager");
		lp.clicklogin();
		String expected="John Doe";
		String actual = ep.validateuserLoggedin();
		Assert.assertEquals(actual, expected);
		ep.clickTask();
		tp.clickaddnew();
		tp.clicknewcusto();
		tp.createnewcusto("Test Customer");
		tp.customerdescri("Accountant");
		tp.createcustomer();
	    String message = tp.successmessage();
	 	Assert.assertTrue(message.contains("has been created"));
	     ep.clickLogout();
	     
	}
	
	@Test
	public void testdeletecustomer() {
		
		lp.enterUserName("admin");
		lp.enterpassword("manager");
		lp.clicklogin();
		String expected="John Doe";
		String actual = ep.validateuserLoggedin();
		Assert.assertEquals(actual, expected);
		ep.clickTask();
		tp.enterCustomerType("Test Customer");
		tp.clickSearchedCustomer();
		tp.clickEditButton();
		tp.clickAction();
		tp.clickDelete();
		tp.clickDeletePermanently();
		String message = tp.successmessage();
	 	Assert.assertTrue(message.contains("has been deleted"));
	     ep.clickLogout();
	}

}
