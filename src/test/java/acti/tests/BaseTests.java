package acti.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import acti.driver.DriverManager;
import acti.pages.EnterPage;
import acti.pages.LoginPage;
import acti.pages.TaskPage;

import acti.utils.Excellibrary1;




public class BaseTests extends DriverManager {
	
	LoginPage lp;
	EnterPage ep;
	TaskPage tp;
	
	@BeforeMethod
	public void setUp() {

		init_driver();
		lp = new LoginPage();
		ep = new EnterPage();
	    tp = new TaskPage();
	}
	
	@AfterMethod
	public void tearDown() {
		quit_browser();
	}
   
	
  @DataProvider (name="Actitimedata")
	
	public Object[][] testdata() {
		
		
    	
    	Excellibrary1 x1 = new Excellibrary1("./src/test/resources/acti/testdata/Actitimedata.xlsx");
		int rows = x1.getRowCount(0);

		Object[][] data = new Object[rows][2];
		for (int i = 0; i < rows; i++) {

			data[i][0] = x1.getCellData(0, i, 0);
			data[i][1] = x1.getCellData(0, i, 1);
		}
		return data;
	}
}