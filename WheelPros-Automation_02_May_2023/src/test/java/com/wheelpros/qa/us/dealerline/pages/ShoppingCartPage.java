package com.wheelpros.qa.us.dealerline.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

  //===shopping cart and my cart icon lands on same page =========
	public class ShoppingCartPage extends BasePage{
		WebDriver driver;
		public ShoppingCartPage(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		
		@FindBy(xpath = "//button[text()='Checkout']")
		WebElement btnCheckout;
		
		@FindBy(xpath = "//button[text()='delete']")
		WebElement btnDelete;
		
		//==sort===
		
		@FindBy(xpath = "//span[text()='Name']")
		WebElement btnName;
		
		@FindBy(xpath = "//span[text()='SKU']")
		WebElement btnSku;
		
		@FindBy(xpath = "//span[text()='Date Added']")
		WebElement btnDateAdded;
		
		//======footer for Shopping cart page ==========
		
		@FindBy(xpath = "//button[text()='Continue Shopping']")
		WebElement btnContinueShopping;
		
		@FindBy(xpath = "//button[text()='Apply Discounts']")
		WebElement btnApplyDiscounts;
		
		@FindBy(xpath = "//button[text()='Update']")
		WebElement btnUpdate;
		
		@FindBy(xpath = "//button[text()='Email Cart']")
		WebElement btnEmailCart;
		
		
		@FindBy(xpath = "//button[text()='Request For Quote']")
		WebElement btnReqestForQuote;
		
		//==after clicking Email cart for.====
		
		
		@FindBy(xpath = "//input[@name='toEmailAddress']")
		WebElement txtEmailAddressEC;
		
		@FindBy(xpath = "//input[@name='ccEmailAddress']")
		WebElement txtCcEmailAddressEC;
		
		@FindBy(xpath = "//input[@name='subject']")
		WebElement txtSubjectEC;
		
		@FindBy(xpath = "//textarea[@name='description']")
		WebElement txtDescriptionEc;
		
		
		@FindBy(xpath = "//input[@value='Send']")
		WebElement btnSendEc;
		
		
		//==after clicking Request for quote form====
		
		@FindBy(xpath = "//input[@id='rfq_first_name']")
		WebElement txtFirstNamerfq;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		public void clickCheckout() {
			jsClick(btnCheckout);
			//btnCheckout.click();
		}
		
		public void clickDelete() {
			btnDelete.click();
		}
		
		public void clickName() {
			btnName.click();
		}
		
		public void clickSku() {
			btnSku.click();
		}
		
		public void clickDateAdded() {
			btnDateAdded.click();
		}
		
		
		//======footer for Shopping cart page ==========
		
		public void clickContinueShopping() {
			btnContinueShopping.click();
		}
		
		public void clickApplyDiscounts() {
			btnApplyDiscounts.click();
		}
		
		
		public void clickUpdate() {
			btnUpdate.click();
		}

		public void clickEmailCart() {
			btnEmailCart.click();
		}
		
		public void clickRequestForQuote() {
			btnReqestForQuote.click();
		}
		
		
		//==after clicking Email cart form====
		
		public void enterEmailAddressEC(String EmailAddress) {
			clearAndEnterText(txtEmailAddressEC,EmailAddress);
		}
		
		public void enterCcEmailAddressEC(String cceamiladdress) {
			clearAndEnterText(txtCcEmailAddressEC,cceamiladdress);
		}
		
		public void enterSubjectEC(String subject) {
			clearAndEnterText(txtSubjectEC,subject);
		}
		
		public void enterDescriptionEc(String description) {
			clearAndEnterText(txtDescriptionEc,description);
		}
		
		public void clickSendEc() {
			btnSendEc.click();
		}
		
		
		//==after clicking Request for quote form====
		public void enterFirstNamerfq(String name) {
			clearAndEnterText(txtFirstNamerfq,name);
		}
		
		
		
		
	

}
