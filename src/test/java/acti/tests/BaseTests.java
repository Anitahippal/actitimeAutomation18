package acti.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import acti.driver.DriverManager;
import acti.pages.EnterPage;
import acti.pages.LoginPage;
import acti.pages.TaskPage;


public class BaseTests extends DriverManager {
	
	LoginPage lp;
	EnterPage ep;
	TaskTests tp;
	
	@BeforeMethod
	public void setUp() {
		init_driver();
		lp = new LoginPage();
		ep = new EnterPage();
	    tp = new TaskTests();
	}
	
	@AfterMethod
	public void tearDown() {
		quit_browser();
	}

}
