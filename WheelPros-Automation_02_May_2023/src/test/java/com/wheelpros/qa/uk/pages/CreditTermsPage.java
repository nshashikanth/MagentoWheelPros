package com.wheelpros.qa.uk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

public class CreditTermsPage extends BasePage {

	WebDriver driver;

	public CreditTermsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//div[contains(@class, 'slds-text-heading')]/span[1]")
	WebElement lblPageHeader;

	@FindBy(xpath = "(//div[contains(@class, 'ui-widget')]//span[text()='Personal Guarantee'])[5]")
	WebElement lblCreditAppHeaderPersonalGuarantee;

	@FindBy(xpath = "//div[contains(@class, 'slds-col slds-size_1-of-1 slds-var-m-top_x-large')]/label")
	WebElement lbl20thProxCreditTerms;

	@FindBy(xpath = "//input[@value='Yes']")
	WebElement rdoYes;

	@FindBy(xpath = "//input[@value='No']")
	WebElement rdoNo;

	@FindBy(xpath = "//button[@title='Submit']")
	WebElement btnSubmit;

	@FindBy(xpath = "//*[contains(@class,'wp_AccNumber_input')]//input")
	WebElement txtSevenDigitWheelProsAccountNumber; 

	//CR1
	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorName')]//input")
	WebElement txtCR1VendorName;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorName')]/div[2]")
	WebElement lblCR1VendorNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorPhone')]//input")
	WebElement txtCR1Phone;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorPhone')]/div[2]")
	WebElement lblCR1PhoneErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorEmail')]//input")
	WebElement txtCR1Emailaddress;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorEmail')]/div[2]")
	WebElement lblCR1EmailaddressErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorCity')]//input")
	WebElement txtCR1City;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorCity')]/div[2]")
	WebElement lblCR1CityErrorMessage;

	@FindBy(xpath = "(//button[@name='StatesPicklist'])[1]")
	WebElement drpdwnCR1Region;

	private WebElement lstCR1RegionOption(String optionValue) {
		return driver.findElement(By.xpath("//*[@data-value='"+optionValue+"']"));
	}
	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorState')]/div[2]")
	WebElement lblCR1RegionErrorMessage;

	//CR2
	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorName')]//input")
	WebElement txtCR2VendorName;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorName')]/div[2]")
	WebElement lblCR2VendorNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorPhone')]//input")
	WebElement txtCR2Phone;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorPhone')]/div[2]")
	WebElement lblCR2PhoneErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorEmail')]//input")
	WebElement txtCR2Emailaddress;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorEmail')]/div[2]")
	WebElement lblCR2EmailaddressErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorCity')]//input")
	WebElement txtCR2City;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorCity')]/div[2]")
	WebElement lblCR2CityErrorMessage;

	@FindBy(xpath = "(//button[@name='StatesPicklist'])[2]")
	WebElement drpdwnCR2Region;
	private WebElement lstCR2RegionOption(String optionValue) {
		return driver.findElement(By.xpath("(//*[@data-value='"+optionValue+"'])[2]"));
	}

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorState')]/div[2]")
	WebElement lblCR2RegionErrorMessage;


	//CR3
	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorName')]//input")
	WebElement txtCR3VendorName;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorName')]/div[2]")
	WebElement lblCR3VendorNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorPhone')]//input")
	WebElement txtCR3Phone;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorPhone')]/div[2]")
	WebElement lblCR3PhoneErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorEmail')]//input")
	WebElement txtCR3Emailaddress;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorEmail')]/div[2]")
	WebElement lblCR3EmailaddressErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorCity')]//input")
	WebElement txtCR3City;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorCity')]/div[2]")
	WebElement lblCR3CityErrorMessage;

	@FindBy(xpath = "(//button[@name='StatesPicklist'])[3]")
	WebElement drpdwnCR3Region;
	private WebElement lstCR3RegionOption(String optionValue) {
		return driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorState_input')]//*[@data-value='"+optionValue+"']"));
	}

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorState')]/div[2]")
	WebElement lblCR3RegionErrorMessage;

	//owner1
	@FindBy(xpath = "//*[contains(@class,'bi_owner1_firstName_input')]//input")
	WebElement txtOwner1FirstName;

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_firstName')]/div[2]")
	WebElement lblOwner1FirstNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_lastName_input')]//input")
	WebElement txtOwner1LastName;

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_lastName')]/div[2]")
	WebElement lblOwner1LastNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_phone_input')]//input")
	WebElement txtOwner1Phone;

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_phone')]/div[2]")
	WebElement lblOwner1PhoneErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_email_input')]//input")
	WebElement txtOwner1Emailaddress;

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_email')]/div[2]")
	WebElement lblOwner1EmailaddressErrorMessage;

	//owner-2
	@FindBy(xpath = "//*[contains(@class,'bi_owner2_fName_input')]//input")
	WebElement txtOwner2FirstName;

	@FindBy(xpath = "//*[contains(@class,'bi_owner2_lName_input')]//input")
	WebElement txtOwner2LastName;

	@FindBy(xpath = "//*[contains(@class,'bi_owner2_phone_input')]//input")
	WebElement txtOwner2Phone;

	@FindBy(xpath = "//*[contains(@class,'bi_owner2_email_input')]//input")
	WebElement txtOwner2Emailaddress;

	//Projected Purchases

	@FindBy(xpath = "//*[contains(@class,'projected_monthly_purchase')]//input")
	WebElement txtProjectedMonthlyPurchaseTotal;

	@FindBy(xpath = " //*[contains(@class, 'projected_monthly_purchase')]/div[2]")
	WebElement lblProjectedMonthlyPurchaseTotalErrorMessage;

	//Signer Information

	@FindBy(xpath = "//*[contains(@class,'bi_signer_fName')]//input")
	WebElement txtSInfoFirstName;

	@FindBy(xpath = "//*[contains(@class, 'bi_signer_fNam')]/div[2]")
	WebElement lblSInfoFirstNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_lName')]//input")
	WebElement txtSInfoLastName;

	@FindBy(xpath = "//*[contains(@class, 'bi_signer_lNam')]/div[2]")
	WebElement lblSInfoLastNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_Phone')]//input")
	WebElement txtSInfoPhone;

	@FindBy(xpath = "//*[contains(@class, 'bi_signer_Phone')]/div[2]")
	WebElement lblSInfoPhoneErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_email')]//input")
	WebElement txtSInfoEmailAddress;

	@FindBy(xpath = "//*[contains(@class, 'bi_signer_email')]/div[2]")
	WebElement lblSInfoEmailAddressErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_street')]//input")
	WebElement txtSInfoStreetAddress;

	@FindBy(xpath = "//*[contains(@class, 'bi_signer_street')]/div[2]")
	WebElement lblSInfoStreetAddressErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_city')]//input")
	WebElement txtSInfoCity;

	@FindBy(xpath = "//*[contains(@class, 'bi_signer_city')]/div[2]")
	WebElement lblSInfoCityErrorMessage;

	@FindBy(xpath = "//button[@name='CountryPicklist']")
	WebElement drpdwnCountry;

	@FindBy(xpath = "//*[contains(@class, 'bi_signer_country')]/div[2]")
	WebElement lblSInfoCountryErrorMessage;

	private WebElement lstCountryOption(String optionValue) {
		return driver.findElement(By.xpath("//*[@data-value='"+optionValue+"']"));
	}

	@FindBy(xpath = "(//button[@name='StatesPicklist'])[4]")
	WebElement drpdwnSInfoRegion;

	@FindBy(xpath = "//*[contains(@class, 'bi_signer_state')]/div[2]")
	WebElement lblSInfoRegionErrorMessage;


	private WebElement lstSInfoRegionOption(String optionValue) {
		return driver.findElement(By.xpath("//*[contains(@class,'bi_signer_state_input')]//*[@data-value='"+optionValue+"']"));
	}

	@FindBy(xpath = "//*[contains(@class,'bi_signer_zipCode')]//input")
	WebElement txtSInfoPostCode;

	@FindBy(xpath = "//*[contains(@class, 'bi_signer_zipCode')]/div[2]")
	WebElement lblSInfoPostCodeErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_signature')]//input")
	WebElement txtSInfoSignature;

	@FindBy(xpath = "//*[contains(@class, 'bi_signer_signature')]/div[2]")
	WebElement lblSInfoSignatureErrorMessage;

	@FindBy(xpath = "//*[@title='Continue']")
	WebElement btnContinue;

	@FindBy(xpath = "//button[@title='Back']")
	WebElement btnBack;



	public void clickYes() {
		jsClick(rdoYes);
	}

	public void clickNo() {
		rdoNo.click();
	}

	public boolean isSelectedNo() {
		return rdoNo.isSelected();
	}

	public boolean isSelectedYes() {
		return rdoYes.isSelected();
	}

	public String getPageHeader() {
		return waitForVisibilityOfElement(lblPageHeader).getText();
	}

	public String getCreditAppHeader() {
		return waitForVisibilityOfElement(lblCreditAppHeaderPersonalGuarantee).getText();
	}

	public String get20thProxCreditTerms() {
		return lbl20thProxCreditTerms.getText();
	}

	public void clickSubmit() {
		btnSubmit.click();
	}

	public void enterSevenDigitWheelProsAccountNumber(String number) {
		txtSevenDigitWheelProsAccountNumber.sendKeys(number);
	}

	//CR1
	public void enterCR1VendorName(String CR1VendorName) {
		txtCR1VendorName.sendKeys(CR1VendorName);
	}

	public String getCR1VendorNameErrorMessage() {
		return lblCR1VendorNameErrorMessage.getText();
	}

	public void enterCR1Phone(String number) {
		txtCR1Phone.sendKeys(number);
	}

	public String getCR1PhoneErrorMessage() {
		return lblCR1PhoneErrorMessage.getText();
	}

	public void enterCR1Emailaddress(String CR1Emailaddress) {
		txtCR1Emailaddress.sendKeys(CR1Emailaddress);
	}

	public String getCR1EmailaddressErrorMessage() {
		return lblCR1EmailaddressErrorMessage.getText();
	}

	public void enterCR1City(String CR1City) {
		txtCR1City.sendKeys(CR1City);
	}

	public String getCR1CityaddressErrorMessage() {
		return lblCR1CityErrorMessage.getText();
	}

	public void selectOptionFromCR1RegionDropDown(String option) {
		clickElement(drpdwnCR1Region);
		lstCR1RegionOption(option).click();
	}

	public String getCR1RegionaddressErrorMessage() {
		return lblCR1RegionErrorMessage.getText();
	}

	//CR2

	public void enterCR2VendorName(String CR2VendorName) {
		txtCR2VendorName.sendKeys(CR2VendorName);
	}

	public String getCR2VendorNameErrorMessage() {
		return lblCR2VendorNameErrorMessage.getText();
	}

	public void enterCR2Phone(String number) {
		txtCR2Phone.sendKeys(number);
	}

	public String getCR2PhoneErrorMessage() {
		return lblCR2PhoneErrorMessage.getText();
	}

	public void enterCR2Emailaddress(String CR2Emailaddress) {
		txtCR2Emailaddress.sendKeys(CR2Emailaddress);
	}

	public String getCR2EmailaddressErrorMessage() {
		return lblCR2EmailaddressErrorMessage.getText();
	}

	public void enterCR2City(String CR2City) {
		txtCR2City.sendKeys(CR2City);
	}

	public String getCR2CityaddressErrorMessage() {
		return lblCR2CityErrorMessage.getText();
	}

	public void selectOptionFromCR2RegionDropDown(String option) {
		clickElement(drpdwnCR2Region);
		lstCR2RegionOption(option).click();
	}

	public String getCR2RegionaddressErrorMessage() {
		return lblCR2RegionErrorMessage.getText();
	}

	//CR3
	public void enterCR3VendorName(String CR3VendorName) {
		txtCR3VendorName.sendKeys(CR3VendorName);
	}

	public String getCR3VendorNameErrorMessage() {
		return lblCR3VendorNameErrorMessage.getText();
	}

	public void enterCR3Phone(String number) {
		txtCR3Phone.sendKeys(number);
	}

	public String getCR3PhoneErrorMessage() {
		return lblCR3PhoneErrorMessage.getText();
	}


	public void enterCR3Emailaddress(String CR3Emailaddress) {
		txtCR3Emailaddress.sendKeys(CR3Emailaddress);
	}

	public String getCR3EmailaddressErrorMessage() {
		return lblCR3EmailaddressErrorMessage.getText();
	}

	public void enterCR3City(String CR3City) {
		txtCR3City.sendKeys(CR3City);
	}

	public String getCR3CityaddressErrorMessage() {
		return lblCR3CityErrorMessage.getText();
	}

	public void selectOptionFromCR3RegionDropDown(String option) {
		clickElement(drpdwnCR3Region);
		lstCR3RegionOption(option).click();
	}

	public String getCR3RegionaddressErrorMessage() {
		return lblCR3RegionErrorMessage.getText();
	}

	//Owner-1
	public void enterOwner1FirstName(String Owner1FirstName) {
		txtOwner1FirstName.sendKeys(Owner1FirstName);
	}

	public String getOwner1FirstNameErrorMessage() {
		return lblOwner1FirstNameErrorMessage.getText();
	}

	public void enterOwner1LastName(String Owner1LastName) {
		txtOwner1LastName.sendKeys(Owner1LastName);
	}

	public String getOwner1LastNameErrorMessage() {
		return lblOwner1LastNameErrorMessage.getText();
	} 
	public void enterOwner1Phone(String number) {
		txtOwner1Phone.sendKeys(number);
	}

	public String getOwner1PhoneErrorMessage() {
		return lblOwner1PhoneErrorMessage.getText();
	}

	public void enterOwner1Emailaddress(String Emailaddress) {
		txtOwner1Emailaddress.sendKeys(Emailaddress);
	}

	public String getOwner1EmailaddressErrorMessage() {
		return lblOwner1EmailaddressErrorMessage.getText();
	}

	//Owner-2
	public void enterOwner2FirstName(String Owner2FirstName) {
		txtOwner2FirstName.sendKeys(Owner2FirstName);
	}

	public void enterOwner2LastName(String Owner2LastName) {
		txtOwner2LastName.sendKeys(Owner2LastName);
	}

	public void enterOwner2Phone(String number) {
		txtOwner2Phone.sendKeys(number);
	}

	public void enterOwner2Emailaddress(String Emailaddress) {
		txtOwner2Emailaddress.sendKeys(Emailaddress);
	}

	//Projected Purchases
	public void enterProjectedMonthlyPurchaseTotal(String number) {
		txtProjectedMonthlyPurchaseTotal.sendKeys(number);
	}

	public String getProjectedMonthlyPurchaseTotalErrorMessage() {
		return lblProjectedMonthlyPurchaseTotalErrorMessage.getText();
	}

	//Signer Information
	public void enterSInfoFirstName(String SInfoFirstName) {
		txtSInfoFirstName.sendKeys(SInfoFirstName);
	}

	public String getSInfoFirstNameErrorMessage() {
		return lblSInfoFirstNameErrorMessage.getText();
	}

	public void enterSInfoLastName(String SInfoLastName) {
		txtSInfoLastName.sendKeys(SInfoLastName);
	}

	public String getSInfoLastNameErrorMessage() {
		return lblSInfoLastNameErrorMessage.getText();
	}

	public void enterSInfoPhone(String number) {
		txtSInfoPhone.sendKeys(number);
	}

	public String getSInfoPhoneErrorMessage() {
		return lblSInfoPhoneErrorMessage.getText();
	}

	public void enterSInfoEmailAddress(String EmailAddress) {
		txtSInfoEmailAddress.sendKeys(EmailAddress);
	}

	public String getSInfoEmailAddressErrorMessage() {
		return lblSInfoEmailAddressErrorMessage.getText();
	}

	public void enterSInfoStreetAddress(String StreetAddress) {
		txtSInfoStreetAddress.sendKeys(StreetAddress);
	}

	public String getSInfoStreetAddressErrorMessage() {
		return lblSInfoStreetAddressErrorMessage.getText();
	}

	public void enterSInfoCity(String City) {
		txtSInfoCity.sendKeys(City);
	}

	public String getSInfoCityErrorMessage() {
		return lblSInfoCityErrorMessage.getText();
	}

	public void selectOptionFromCountryDropDown(String option) {
		clickElement(drpdwnCountry);
		lstCountryOption(option).click();
	}

	public String getSInfoCountryErrorMessage() {
		return lblSInfoCountryErrorMessage.getText();
	}

	public void selectOptionFromSInfoRegionDropDown(String option) {
		clickElement(drpdwnSInfoRegion);
		lstSInfoRegionOption(option).click();
	}

	public String getSInfoRegionErrorMessage() {
		return lblSInfoRegionErrorMessage.getText();
	}

	public void enterPostCode(String PostCode) {
		txtSInfoPostCode.sendKeys(PostCode);
	}

	public String getSInfoPostCodeErrorMessage() {
		return lblSInfoPostCodeErrorMessage.getText();
	}

	public void enterSignature(String Signature) {
		txtSInfoSignature.sendKeys(Signature);
	}

	public String getSInfoSignatureErrorMessage() {
		return lblSInfoSignatureErrorMessage.getText();
	}

	public String getSignature() {
		return txtSInfoSignature.getText();
	}

	public void clickContinue() {
		btnContinue.click();
	}

	public void clickBack() {
		btnBack.click();
	}

}
