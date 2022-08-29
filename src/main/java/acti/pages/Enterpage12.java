package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import acti.driver.DriverManager1;

public class Enterpage12 extends DriverManager1 {

     @FindBy(id ="logoutLink") WebElement linklogout;
	
	//@FindBy(xpath = "//a[@class='userProfileLink username ']") WebElement TextUserLoggedin;
	@FindBy(xpath = "//a[@class='userProfileLink username']") WebElement TextUserLoggedin;
	@FindBy(xpath="//a[@class='content tasks']") WebElement MenuTask;
		
	

}
