package com.wheelpros.qa.ca.pages;

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
	
	@FindBy(xpath = "(//span[text()='Personal Guarantee'])[5]")
	WebElement lblPersonalGuaranteePageHeader;
	
	@FindBy(xpath = "(//span[text()='Finish'])[5]")
	WebElement lblFinishPageHeader;
	
	@FindBy(xpath = "//input[@value='Yes']")
	WebElement rdoYes;

	@FindBy(xpath = "//input[@value='No']")
	WebElement rdoNo;

	@FindBy(xpath = "//button[@title='Submit']")
	WebElement btnSubmit;

	@FindBy(xpath = "//*[contains(@class,'wp_AccNumber_input')]//input")
	WebElement txtSevenDigitWheelProsAccountNumber;

	@FindBy(xpath = "//span[text()='I HAVE READ AND AGREE TO American Racing Equipment CREDIT TERMS AND CONDITIONS.']")
	WebElement chkboxTermsCondition;

	@FindBy(xpath = "//*[contains(@class, 'agree_tc')]/div[2]")
	WebElement lblchkboxAgreeTcErrorMessage;

	//bank info

	@FindBy(xpath = "//*[contains(@class,'bi_bank_name_input')]//input")
	WebElement txtBankName;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_bank_name_input')]/div[2]")
	WebElement lblBankNameErrorMessage;
	
	@FindBy(xpath = "//*[contains(@class,'bi_bank_accNumber_input')]//input")
	WebElement txtBankAccountNumber;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_bank_accNumber_input')]/div[2]")
	WebElement lblBankAccountNumberErrorMessage;
	
	@FindBy(xpath = "//*[contains(@class,'bi_bank_city_input')]//input")
	WebElement txtCity;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_bank_city_input')]/div[2]")
	WebElement lblCityErrorMessage;

	@FindBy(xpath = "(//button[@name='StatesPicklist'])[1]")
	WebElement drpdwnProvince;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_bank_state_input')]/div[2]")
	WebElement lblProvinceErrorMessage;

	private WebElement lstBnkProvinceOption(String optionValue) {
		return driver.findElement(By.xpath("//*[contains(@class,'bi_bank_state_input')]//*[@data-value='AB']"));
	}

	//Credit ref1 

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc1_vendorName')]//input")
	WebElement txtCR1VendorName;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_crdtRfrnc1_vendorName_input')]/div[2]")
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

	@FindBy(xpath = "(//button[@name='StatesPicklist'])[2]")
	WebElement drpdwnCR1Province;
	
	private WebElement lstCR1ProvinceOption(String optionValue) {
		return driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorState_input')]//*[@data-value='"+optionValue+"']"));
	}
	
	@FindBy(xpath = "//*[contains(@class, 'bi_crdtRfrnc1_vendorState_input')]/div[2]")
	WebElement lblCR1CR1ProvinceErrorMessage;

	//Credit ref2

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc2_vendorName')]//input")
	WebElement txtCR2VendorName;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_crdtRfrnc2_vendorName_input')]/div[2]")
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

	@FindBy(xpath = "(//button[@name='StatesPicklist'])[3]")
	WebElement drpdwnCR2Province;
	private WebElement lstCR2ProvinceOption(String optionValue) {
		return driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorState_input')]//*[@data-value='"+optionValue+"']"));
	}
	
	@FindBy(xpath = "//*[contains(@class, 'bi_crdtRfrnc2_vendorState_input')]/div[2]")
	WebElement lblCR1CR2ProvinceErrorMessage;

	//Credit ref 3

	@FindBy(xpath = "//*[contains(@class,'bi_crdtRfrnc3_vendorName')]//input")
	WebElement txtCR3VendorName;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_crdtRfrnc3_vendorName_input')]/div[2]")
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

	@FindBy(xpath = "(//button[@name='StatesPicklist'])[4]")
	WebElement drpdwnCR3Province;

	private WebElement lstCR3ProvinceOption(String optionValue) {
		return driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorState_input')]//*[@data-value='"+optionValue+"']"));
	}
	
	@FindBy(xpath = "//*[contains(@class, 'bi_crdtRfrnc3_vendorState_input')]/div[2]")
	WebElement lblCR1CR3ProvinceErrorMessage;

	//Owner Information
	//Owner #1

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_firstName_input')]//input")
	WebElement txtOwner1FirstName;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_owner1_firstName_input')]/div[2]")
	WebElement lblOwner1FirstNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_lastName_input')]//input")
	WebElement txtOwner1LastName;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_owner1_lastName_input')]/div[2]")
	WebElement lblOwner1LastNameErrorMessage;
	
	@FindBy(xpath = "//*[contains(@class,'bi_owner1_phone_input')]//input")
	WebElement txtOwner1Phone;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_owner1_phone_input')]/div[2]")
	WebElement lblOwner1PhoneErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_owner1_email_input')]//input")
	WebElement txtOwner1Emailaddress;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_owner1_email_input')]/div[2]")
	WebElement lblOwner1EmailaddressErrorMessage;


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
	
	@FindBy(xpath = "//*[contains(@class, 'projected_monthly_purchase_input')]/div[2]")
	WebElement lblProjectedMonthlyPurchaseTotalErrorMessage;

	//Signer Information

	@FindBy(xpath = "//*[contains(@class,'bi_signer_fName')]//input")
	WebElement txtSInfoFirstName;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_signer_fName_input')]/div[2]")
	WebElement lblSInfoFirstNameErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_lName')]//input")
	WebElement txtSInfoLastName;

	@FindBy(xpath = "//*[contains(@class, 'bi_signer_lName_input')]/div[2]")
	WebElement lblSInfoLastNameErrorMessage; 
	
	@FindBy(xpath = "//*[contains(@class,'bi_signer_Phone')]//input")
	WebElement txtSInfoPhone;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_signer_Phone_input')]/div[2]")
	WebElement lblSInfoPhoneErrorMessage; 

	@FindBy(xpath = "//*[contains(@class,'bi_signer_email')]//input")
	WebElement txtSInfoEmailAddress;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_signer_email_input')]/div[2]")
	WebElement lblSInfoEmailAddressErrorMessage; 
	
	@FindBy(xpath = "//*[contains(@class,'bi_signer_street')]//input")
	WebElement txtSInfoStreetAddress;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_signer_street_input')]/div[2]")
	WebElement lblSInfoStreetAddressErrorMessage; 

	@FindBy(xpath = "//*[contains(@class,'bi_signer_city')]//input")
	WebElement txtSInfoCity;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_signer_city_input')]/div[2]")
	WebElement lblSInfoCityErrorMessage;

	//State pending

	@FindBy(xpath = "(//button[@name='StatesPicklist'])[5]")
	WebElement drpdwnSInfoProvince;

	private WebElement lstSInfoProvinceOption(String optionValue) {
		return driver.findElement(By.xpath("//*[contains(@class,'bi_signer_state_input')]//*[@data-value='"+optionValue+"']"));
	}
	
	@FindBy(xpath = "//*[contains(@class, 'bi_signer_state_input')]/div[2]")
	WebElement lblSInfoProvinceErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_zipCode')]//input")
	WebElement txtSInfoPostalCode;
	
	@FindBy(xpath = "//*[contains(@class, 'bi_signer_zipCode_input')]/div[2]")
	WebElement lblSInfoPostalCodeErrorMessage;

	@FindBy(xpath = "//*[contains(@class,'bi_signer_signature')]//input")
	WebElement txtSInfoSignature;

	@FindBy(xpath = "//*[contains(@class, 'bi_signer_zipCode_input')]/div[2]")
	WebElement lblSInfoSignatureErrorMessage;
	
	@FindBy(xpath = "//*[contains(@class,'bi_signer_signature')]//input")
	WebElement txtSInfoSignatureAttribute;

	@FindBy(xpath = "//*[@title='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//button[@title='Back']")
	WebElement btnBack;



	public String getPageHeader() {
		return waitForVisibilityOfElement(lblPageHeader).getText();
	}
	
	public String getPersonalGuaranteePageHeader() {
		return lblPersonalGuaranteePageHeader.getText();
	}
	
	public String getFinishPageHeader() {
		return lblFinishPageHeader.getText();
	}

	public void clickYes() {
		jsClick(rdoYes);
	}
	
	public boolean isSelectedYes() {
		return rdoYes.isSelected(); 
	}
	

	public void clickNo() {
		rdoNo.click();
	}
	
	public boolean isSelectedNo() {
		return rdoNo.isSelected(); 
	}

	public void enterSevenDigitWheelProsAccountNumber(String number) {
		txtSevenDigitWheelProsAccountNumber.sendKeys(number);
	}

	public void clickSubmit() {
		btnSubmit.click();
	}

	public void clickTermsCondition() {
		jsClick(chkboxTermsCondition);
	}

	public boolean isSelectedTermsCondition() {
		return isSelected(chkboxTermsCondition);
	}

	public String getAgreeTcErrorMessage() {
		return lblchkboxAgreeTcErrorMessage.getText();
	}

	private boolean isSelected(WebElement chkboxTermsCondition2) {
		// TODO Auto-generated method stub
		return false;
	}

	//bank info

	public void enterBankName(String BankName) {
		txtBankName.sendKeys(BankName);
	}
	
	public String getBankNameErrorMessage() {
		return lblBankNameErrorMessage.getText();
	}
	

	public void enterBankAccountNumberr(String number) {
		txtBankAccountNumber.sendKeys(number);
	}
	
	
	public String getBankAccountNumberErrorMessage() {
		return lblBankAccountNumberErrorMessage.getText();
	}
	

	public void enterCity(String City) {
		txtCity.sendKeys(City);
	}
	
	public String getCityrErrorMessage() {
		return lblCityErrorMessage.getText();
	}
	
	public void clickProvince(String option) {
		drpdwnProvince.click();
		lstBnkProvinceOption(option).click();
	}
	
	public String getProvinceErrorMessage() {
		return lblProvinceErrorMessage.getText();
	}
	
	//cedit ref1
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
	
	public String getCR1CityErrorMessage() {
		return lblCR1CityErrorMessage.getText();
	}

	public void selectOptionFromCR1ProvinceDropDown(String option) {
		clickElement(drpdwnCR1Province);
		lstCR1ProvinceOption(option).click();
	}
	
	public String getCR1ProvinceErrorMessage() {
		return lblCR1CR1ProvinceErrorMessage.getText();
	}


	//Credit Ref2

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
	
	public String getCR2CityErrorMessage() {
		return lblCR2CityErrorMessage.getText();
	}

	public void selectOptionFromCR2ProvinceDropDown(String option) {
		clickElement(drpdwnCR2Province);
		lstCR2ProvinceOption(option).click();
	}
	
	public String getCR2ProvinceErrorMessage() {
		return lblCR1CR2ProvinceErrorMessage.getText();
	}

	//Cred redf3

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
	
	public String getCR3CityErrorMessage() {
		return lblCR3CityErrorMessage.getText();
	}

	public void selectOptionFromCR3ProvincDropDown(String option) {
		clickElement(drpdwnCR3Province);
		lstCR3ProvinceOption(option).click();
	}
	
	public String getCR3ProvinceErrorMessage() {
		return lblCR1CR3ProvinceErrorMessage.getText();
	}

	//Owner-1

	public void enterOwner1FirstName(String Owner1FirstName) {
		txtOwner1FirstName.sendKeys(Owner1FirstName);
	}
	
	public String getCOwner1FirstNameErrorMessage() {
		return lblOwner1FirstNameErrorMessage.getText();
	}

	public void enterOwner1LastName(String Owner1LastName) {
		txtOwner1LastName.sendKeys(Owner1LastName);
	}
	
	public String getCOwner1LastNameErrorMessage() {
		return lblOwner1LastNameErrorMessage.getText();
	}

	public void enterOwner1Phone(String number) {
		txtOwner1Phone.sendKeys(number);
	}

	public String getCOwner1PhoneErrorMessage() {
		return lblOwner1PhoneErrorMessage.getText();
	}

	public void enterOwner1Emailaddress(String Emailaddress) {
		txtOwner1Emailaddress.sendKeys(Emailaddress);
	}
	
	public String getCOwner1EmailaddressErrorMessage() {
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

	public void selectOptionFromSIinfoProvinceDropDown(String option) {
		clickElement(drpdwnSInfoProvince);
		lstSInfoProvinceOption(option).click();
	}
	
	public String getSInfoProvinceErrorMessage() {
		return lblSInfoProvinceErrorMessage.getText();
	}

	public void enterSInfoPostalCode(String PostalCode) {
		clearAndEnterText(txtSInfoPostalCode, PostalCode);
	}

	public String getSInfoPostalCodeErrorMessage() {
		return lblSInfoPostalCodeErrorMessage.getText();
	}

	public void enterSInfoSignature(String Signature) {
		txtSInfoSignature.sendKeys(Signature);
	}

	public String getSInfoSignatureErrorMessage() {
		return lblSInfoSignatureErrorMessage.getText();
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

}
