package acti.tests;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import acti.driver.DriverManager;
import acti.pages.EnterPage;
import acti.pages.LoginPage;
import acti.pages.TaskPage;
import acti.utils.Excellibrary1;
import acti.utils.Helper;




public class BaseTests extends DriverManager {
	protected static ExtentReports report;
	protected static ExtentTest Logger;
	
	
	
	LoginPage lp;
	EnterPage ep;
	TaskPage tp;
	
	@BeforeSuite
	public void setUpReort() {
		ExtentHtmlReporter extent = new ExtentHtmlReporter("./actireports/index.html"); // u can give index or any name
																						// of your choice
																						// create an object of
																						// ExtenHtmlreporter
		report = new ExtentReports();// create an object of extent reports and make the report as global
													// variable
		report.attachReporter(extent); // call a method and pass an argument of the Extent Html Reporter
	}
	
	@BeforeMethod
	public void setUp() {

		init_driver();
		lp = new LoginPage();
		ep = new EnterPage();
	    tp = new TaskPage();
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			try {
				Logger.fail("test failed",
						MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreen(driver)).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		report.flush();
		Helper.fn_sleep();
		quit_browser();
	}
  @DataProvider (name="Actitimedata")
	
	public Object[][] testata() {
		
		
    	
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