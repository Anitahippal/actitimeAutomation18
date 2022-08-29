package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager1;
import acti.utils.Helper1;


public class Enterpage12 extends DriverManager1 {
	
	/*
	 * Name :Enter Time Page
	 * Developed By Anita
	 * Approved By    Hippalgaonkar
	 * Last Modified Date 7/26/2022
	 * Description : Enter Time page (home page) elements and its methods
	 */

	//************************* the page elements*************************************/


     
	
	//@FindBy(xpath = "//a[@class='userProfileLink username ']") WebElement TextUserLoggedin;
//	@FindBy(xpath = "//a[@class='userProfileLink username']") WebElement TextUserLoggedin;
     
//	@FindBy(xpath = "//a[@class='userProfileLink username']") WebElement TextUserLoggedin;
	@FindBy(id ="logoutLink") WebElement linklogout;
	@FindBy(xpath = "//a[@class='userProfileLink username ']") WebElement TextUserLoggedin;
	@FindBy(xpath="//a[@class='content tasks']") WebElement MenuTask;
	
	//********************Initialization**************************//
	
	public Enterpage12() {
		
	PageFactory.initElements(driver, this);
			
	}
	//**************************Page Actions******************************
	
		
	public void Taskmenu() {
		
		MenuTask.click();
		
	}
	
	public void logout() {
		
		linklogout.click();
		Helper1.fn_sleep();
		
	}
	
	public String Userloggedin() {
		return	TextUserLoggedin.getText();
				
		}

}
