package acti.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager1;
import acti.utils.Helper1;

public class Taskpage122 extends DriverManager1{
	
	@FindBy(xpath = "//div[text()='Add New']") WebElement buttonAddNew;
	@FindBy(xpath = "//div[@class='item createNewCustomer']") WebElement itemNewCustomer;
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") 
	WebElement textboxCustomerName;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement textareaCustomerDescription;
	@FindBy(xpath = "//div[contains(text(),'Create Customer')]") WebElement buttonCreateCustomer;
	@FindBy(xpath = "//span[@class='innerHtml']") WebElement textSuccesMessage;
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]") WebElement textboxStartTyping;
	@FindBy(xpath="//div[@class='filteredContainer']//div[@class='title']") WebElement searchedCustomer;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement buttonEdit;
	@FindBy(xpath="//div[@class='editCustomerPanelHeader']//div[@class='action'][normalize-space()='ACTIONS']" )
	WebElement buttonAction;
	@FindBy(xpath="//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space()='Delete']")
	WebElement buttonDelete;
	@FindBy(xpath="//span[normalize-space()='Delete permanently']") WebElement buttonDeletePermanently;

	
	// Page Initilalization
	
	public Taskpage122() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickDeletePermanently()
	{
		buttonDeletePermanently.click();
		Helper1.fn_sleep();
	}
	
	public void clickDelete()
	{
		buttonDelete.click();
	}
	
	public void clickAction()
	{
		buttonAction.click();
	}
	
	public void clickEditButton()
	{
		buttonEdit.click();
		Helper1.fn_sleep();
	}
	
	public void clickSearchedCustomer()
	{
		searchedCustomer.click();
	}
	
	public void enterCustomerType(String customername) 
	{
		textboxStartTyping.sendKeys(customername);
	}
	
	
	public void clickAddNew() {
		buttonAddNew.click();
	}
	
	public void clickNewCustomer() {
		itemNewCustomer.click();
	}
	
	public void enterCustomerName(String customername) {
		textboxCustomerName.sendKeys(customername);
	}
	
	public void enterCustomerDescription(String customerdescription) {
		textareaCustomerDescription.sendKeys(customerdescription);
	}
	
	public void clickCreateCustomer() {
		buttonCreateCustomer.click();
		Helper1.fn_sleep();
	}
	
	public String getSuccessMessage() {
		return textSuccesMessage.getText();
	}
	
}

	