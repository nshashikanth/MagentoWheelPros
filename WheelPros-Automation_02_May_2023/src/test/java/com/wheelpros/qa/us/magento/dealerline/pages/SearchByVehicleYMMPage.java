package com.wheelpros.qa.us.magento.dealerline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.wheelpros.web.utils.BasePage;

public class SearchByVehicleYMMPage extends BasePage {

	WebDriver driver;

	public SearchByVehicleYMMPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//div[@class='section-item-title ymm-section nav-sections-item-title']/a")
	WebElement mvetoSerchByVehicleYMM;
	
	@FindBy(xpath = "//select[@id='year']")
	WebElement drpdwnYear;
	
	@FindBy(xpath = "//select[@id='make']")
	WebElement drpdwnMake;
	
	@FindBy(xpath = "//select[@id='model']")
	WebElement drpdwnModel;
    
	@FindBy(xpath = "//select[@id='submodel']")
	WebElement drpdwnSubModel;
	
	@FindBy(xpath = "//button[@id='ymm-submit']")
	WebElement btnSubmit;
	
	
	
	
	public void mvetoSearchByVehicle() {
		actions(mvetoSerchByVehicleYMM);
	}
	
	public void clickYearinYMM() {
		drpdwnYear.click();
	}
	
	public void clickMakeinYMM() {
		drpdwnMake.click();
	}
	
	public void clickModelInYmm() {
		drpdwnModel.click();
	}
	
	public void selectYearInYMM(String enterYear) {
	
		Select dropdown = new Select(drpdwnYear);
		dropdown.selectByValue(enterYear);
	}
	
	public void selectMakeInYMM(String enterMake) {
		Select dropdown = new Select(drpdwnMake);
		dropdown.selectByValue(enterMake);
	}
	
	public boolean isEnabledMake() {
		return drpdwnMake.isEnabled();
	}
    
	
	public void selectModelInYMM(String enterModel) {
		Select dropdown = new Select(drpdwnModel);
		dropdown.selectByValue(enterModel);
	}
	
	public boolean isEnabledModel() {
		return drpdwnModel.isEnabled();
	}
	
	public void selectSubModelInYMM(String enterSubModel) {
		Select dropdown = new Select(drpdwnSubModel);
		dropdown.selectByValue(enterSubModel);
	}
	public boolean isEnabledSubModel() {
		return drpdwnSubModel.isEnabled();
	}
	
	
	
	public void clickSearchProducts() {
		btnSubmit.submit();
	}
	
	public boolean isEnabledSerchProducts() {
		return btnSubmit.isEnabled();
	}
	

	public String getSelectedModelInYMM(String model) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
