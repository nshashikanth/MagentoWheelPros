package com.wheelpros.qa.simplifiedcheckout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UkSimplifiedCheckoutStoredCc {

	
public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//for UK
		
		driver.get("https://wheelpros--wpuat.sandbox.my.salesforce.com/0037h00000cN2mg");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shashikanthn@nsight-inc.com.uat");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shashi.Manoj1");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//li[contains(@class, 'slds-dropdown-trigger slds-dropdown-trigger_click')]")).click();
		driver.findElement(By.xpath("//*[@title='Log in to Experience as User']")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();


		
		try {
		     driver.findElement(By.xpath("//*[text()='All Products']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[text()='All Products']")));
		  }
		
		
		WebElement search=driver.findElement(By.xpath("//input[@id='searchText']"));
		search.sendKeys("106A-896530");
		 search.sendKeys(Keys.ENTER);
		 
		 
		 driver.findElement(By.xpath("//button[@class='btn btn-default center-block cc_add_to_btn cc_add_to_btn_a1F0S000002wKIhUAM']")).click();
		

		
		try {
		     driver.findElement(By.xpath("//*[@id='cartHeader']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id='cartHeader']")));
		  }
		
		
		try {
		     driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[text()='Checkout']")));
		  }
		
		
		
		try {
		     driver.findElement(By.xpath("(//input[@id='storedPaymentSelectiona1i7h000001xMXiAAM'])[2]")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//input[@id='storedPaymentSelectiona1i7h000001xMXiAAM'])[2]")));
		  }
		
		driver.findElement(By.xpath("//button[@id='storePaymentBtnTemp']")).click();
		}
		
}
