package com.wheelpros.qa.us.dealerline.pages;

import java.util.List;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.Assert;
import com.wheelpros.web.utils.BasePage;
import com.wheelpros.web.utils.ValidationType;


public class LandingPage extends BasePage{
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	
	//========== Left panel group============
	@FindBy(xpath = "//a[text()='All Products']")
	WebElement lnkAllProducts;

	@FindBy(xpath = "//*[@id='a0K0S0000027ZCTUA2']/h5/a[text()='Accessories']")
	WebElement lnkAccessories;

	@FindBy(xpath = "//*[@id=\"a0K0S0000027ZCSUA2\"]/h5/a[text()='Tires']")
	WebElement lnkTires;

	@FindBy(xpath = "//*[@id=\"a0K0S0000027ZCUUA2\"]/h5/a[text()='Wheels']")
	WebElement lnkWheels;
	
	//=========right panel group=====
	
	//Total price
	
	@FindBy(xpath = "(//*[@id=\"collapseMiniCart\"]/div/div[1]/div[10]/div[1]/div[2]/span)[1]")
	WebElement txtTotalPrice;
	
	
    
	//Quick order
	
	@FindBy(xpath = "//input[@id='quickorder[0].sku']")
	WebElement txtQuickOrderSku0;
	
	@FindBy(xpath = "//input[@id='quickorder[0].qty']")
	WebElement txtQty0;
	
	@FindBy(xpath = "//input[@id='quickorder[1].sku']")
	WebElement txtQuickOrderSku1;
	
	@FindBy(xpath = "//input[@id='quickorder[1].qty']")
	WebElement txtQty1;
	
	@FindBy(xpath = "//input[@id='quickorder[2].sku']")
	WebElement txtQuickOrderSku2;
	
	@FindBy(xpath = "//input[@id='quickorder[2].qty']")
	WebElement txtQty2;
	//Add more
	@FindBy(xpath = "//button[text()='Add More']")
	WebElement btnAddMore;
	
	@FindBy(xpath = "//input[@id='quickorder[3].sku']")
	WebElement txtQuickOrderSku3;
	
	@FindBy(xpath = "//input[@id='quickorder[3].qty']")
	WebElement txtQty3;
	
	@FindBy(xpath = "//input[@id='quickorder[4].sku']")
	WebElement txtQuickOrderSku4;
	
	@FindBy(xpath = "//input[@id='quickorder[4].qty']")
	WebElement txtQty4;
	
	//Add to cart
	
	@FindBy(xpath = "//button[text()='Add To Cart']")
	WebElement btnAddtoCart;
	
	//====Spotlight product==========
	
	@FindBy(xpath = "(//img[@class='spot img-responsive center-block'])[1]")
	WebElement imgSpotlightProduct1;
	
	@FindBy(xpath = "(//img[@class='spot img-responsive center-block'])[2]")
	WebElement imgSpotlightProduct2;
	
	@FindBy(xpath = "(//img[@class='spot img-responsive center-block'])[3]")
	WebElement imgSpotlightProduct3;
	
	@FindBy(xpath = "(//img[@class='spot img-responsive center-block'])[4]")
	WebElement imgSpotlightProduct4;
	
	@FindBy(xpath = "(//img[@class='spot img-responsive center-block'])[5]")
	WebElement imgSpotlightProduct5;
	
	
	
	
	
	
	
	
	
	






 //=======Left panel group =======================
	
	public void clickAllProducts() {
		lnkAllProducts.click();
	}

	public void clickAccessories() {
		lnkAccessories.click();
	}

	public void clickTires() {
		lnkTires.click();
	}	

	public void clickWheels() {
		lnkWheels.click();
	}

	//=========right panel group=====
	
	
	public void txtTotalPrice() {
		//waitForVisibilityOfElement(txtTotalPrice);
		String totalpricetxt=txtTotalPrice.getText();
		String totalprice=totalpricetxt.substring(totalpricetxt.lastIndexOf("$") + 1).trim();
		System.out.println(totalprice);
	    
	}
	
	
	
    
	//Quick order
	
	public void enterSKU1(String sku) {
		txtQuickOrderSku0.sendKeys(sku);
	}
	
	public void enterQty1(String qty) {
		txtQty0.clear();
		txtQty0.sendKeys(qty);
	}
	
	public void enterSKU2(String sku) {
		txtQuickOrderSku1.sendKeys(sku);
	}
	
	public void enterQty2(String qty) {
		txtQty1.clear();
		txtQty1.sendKeys(qty);
	}
	
	public void enterSKU3(String sku) {
		txtQuickOrderSku2.sendKeys(sku);
	}
	
	public void enterQty3(String qty) {
		txtQty2.clear();
		txtQty2.sendKeys(qty);
	}
	
	public void clickAddMore() {
		btnAddMore.click();
	}
	
	public void enterSKU4(String sku) {
		txtQuickOrderSku3.sendKeys(sku);
	}
	
	public void enterQty4(String qty) {
		txtQty3.clear();
		txtQty3.sendKeys(qty);
	}
	
	//Add to cart
	
	public void clickAddtoCart() {
		btnAddtoCart.click();
	}
	
	//==Spotlight Product =====
	
	public void clickSpotlightProduct1() {
		imgSpotlightProduct1.click();
	}
	
	public void clickSpotlightProduct2() {
		jsClick(imgSpotlightProduct2);
		//imgSpotlightProduct2.click();
	}
	
	
	public void clickSpotlightProduct3() {
		imgSpotlightProduct3.click();
	}
	
	public void clickSpotlightProduct4() {
		imgSpotlightProduct4.click();
	}
	
	public void clickSpotlightProduct5() {
		imgSpotlightProduct5.click();
	}
	
	

	}
