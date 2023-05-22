package com.wheelpros.qa.us.magento.dealerline.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

public class LoginPage extends BasePage{

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@class='logo']")
	WebElement lnkCompanylogo;
	
	@FindBy(xpath = "//h4[text()='Log In']")
	WebElement lblHeading;

	@FindBy(name = "login[username]")
	WebElement txtusername;
	
	@FindBy (xpath = "//div[@id='email-error']")
	WebElement lblUserNameErrorMessage;
	
	@FindBy(name = "login[password]")
	WebElement txtpassword;
	
	@FindBy (xpath = "//div[@id='pass-error']")
	WebElement lblPasswordErrorMessage;
	
	@FindBy(xpath = "//button[@type='submit']//span[text()='Log In']")
	WebElement rdoSubmit;
	
	@FindBy(xpath = "//*[@id='maincontent']/div[1]/div[2]/div/div/div")
	WebElement lblSiginInIncorrectErrorMessage;
	
	
	//forgot password
	@FindBy(xpath = "//*[text()='Forgot Password?']")
	WebElement lnkForgotPassword;
	
	@FindBy(xpath = "//h4[text()='Reset Password']")
	WebElement lblResetPassword;
	
	@FindBy(xpath = "//strong[text()='Go back to Login']")
	WebElement lnkBackToLoginRestPassword;
	
	@FindBy(xpath = "//div[@class='secondary']/button")
	WebElement btnSubmitResetPassword;
	
	@FindBy(xpath = "//div[@id='email_address-error']")
	WebElement lblEmailErrorMessageResetPasswordPage;
	
	@FindBy(xpath = "//div[@class='messages']/div/div")
	WebElement lblRestPasswordSuccessMessage;
	
	@FindBy(xpath = "//fieldset[@class='fieldset login']/div[4]/div[1]/a")
	WebElement lnkForgotPasswordLoginPage;
	
	@FindBy(xpath = "//input[@id='email_address']")
	WebElement txtEmailAddressForgotPassword;
	
	@FindBy(xpath = "//*[@id='maincontent']/div[1]/div[2]/div/div/div")
	WebElement lblEmailForResetPasswordMessgae;
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//*[text()='Request Access']")
	WebElement formRequestAccesstoDealerLine;
	
	@FindBy(xpath = "//main[@id='maincontent']//*[text()='Existing Customer - Request Access to Dealerline']")
	WebElement lblRequestAccesstoDealerLine;
	
	@FindBy(xpath = "//a[@href='https://dealerline.force.com/CreditApp/s/?language=en_US']/span")
	WebElement clickCreateAccount;
	
	//Request access form 
	@FindBy(xpath = "//input[@id='firstname']")
	WebElement txtFirstNameRequestAccessDealerLine;
	
	@FindBy(xpath = "//div[@id='firstname-error']")
	WebElement lblFirstNameRequestErrorMessageAccessDealerLine;
	
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement txtLastNameRequestAccessDealerLine;
	
	@FindBy(xpath = "//div[@id='lastname-error']")
	WebElement lblLastNameRequestErrorMessageAccessDealerLine;
	
	@FindBy(xpath = "//input[@id='request-email']")
	WebElement txtEmailRequestAccessDealerLine;
	
	@FindBy(xpath = "//div[@id='request-email-error']")
	WebElement lblEmailErrorMessageAccessDEalerLine;
	
	@FindBy(xpath = "//input[@id='businessname']")
	WebElement txtBusinessNameRequestAccessDealerLine;
	
	@FindBy(xpath = "//div[@id='businessname-error']")
	WebElement lblBusinessNameErrorMessageAccessDEalerLine;
	
	@FindBy(xpath = "//input[@id='accountnumber']")
	WebElement txtWheelProsAccountNumberRequestAccessDealerLine;
	
	@FindBy(xpath = "//div[@id='accountnumber-error']")
	WebElement lblWheelProsAccountNumberErrorMessageRequestAccessDealerLine;
	
	@FindBy(xpath = "//button[@id='send3']/span")
	WebElement btnSubmitRequestAccessDealerLine;
	
	
	@FindBy(xpath = "//*[@id='maincontent']/div[1]/div[2]/div/div/div")
	WebElement lblFormSubmittedSuccessfullyRequestAccess;
	
	
	@FindBy(xpath = "//strong[text()='Go back to Login']")
	WebElement lnkBackToLogin;
	
	@FindBy(xpath = "//*[@id='html-body']//div/aside[1]/div[2]/header/button")
	WebElement btnCloseRequestAccess;
	
	//Become a Dealer
	
	@FindBy(xpath = "//*[@id='maincontent']/div[3]/div/div[2]/div[7]/div[2]/div/div/a")
	WebElement lnkBecomeDealerCA;
	
	@FindBy(xpath = "//div[contains(@class, 'slds-text-heading')]/span[1]")
	WebElement lblDealerLine;
	
	
	
	
	
	
	public boolean isEnabledCompanyLogo() {
	 return	lnkCompanylogo.isEnabled();
	}
	
	
	public String getlblHeading() {
		return lblHeading.getText();
	}
	
	public void enterUsername(String username) {
		txtusername.sendKeys(username);
	}
	
	public String getUserNameErrorMessage() {
		return lblUserNameErrorMessage.getText();
	}
	
	public void enterPassword(String password) {
		txtpassword.sendKeys(password);
	}
	
	public String getPasswordErrorMessage() {
		return lblPasswordErrorMessage.getText();
	}
	
	public void clickSubmit() {
		rdoSubmit.click();
	}
	public String getSiginInErorrMessage() {
		return lblSiginInIncorrectErrorMessage.getText();
	}
	
	
	//forgot passwrod and reset
	
	public void clickForgotPassword() {
		lnkForgotPassword.click();
	}
	
	public String getForgotPasswordLoginPage() {
		return lnkForgotPassword.getText();
	}
	
	public String getresetPassword() {
		return lblResetPassword.getText();
	}
	
	public void clickBackToLoginResetPasswordPage() {
		lnkBackToLoginRestPassword.click();
	}
	
	public void clickSubmitResetPasswordPage() {
		btnSubmitResetPassword.click();
	}
	
	public String getEmailErrorMessageResetPasswrodPage() {
		return lblEmailErrorMessageResetPasswordPage.getText();
	} 
	
	 public String getinvalidEmailErrorMessageResetPasswordPage() {
		 return lblEmailErrorMessageResetPasswordPage.getText();
	 }
	 
	 public String getRestpasswordSucessMessage() {
		 return lblRestPasswordSuccessMessage.getText();
	 }
	
	 public boolean isClickableForgotPassword() {
		 return lnkForgotPasswordLoginPage.isEnabled(); 
	 }
	
	public void enterEmailaddressForgotPassword(String email) {
		waitForVisibilityOfElement(txtEmailAddressForgotPassword).sendKeys(email);
		//txtEmailAddressForgotPassword.sendKeys(email);
	}
	
	
	public String getEmailforResetPassword() {
		return lblEmailForResetPasswordMessgae.getText();
	}
	 
	 
	 
	 
	 
	
	public void clickRequestAccesstoDealerLine() {
		formRequestAccesstoDealerLine.click();
	}
	
	public boolean isDisplayedRequestAccesstoDealerLine() {
		return formRequestAccesstoDealerLine.isDisplayed();
	}
	
	public String getRequestAccessToDealerLine() {
		return lblRequestAccesstoDealerLine.getText();
	}
	
	public void clickCreateAccount() {
		clickCreateAccount.click();
	}
	
	//Request access form 
	
	public void enterFirstNameRequestAccess(String firstname) {
		txtFirstNameRequestAccessDealerLine.sendKeys(firstname);
	}
	
   public String getFirstNameErrorMessageRequestAccess() {
	   return lblFirstNameRequestErrorMessageAccessDealerLine.getText();
   }
   
	public void enterLastNameRequestAcess(String lastname) {
		txtLastNameRequestAccessDealerLine.sendKeys(lastname);
	}
	
	public String getLastNameErrorMessageRequestAccess() {
		   return lblLastNameRequestErrorMessageAccessDealerLine.getText();
	   }
	
	public void enterEmailRequestAccess(String email) {
		txtEmailRequestAccessDealerLine.sendKeys(email);
	}
	
	public String getEmailErrorMessageRequestAccess() {
		   return lblEmailErrorMessageAccessDEalerLine.getText();
	   }
	
	public void enterBusinessNameRequestAccess(String businessname) {
		txtBusinessNameRequestAccessDealerLine.sendKeys(businessname);
	}
	
	public String getBusinessNameErrorMessageRequestAccess() {
		   return lblBusinessNameErrorMessageAccessDEalerLine.getText();
	   }
	
	public void enterWheelProsAccountNumberRequestAccess(String number) {
		txtWheelProsAccountNumberRequestAccessDealerLine.sendKeys(number);
	}
	
	public String getWheelprosAccountNumberErrorMessageRequestAccess() {
		   return lblWheelProsAccountNumberErrorMessageRequestAccessDealerLine.getText();
	   }
	
	public String getWheelProsAccountNumberRequestAccess() {
		return txtWheelProsAccountNumberRequestAccessDealerLine.getText();
	}
	
	public void clickSubmitRequestAccess() {
		btnSubmitRequestAccessDealerLine.click();
	}
	
	public String getFormSubmittedSuccessfullyRequestAccess() {
		return lblFormSubmittedSuccessfullyRequestAccess.getText();
	}
	
	public void clickBackToLogin() {
		lnkBackToLogin.click();
	}
	
	public void clickCloseRequestAccess() {
		btnCloseRequestAccess.click();
	}
	
	//===Become a dealer===
	
	public void clickBecomeDealerCA() {
		lnkBecomeDealerCA.click();
	}
	
	public String getDealerLine() {
		return lblDealerLine.getText();
	}
	
	public boolean isDisplayedCreatAccount() {
		return lnkBecomeDealerCA.isDisplayed();
	}

	


	
}
