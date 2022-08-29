package acti.tests;

import acti.driver.DriverManager1;
import acti.pages.EnterPage;
import acti.pages.Enterpage12;
import acti.pages.LoginPage;
import acti.pages.Loginpag12;
import acti.pages.TaskPage;
import acti.pages.Taskpage122;
import acti.utils.Excellibrary1;

public class Basetests12 extends DriverManager1{
	
	Loginpag12 lp;
	Enterpage12 ep;
	Taskpage122 tp;


public void setUp() {

	init_driver();
	
	lp  = new Loginpag12();
	ep= new Enterpage12();
	tp  = new Taskpage122();
}

public void tearDown() {
	
	quit_browser();
	
}



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