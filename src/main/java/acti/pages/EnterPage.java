package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;

//don’t hard code any of the test data in the page  classes


public class EnterPage extends DriverManager{
	@FindBy(id ="logoutLink") WebElement linklogout;
	@FindBy(xpath ="//a[@class='userProfileLink username ']") WebElement TextUserLoggedin;

	public EnterPage()  { //constructor is made
		PageFactory.initElements(driver, this);
	}

	public void clickLogout() {
		linklogout.click();
		
		}
	
	public String validateuserLoggedin() {
		return TextUserLoggedin.getText();
	}
}
