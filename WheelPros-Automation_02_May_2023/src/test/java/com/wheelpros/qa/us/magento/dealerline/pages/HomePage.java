package com.wheelpros.qa.us.magento.dealerline.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

public class HomePage extends BasePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath = "//*[@id=\"html-body\"]//header/div/ul/li/span/div/div/span")
	WebElement lblHeadingLandingPage;
	
	
	@FindBy(xpath = "//div[@class='section-item-title link nav-sections-item-title']/a")
	WebElement lnkFindWheelsAndTires;
	
	@FindBy(xpath = " //div[@class='section-items nav-sections-items']/div[1]/a")
	WebElement drpdwnShopByCategory;
	
	@FindBy(xpath = "//div[@class='section-item-title ymm-section nav-sections-item-title']/a")
	WebElement drpdwnSearchByVehicle;
	
	
	//===============Search box on the header==========
	
	@FindBy(xpath = "//input[@id='search']")
	WebElement txtSerchBox;
	
	@FindBy(xpath = "//form[@id='search_mini_form']/div[2]/button")
	WebElement btnSerchclick;
	
	@FindBy(xpath = "//*[@id='maincontent']/div[2]/h1/span")
	WebElement lblforSearch;
	
	
	//================Alert message ============
	
	@FindBy(xpath = "//div/div[@class='marquee-container']//strong[1]")
	WebElement lblAlertMessgae;
	
	@FindBy(xpath = "//span[@class='marquee_close']")
	WebElement closeAlertMessage;
	
	
	
	
	
	public String getlblHeadingLandingPage() {
		return  waitForVisibilityOfElement(lblHeadingLandingPage).getText();
		}
	
	public void clickFindWheelsAndTires() {
		lnkFindWheelsAndTires.click();
	}
	
	
	
	
	
	
	
		public boolean isClickableShopByCategory() {
		drpdwnShopByCategory.isEnabled();
			drpdwnShopByCategory.click();
			return false;
	}
	
	public boolean isClickableSearchByVehicle() {
		 drpdwnSearchByVehicle.isEnabled();
			   drpdwnSearchByVehicle.click();
			   return false;
	}
	
	
	
	
	public String homePageTittle() {
		return driver.getTitle();
	}
	
	
	//===============Search box on the header==========
	
	public void enterinSearchBox(String text) {
		txtSerchBox.sendKeys(text);
	}
	
	public void clickSearchboxClick() {
		btnSerchclick.click();
	}
	
	public String getIteamSerched() {
		return lblforSearch.getText();
	}
	
	public void hitEnterSerchBox() {
		txtSerchBox.sendKeys(Keys.ENTER);
	}
	
	
	//================Alert message ============
	
	public String getAlertMessage() {
		return lblAlertMessgae.getText();
	}
	
	public boolean isAlertMessageVisable() {
		return isElementDisplayed(lblAlertMessgae);
	}
	
	public void clickCloseAlertMessage() {
		closeAlertMessage.click();
	}
	
	
   //==========to get page title ==
	
	public String titleHome() {
		return driver.getTitle();
	}
}