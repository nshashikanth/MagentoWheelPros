package com.wheelpros.qa.ca.pages;

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
	
	@FindBy(xpath = "//*[contains(@class, 'pg1_last_name')]/div[2]")
	WebElement lblGuarantor1LastNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'pg1_street_address')]//input")
	WebElement txtPg1StreetAddress;
	
	@FindBy(xpath = "//*[contains(@class, 'pg1_street_address_input')]/div[2]")
	WebElement lblPg1StreetAddressErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'pg1_city')]//input")
	WebElement txtPg1City;

	@FindBy(xpath = "//*[contains(@class, 'pg1_city_input')]/div[2]")
	WebElement lblPg1CityErrorMessage;
	
	@FindBy(xpath = "(//div[contains(@class,'slds-combobox slds-dropdown')])[1]")
	WebElement drpdwnPg1Province;

	private WebElement lstPg1ProvinceOption() {
		return driver.findElement(By.xpath("(//*[contains(@class,'slds-combobox')]//*[@data-value='AB'])[1]"));
	}
	
	@FindBy(xpath = "//*[contains(@class, 'pg1_state_combobox')]/div[2]")
	WebElement lblPg1ProvinceErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'pg1_zip_code')]//input")
	WebElement txtPg1PostalCode;
	
	@FindBy(xpath = "//*[contains(@class, 'pg1_zip_code_input')]/div[2]")
	WebElement lblPg1PostalCodErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'pg1_ssn')]//input")
	WebElement txtPg1SIN;

	@FindBy(xpath = "//*[contains(@class,'pg1_sign_input')]//input")
	WebElement txtPg1Signature;
	
	@FindBy(xpath = "//*[contains(@class, 'pg1_sign_input')]/div[2]")
	WebElement lblPg1SignatureErrorMessage;

	//pg2
	@FindBy(xpath = "//*[contains(@class,'pg2_first_name')]//input")
	WebElement txtGuarantor2FirstName;
	
	@FindBy(xpath = "//*[contains(@class, 'pg2_first_name')]/div[2]")
	WebElement lblGuarantor2FirstNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'pg2_last_name')]//input")
	WebElement txtGuarantor2LastName;
	
	@FindBy(xpath = "//*[contains(@class, 'pg2_last_name')]/div[2]")
	WebElement lblGuarantor2LastNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'pg2_street_address')]//input")
	WebElement txtPg2StreetAddress;
	
	@FindBy(xpath = "//*[contains(@class, 'pg2_street_address_input')]/div[2]")
	WebElement lblPg2StreetAddressErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'pg2_city')]//input")
	WebElement txtPg2City;

	@FindBy(xpath = "//*[contains(@class, 'pg2_city_input')]/div[2]")
	WebElement lblPg2CityErrorMessage;
	
	@FindBy(xpath = "(//div[contains(@class,'slds-combobox slds-dropdown')])[2]")
	WebElement drpdwnPg2Province;

	private WebElement lstPg2ProvinceOption() {
		return driver.findElement(By.xpath("(//*[contains(@class,'slds-combobox')]//*[@data-value='AB'])[2]"));
	}

	@FindBy(xpath = "//*[contains(@class, 'pg2_state_combobox')]/div[2]")
	WebElement lblPg2ProvinceErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'pg2_zip_code')]//input")
	WebElement txtPg2PostalCode;
	
	@FindBy(xpath = "//*[contains(@class, 'pg2_zip_code_input')]/div[2]")
	WebElement lblPg2PostalCodErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'pg2_ssn')]//input")
	WebElement txtPg2SIN;
	
	@FindBy(xpath = "//*[contains(@class, 'pg2_ssn_input')]/div[2]")
	WebElement lblPg2SINErrorMessage;
	
	@FindBy(xpath = "//*[contains(@class,'pg2_sign_input')]//input")
	WebElement txtPg2Signature;
	
	@FindBy(xpath = "//*[contains(@class, 'pg2_sign_input')]/div[2]")
	WebElement lblPg2SignatureErrorMessage;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement btnSubmit;
	
	@FindBy(xpath = "//button[text()='Close']")
	WebElement btnClose;
	
	@FindBy(xpath = "(//span[text()='Finish'])[5]")
	WebElement lblFinishPageHeader;
	
	
	


	public String getPageHeader() {
		return waitForVisibilityOfElement(lblPageHeader).getText();
	}

	
	public void clickBack() {
		btnback.click();
	}
	public void clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE() {
		jsClick(rdoIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE);
	}
	 
	public Boolean isSelectedIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE() {
		return rdoIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE.isSelected();
	}

	public void clickIDONOTWISHTOAUTHORIZETHECONTINUINGPERSONALGUARANTEE() {
		jsClick(rdoIDONOTWISHTOAUTHORIZETHECONTINUINGPERSONALGUARANTEE);
	}
	
	public boolean isSelectedIDONOTWISHTOAUTHORIZETHECONTINUINGPERSONALGUARANTEE() {
		return rdoIDONOTWISHTOAUTHORIZETHECONTINUINGPERSONALGUARANTEE.isSelected();
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
	
	public String getGuarantor1LastNameErrorMessage() {
		return lblGuarantor1LastNameErrorMessage.getText();
	}

	public void enterPg1StreetAddress(String Pg1StreetAddress) {
		txtPg1StreetAddress.sendKeys(Pg1StreetAddress);
	}
	
	public String getPg1StreetAddressErrorMessage() {
		return lblPg1StreetAddressErrorMessage.getText();
	}
	
	public void enterPg1City(String Pg1City) {
		txtPg1City.sendKeys(Pg1City);
	}
	
	public String getPg1CityErrorMessage() {
		return lblPg1CityErrorMessage.getText();
	}

	public void selectOptionFromPg1ProvinceDropDown() {
		clickElement(drpdwnPg1Province);
		lstPg1ProvinceOption().click();
	}
	
	public String getPg1ProvinceErrorMessage() {
		return lblPg1ProvinceErrorMessage.getText();
	}

	public void enterPg1PostalCode(String Pg1PostalCode) {
		clearAndEnterText(txtPg1PostalCode, Pg1PostalCode);
		//txtPg1PostalCode.sendKeys(Pg1PostalCode);
	}
	
	public String getPg1PostalCodeErrorMessage() {
		return lblPg1PostalCodErrorMessage.getText();
	}

	public void enterPg1SIN(String sin) {
		txtPg1SIN.sendKeys(sin);
	}

	public void enterPg1Signature(String Pg1Signature) {
		txtPg1Signature.sendKeys(Pg1Signature);
	}
	
	public String getPg1SignatureCodeErrorMessage() {
		return lblPg1SignatureErrorMessage.getText();
	}

	//pg2

	public void enterGuarantor2FirstName(String Guarantor2FirstName) {
		txtGuarantor2FirstName.sendKeys(Guarantor2FirstName);
	}

	public String getGuarantor2FirstNameErrorMessage() {
		return lblGuarantor2FirstNameErrorMessage.getText();
	}
	
	public void enterGuarantor2LastName(String Guarantor2LastName) {
		txtGuarantor2LastName.sendKeys(Guarantor2LastName);
	}

	public String getGuarantor2LastNameErrorMessage() {
		return lblGuarantor2LastNameErrorMessage.getText();
	}
	
	public void enterPg2StreetAddress(String Pg2StreetAddress) {
		txtPg2StreetAddress.sendKeys(Pg2StreetAddress);
	}
	
	public String getPg2StreetAddressErrorMessage() {
		return lblPg2StreetAddressErrorMessage.getText();
	}
	

	public void enterPg2City(String Pg2City) {
		txtPg2City.sendKeys(Pg2City);
	}
	
	public String getPg2CityErrorMessage() {
		return lblPg2CityErrorMessage.getText();
	}

	public void selectOptionFromPg2ProvinceDropDown() {
		clickElement(drpdwnPg2Province);
		lstPg2ProvinceOption().click();
	}
	
	public String getPg2ProvinceErrorMessage() {
		return lblPg2ProvinceErrorMessage.getText();
	}


	public void enterPg2PostalCode(String Pg2PostalCode) {
		clearAndEnterText(txtPg2PostalCode, Pg2PostalCode);
		//txtPg2PostalCode.sendKeys(Pg2PostalCode);
	}
	
	public String getPg2PostalCodeErrorMessage() {
		return lblPg2PostalCodErrorMessage.getText();
	}

	public void enterPg2SIN(String sin) {
		txtPg2SIN.sendKeys(sin);
	}
	
	public String getPg2SINErrorMessage() {
		return lblPg2SINErrorMessage.getText();
	}


	public void enterPg2Signature(String Pg2Signature) {
		txtPg2Signature.sendKeys(Pg2Signature);
	}
	
	public String getPg2SignatureCodeErrorMessage() {
		return lblPg2SignatureErrorMessage.getText();
	}
	
	public void clickSubmit() {
		btnSubmit.click();
	}

	public void clickClose() {
		btnClose.click();
	}
	
	public String getFinishPageHeader() {
		return lblFinishPageHeader.getText();
	}

}

