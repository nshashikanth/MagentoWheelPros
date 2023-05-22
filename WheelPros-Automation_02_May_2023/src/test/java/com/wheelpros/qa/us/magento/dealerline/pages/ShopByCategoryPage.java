package com.wheelpros.qa.us.magento.dealerline.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;


public class ShopByCategoryPage extends BasePage{
	WebDriver driver;
	
	public ShopByCategoryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//div[@class='section-item-title hide-mob nav-sections-item-title']/a")
	WebElement mvetoShopByCategory;
	
	@FindBy(xpath = "//li[@class='level0 nav-1 category-item first has-active level-top parent ui-menu-item']")
	WebElement mvetoWheels;
	
	@FindBy(xpath = "//li[@class='level1 nav-1-1 category-item first ui-menu-item']/a/span[text()='All Brands']")
	WebElement mvetoAllBrandsWheels;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='American Force']")
	WebElement mvetoAmericanForceWheels;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='American Racing']")
	WebElement mvetoAmericanRacingWheels;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='Asanti Black']")
	WebElement mvetoAsantiBlackWheels;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='ATX']")
	WebElement mvetoATXWheels;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='Black Rhino']")
	WebElement mvetoBlackRhinoWheels;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='Fairway Alloys ']")
	WebElement mvetoFairwayAlloysWheels;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='Fuel Off-Road ']")
	WebElement mvetoFuelOffRoadWheels;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='Fuel UTV']")
	WebElement mvttoFuelUTVWheels;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='HELO']")
	WebElement mvetoHeloWheels;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='KMC']")
	WebElement mvetoKmcWheels;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='CEAT']")
	WebElement mvetoCeatWheels;
	
	//=========Tires===================
	
//	@FindBy(xpath = "//li[@class='level0 nav-2 category-item last level-top parent ui-menu-item']")
//	WebElement mvetoTires;
	
	@FindBy(xpath = "//li[@class='level0 nav-2 category-item last level-top parent ui-menu-item']/a")
	WebElement mvetoTires;
	
	@FindBy(xpath = "//li[@class='level1 nav-2-1 category-item first ui-menu-item']/a/span[text()='All Brands']")
	WebElement mvetoAllBrandTires;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='BF GOODRICH']")
	WebElement mvetoBfGoodRichTires;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='EFX']")
	WebElement mvetoEFXTires;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='FALKEN']")
	WebElement mvetoFalkenTires;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='FUEL TIRES']")
	WebElement mvetoFuelTires;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='MICKEY THOMPSON']")
	WebElement mvetoMickeyThompsonTires;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='NITTO']")
	WebElement mvetoNittoTires;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='OHTSU']")
	WebElement mvetoOhtsuTires;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='PIRELLI']")
	WebElement mvetoPirelliTires;
	
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='TOYO']")
	WebElement mvetoToyoTires;
	
	@FindBy(xpath = "//a[@role='menuitem']/span[text()='YOKOHAMA']")
	WebElement mvetoYokohamaTires;
	
	
	
	
	
	
	
	
	
	
	
	public void mvetoShopByCategory() {
		Actions actions = new Actions(driver);
		actions.moveToElement(mvetoShopByCategory).build().perform();
	}
	
	public void mvetoWheels() {
		Actions actions = new Actions(driver);
		actions.moveToElement(mvetoWheels).build().perform();
	}
	
	public void clickAllBrandsWheels() {
		actions(mvetoAllBrandsWheels);
	}
	
	public void clickAmericanForceWheels() {
		actions(mvetoAmericanForceWheels);
	}
	
	public void clickAmericanRacingWheels() {
		actions(mvetoAmericanRacingWheels);
	}
	
	public void clickAsantiBlackWheels() {
		actions(mvetoAsantiBlackWheels);
	}
	
	public void clickATXWheels() {
		actions(mvetoATXWheels);
	}
	
	public void clickBlackRhinoWheels() {
		actions(mvetoBlackRhinoWheels);
	}
	
	public void clickFairwayAlloysWheels() {
		actions(mvetoFairwayAlloysWheels);
	}
	
	public void clickFuelOffRoadWheels() {
		actions(mvetoFuelOffRoadWheels);
	}
	
	public void clickFuelUTVWheels() {
		actions(mvttoFuelUTVWheels);
	}
	
	public void clickHeloWheels() {
		actions(mvetoHeloWheels);
	}
	
	public void clickKmcWheels() {
		actions(mvetoKmcWheels);
	}
	
	public void clickCeatWheels() {
		actions(mvetoCeatWheels);
	}
	
	//===============Tires=====================
	
	public void mvetoTires() {
		Actions actions = new Actions(driver);
		actions.moveToElement(mvetoTires).build().perform();
	}
	
	public void clickAllBrandTires() {
		actions(mvetoAllBrandTires);
	}
	
	public void clickBfGoodRichTires() {
		actions(mvetoBfGoodRichTires);
	}
	
	public void clickEfxTires() {
		actions(mvetoEFXTires);
	}
	
	public void clickFalkenTires() {
		actions(mvetoFalkenTires);
	}
	
	public void clickFuelTires() {
		actions(mvetoFuelTires);
	}
	
	public void clickMickeyThompsonTires() {
		actions(mvetoMickeyThompsonTires);
	}
	
    public void clickNittoTires() {
    	actions(mvetoNittoTires);
    }
	
    public void clickohtsuTires() {
    	actions(mvetoOhtsuTires);
    }
    
    public void clickPirelliTires() {
    	actions(mvetoPirelliTires);
    }
    
    public void clickToyoTires() {
    	actions(mvetoToyoTires);
    }
    
    public void clickYokohamaTires() {
    	actions(mvetoYokohamaTires);
    }
}

