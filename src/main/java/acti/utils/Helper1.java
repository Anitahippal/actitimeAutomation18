package acti.utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

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
	
	public static String captureScreen(WebDriver driver) {  //webdriver is the interface
	
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //screen shot is also an interface
	
	      String   screenshotpath = "C:\\Users\\prash\\git\\actitimeAutomation18\\actireports\\Screens1\\act1.png";    
	    
	      try {
			org.openqa.selenium.io.FileHandler.copy(src, new File (screenshotpath)); //copy from source to destination
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
	   return screenshotpath;

	
	}                   

}