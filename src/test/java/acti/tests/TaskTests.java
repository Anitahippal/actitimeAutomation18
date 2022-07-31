package acti.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
	
public class TaskTests extends BaseTests{
	
	@Test (priority = 1)
	public void testCreateCustomer() {
		Logger=report.createTest("create new customer test");
		lp.enterUserName("admin");
		Logger.info("entered username");
					
		lp.enterpassword("manager");
		Logger.info("entered password");
		lp.clicklogin();
		Logger.info("clicked Login button");
		String expected="John Doe";
		String actual = ep.validateuserLoggedin();
		Assert.assertEquals(actual, expected);
		Logger.pass("Login is successfull");
				
		ep.clickTask();
		Logger.info("clicked taskmenu");
		tp.clickaddnew();
		Logger.info("clicked add new button");
		tp.clicknewcusto();
		Logger.info("Clicked item new customer");
		
		tp.createnewcusto("Test Customer");
		Logger.info("enter customer name");
		
		tp.customerdescri("Accountant");
		Logger.info("enter customer description");
		
		tp.createcustomer();
		Logger.info("clicked create customer button");
		
	    String message = tp.successmessage();
	 	Assert.assertTrue(message.contains("has been created"));
	 	Logger.pass("customer created successfully");
	     ep.clickLogout();
	     Logger.info("clicked logout link");
	     
	}
	
	@Test (priority = 2)
	public void testdeletecustomer() {
		Logger=report.createTest("test delete customer ");
		
		lp.enterUserName("admin");
		Logger.info("entered username");
		lp.enterpassword("manager");
		Logger.info("entered password");
		lp.clicklogin();
		Logger.info("clicked Login button");
		String expected="John Doe";
		String actual = ep.validateuserLoggedin();
		Assert.assertEquals(actual, expected);
		Logger.pass("Login is successfull");
		ep.clickTask();
		Logger.info("clicked taskmenu");
		tp.enterCustomerType("Test Customer");
		
		Logger.info("enter the customer name created ");
		tp.clickSearchedCustomer();
		Logger.info("clicked on searched customer item");
		tp.clickEditButton();
		Logger.info("clicked on edit button");
		tp.clickAction();
		Logger.info("clicked action button");
		tp.clickDelete();
		Logger.info("clicked Delete button");
		tp.clickDeletePermanently();
		Logger.info("clicked permanentely delete button");
		String message = tp.successmessage();
	 	Assert.assertTrue(message.contains("has been deleted"));
	 	Logger.info("customer deleted successfully");
	     ep.clickLogout();
	     Logger.info("clicked Logout link");
	}

}
