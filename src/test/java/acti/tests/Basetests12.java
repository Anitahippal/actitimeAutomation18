package acti.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import acti.driver.DriverManager1;

import acti.pages.Enterpage12;

import acti.pages.Loginpag12;

import acti.pages.Taskpage122;
import acti.utils.ExcelLibrary12;
import acti.utils.Helper1;


public class Basetests12 extends DriverManager1{
	
	Loginpag12 lp;
	Enterpage12 ep;
	Taskpage122 tp;

@BeforeMethod
public void setUp() {

	init_driver();
	
	lp  = new Loginpag12();
	ep = new Enterpage12();
	tp  = new Taskpage122();
}
@AfterMethod
public void tearDown() {
	
	quit_browser();
	Helper1.fn_sleep();
	
}


@DataProvider (name="Actitimedata")
public Object[][] testata() {
	
	
	
	ExcelLibrary12 x1 = new ExcelLibrary12("./src/test/resources/acti/testdata/Actitimedata.xlsx");
	int rows = x1.getRowCount(0);

	Object[][] data = new Object[rows][2];
	for (int i = 0; i < rows; i++) {

		data[i][0] = x1.getCellData(0, i, 0);
		data[i][1] = x1.getCellData(0, i, 1);
		
	}
	return data;
}
}