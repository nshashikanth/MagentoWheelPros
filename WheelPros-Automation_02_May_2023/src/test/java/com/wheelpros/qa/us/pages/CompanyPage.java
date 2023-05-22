package com.wheelpros.qa.us.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

public class CompanyPage extends BasePage{
	WebDriver driver;

	public CompanyPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//div[contains(@class, 'slds-text-heading')]/span[1]")
	WebElement lblPageHeader;

	@FindBy(xpath = "//*[contains(@class, 'company_name_input')]//input")
	WebElement txtCompanyName;

	@FindBy(xpath = "//*[contains(@class, 'company_name_input')]/div[2]")
	WebElement lblCompanyNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class, 'company_name_trade_dba')]//input")
	WebElement txtCompanyNameTrade;

	@FindBy(xpath = "//*[contains(@class, 'business_legal_structure_combobox')]")
	WebElement btnBusinessLegalStructure;

	private WebElement lstBusinessLegalStructureOption(String optionValue) {

		return driver.findElement(By.xpath("//*[@data-value='"+optionValue+"']"));
	}

	@FindBy(xpath = "//*[contains(@class, 'federal_identification_number')]//input")
	WebElement txtFederalEmployerIdentificationNumber;

	@FindBy(xpath = "//*[contains(@class, 'year_input')]//input")
	WebElement txtYearEstablishedByCurrentOwnership;

	@FindBy(xpath = "//*[contains(@class, 'other_notes')]//input")
	WebElement txtOtherNotes;

	@FindBy(xpath = "//input[contains(@class, 'slds-file-selector__input' )]")
	WebElement uploadSalesTaxorBusinessLicense;


	@FindBy(xpath = "//button[contains(@class,'slds-button slds-button--neutral')]")
	WebElement uploadFiles;

	@FindBy(xpath = "//*[contains(@class, 'street_address')]//input")
	WebElement txtStreetAddress;

	@FindBy(xpath = "//*[contains(@class, 'city')]//input")
	WebElement txtCity;

	@FindBy(xpath = "//button[@name='StatesPicklist']")
	WebElement drpdwnState;

	private WebElement lstStateOption(String optionValue) {
		return driver.findElement(By.xpath("//*[@data-value='"+optionValue+"']"));
	}

	public void selectOptionFromStateDropDown(String option) {
		jsClick(drpdwnState);
		jsClick(lstStateOption(option));
	}

	@FindBy(xpath = "//*[contains(@class, 'zip_code')]//input")
	WebElement txtZipCode;

	@FindBy(xpath = "//input[@value='Yes']")
	WebElement rdoYes;

	@FindBy(xpath = "//input[@value='No']")
	WebElement rdoNo;

	@FindBy(xpath = "//*[contains(@class,'slds-button slds-button_brand')]")
	WebElement btnContinue;


	public void enterCompanyName(String CompanyName) {
		txtCompanyName.sendKeys(CompanyName);
	}

	public void enterCompanyNameTrade(String CompanyNameTrade) {
		txtCompanyNameTrade.sendKeys(CompanyNameTrade);
	}
	public void selectOptionFromBusinessLegalStructureDropDown(String option) {
		btnBusinessLegalStructure.click();
		lstBusinessLegalStructureOption(option).click();
	}

	public void enterFederalEmployerIdentificationNumber(String number) {
		txtFederalEmployerIdentificationNumber.sendKeys(number);
	}

	public void enterYearEstablishedByCurrentOwnership(String YearEstablishedByCurrentOwnership) {
		txtYearEstablishedByCurrentOwnership.sendKeys(YearEstablishedByCurrentOwnership);
	}

	public void enterOtherNotes(String OtherNotes) {
		txtOtherNotes.sendKeys(OtherNotes);
	}

	public void uploadSalesTaxorBusinessLicense(String path) {
		uploadSalesTaxorBusinessLicense.sendKeys(path);
	}

	public void clickSalesTaxorBusinessLicense() {
		while(uploadFiles.getAttribute("disabled")!=null) {
			staticThreadWait(1);
		}
		uploadFiles.click();
	}

	public void enterStreetAddress(String StreetAddress) {
		txtStreetAddress.sendKeys(StreetAddress);
	}

	public void enterCity(String City) {
		txtCity.sendKeys(City);
	}

	public void enterZipCode(String ZipCode) {
		txtZipCode.sendKeys(ZipCode);
	}

	public void clickYes() {
		clickElement(rdoYes);
	}

	public void clickNo() {
		clickElement(rdoNo);
	}
	public void clickContinue() {
		jsClick(btnContinue);
	}

	public String getPageHeader() {
		return waitForVisibilityOfElement(lblPageHeader).getText();
	}

	public String getCompanyNameErrorMessage() {
		return lblCompanyNameErrorMessage.getText();
	}
}
