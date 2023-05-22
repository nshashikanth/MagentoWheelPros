package com.wheelpros.qa.us.dealerline.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.qa.test.base.DealerLineBasetest;

public class ContactInformationPage extends DealerLineBasetest {
	WebDriver driver;

	public ContactInformationPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@value='Edit Profile']")
	WebElement btnEditProfile;
	
	@FindBy(xpath = "//input[@id='firstNameField']")
    WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='lastNameField']")
	WebElement txtLastName;
	
	@FindBy(xpath = "//input[@id='homePhoneField']")
	WebElement txthomePhone;
	
	//=====contact mailing address=====
	
	@FindBy(xpath = "//input[@id='street']")
	WebElement txtMailingStreet;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement txtMailingCity;
	
	@FindBy(xpath = "//input[@name='mailingAddress.state']")
	WebElement txtMailinState;
	
	//NEED TO ADD MAILING COUNTRY
	 
	@FindBy(xpath = "//input[@id='postalCode']")
	WebElement txtMailingZip;
	
	
	//===============Contact other address =============
	
	
	
	
	
	
	public void buttonEditProfile() {
		btnEditProfile.click();
	}
	
	public void enterFirstName(String firstname) {
		txtFirstName.clear();
		txtFirstName.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname) {
		txtLastName.clear();
		txtLastName.sendKeys(lastname);
	}
	
	public void enterHomephone(String phonenumber) {
		txthomePhone.clear();
		txthomePhone.sendKeys(phonenumber);
	}
	
	//=====contact mailing address=====
	
	public void enterMailingStreet(String mailingstreet) {
		txtMailingStreet.clear();
		txtMailingStreet.sendKeys(mailingstreet);
	}
	
	public void enterMailingCity(String mailingcity) {
		txtMailingCity.clear();
		txtMailingCity.sendKeys(mailingcity);
	}
		
		
		public void enterMailingState(String mailingstate) {
			txtMailingStreet.clear();
			txtMailingStreet.sendKeys(mailingstate);
	}
		
		public void enterMailingPostalCode(String mailingpostalcode) {
			txtMailingZip.clear();
			txtMailingZip.sendKeys(mailingpostalcode);
	}
	
}
