package com.wheelpros.qa.us.magento.dealerline.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

public class FooterPage extends BasePage{

	WebDriver driver;

	public FooterPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//div[@class='footer-log col-12 col-lg-auto']/a")
	WebElement lnkCompanylogoFooter;
	
	//================PRODUCTS ==================
	@FindBy(xpath = "//h4[text()='Products']")
	WebElement lblProductsFooter;
	
	@FindBy(xpath = "//a[text()='Browse Wheels']")
	WebElement lnkBrowseWheels;
	
	@FindBy(xpath = "//a[text()='Browse Tires']")
	WebElement lnkBrowseTires;
	
	@FindBy(xpath = "//a[text()='Browse Suspensions']")
	WebElement lnkBrowseSuspensions;
	
	@FindBy(xpath = "//a[text()='Browse Lighting']")
	WebElement lnkBrowseLighting;
	
	@FindBy(xpath = "//a[text()='Browse Accessories']")
	WebElement lnkBrowseAccessories;
	
	@FindBy(xpath = "//a[text()='2023 Collection']")
	WebElement lnk2023Collection;
	
	@FindBy(xpath = "//a[text()='Vehicle Gallery']")
	WebElement lnkVehicleGallery;
	
	/////============INFO==============
	@FindBy(xpath = "//h4[text()='Info']")
	WebElement lblInfoFooter;
	
	@FindBy(xpath = "//a[text()='About Us']")
	WebElement lnkAboutUs;
	
	@FindBy(xpath = "//a[text()='Contact']")
	WebElement lnkContact;
	
	@FindBy(xpath = "//a[text()='Warranty']")
	WebElement lnkWarranty;
	
	@FindBy(xpath = "//a[text()='FAQ’s']")
	WebElement lnkFaqs;
	
	@FindBy(xpath = "//a[text()='Wheel Care']")
	WebElement lnkWheelCare;
	
	@FindBy(xpath = "//a[text()='Brand Logo']")
	WebElement lnkBrandLogo;
	
	//======Consumer Sites========
	
	@FindBy(xpath = "//h4[text()='Consumer Sites']")
	WebElement lblConsumerSiteFooter;
	
	@FindBy(xpath = "//a[text()='Find a Dealer']")
	WebElement lnkFindADealer;
	
	@FindBy(xpath = "//a[text()='WheelPros.com']")
	WebElement lnkWheelPros;
	
	//==========================================end of footer===========
	
	@FindBy(xpath = "//span[text()='COPYRIGHT © 2022 WHEELPROS LLC']")
	WebElement lblCopyRight2022WheelProsLLC;
	
	@FindBy(xpath = "//*[@id='html-body']/div[5]/footer/div/small/a[1]")
	WebElement lnkPrivacyPolicy;
	
	@FindBy(xpath = "//*[@id='html-body']/div[5]/footer/div/small/a[2]")
	WebElement lnkCaliforniaConsumerPrivacyAct;
	
	@FindBy(xpath = "//*[@id='html-body']/div[5]/footer/div/small/a[3]")
	WebElement lnkDoNotSellMyData;
	
	@FindBy(xpath = "//*[@id='html-body']/div[5]/footer/div/small/a[4]")
	WebElement lnkTerms;
	
	@FindBy(xpath = "//*[@id='html-body']/div[5]/footer/div/small/a[5]")
	WebElement lnkAccessibility;
	
	
	public void clickCompnayLogoFooter() {
		lnkCompanylogoFooter.click();
	}
	
	
	//===========PRODUCTS==========
	public String getlblProductsFooter() {
		return lblProductsFooter.getText();
	}
	
	public void clickBrowseWheels() {
		lnkBrowseWheels.click();
	}
	
	public void clickBrowseTires() {
		lnkBrowseTires.click();
	}
	
	public void clickBrowseSuspensions() {
		lnkBrowseSuspensions.click();
	}
	
	public void clickBrowseLighting() {
		lnkBrowseLighting.click();
	}
	
	public void clickBrowseAccessories() {
		lnkBrowseAccessories.click();
	}
	
	public void click2023Collections() {
		lnk2023Collection.click();
	}
	
	public void clickVehicleGallery() {
		lnkVehicleGallery.click();
	}
	
	//===== INFO ===========
	
	public String getlblInfoFooter() {
		return lblInfoFooter.getText();
	}
	
	public void clickAboutUs() {
		lnkAboutUs.click();
	}
	
	public void clickContact() {
		lnkContact.click();
	}
	
	public void clickWarranty() {
		lnkWarranty.click();
	}
	
	public void clickFaqs() {
		lnkFaqs.click();
	}
	
	public void clickWheelCare() {
		lnkWheelCare.click();
	}
	
	public void clickBrandLogo() {
		lnkBrandLogo.click();
	}
	
	//============Consumer site===========
	
	public String getlblConsumerSiteFooter() {
		return lblConsumerSiteFooter.getText();
	}
	
	public void clickFindAdealer() {
		lnkFindADealer.click();
	}
	
	public void clickWheelProscom() {
		lnkWheelPros.click();
	}
	
	//=============================ENd of footer===============================
	public String getCopyRight() {
	    return lblCopyRight2022WheelProsLLC.getText();
	}
	
	public void clickPrivacyPolicy() {
		lnkPrivacyPolicy.click();
	}
	
	public void clickCaliforniaConsumerPrivacyAct() {
		lnkCaliforniaConsumerPrivacyAct.click();
	}
	
	public void clickDoNotSellMyData() {
		lnkDoNotSellMyData.click();
	}
	
	public void clickTerms() {
		lnkTerms.click();
	}
	
	public void clickAccessbility() {
		lnkAccessibility.click();
	}
	
}
 