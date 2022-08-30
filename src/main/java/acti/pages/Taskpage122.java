package acti.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager1;
import acti.utils.Helper1;

public class Taskpage122 extends DriverManager1{

	// ************************* the page //
	// elements*************************************/

	//@FindBy(xpath = "//div[@class='title ellipsis']")
	//WebElement buttonAddnew;
	
	
	@FindBy(xpath= "//div[@class='title ellipsis']")
	WebElement buttonAddnew;
	
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	WebElement createCustomer;

	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	WebElement textboxcustomername;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	WebElement txtareacustomerdes;

	@FindBy(xpath = "//div[contains(text(),  'Create Customer')]")
	WebElement buttoncreatecustomer;

	@FindBy(xpath = "//span[@class='innerHtml']")
	WebElement successMessage;

	@FindBy(xpath = "//input[@placeholder='Start typing name ...'])[1]")
	WebElement textboxStartTyping;
	@FindBy(xpath = "//div[@class='filteredContainer']//div[@class='title']")
	WebElement searchedCustomer;
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']//div[@class='editButton']")
	WebElement buttonEdit;
	@FindBy(xpath = "//div[@class='editCustomerPanelHeader']//div[@class='action'][normalize-space()='ACTIONS']")
	WebElement buttonAction;
	@FindBy(xpath = "//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space()='Delete']")
	WebElement buttonDelete;
	@FindBy(xpath = "//span[normalize-space()='Delete permanently']")
	WebElement buttonDeletePermanently;

	// Page Initilalization

	public void Taskpage122() {
		
		PageFactory.initElements(driver, this);

	}

	public void clickDeletePermanently() {
		buttonDeletePermanently.click();
		Helper1.fn_sleep();

	}

	public void clickDelete() {
		buttonDelete.click();
	}

	public void clickAction() {
		buttonAction.click();
	}

	public void clickEditButton() {
		buttonEdit.click();
        Helper1.fn_sleep();
	}

	public void clickSearchedCustomer() {
		searchedCustomer.click();
	}

	public void enterCustomerType(String customername) {
		textboxStartTyping.sendKeys(customername);
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

	public void customerdescri(String customerdesc) {
		txtareacustomerdes.sendKeys(customerdesc);
	}

	public void createcustomer() {
		buttoncreatecustomer.click();
		Helper1.fn_sleep();

	}

	public String successmessage() {
		return successMessage.getText();
	}

}
