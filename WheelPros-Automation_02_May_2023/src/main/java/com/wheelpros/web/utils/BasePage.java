package com.wheelpros.web.utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	protected WebDriverWait wait;
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	protected WebElement waitForVisibilityOfElement(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
//	protected WebElement waitForVisibilityOfElements(WebElement element) {
//		return wait.until(ExpectedConditions.visibilityOf(element));
//	}
//	
	
	
	protected void clickElement(WebElement element) {
		try {
			waitForVisibilityOfElement(element).click();
		}catch(ElementClickInterceptedException e) {
			jsClick(element);
		}
	}
	
	protected void jsClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	protected void clearAndEnterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	protected boolean isElementDisplayed(WebElement element) {
		try{
			return element.isDisplayed();
		}catch(NoSuchElementException nse) {
			return false;
		}
	}
	
	
	
	public void takeScreenShot(String name) {
	 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     try {
		org.openqa.selenium.io.FileHandler.copy(screenshot,new File("C:\\Users\\Shashi\\Desktop\\us\\DealerLine\\"+name+""));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void staticThreadWait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		}catch (Exception e) {
		}
	}
	
	public void scrollIntoView(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void scrollToTopPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
	}
	
	public void scrollToMidPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight/2)");
	}
	
	public void scrollToBottomPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	
	public void actions(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
}


