package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager1;

public class Loginpag12 extends DriverManager1{
	
	//*************PAGE ELEMENTS**************************//
	
	@FindBy(id = "username") WebElement usernametextbox;
	@FindBy(name = "pwd") WebElement    passwordtextbox;
	@FindBy(xpath  ="//div[text()='Login ']") WebElement Loginbutton;
	@FindBy(linkText = "Forgot your password?") WebElement linkforgotpassword;
	@FindBy(xpath = "//div[@class='atLogoImg']") WebElement imgActilogo;
	
	//Initialization
	public Loginpag12() {
		
	PageFactory.initElements(driver, this);
		
	}
	
	//PAGE ACTIONS
	
	public void enterusername(String username) {
		usernametextbox.sendKeys(username);
		
	}
	
	public void enterpassword(String password) {
		passwordtextbox.sendKeys(password);
		
	}
	
	public void loginclick() {
		Loginbutton.click();
		
	}
		
	public boolean forgotpasswordlink() {
	return	linkforgotpassword.isDisplayed();
	
	}
	
	public boolean actiimage() {
	return imgActilogo.isDisplayed();
		
	
	}
	
	
	public String loginpagetitle() {
		
	return	driver.getTitle();
		
	
	}
		
		
		
	}
	
	
	
	
	
	


