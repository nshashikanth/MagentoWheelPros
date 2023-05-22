package com.wheelpros.qa.ca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

public class ContactPage extends BasePage {
	WebDriver driver;

	public ContactPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//div[contains(@class, 'slds-text-heading')]/span[1]")
	WebElement lblPageHeader;
	
	@FindBy(xpath = "//*[contains(@class, 'sci_first_name')]//input")
	WebElement txtFirstName;
	
	@FindBy(xpath = "//*[contains(@class, 'first_name_input')]/div[2]")
	WebElement lblFirstNameErrorMessage;
	
	@FindBy(xpath = "//*[contains(@class, 'sci_last_name')]//input")
	WebElement txtLastName;
	
	@FindBy(xpath = "//*[contains(@class, 'last_name_input')]/div[2]")
	WebElement lblLastNameErrorMessage;
	
	@FindBy(xpath = "//*[contains(@class, 'sci_email')]//input")
	WebElement txtEmailAddress;
	
	@FindBy(xpath = "//*[contains(@class, 'sci_email_input')]/div[2]")
	WebElement lblEmailAddressErrorMessage;
	
	@FindBy(xpath = "//*[contains(@class, 'sci_phone')]//input")
	WebElement txtPhone;
	
	@FindBy(xpath = "//*[contains(@class, 'sci_phone')]/div[2]")
	WebElement lblPhoneErrorMessage;
	
	//Account Payable
	
	@FindBy(xpath = "//*[contains(@class, 'cap_first_name')]//input")
	WebElement txtAPFirstName;
	
	@FindBy(xpath = "//*[contains(@class, 'cap_first_name')]/div[2]")
	WebElement lblAPFirstNameErrorMessage;
	
	@FindBy(xpath = "//*[contains(@class, 'cap_last_name')]//input")
	WebElement txtAPLastName;
	
	@FindBy(xpath = "//*[contains(@class, 'cap_last_name')]/div[2]")
	WebElement lblAPLastNameErrorMessage;
	
	@FindBy(xpath = "//*[contains(@class, 'cap_email')]//input")
	WebElement txtAPEmailAddress;

	@FindBy(xpath = "//*[contains(@class, 'cap_email')]/div[2]")
	WebElement lblAPEmailAddressErrorMessage;
	
	@FindBy(xpath = "//*[contains(@class, 'cap_phone')]//input")
	WebElement txtAPPhone;
	
	@FindBy(xpath = "//*[contains(@class, 'cap_phone')]/div[2]")
	WebElement lblAPPhoneErrorMessage;
	
	@FindBy(xpath = "//button[text()='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//button[text()='Back']")
	WebElement btnBack;
	
	
	
	public void enterFirstName(String FirstName) {
		txtFirstName.sendKeys(FirstName);
	}
	
	public String getFirstNameErrorMessage() {
		return lblFirstNameErrorMessage.getText();
	}
	
	public void enterLastName(String LastName) {
		txtLastName.sendKeys(LastName);
	}
	
	public String getLastNameErrorMessage() {
		return lblLastNameErrorMessage.getText();
	}
	
	public void enterEmailAddress(String EmailAddress) {
		txtEmailAddress.sendKeys(EmailAddress);
	}
	
	public String getEmailAddressErrorMessage() {
		return lblEmailAddressErrorMessage.getText();
	}
	
	public String getEmailAddressInvalidErrorMessage() {
		return lblEmailAddressErrorMessage.getText();
	}
	
	public void enterPhone(String Number) {
		txtPhone.sendKeys(Number);
	}
	
	public String getPhoneErrorMessage() {
		return lblPhoneErrorMessage.getText();
	}
	
	//Acount paybale
	public void enterAPFirstName(String APFirstName) {
		txtAPFirstName.sendKeys(APFirstName);
	}
	
	public String getAPFirstNameMessage() {
		return lblAPFirstNameErrorMessage.getText();
	}
	
	public void enterAPLastName(String APLastName) {
		txtAPLastName.sendKeys(APLastName);
	}
	
	public String getAPLastNameMessage() {
		return lblAPLastNameErrorMessage.getText();
	}
	
	public void enterAPEmailAddress(String APEmailAddress) {
		txtAPEmailAddress.sendKeys(APEmailAddress);
	}
	
	public String getAPEmailAddressMessage() {
		return lblAPEmailAddressErrorMessage.getText();
	}
	
	public void enterAPPhone(String APNumber) {
		txtAPPhone.sendKeys(APNumber);
	}
	
	public String getAPPhonesMessage() {
		return lblAPPhoneErrorMessage.getText();
	}
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	public void clikBack() {
		btnBack.click();
	}
	
	public String getPageHeader() {
		return waitForVisibilityOfElement(lblPageHeader).getText();
	}
	
	public boolean isContactPageDisplayed() {
		return isElementDisplayed(lblPageHeader);
	}
	
}
