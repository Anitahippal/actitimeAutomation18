package acti.pages;

import acti.driver.DriverManager;
import acti.utils.Helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * Name : Task Page
 * Developed By Anita
 * Approved By    Hippalgaonkar
 * Last Modified Date 7/26/2022
 * Description : Task page  elements and its methods
 */

public class TaskPage extends DriverManager {

	// ************************* the page	// elements*************************************/

	@FindBy(xpath = "//div[@class='title ellipsis']")
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

	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]") WebElement textboxStartTyping;
	@FindBy(xpath="//div[@class='filteredContainer']//div[@class='title']") WebElement searchedCustomer;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement buttonEdit;
	@FindBy(xpath="//div[@class='editCustomerPanelHeader']//div[@class='action'][normalize-space()='ACTIONS']" )
	WebElement buttonAction;
	@FindBy(xpath="//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space()='Delete']")
	WebElement buttonDelete;
	@FindBy(xpath="//span[normalize-space()='Delete permanently']") WebElement buttonDeletePermanently;
	
	// *****************************Page //	// Initialization*****************************//
	public TaskPage() {
		PageFactory.initElements(driver, this);
	}
	// *****************************Page Actions*****************************//

	public void clickDeletePermanently() {
		buttonDeletePermanently.click();
		Helper.fn_sleep();
	}

	public void clickDelete() {
		buttonDelete.click();
	}

	public void clickAction() {
		buttonAction.click();
	}

	public void clickEditButton() {
		buttonEdit.click();
		Helper.fn_sleep();
	}

	public void clickSearchedCustomer()
	{
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
		Helper.fn_sleep();
	}

	public String successmessage() {
		return successMessage.getText();
	}

}
