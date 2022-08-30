package acti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Taskpagetest122 extends Basetests12 {

	@Test(priority = 1)

	public void testcreatecustomer() {

		logger = report.createTest("test create new customer");
		lp.enterusername("admin");
		logger.info("entered username");
		lp.enterpassword("manager");
		logger.info("entered password");

		lp.loginclick();
		logger.info("clicked login button");
		String expected = "John Doe";
		String actual = ep.Userloggedin();
		Assert.assertEquals(actual, expected);
		logger.pass("login is successfull");
		ep.Taskmenu();
		logger.info("clicked task menu");

		tp.clickAddNew();

		logger.info("clicked add new button");
		tp.clickNewCustomer();

		logger.info("clicked item new customer");
		tp.enterCustomerName("Test Customer"); // creation of new customer
		logger.info("enter customer name");
		tp.enterCustomerDescription("adrey kell road");
		logger.info("entered customer description");

		tp.clickCreateCustomer();
		logger.info("clicked create customer button");
		String message = tp.getSuccessMessage();
		Assert.assertTrue(message.contains("has been created"));
		logger.pass("customer created successfully");
		ep.logout();
		logger.info("clicked logout link");

	}

	@Test(priority = 2)
	public void testdeletecustomer() {
		logger = report.createTest("test delete customer");
		lp.enterusername("admin");
		logger.info("entered username");
		lp.enterpassword("manager");
		logger.info("entered password");
		lp.loginclick();
		logger.info("clicked login button");
		String expected = "John Doe";
		String actual = ep.Userloggedin();
		Assert.assertEquals(actual, expected);
		logger.pass("login is successfull");
		ep.Taskmenu();
		logger.info("clicked task menu");

		tp.enterCustomerType("Test Customer");
		logger.info("enter the customer name created");
		tp.clickSearchedCustomer();
		logger.info("click on the searched customer item");
		tp.clickEditButton();
		logger.info("clicked on edit button");
		tp.clickAction();
		logger.info("clicked action button");
		tp.clickDelete();
		logger.info("clicked delete button");
		tp.clickDeletePermanently();
		logger.info("clicked delete permanently button");
		
		String message = tp.getSuccessMessage();
		Assert.assertTrue(message.contains("has been deleted"));
		logger.pass("customer deleted successfully");
		ep.logout();
		logger.info("clicked logout link");


	}

}
