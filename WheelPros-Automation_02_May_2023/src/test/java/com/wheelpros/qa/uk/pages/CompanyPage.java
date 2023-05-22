package com.wheelpros.qa.uk.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
	WebElement txtRegisteredName;

	@FindBy(xpath = "//*[contains(@class, 'company_name_input')]/div[2]")
	WebElement lblCompanyNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class, 'company_name_trade_dba')]//input")
	WebElement txtTradingName;

	@FindBy(xpath = "//*[contains(@class, 'company_name_trade_cn')]//input")
	WebElement txtCompanyNumber;

	@FindBy(xpath = "//*[contains(@class, 'company_name_trade_cn ')]/div[2]")
	WebElement lblCompanyNumberErrorMessage;

	@FindBy(xpath = "//*[contains(@class, 'business_legal_structure_combobox')]")
	WebElement clickBusinessLegalStructure;

	@FindBy(xpath = "//*[contains(@class, 'business_legal_structure')]/div[2]")
	WebElement lblBusinessLegalStructureErrorMessage;

	private WebElement lstBusinessLegalStructureOption(String optionValue) {

		return driver.findElement(By.xpath("//*[@data-value='"+optionValue+"']"));
	}


	@FindBy(xpath = "//*[contains(@class, 'vat')]//input")
	WebElement txtVATRegistration;

	@FindBy(xpath = "//*[contains(@class, 'vat_registration')]/div[2]")
	WebElement lblVATRegistrationErrorMessage;

	@FindBy(xpath = "//*[contains(@class, 'year_input')]//input")
	WebElement txtYearEstablishedByCurrentOwnership;

	@FindBy(xpath = "//*[contains(@class, 'year_input')]/div[2]")
	WebElement lblYearEstablishedByCurrentOwnershipErrorMessage;

	@FindBy(xpath = "//*[contains(@class, 'other_notes')]//input")
	WebElement txtOtherNotes;

	@FindBy(xpath = "//*[contains(@class, 'street_address')]//input")
	WebElement txtStreetAddress;

	@FindBy(xpath = "//*[contains(@class, 'street_address_input')]/div[2]")
	WebElement lblStreetAddressErrorMessage;

	@FindBy(xpath = "//*[contains(@class, 'city')]//input")
	WebElement txtCity;

	@FindBy(xpath = "//*[contains(@class, 'city_input')]/div[2]")
	WebElement lblCityErrorMessage;

	@FindBy(xpath = "//button[@name='StatesPicklist']")
	WebElement clickRegion;

	@FindBy(xpath = "//button[@name='StatesPicklist']")
	WebElement VerifyRegionName;

	@FindBy(xpath = "//*[contains(@class, 'state_combobox')]/div[2]")
	WebElement lblRegionErrorMessage;

	@FindBy(xpath = "//button[@name='StatesPicklist']/../../div[2]//span/span")
	List<WebElement> lstStatesPick;	

	private WebElement lstRegionOption(String optionValue) {
		return driver.findElement(By.xpath("//*[@data-value='"+optionValue+"']"));				
	}

	@FindBy(xpath = "//*[contains(@class, 'zip_code')]//input")
	WebElement txtPostCode;

	@FindBy(xpath = "//input[@value='Yes']")
	WebElement rdoBtnYes;

	@FindBy(xpath = "//input[@value='No']")
	WebElement rdoBtnNo;

	@FindBy(xpath = "//*[contains(@class, 'owner_residence_radio_group')]/fieldset/div[2]")
	WebElement lblIstheBusinessOperatingAtTheOwnerResidenceErrorMessage;

	@FindBy(xpath = "//div/button[@title='Continue']")
	WebElement btnContinue;

	public String getPageHeader() {
		return waitForVisibilityOfElement(lblPageHeader).getText();
	}

	public void enterRegisteredName(String RegisteredName){
		clearAndEnterText(txtRegisteredName, RegisteredName);
	}

	public void enterTradingName(String TradingName){
		txtTradingName.sendKeys(TradingName);
	}

	public void enterCompanyNumber(String Number){
		clearAndEnterText(txtCompanyNumber, Number);
	}

	public String getCompanyNumberErrorMessage() {
		return lblCompanyNumberErrorMessage.getText();
	}

	public void selectOptionFromBusinessLegalStructureDropDown(String option) {
		clickBusinessLegalStructure.click();
		lstBusinessLegalStructureOption(option).click();
	}

	public String getBusinessLegalStructureErrorMessage() {
		return lblBusinessLegalStructureErrorMessage.getText();
	}

	public void enterVATRegistration(String number){
		txtVATRegistration.sendKeys(number);
	}

	public String getVATRegistrationErrorMessage() {
		return lblVATRegistrationErrorMessage.getText();
	}

	public void enterYearEstablishedByCurrentOwnership(String number){
		txtYearEstablishedByCurrentOwnership.sendKeys(number);
	}

	public String getYearEstablishedByCurrentOwnershipErrorMessage() {
		return lblYearEstablishedByCurrentOwnershipErrorMessage.getText();
	}

	public void enterOtherNotes(String OtherNotes){
		txtOtherNotes.sendKeys(OtherNotes);
	}

	public void enterStreetAddress(String StreetAddress){
		txtStreetAddress.sendKeys(StreetAddress);
	}

	public String getStreetAddressErrorMessage() {
		return lblStreetAddressErrorMessage.getText();
	}

	public void enterCity(String City){
		txtCity.sendKeys(City);
	}

	public String getCityErrorMessage(){
		return lblCityErrorMessage.getText();
	}

	public void clickRegion(String option){
		clickRegion.click();
		lstRegionOption(option).click();
	}

	public String getRegionName(){
		return VerifyRegionName.getText();
	}


	public String getRegioErrorMessage(){
		return lblRegionErrorMessage.getText();
	}

	public void enterPostCode(String PostCode) {
		txtPostCode.sendKeys(PostCode);
	}

	public void clickYesIstheBusinessOperatingAtTheOwnerResidence(){
		try {
			driver.findElement(By.xpath("//input[@value='Yes']")).click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='Yes']"))); //yes
		}
	}

	public void clickNoIstheBusinessOperatingAtTheOwnerResidence(){
		try {
			driver.findElement(By.xpath("//input[@value='No']")).click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='No']"))); 
		}
	}


	public String getIstheBusinessOperatingAtTheOwnerResidenceErrorMessage() {
		return lblIstheBusinessOperatingAtTheOwnerResidenceErrorMessage.getText();
	}

	public void btnContinue(){
		jsClick(btnContinue);
	}

	public String getCompanyNameErrorMessage() {
		return lblCompanyNameErrorMessage.getText();
	}

	public void verifyScrollThroughDropDownOptions(){
		clickRegion.click();
		int i = 0;
		for(WebElement option:lstStatesPick) {
			scrollIntoView(option);
			i++;
			if(i%30==0) {
				takeScreenShot("StateOption_"+option.getText()+".png");
			}
			Assert.assertTrue(isElementDisplayed(option));
		}
	}

	public boolean isErrorMessageFOrRegionDisplayed() {
		return isElementDisplayed(clickRegion);
	}
}








