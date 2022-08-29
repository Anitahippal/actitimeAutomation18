package acti.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverManager1 {

	public static WebDriver driver;
	Properties prop;

	public DriverManager1() {

		File file = new File("src/test/resources/acti/config/config.properties");

		try {
			FileInputStream fls = new FileInputStream(file);

			prop = new Properties();
			prop.load(fls);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			System.out.println("unable to load properties file please check " + e.getMessage());
			e.printStackTrace();

		}

	}

	@Test
	public void init_driver() {

		String browser1 = prop.getProperty("browser");

		if (browser1.trim().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/acti/browser/chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (browser1.trim().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/acti/browser/geckodriver.exe");

			driver = new FirefoxDriver();
		}

		else if (browser1.trim().equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./src/test/resources/acti/browser/msedgedriver.exe");

			driver = new EdgeDriver();

		}

		
		else

		{
			System.err.println("please check the properties file for supported browser types");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		get_url();
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
		
		
		
		
	
