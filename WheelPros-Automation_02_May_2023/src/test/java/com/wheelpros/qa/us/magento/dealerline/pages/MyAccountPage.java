package com.wheelpros.qa.us.magento.dealerline.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

public class MyAccountPage extends BasePage{

	WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath  = "//button[@class='action switch']")
	WebElement btnLoginName;
	
	@FindBy(xpath = "//button[@type='button']//span[@class='logged-in header-value theme-primary']")
	WebElement lblCustomerName;
	
	//======My account drop down list ============
	@FindBy(xpath = "//a[text()='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath = "//li[@class='nav item']/a")
	WebElement lnkCustomerCodeMyAccount;

	@FindBy(xpath = "//a[text()='logout']")
	WebElement lnkLogout;
	
	//right side panel after clciking on my account   or my account detalis======
	
	@FindBy(xpath = "//a[text()='Account Dashboard']")
	WebElement  lnkAccountDashBoard;
	
	@FindBy(xpath = "//span[text()='Account Dashboard']")
	WebElement lblAccountDashBoard;
	
	@FindBy(xpath = "//a[text()='Account Information']")
	WebElement lnkAccountInformation;
	
	@FindBy(xpath = "//span[text()='Account Information']")
	WebElement lblAccountInformation;
	
	@FindBy(xpath = "//a[text()='Address Book']")
	WebElement lnkAddressBook;
	
	@FindBy(xpath = "//span[text()='Address Book']")
	WebElement lblAddessBook;
	
	@FindBy(xpath = "//a[text()='My Orders']")
	WebElement lnkMyOrders;
	
	@FindBy(xpath = "//span[text()='My Orders']")
	WebElement lblMyOrders;
	
	@FindBy(xpath = "//a[text()='My Invoices']")
	WebElement lnkMyInvoices;
	
	@FindBy(xpath = "//span[text()='My Invoices']")
	WebElement lblMyInvoices;
	
	@FindBy(xpath = "//a[text()='Make Payment']")
	WebElement lnkMakePayment;
	
	@FindBy(xpath = "//span[text()='Make Payment']")
	WebElement lblMakePayment;
	
	@FindBy(xpath = "//a[text()='My Wallet']")
	WebElement lnkMyWallet;
	
	@FindBy(xpath = "//span[text()='My Wallet']")
	WebElement lblMyWallet;
	
	@FindBy(xpath = "//a[text()='My Favorites']")
	WebElement lnkMyFavourites;
	
	@FindBy(xpath = "//span[text()='Favorites Lists']")
	WebElement lblMyFavourites;
	
	@FindBy(xpath = "//a[text()='My Rewards']")
	WebElement lnkMyRewards;
	
	@FindBy(xpath = "//span[text()='My Rewards']")
	WebElement lblMyRewards;
	
	@FindBy(xpath = "//ul[@class='nav items d-flex d-initial-lg']//a[contains(text(),'Customer Code')]")
	WebElement lnkCustomerCode;
	
	@FindBy(xpath = "//span[text()='Customer Code']")
	WebElement lblCustomerCode;
	
	
	
	
	
	
	
	
	
	
	public void clickLoginname() {
		waitForVisibilityOfElement(btnLoginName).click();
	}
	
	public String getCustomerName() {
		return waitForVisibilityOfElement(lblCustomerName).getText();
	}
	
	//======My account drop down list ============
	
	public void clickMyAccount() {
		lnkMyAccount.click();
	}
	
	public void clickCustomerCodeMyAccount() {
		lnkCustomerCode.click();
	}
	
	public void clickLogout() {
		lnkLogout.click();
	}
	
	//right side panel after clciking on my account   or my account details======
	
	public void clickAccountDashBoard() {
		lnkAccountDashBoard.click();
	}
	
	public String getAccountDashBoard() {
		return lblAccountDashBoard.getText();
	}
	
    public void clickAccountInformation() {
    	lnkAccountInformation.click();
    }
    
    public String getAccountInformation() {
    	return lblAccountInformation.getText();
    }
    
    public void clickAddressBook() {
    	lnkAddressBook.click();
    }
    
    public String getAddressBook() {
    	return lblAddessBook.getText();
    }
    
    
    public void clickMyOrders() {
    	lnkMyOrders.click();
    }
	
    
    public String getMyOrders() {
    	return lblMyOrders.getText();
    }
    
    public void clickMyInvoices() {
    	lnkMyInvoices.click();
    }
    
    public String getMyInvoices() {
    	return lblMyInvoices.getText();
    }
    
    
    public void clickMakePayment() {
    	lnkMakePayment.click();
    }
    
    public String getMakePayment() {
    	return lblMakePayment.getText();
    }
    
    
    public void clickMyWallet() {
    	lnkMyWallet.click();
    }
    
    public String getMyWallet() {
    	return lblMyWallet.getText();
    }
    
    
    public void clickMyFavourites() {
    	lnkMyFavourites.click();
    }
    
    public String getMyFavourites() {
    	return lblMyFavourites.getText();
    }
    
    
    public void clickMyRewards() {
    	lnkMyRewards.click();
    }
    
    public String getMyRewards() {
    	return lblMyRewards.getText();
    }
    
	
    public void clickCustomerCode() {
    	lnkCustomerCode.click();
    }
    
    
    public String getCustomerCode() {
    	return lblCustomerCode.getText();
    }
    
}
