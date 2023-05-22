package com.wheelpros.qa.us.dealerline.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

public class CommonHeaderPage extends BasePage {
	WebDriver driver;

	public CommonHeaderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//====contiune pop up=================
	
	
	@FindBy(xpath = "//button[text()='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "(//a[text()='Wheels'])[1]")
	WebElement drpdwnWheels;
	
	@FindBy(xpath = "(//*[text()='Tires'])[1]")
	WebElement drpdwnTires;
	
	@FindBy(xpath = "(//*[text()='Accessories'])[1]")
	WebElement drpdwnAccessories;
	
	
	@FindBy(xpath = "(//*[text()='Find Wheels and Tires'])[1]")
	WebElement lnkFindWheelsandTires;
	
	//================ My Account links =================================
	@FindBy(xpath = "(//*[text()='My Account'])[1]")
	WebElement drpdwnMyAccount;
	
	@FindBy(xpath = "//a[text()='Contact Information']")
	WebElement lnkContactInformation;
	
	@FindBy(xpath = "//a[text()='Change Password']")
	WebElement lnkChangePassword;
	
	@FindBy(xpath = "//a[text()='Manage Address Book']")
	WebElement lnkManageAddressBook;
	
	
	@FindBy(xpath = "//a[text()='My Orders']")
	WebElement lnkMyOrders;
	
	@FindBy(xpath = "//a[text()='My Wallet']")
	WebElement lnkMyWallet;
	
	@FindBy(xpath = "//a[text()='My Invoices']")
	WebElement lnkMyInvoices;
	
	
	@FindBy(xpath = "//a[text()='Customer Code']")
	WebElement lnkCustomerCode;
	
	
	@FindBy(xpath = "//a[text()='MAKE PAYMENTS']")
	WebElement lnkMakePayments;

	//=================================my account links completed ===================
	
	@FindBy(xpath = "//input[@id='searchText']")
	WebElement txtSearchProducts;
	
	//============= customer code selection======================
	@FindBy(xpath = "//select[@id='CustomerCodeSelect']")
	WebElement drpdwnCustomerCode;
	
	@FindBy(xpath = "//option[@value='MSRP']")
	WebElement selectMSRP;
	
	@FindBy(xpath = "//option[@value='Dealer Price']")
	WebElement selectDealerprice;
	
	@FindBy(xpath = "//option[@value='Blank']")
	WebElement selectBlank;
	//===================customer code selection end====================
	
	@FindBy(xpath = "//li[@class='effAccount cc_eff_account']/a")
	WebElement clickEffectiveAccountSelection;
	
	@FindBy(xpath = "//span[text()='×']")
	WebElement clickCloseEffectiveAccountSelection;
	
	
	@FindBy(xpath = "//li[@class='cc_my_account']")
	WebElement clickMyaccount;
	
	
	@FindBy(xpath = "//*[@id='cartHeader']")
	WebElement clickCartHeader;
	
	@FindBy(xpath = "//*[@id='cartHeader']/span")
	WebElement chkCartHeaderPrice;

	
	@FindBy(xpath = "//div[@id='cc_store_logo_img']")
	WebElement lnkWheelProsHome;
	
	@FindBy(xpath = "//a[@class='doLogout cc_do_logout']")
	WebElement clickLogout;
	
	
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	//=====effective account====
	
	public void dropdownWheels() {
		drpdwnWheels.click();
	}
	
	public void dropdownTires() {
		drpdwnTires.click();
	}
	
	public void dropdownAccessories() {
		drpdwnAccessories.click();
	}
	
	
	public void linkFindWheelsandTires() {
		lnkFindWheelsandTires.click();
	}
	
	//================ My Account links =================================
	public void dropdownMyAccount() {
		drpdwnMyAccount.click();
	}
	
	public void clickContactInformation() {
		lnkContactInformation.click();
	}
	
	public void clickChangePassword() {
		lnkChangePassword.click();
	}
	
	public void clickManageAddressBook() {
		lnkManageAddressBook.click();
	}
	
	
	public void clickMyOrders() {
		lnkMyOrders.click();
	}
	
	public void clickMyWallet() {
		lnkMyWallet.click();
	}
	
	public void clickMyInvoices() {
		lnkMyInvoices.click();
	}
	
	public void clickCustomerCode() {
		lnkCustomerCode.click();
	}
	
	public void clickMakePayments() {
		lnkMakePayments.click();
	}
	
	//=====================end my accounts=====
	
	
	
	public void serchboxSearchProducts(String serachproduct) {
		txtSearchProducts.sendKeys(serachproduct);
		txtSearchProducts.sendKeys(Keys.ENTER);
	}
	
	//=====customer code selection =========
	
	public void dropdownCustomerCode() {
		drpdwnCustomerCode.click();
	}
	
	public void selectMSRP() {
		selectMSRP.click();
	}
	
	public void selectDealerPrice() {
		selectDealerprice.click();
	}
	
	public void selectBlank() {
		selectBlank.click();
	}
	
	//===============================
	
	public void clickEffectiveAccountSelection() {
		clickEffectiveAccountSelection.click();
	}
	
	public void clickCloseEffectiveAccountSelection() {
		clickCloseEffectiveAccountSelection.click();
	}
	
	public void clickMyaccount() {
		clickMyaccount.click();
	}
	
	
	public void clickCartHeader() {
		clickElement(clickCartHeader);
		//clickCartHeader.click();
	}
	
	public void chkCartHeaderPrice() {
		
		String myCartText = chkCartHeaderPrice.getText();
		String priceText = myCartText.substring(myCartText.lastIndexOf("$") + 1).trim();
		System.out.println(priceText);
	}
	
	public void clickLogout() {
		clickLogout.click();
	}
	
	
	public void clickWheelProsHome() {
		lnkWheelProsHome.click();
	}
	

}

		

