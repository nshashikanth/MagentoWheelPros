package com.wheelpros.qa.us.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

public class CreditTermsPage extends BasePage{


	WebDriver driver;

	public CreditTermsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//div[contains(@class, 'slds-text-heading')]/span[1]")
	WebElement lblPageHeader;

	@FindBy(xpath = "//input[@value='Yes']")
	WebElement rdoYes;

	@FindBy(xpath = "//input[@value='No']")
	WebElement rdoNo;

	@FindBy(xpath = "//button[@title='Submit']")
	WebElement btnSubmit;

	@FindBy(xpath = "//*[contains(@class,'wp_AccNumber_input')]//input")
	WebElement txtSevenDigitWheelProsAccountNumber;

	@FindBy(xpath = "//span[text()='I HAVE READ AND AGREE TO WHEEL PROS’ CREDIT TERMS AND CONDITIONS.']")
	WebElement chkboxTermsCondition;

	@FindBy(xpath = "//*[contains(@class, 'agree_tc')]/div[2]")
	WebElement chkboxAgreeTcErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_bank_name_input')]//input")
	WebElement txtBankName;

	@FindBy(xpath = "//*[contains(@class,'bi_bank_accNumber_input')]//input")
	WebElement txtBankAccountNumber;

	@FindBy(xpath = "//*[contains(@class,'bi_bank_city_input')]//input")
	WebElement txtCity;

	@FindBy(xpath = "(//button[@name='StatesPicklist'])[1]")
	WebElement drpdwnState;

	private WebElement lstStateOption(String optionValue) {
		return driver.findElement(By.xpath("//*[@data-value='"+optionValue+"']"));				
	}

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorName')]//input")
	WebElement txtCR1VendorName;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorPhone')]//input")
	WebElement txtCR1Phone;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorEmail')]//input")
	WebElement txtCR1Emailaddress;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorCity')]//input")
	WebElement txtCR1City;

	@FindBy(xpath = "(//button[@name='StatesPicklist'])[2]")
	WebElement drpdwnCR1State;

	private WebElement lstCR1StateOption(String optionValue) {
		return driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorState_input')]//*[@data-value='"+optionValue+"']"));
	}

	//Credit rf2
	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorName')]//input")
	WebElement txtCR2VendorName;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorPhone')]//input")
	WebElement txtCR2Phone;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorEmail')]//input")
	WebElement txtCR2Emailaddress;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorCity')]//input")
	WebElement txtCR2City;

	@FindBy(xpath = "(//button[@name='StatesPicklist'])[3]")
	WebElement drpdwnCR2State;
	private WebElement lstCR2StateOption(String optionValue) {
		return driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorState_input')]//*[@data-value='"+optionValue+"']"));
	}

	//Credit rf3
	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorName')]//input")
	WebElement txtCR3VendorName;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorPhone')]//input")
	WebElement txtCR3Phone;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorEmail')]//input")
	WebElement txtCR3Emailaddress;

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorCity')]//input")
	WebElement txtCR3City;

	@FindBy(xpath = "(//button[@name='StatesPicklist'])[4]")
	WebElement drpdwnCR3State;

	private WebElement lstCR3StateOption(String optionValue) {
		return driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorState_input')]//*[@data-value='"+optionValue+"']"));
	}

	//Owner Information
	//Owner #1

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_firstName_input')]//input")
	WebElement txtOwner1FirstName;

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_lastName_input')]//input")
	WebElement txtOwner1LastName;

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_phone_input')]//input")
	WebElement txtOwner1Phone;

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_email_input')]//input")
	WebElement txtOwner1Emailaddress;

	//	owner-2
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

	//Signer Information
	@FindBy(xpath = "//*[contains(@class,'bi_signer_fName')]//input")
	WebElement txtSInfoFirstName;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_lName')]//input")
	WebElement txtSInfoLastName;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_Phone')]//input")
	WebElement txtSInfoPhone;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_email')]//input")
	WebElement txtSInfoEmailAddress;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_street')]//input")
	WebElement txtSInfoStreetAddress;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_city')]//input")
	WebElement txtSInfoCity;

	//State pending
	@FindBy(xpath = "(//button[@name='StatesPicklist'])[5]")
	WebElement drpdwnSInfoState;

	private WebElement lstSInfoStateOption(String optionValue) {
		return driver.findElement(By.xpath("//*[contains(@class,'bi_signer_state_input')]//*[@data-value='"+optionValue+"']"));
	}

	@FindBy(xpath = "//*[contains(@class,'bi_signer_zipCode')]//input")
	WebElement txtSInfoZipCode;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_signature')]//input")
	WebElement txtSInfoSignature;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_signature')]//input")
	WebElement txtSInfoSignatureAttribute;


	@FindBy(xpath = "//*[@title='Continue']")
	WebElement btnContinue;

	@FindBy(xpath = "//button[@title='Back']")
	WebElement btnBack;

	public String getPageHeader() {
		return waitForVisibilityOfElement(lblPageHeader).getText();
	}

	public void clickYes() {
		jsClick(rdoYes);
	}

	public void clickNo() {
		rdoNo.click();
	}

	public void enterSevenDigitWheelProsAccountNumber(String number) {
		txtSevenDigitWheelProsAccountNumber.sendKeys(number);
	}

	public String getAgreeTcErrorMessage() {
		return chkboxAgreeTcErrorMessage.getText();
	}

	public void clickTermsCondition() {
		jsClick(chkboxTermsCondition);
	}

	public boolean isSelectedTermsCondition() {
		return isSelected(chkboxTermsCondition);
	}

	private boolean isSelected(WebElement chkboxTermsCondition2) {
		// TODO Auto-generated method stub
		return false;
	}

	public void enterBankName(String BankName) {
		txtBankName.sendKeys(BankName);
	}

	public void enterBankAccountNumberr(String number) {
		txtBankAccountNumber.sendKeys(number);
	}

	public void enterCity(String City) {
		txtCity.sendKeys(City);
	}

	public void selectOptionFromStateDropDown(String option) {
		clickElement(drpdwnState);
		lstStateOption(option).click();
	}

	public void enterCR1VendorName(String CR1VendorName) {
		txtCR1VendorName.sendKeys(CR1VendorName);
	}

	public void enterCR1Phone(String number) {
		txtCR1Phone.sendKeys(number);
	}

	public void enterCR1Emailaddress(String CR1Emailaddress) {
		txtCR1Emailaddress.sendKeys(CR1Emailaddress);
	}

	public void enterCR1City(String CR1City) {
		txtCR1City.sendKeys(CR1City);
	}

	public void selectOptionFromCR1StateDropDown(String option) {
		clickElement(drpdwnCR1State);
		lstCR1StateOption(option).click();
	}

	//Credit Ref2
	public void enterCR2VendorName(String CR2VendorName) {
		txtCR2VendorName.sendKeys(CR2VendorName);
	}

	public void enterCR2Phone(String number) {
		txtCR2Phone.sendKeys(number);
	}

	public void enterCR2Emailaddress(String CR2Emailaddress) {
		txtCR2Emailaddress.sendKeys(CR2Emailaddress);
	}

	public void enterCR2City(String CR2City) {
		txtCR2City.sendKeys(CR2City);
	}

	public void selectOptionFromCR2StateDropDown(String option) {
		clickElement(drpdwnCR2State);
		lstCR2StateOption(option).click();
	}
	//Cred redf3
	public void enterCR3VendorName(String CR3VendorName) {
		txtCR3VendorName.sendKeys(CR3VendorName);
	}

	public void enterCR3Phone(String number) {
		txtCR3Phone.sendKeys(number);
	}

	public void enterCR3Emailaddress(String CR3Emailaddress) {
		txtCR3Emailaddress.sendKeys(CR3Emailaddress);
	}

	public void enterCR3City(String CR3City) {
		txtCR3City.sendKeys(CR3City);
	}

	public void selectOptionFromCR3StateDropDown(String option) {
		clickElement(drpdwnCR3State);
		lstCR3StateOption(option).click();
	}


	//Owner-1
	public void enterOwner1FirstName(String Owner1FirstName) {
		txtOwner1FirstName.sendKeys(Owner1FirstName);
	}

	public void enterOwner1LastName(String Owner1LastName) {
		txtOwner1LastName.sendKeys(Owner1LastName);
	}

	public void enterOwner1Phone(String number) {
		txtOwner1Phone.sendKeys(number);
	}

	public void enterOwner1Emailaddress(String Emailaddress) {
		txtOwner1Emailaddress.sendKeys(Emailaddress);
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

	//Signer Information
	public void enterSInfoFirstName(String SInfoFirstName) {
		txtSInfoFirstName.sendKeys(SInfoFirstName);
	}

	public void enterSInfoLastName(String SInfoLastName) {
		txtSInfoLastName.sendKeys(SInfoLastName);
	}

	public void enterSInfoPhone(String number) {
		txtSInfoPhone.sendKeys(number);
	}

	public void enterSInfoEmailAddress(String EmailAddress) {
		txtSInfoEmailAddress.sendKeys(EmailAddress);
	}

	public void enterSInfoStreetAddress(String StreetAddress) {
		txtSInfoStreetAddress.sendKeys(StreetAddress);
	}

	public void enterSInfoCity(String City) {
		txtSInfoCity.sendKeys(City);
	}

	public void selectOptionFromSIinfoStateDropDown(String option) {
		clickElement(drpdwnSInfoState);
		lstSInfoStateOption(option).click();
	}

	public void enterSInfoZipCode(String ZipCode) {
		txtSInfoZipCode.sendKeys(ZipCode);
	}

	public void enterSInfoSignature(String Signature) {
		txtSInfoSignature.sendKeys(Signature);
	}

	public String enterInfoSignatureAttributee(String Signature) {
		txtSInfoSignatureAttribute.sendKeys(Signature);
		return Signature;
	}

	public void clickContinue() {
		btnContinue.click();
	}

	public void clickBack() {
		btnBack.click();
	}

	public void clickSubmit() {
		btnSubmit.click();
	}

}
