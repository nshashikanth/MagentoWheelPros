package com.wheelpros.qa.us.dealerline.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

public class CommonFooterPage extends BasePage {
	WebDriver driver;
	public CommonFooterPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//===========footer products =============
	
	@FindBy (xpath = "//a[text()='Browse Wheels']")
    WebElement lnkBrowseWheels;
	
	@FindBy (xpath = "//a[text()='Browse Tires']")
    WebElement lnkBrowseTires;
	
	@FindBy (xpath = "//a[text()='Browse Accessories']")
    WebElement lnkBrowseAccessories;
	
	@FindBy (xpath = "//a[text()='2020 Collection']")
    WebElement lnkCollection2020;
	
	@FindBy (xpath = "//a[text()='Vehicle Gallery']")
    WebElement lnkVehicleGallery;
	
	@FindBy (xpath = "//a[text()='Tech Data']")
    WebElement lnkTechData;
	
	
	
	//===========footer info==========
	
	@FindBy (xpath = "//a[text()='About Us']")
    WebElement lnkAboutUs;
	
	@FindBy (xpath = "//a[text()='Contact']")
    WebElement lnkContact;
	
	@FindBy (xpath = "//a[text()='Warranty']")
    WebElement lnkWarranty;
	
	@FindBy (xpath = "//a[text()='FAQ']")
    WebElement lnkFaq;
	
	@FindBy (xpath = "//a[text()='Wheel Care']")
    WebElement lnkWheelCare;
	
	@FindBy (xpath = "//a[text()='Become a Dealer']")
    WebElement lnkBecomeDealer;
	
	@FindBy (xpath = "//a[text()='Brand Logos']")
    WebElement lnkBrandLogos;
	
	
    //===============Consumer Sites==================
	
	@FindBy (xpath = "//a[text()='Find a Dealer']")
    WebElement lnkFindDealer;
	
	@FindBy (xpath = "//a[text()='Wheelpros.com']")
	WebElement lnkWheelProsSite;
	
	//========Terms/Privacy===========
	
	@FindBy (xpath = "//a[text()='Terms']")
	WebElement lnkTerms;
	
	@FindBy (xpath = "//a[text()='Privacy']")
	WebElement lnkPrivacy;
	
	
	
	//===========footer products =============
	
	public void clickBrowseWheels() {
		lnkBrowseWheels.click();
	}
	
	public void clickBrowseTires() {
		lnkBrowseTires.click();
	}
	
	public void clickBrowseAccessories() {
		lnkBrowseAccessories.click();
	}
	
	public void clickCollection2020() {
		lnkCollection2020.click();
	}
	
	public void clickVehicleGallery() {
		lnkVehicleGallery.click();
	}
	
	public void clickTechData() {
		lnkTechData.click();
	}
	
	
	//===========footer info==========
	
	public void clickAboutUs() {
		lnkAboutUs.click();
	}
	
	public void clickContact() {
		lnkContact.click();
	}
	
	public void clickWarranty() {
		lnkWarranty.click();
	}
	
	public void clickFaq() {
		lnkFaq.click();
	}
	
	public void clickWheelCare() {
		lnkWheelCare.click();
	}
	
	public void clickBecomeDealer() {
		lnkBecomeDealer.click();
	}
	
	public void clickBrandLogos() {
		lnkBrandLogos.click();
	}
	
	 //===============Consumer Sites==================
	
	public void clickFindDealer() {
		lnkFindDealer.click();
	}
	
	public void clickWheelsprosSite() {
		lnkWheelProsSite.click();
	}
	
	//==========Terms/Privacy=======
	
	public void clickTerms() {
		lnkTerms.click();
	}
	
	public void clickPrivacy() {
		lnkPrivacy.click();
	}
}
