package acti.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;

/*
 * Name Login Page
 * Developed By Anita
 * Approved By    Hippalgaonkar
 * Last Modified Date 7/26/2022
 * Description Login page elements and its Methods
 */

public class LoginPage extends DriverManager {

	// ************************* the page elements*************************************//

	@FindBy(id="username")  WebElement Usernametextbox;
	
	@FindBy(name="pwd")	WebElement passwordtextbox;

	@FindBy(xpath="//div[text()='Login ']")  WebElement loginbutton;

	@FindBy(linkText = "Forgot your password?") WebElement linkForgotPassword;
	
	@FindBy(xpath="//div[@class='atLogoImg']") WebElement imgActilogo;
	

	
	

	// *****************************Page	// Initialization*****************************//
	
	
	public LoginPage() { // this refers to current class objects
		PageFactory.initElements(driver, this); 
		// page factory is a class which is used the initialize the page
												// elements and
												// InitElements is a method
	}

	// *****************************Page Actions*****************************//
	public void enterUserName(String username) {
		Usernametextbox.sendKeys(username);

	}

	public void enterpassword(String password) {
		passwordtextbox.sendKeys(password);

	}

	public void clicklogin() {
		loginbutton.click();

	}

	public boolean validateForgotPasswordlink() {
		return linkForgotPassword.isDisplayed(); // the return type is the data type boolean
	} // right click the return

	public String validateLoginPageTitle() { // the return type is the data type string
		return driver.getTitle(); // right click the return
	}

	public boolean validateActiImg() { // the return type is the data type boolean
		return imgActilogo.isDisplayed(); // right click the return
	}
}
