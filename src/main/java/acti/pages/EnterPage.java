package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;
import acti.utils.Helper;

//don’t hard code any of the test data in the page  classes

/*
 * Name :Enter Time Page
 * Developed By Anita
 * Approved By    Hippalgaonkar
 * Last Modified Date 7/26/2022
 * Description : Enter Time page (home page) elements and its methods
 */

//************************* the page elements*************************************/

public class EnterPage extends DriverManager{
	@FindBy(id ="logoutLink") WebElement linklogout;
	
	//@FindBy(xpath = "//a[@class='userProfileLink username ']") WebElement TextUserLoggedin;
	@FindBy(xpath = "//a[@class='userProfileLink username']") WebElement TextUserLoggedin;
	@FindBy(xpath="//a[@class='content tasks']") WebElement MenuTask;


	// *****************************Page	// Initialization*****************************//
	
	public EnterPage()  { //constructor is made
		PageFactory.initElements(driver, this);
	}
	
	
	// *****************************Page Actions*****************************//
	 public void  clickTask(){
		 MenuTask.click();
	 }

	public void clickLogout() {
		
		linklogout.click();
		
		}
	
	public String validateuserLoggedin() {
		return TextUserLoggedin.getText();
	}
}
