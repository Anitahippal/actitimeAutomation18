
//To create a config file just go the config folder right click and click on File a config file is created

package acti.driver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class DriverManager {

	public static WebDriver driver;
	Properties prop;

	public DriverManager() { // constructor is made

		try { // try is used becos external file is called
			File file = new File("./src/test/resources/acti/config/config.properties");

			FileInputStream fls = new FileInputStream(file);
			prop = new Properties();
			prop.load(fls);

		} catch (Exception e)

		{
			System.out.println("unable to load properties file please check " + e.getMessage());

		}
	}

	@Test
	public void init_driver()   {

		String browser = prop.getProperty("browser"); // the browser mentioned in the sysout is key value which is
														// present in config file
														// the browser which as a data type string is the variable.Dont
														// get confused

		if (browser.trim().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/acti/browser/chromedriver.exe");
			

			driver = new ChromeDriver();
		} else if (browser.trim().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/acti/browser/geckodriver.exe");

			driver = new FirefoxDriver();
		}

		else if (browser.trim().equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./src/test/resources/acti/browser/msedgedriver.exe");

			driver = new EdgeDriver();
		}

		else

		{
			System.err.println("please check the properties file for supported browser types");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://demo.actitime.com/login.do");
		// driver.get( "https://google.com");

		get_url(); // calling the get url method in the init driver method
		//Thread.sleep(3000);
		//driver.close();
		
	}

	 public void get_url() // created a separate method for url
	{
		String url = prop.getProperty("url");
		
		driver.get(url);

	} 

	public static void quit_browser() {
		driver.close();
	}

}
	