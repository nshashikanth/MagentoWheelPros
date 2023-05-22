package com.wheelpros.qa.us.dealerline.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDealerLine {
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://wheelpros--wpuat.sandbox.my.site.com/dealerline/ccrz__CCSiteLogin ");
		driver.findElement(By.xpath("//input[@id='emailField']")).sendKeys("eswar.ravi@gmail.com.uat");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Testing123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();   //to click on contiune
		
		
		//====login to sandbox==============

//	driver.get("https://wheelpros--preprod.sandbox.lightning.force.com/lightning/r/Contact/00374000008yuMVAAY/view");
//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shashikanthn@nsight-inc.com.preprod"); // usernmae
//	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(" Pre-Prod1");  //password
//
//driver.findElement(By.xpath("//input[@id='Login']")).click();
//driver.findElement(By.xpath("//li[contains(@class, 'slds-dropdown-trigger slds-dropdown-trigger_click')]")).click();
//driver.findElement(By.xpath("//*[@title='Log in to Experience as User']")).click();
//driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		WebElement searchButton = driver.findElement(By.xpath("(//*[text()='My Account'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", searchButton);
		
 
  driver.findElement(By.xpath("//a[text()='Contact Information']")).click();

 // to edit contact infor
  driver.findElement(By.xpath("//input[@value='Edit Profile']")).click();

  WebElement firstname= driver.findElement(By.xpath("//input[@id='firstNameField']"));
  firstname.clear();
  firstname.sendKeys("hello");
  
  WebElement lastname=driver.findElement(By.xpath("//input[@id='lastNameField']"));
  lastname.clear();
  lastname.sendKeys("hi");
  
  WebElement homephone=driver.findElement(By.xpath("//input[@id='homePhoneField']"));
  homephone.clear();
  homephone.sendKeys("04024987645");
  
  //==========contact mailing address=============
  
  WebElement mailingStreet=driver.findElement(By.xpath("//input[@id='street']"));
  mailingStreet.clear();
  mailingStreet.sendKeys("ks nagar");
  
  WebElement mailingCity=driver.findElement(By.xpath("//input[@id='city']"));
  mailingCity.clear();
  mailingCity.sendKeys("hyd");
  
  Thread.sleep(2);
  
  WebElement mailingState=driver.findElement(By.xpath("//input[@name='mailingAddress.state']"));
  mailingState.clear();
  mailingState.sendKeys("TSchechk");
  
  
  
  
  
  WebElement mailingZip=driver.findElement(By.xpath("//input[@id='postalCode']"));
  mailingZip.clear();
  mailingZip.sendKeys("500006");
  
  driver.findElement(By.xpath("//select[@name='mailingAddress.countryCode']")).click();
 WebElement country= driver.findElement(By.xpath("//*[@id=\"myAccountForm\"]/div[1]/div[2]/div[4]/div[1]/div[4]/select/option[4]"));
  country.click();
 country.sendKeys(Keys.ENTER);
  
  //============contact other address=====
  
 /* WebElement otherStreet=driver.findElement(By.xpath("//input[@id='otherStreet']"));
  otherStreet.clear();
  otherStreet.sendKeys("moti nagar");
  
  
  WebElement otherCity=driver.findElement(By.xpath("//input[@id='othercity']"));
  otherCity.clear();
  otherCity.sendKeys("blore");
  
  WebElement otherState=driver.findElement(By.xpath("//input[@name='otherAddress.state']"));
  otherState.clear();
  otherState.sendKeys("hyd");
  
  WebElement otherZip=driver.findElement(By.xpath("//input[@id='otherpostalCode']"));
  otherZip.clear();
  otherZip.sendKeys("500002");
  
  */
  
  

  
  
  
  
  
  
		  }
}


