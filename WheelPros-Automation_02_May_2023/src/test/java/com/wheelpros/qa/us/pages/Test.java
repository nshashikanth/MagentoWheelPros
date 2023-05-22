package com.wheelpros.qa.us.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://wheelpros--wpuat.sandbox.my.site.com/CreditApp/s/n?language=en_US");
		
	
	driver.findElement(By.xpath("//input[@id='input-8']")).sendKeys("Kuvalis - Ledner");
	driver.findElement(By.xpath("//input[@id='input-9']")).sendKeys("Kuvalis - Ledner");
	driver.findElement(By.xpath("//button[@aria-label='Business Legal Structure, Select']")).click();
	driver.findElement(By.xpath("//*[@data-value='LLP']")).click();
	driver.findElement(By.xpath("//input[@placeholder='XX-XXXXXXX']")).sendKeys("11-1111111");
	driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("2002");  //year
	driver.findElement(By.xpath("//input[@id='input-16']")).sendKeys("Hello");  //other notes
	
	
	//to uploas file;
	
//	driver.findElement(By.xpath("//span[@class='slds-file-selector__button slds-button slds-button_neutral']")).click();
//	
//	Robot rb = new Robot();
//	
//	
//	StringSelection str = new StringSelection("C:\\Users\\Shashi\\Desktop\\test.jpg");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    
//   // press Control+V for pasting
//    rb.keyPress(KeyEvent.VK_CONTROL);
//    rb.keyPress(KeyEvent.VK_V);
//    
//    		
// // release Contol+V for pasting
//    rb.keyRelease(KeyEvent.VK_CONTROL);
//    rb.keyRelease(KeyEvent.VK_V);
//    
//    
// // for pressing and releasing Enter
//    rb.keyPress(KeyEvent.VK_ENTER);
//    rb.keyRelease(KeyEvent.VK_ENTER);
//    
//  driver.getWindowHandle();
//   
//    driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral ok uiButton--default uiButton--brand uiButton']")).click();
	
	
	

	    
	
	    

	driver.findElement(By.xpath("//input[@id='input-21']")).sendKeys("hyd");  //street adress
	driver.findElement(By.xpath("//input[@id='input-22']")).sendKeys("hyd"); //city 
	
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='StatesPicklist']"))).click();
	
	
	//driver.findElement(By.xpath("//button[@name='StatesPicklist']")).click(); //State
	driver.findElement(By.xpath("//*[@data-value='AK']")).click();
	
	driver.findElement(By.xpath("//input[@placeholder='XXXXX']")).sendKeys("95340");
	
	
			
			try {
				driver.findElement(By.xpath("//input[@id='radio-0-28']")).click();
			} catch (Exception e) {
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='radio-0-28']"))); //yes
			}
			
		
			
		
			
			
	   
   
			WebElement con=driver.findElement(By.xpath("//div/button[@title='Continue']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", con);   
			
		

}

}
