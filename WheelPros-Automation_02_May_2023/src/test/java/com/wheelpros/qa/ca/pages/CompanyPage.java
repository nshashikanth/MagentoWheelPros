package com.wheelpros.qa.ca.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;
import com.wheelpros.web.utils.Report;
import com.wheelpros.web.utils.Status;

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

	@FindBy(xpath = "//*[contains(@class, 'parent_company')]//input")
	WebElement txtParentCompany;

	@FindBy(xpath = "//*[contains(@class, 'business_legal_structure_combobox')]")
	WebElement btnBusinessLegalStructure;

	@FindBy(xpath = "//*[contains(@class, 'business_legal')]/div[2]")
	WebElement lblBusinessLegalStructureErrorMessage;



	private WebElement lstBusinessLegalStructureOption(String optionValue) {

		return driver.findElement(By.xpath("//*[@data-value='"+optionValue+"']"));
	}

	@FindBy(xpath = "//*[@name='PlaceOfFormationOfApplication']")
	WebElement btnPlaceofFormationofApplication;

	private WebElement lstPlaceofFormationofApplicationOption(String optionValue) {

		return driver.findElement(By.xpath("//*[@data-value='"+optionValue+"']"));
	}

	@FindBy(xpath = "//*[contains(@class, 'pst_input')]//input")
	WebElement txtPST1;

	@FindBy(xpath = "//*[contains(@class, 'pst')]/div[2]")
	WebElement lblPSTErrorMessage;


	@FindBy(xpath = "//*[contains(@class, 'gst_input')]//input")
	WebElement txtGST1;

	@FindBy(xpath = "//*[contains(@class, 'gst')]/div[2]")
	WebElement lblGSTErrorMessage;

	@FindBy(xpath = "//*[contains(@class, 'hst_input')]//input")
	WebElement txtHST1;

	@FindBy(xpath = "//*[contains(@class, 'hst')]/div[2]")
	WebElement lblHSTErrorMessage;

	@FindBy(xpath = "(//label[text()='Tire Recycling#'])[2]//../div/input")
	WebElement txtTireRecycling;

	@FindBy(xpath = "//*[contains(@class, 'year_input')]//input")
	WebElement txtYearEstablishedByCurrentOwnership;

	@FindBy(xpath = "//*[contains(@class, 'year')]/div[2]")
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
	WebElement drpdwnProvince;


	private WebElement lstProvinception(String optionValue) {
		return driver.findElement(By.xpath("//*[@data-value='"+optionValue+"']"));				
	}


	@FindBy(xpath = "//*[contains(@class, 'state_combobox')]/div[2]")
	WebElement lblProvinceErrorMessage;

	@FindBy(xpath = "//*[contains(@class, 'zip_code')]//input")
	WebElement txtPostalCode;

	@FindBy(xpath = "//*[contains(@class, 'zip_code')]/div[2]")
	WebElement lblPostalCodeErrorMessage;

	@FindBy(xpath = "//input[@value='Yes']")
	WebElement rdoYes;

	@FindBy(xpath = "//input[@value='No']")
	WebElement rdoNo;

	@FindBy(xpath = "//*[contains(@class,'owner_residence_radio')]//div[text()='This field is required.']")
	WebElement lblIsTheBusinessOperatingAtTheOwnerResidenceErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'slds-button slds-button_brand')]")
	WebElement btnContinue;



	public String getPageHeader() {
		return waitForVisibilityOfElement(lblPageHeader).getText();
	}

	public void enterCompanyName(String CompanyName) {
		txtCompanyName.sendKeys(CompanyName);
		Report.log(Status.INFO, "user entered company name as "+CompanyName);
	}

	public String getCompanyNameErrorMessage() {
		return lblCompanyNameErrorMessage.getText();
	}

	public void enterCompanyNameTrade(String CompanyNameTrade) {
		txtCompanyNameTrade.sendKeys(CompanyNameTrade);
		Report.log(Status.INFO, "user entered company name trade as "+CompanyNameTrade);
	}

	public void enterParentCompany(String ParentCompany) {
		txtParentCompany.sendKeys(ParentCompany);
	}

	public void selectOptionFromBusinessLegalStructureDropDown(String option) {
		btnBusinessLegalStructure.click();
		lstBusinessLegalStructureOption(option).click();
	}

	public String getBusinessLegalStructureErrorMessage() {
		return lblBusinessLegalStructureErrorMessage.getText();
	}

	public void selectOptionFromPlaceofFormationofApplication(String option) {
		btnPlaceofFormationofApplication.click();
		lstPlaceofFormationofApplicationOption(option).click();
	}

	public void enterPST1(String pst1) {
		txtPST1.sendKeys(pst1);
	}

	public String getPST1ErrorMessage() {
		return lblPSTErrorMessage.getText();
	}

	public void enterGST1(String gst1) {
		txtGST1.sendKeys(gst1);
	}

	public String getGST1ErrorMessage() {
		return lblGSTErrorMessage.getText();
	}

	public void enterHST1(String hst1) {
		txtHST1.sendKeys(hst1);
	}

	public String getHST1ErrorMessage() {
		return lblHSTErrorMessage.getText();
	}

	public void enterTireRecycling(String TireRecycling) {
		txtTireRecycling.sendKeys(TireRecycling);
	}

	public void enterYearEstablishedByCurrentOwnership(String YearEstablishedByCurrentOwnership) {
		txtYearEstablishedByCurrentOwnership.sendKeys(YearEstablishedByCurrentOwnership);
	}

	public String getYearEstablishedByCurrentOwnershipErrorMessage() {
		return lblYearEstablishedByCurrentOwnershipErrorMessage.getText();
	}

	public String getValidYearEstablishedByCurrentOwnershipErrorMessage() {
		return lblYearEstablishedByCurrentOwnershipErrorMessage.getText();
	}


	public void enterOtherNotes(String OtherNotes) {
		txtOtherNotes.sendKeys(OtherNotes);
	}

	public void enterStreetAddress(String StreetAddress) {
		txtStreetAddress.sendKeys(StreetAddress);
	}

	public String getStreetAddressErrorMessage() {
		return lblStreetAddressErrorMessage.getText();
	}

	public void enterCity(String City) {
		clearAndEnterText(txtCity, City);
		//txtCity.sendKeys(City);
	}

	public String getCityErrorMessage() {
		return lblCityErrorMessage.getText();
	}

	public void selectOptionFromProvinceDropDown() {
		drpdwnProvince.click();
	}

	public void selectOptionFromlstProvinceDropDown(String option) {
		drpdwnProvince.click();
		lstProvinception(option).click();
	}

	public String getProvinceErrorMessage() {
		return lblProvinceErrorMessage.getText();
	}

	public void enterPostalCode(String PostalCode) {
		clearAndEnterText(txtPostalCode, PostalCode);
		//txtPostalCode.sendKeys(PostalCode);
	}

	public String getPostalCodeErrorMessage() {
		return lblPostalCodeErrorMessage.getText();
	}

	public void clickYes() {
		clickElement(rdoYes);
	}

	public void clickNo() {
		clickElement(rdoNo);
	}

	public String getIsTheBusinessOperatingAtTheOwnerResidenceErrorMessage() {
		return lblIsTheBusinessOperatingAtTheOwnerResidenceErrorMessage.getText();
	}

	public void clickContinue() {
		jsClick(btnContinue);
	}


}
