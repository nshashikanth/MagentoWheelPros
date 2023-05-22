package com.wheelpros.qa.us.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

public class PersonalGuaranteePage extends BasePage{
	WebDriver driver;

	public PersonalGuaranteePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//div[contains(@class, 'slds-text-heading')]/span[1]")
	WebElement lblPageHeader;

	@FindBy(xpath = "//button[@title='Back']")
	WebElement btnback;

	@FindBy(xpath = "(//input[@name='businessAtResidence'])[1]")
	WebElement rdoIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE;

	@FindBy(xpath = "(//input[@name='businessAtResidence'])[2]")
	WebElement rdoIDONOTWISHTOAUTHORIZETHECONTINUINGPERSONALGUARANTEE;

	//pg1
	@FindBy(xpath = "//*[contains(@class,'pg1_first_name')]//input")
	WebElement txtGuarantor1FirstName;

	@FindBy(xpath = "//*[contains(@class, 'pg1_first_name')]/div[2]")
	WebElement lblGuarantor1FirstNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'pg1_last_name')]//input")
	WebElement txtGuarantor1LastName;

	@FindBy(xpath = "//*[contains(@class,'pg1_street_address')]//input")
	WebElement txtPg1StreetAddress;

	@FindBy(xpath = "//*[contains(@class,'pg1_city')]//input")
	WebElement txtPg1City;

	@FindBy(xpath = "(//div[contains(@class,'slds-combobox slds-dropdown')])[1]")
	WebElement drpdwnPg1State;
	
	//testing for USA PG1
	
//	private WebElement lstPg1StateOption(String optionValue) {
//
//		return driver.findElement(By.xpath("//div[@id='dropdown-element-951']//*[@data-value='"+optionValue+"']"));
//	}

	private WebElement lstPg1StateOption(String optonValue) {
		return driver.findElement(By.xpath("(//*[contains(@class,'slds-combobox')]//*[@data-value='"+optonValue+"'])[1]"));
	}

	@FindBy(xpath = "//*[contains(@class,'pg1_zip_code')]//input")
	WebElement txtPg1ZipCode;

	@FindBy(xpath = "//*[contains(@class,'pg1_ssn')]//input")
	WebElement txtPg1SSN;

	@FindBy(xpath = "//*[contains(@class,'pg1_sign_input')]//input")
	WebElement txtPg1Signature;

	//pg2
	@FindBy(xpath = "//*[contains(@class,'pg2_first_name')]//input")
	WebElement txtGuarantor2FirstName;

	@FindBy(xpath = "//*[contains(@class,'pg2_last_name')]//input")
	WebElement txtGuarantor2LastName;

	@FindBy(xpath = "//*[contains(@class,'pg2_street_address')]//input")
	WebElement txtPg2StreetAddress;

	@FindBy(xpath = "//*[contains(@class,'pg2_city')]//input")
	WebElement txtPg2City;

	@FindBy(xpath = "(//div[contains(@class,'slds-combobox slds-dropdown')])[2]")
	WebElement drpdwnPg2State;

	private WebElement lstPg2StateOption() {
		return driver.findElement(By.xpath("(//*[contains(@class,'slds-combobox')]//*[@data-value='AL'])[2]"));
	}

	@FindBy(xpath = "//*[contains(@class,'pg2_zip_code')]//input")
	WebElement txtPg2ZipCode;

	@FindBy(xpath = "//*[contains(@class,'pg2_ssn')]//input")
	WebElement txtPg2SSN;

	@FindBy(xpath = "//*[contains(@class,'pg2_sign_input')]//input")
	WebElement txtPg2Signature;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement btnSubmit;

	@FindBy(xpath = "//button[text()='Close']")
	WebElement btnClose;



	public String getPageHeader() {
		return waitForVisibilityOfElement(lblPageHeader).getText();
	}

	public void clickBack() {
		btnback.click();
	}
	public void clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE() {
		jsClick(rdoIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE);
	}

	public void clickIDONOTWISHTOAUTHORIZETHECONTINUINGPERSONALGUARANTEE() {
		jsClick(rdoIDONOTWISHTOAUTHORIZETHECONTINUINGPERSONALGUARANTEE);
	}


	//pg1
	public void enterGuarantor1FirstName(String Guarantor1FirstName) {
		txtGuarantor1FirstName.sendKeys(Guarantor1FirstName);
	}

	public String getGuarantor1FirstNameErrorMessage() {
		return lblGuarantor1FirstNameErrorMessage.getText();
	}

	public void enterGuarantor1LastName(String Guarantor1LastName) {
		txtGuarantor1LastName.sendKeys(Guarantor1LastName);
	}

	public void enterPg1StreetAddress(String Pg1StreetAddress) {
		txtPg1StreetAddress.sendKeys(Pg1StreetAddress);
	}

	public void enterPg1City(String Pg1City) {
		txtPg1City.sendKeys(Pg1City);
	}

	public void selectOptionFromPg1StateDropDown(String pg1state) {
		clickElement(drpdwnPg1State);
		lstPg1StateOption(pg1state);
		}

	public void enterPg1ZipCode(String Pg1ZipCode) {
		txtPg1ZipCode.sendKeys(Pg1ZipCode);
	}

	public void enterPg1SSN(String ssn) {
		txtPg1SSN.sendKeys(ssn);
	}

	public void enterPg1Signature(String Pg1Signature) {
		txtPg1Signature.sendKeys(Pg1Signature);
	}

	//pg2

	public void enterGuarantor2FirstName(String Guarantor2FirstName) {
		txtGuarantor2FirstName.sendKeys(Guarantor2FirstName);
	}

	public void enterGuarantor2LastName(String Guarantor2LastName) {
		txtGuarantor2LastName.sendKeys(Guarantor2LastName);
	}

	public void enterPg2StreetAddress(String Pg2StreetAddress) {
		txtPg2StreetAddress.sendKeys(Pg2StreetAddress);
	}

	public void enterPg2City(String Pg2City) {
		txtPg2City.sendKeys(Pg2City);
	}

	public void selectOptionFromPg2StateDropDown() {
		clickElement(drpdwnPg2State);
		lstPg2StateOption().click();
	}

	public void enterPg2ZipCode(String Pg2ZipCode) {
		txtPg2ZipCode.sendKeys(Pg2ZipCode);
	}

	public void enterPg2SSN(String ssn) {
		txtPg2SSN.sendKeys(ssn);
	}

	public void enterPg2Signature(String Pg2Signature) {
		txtPg2Signature.sendKeys(Pg2Signature);
	}

	public void clickSubmit() {
		btnSubmit.click();
	}

	public void clickClose() {
		btnClose.click();
	}
}

