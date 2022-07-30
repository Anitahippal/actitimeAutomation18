package acti.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import acti.driver.DriverManager;
import acti.pages.EnterPage;
import acti.pages.LoginPage;
import acti.pages.TaskPage;
import acti.utils.ExcelLib;



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

	@DataProvider (name="actidata")
	
	public Object[][] testData()
	{
		 ExcelLib xl = new ExcelLib("./src/test/resources/acti/testdata/actidata.xlsx");
		int rows = xl.getRowCount(0);
		Object data[][] = new Object[rows][2];
		
		for(int i=0; i<rows;i++)
		{
			data[i][0]=xl.getCellData(0, i, 0);
			data[i][1]=xl.getCellData(0, i, 1);
		}
		
		return data;
	}

}