package com.wheelpros.qa.us.dealerline.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

public class FinalCheckOutPage extends BasePage {
	WebDriver driver;
	public FinalCheckOutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	//==================== payment information ===================

	//==payment type===
	@FindBy(xpath = "//input[@id='poCheckbox']")
	WebElement rdoPurchaseOrder;

	@FindBy(xpath = "//input[@id='accountNumberTemp']")
	WebElement txtPurchaseOrder;

	@FindBy(xpath = "//input[@id='displayNameTemp']")
	WebElement txtName;

	//===Stored payments====

	@FindBy(xpath = "(//input[@id='storedPaymentSelectiona1i7h00000245s7AAA'])[2]")
	WebElement rdoStoredPayment1;

	@FindBy(xpath = "(//input[@id='storedPaymentSelectiona1i7h00000246bqAAA'])[2]")
	WebElement rdoStoredPayment2;

	@FindBy(xpath = "(//input[@id='storedPaymentSelectiona1i7h00000246bvAAA'])[2]")
	WebElement rdoStoredPayment3;

	@FindBy(xpath = "(//input[@id='storedPaymentSelectiona1i7h00000248ecAAA'])[2]")
	WebElement rdoStoredPayment4;

	//==credit card & add new card =======

	//************************add new card**************************************************	
	@FindBy(xpath = "//input[@id='creditCardCheckbox']")
	WebElement rdoCreditCardCheckBox;

	@FindBy(xpath = "//a[@onclick='handleNewPaymentTypeClick()']")
	WebElement linkAddNewCard;

	//*********************************************************************************************

	//Paynow button

	@FindBy(xpath = "//button[@id='storePaymentBtnTemp']")
	WebElement btnPayNow;

	//=====add one time shipping address============

	
	@FindBy(xpath = "//input[@id='sameAsBillingCheckbox']")
	WebElement rdoSameAsBillingCheckbox;
	
	@FindBy(xpath = "//button[text()='ADD ONE-TIME SHIPPING ADDRESS']")
	WebElement btnOneTimeShippingAddress;

	@FindBy(xpath = "//form[@id='shippingAddressForm']")
	WebElement formOneTimeShippingAddress;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement btnCancelOneTimeShippingAddress;
	
	@FindBy(xpath = "//button[@onclick='saveOneTimeShipping()']")
	WebElement btnSaveOneTimeShippingAddress;
	

	//**filing form **

	@FindBy(xpath = "//input[@name='shippingAddress.firstName']")
	WebElement txtShippingAddressFirstName;

	@FindBy(xpath = "//input[@name='shippingAddress.lastName']")
	WebElement txtShippingAddressLastName;

	@FindBy(xpath = "//input[@name='shippingAddress.companyName']")
	WebElement txtShippingAddressCompanyName;

	@FindBy(xpath = "//input[@id='address1']")
	WebElement txtShippingAddressAddress;

	@FindBy(xpath = "//input[@id='city']")
	WebElement txtShippingAddressCity;
	
	@FindBy(xpath = "//input[@name='shippingAddress.postalCode']")
	WebElement txtShippingAddressPostalCode;
	
	@FindBy(xpath = "//input[@name='shippingAddress.phone']")
	WebElement txtShippingAddressPhone;
	
	@FindBy(xpath = "//input[@name='shippingAddress.phoneExt']")
	WebElement txtShippingAddressPhoneExt;
	
	@FindBy(xpath = "//input[@name='shippingAddress.email']")
	WebElement txtShippingAddressEmail;
	
	

	//******shipping note *************

	@FindBy(xpath = "//textarea[@class='shipnotes form-control cc_shipnotes form-control']")
	WebElement txtShippingNotes;

	@FindBy(xpath = "//button[@onclick='saveShippingNotes()']")
	WebElement btnSaveShippingNotes;





	//==payment type===
	public void checkboxPurchaseOrder() {
		rdoPurchaseOrder.click();
	}

	public void enterPurchaseOrder(String purchaseorder) {
		txtPurchaseOrder.sendKeys(purchaseorder);
	}

	public void enterName(String name) {
		txtName.sendKeys(name);
	}

	//====stored payment ====

	public void checkboxStoredPayment1() {
		clickElement(rdoStoredPayment1);
		//rdoStoredPayment1.click();
	}

	public void checkboxStoredPayment2() {
		rdoStoredPayment2.click();
	}

	public void checkboxStoredPayment3() {
		rdoStoredPayment3.click();
	}

	public void checkboxStoredPayment4() {
		rdoStoredPayment4.click();
	}

	//==credit card & add new card =======

	//****************************************************************

	//***********add new card pending************

	public void chekboxCreditcard() {
		rdoCreditCardCheckBox.click();
	}

	public void clickAddNewCard() {
		waitForVisibilityOfElement(linkAddNewCard);
		//linkAddNewCard.click();
	}


	//*****************************************************************************


	//Paynow button

	public void clickPayNow() {
		btnPayNow.click();
	}

	//=====add one time shipping address============

	
	public void clickSameAsBillingAddress() {
		jsClick(rdoSameAsBillingCheckbox);
	}

	
	
	
	public void clickAddOneTimeShippingAddress() {
		while(formOneTimeShippingAddress.getAttribute("disabled")!=null) {
			staticThreadWait(1);
			jsClick(btnOneTimeShippingAddress);
		}
		//jsClick(btnOneTimeShippingAddress);
	}

	public void clickCancelOneTimeShippingAddress() {
		btnCancelOneTimeShippingAddress.click();
	}
	
	public void clickSaveOneTimeShippingAddress() {
		jsClick(btnSaveOneTimeShippingAddress);
	}
	//**filling form**
	public void enterShippingAddressFirstName(String shippingaddressfirstname){
		//clickElement(txtShippingAddressFirstName);
		//waitForVisibilityOfElement(txtShippingAddressFirstName);
		//txtShippingAddressAddress.sendKeys(shippingaddressfirstname);
		clearAndEnterText(txtShippingAddressFirstName, shippingaddressfirstname);
	}

	public void enterShippingAddressLastName(String shippingaddresslastname){
		clearAndEnterText(txtShippingAddressLastName, shippingaddresslastname);
	}

	public void enterShippingAddressCompanyName(String companyname) {
		clearAndEnterText(txtShippingAddressCompanyName, companyname);
	}

	public void enterAddress(String address) {
		clearAndEnterText(txtShippingAddressAddress, address);
	}
	
	public void enterCity(String City) {
		clearAndEnterText(txtShippingAddressCity, City);
	}

	public void enterPostalCode(String postalcode) {
		clearAndEnterText(txtShippingAddressPostalCode, postalcode);
	}
	
	public void enterPhone(String phone) {
		clearAndEnterText(txtShippingAddressPhone, phone);
	}
	
	public void enterPhoneExt(String phoneext) {
		clearAndEnterText(txtShippingAddressPhoneExt, phoneext);
	}
	
	public void enterEmail(String email) {
		clearAndEnterText(txtShippingAddressEmail, email);
	}





	//******shipping notes ****
	public void enterShippingNotes(String shippingnotes)
	{
		txtShippingNotes.sendKeys(shippingnotes);
	}

	public void clickSaveShippingNotes() {
		jsClick(btnSaveShippingNotes);
	}







}
