package com.wheelpros.qa.us.dealerline.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

	
	public class PdpPage extends BasePage{

		WebDriver driver;

		public PdpPage(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath = "//input[@id='qty']")
		WebElement txtQty;
		
		@FindBy(xpath = "//button[text()='Add to Cart']")
		WebElement btnAddtoCartpdp;
		
		
		@FindBy(xpath = "//a[text()='Inventory']")
		WebElement tabInventory;
		
		@FindBy(xpath = "//a[text()='Specs']")
		WebElement tabSpecs;
		
		//@FindBy(xpath = "//div[@class='tabs_container cc_tabs_container cc_product_detail_container']")
		WebElement screenshotspecs;
		
		public  WebElement screenshotspecs() {
		WebElement section=driver.findElement(By.xpath("//div[@class='tabs_container cc_tabs_container cc_product_detail_container']"));
		File src=section.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\Shashi\\Desktop\\us\\DealerLine\\");
		 try {
			FileUtils.copyFile (src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return screenshotspecs;
		}
		
		
		
		
		
		
		
		
		
		
		
		public void enterqty(String qty) {
			clearAndEnterText(txtQty, qty);
		}
		
		public void clickAddtoCartpdp() {
			btnAddtoCartpdp.click();
		}
		
		public void clickInventory() {
			tabInventory.click();
		}
		
		public void clickSpecs() {
			tabSpecs.click();
		}


		
}
