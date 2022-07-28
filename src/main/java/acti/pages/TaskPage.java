package acti.pages;

import acti.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage extends DriverManager {


	@FindBy(xpath = "//div[@class='title ellipsis']")
	WebElement buttonAddnew;
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	WebElement createCustomer;

	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	WebElement textboxcustomername;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	WebElement txtareacustomerdes;

	@FindBy(xpath = "//div[contains(text(),'Create Customer']")
	WebElement buttoncreatecustomer;

	@FindBy(xpath = "//span[@class='innerHtml']")
	WebElement successMessage;

	public TaskPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickaddnew() {
		buttonAddnew.click();
	}
	public void clicknewcusto() {
		createCustomer.click();
				
	}
	public void createnewcusto(String customername) {
	textboxcustomername.sendKeys(customername);
		}
		
	public void customerdescri (String customerdesc) {
		txtareacustomerdes.sendKeys(customerdesc);	
		}
			
	public void createcustomer() {
				buttoncreatecustomer.click();
		}
			
		public String successmessage() {
		return successMessage.getText();
			}
		
	

}
