package acti.utils;

import acti.driver.DriverManager1;

public class Helper1 extends DriverManager1{

	public static void fn_sleep() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	}


