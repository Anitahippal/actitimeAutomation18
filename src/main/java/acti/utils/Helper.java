package acti.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


import acti.driver.DriverManager;


import org.openqa.selenium.OutputType;





public class Helper extends DriverManager {
	
	


	public static void fn_sleep() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
		
		public static String captureScreen(WebDriver driver) {
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String screenshotpath="C:\\Users\\prash\\git\\actitimeAutomation18\\actireports\\Screens\\act.png";
			
			try {
				FileHandler.copy(src, new File(screenshotpath));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return screenshotpath;	
		}

}