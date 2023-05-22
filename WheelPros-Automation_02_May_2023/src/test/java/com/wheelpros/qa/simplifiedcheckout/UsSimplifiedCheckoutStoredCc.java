package com.wheelpros.qa.simplifiedcheckout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsSimplifiedCheckoutStoredCc {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://wheelpros--wpuat.sandbox.my.salesforce.com/0037h00000j4Blt");   // link
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shashikanthn@nsight-inc.com.uat"); // usernmae
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shashi.Manoj1");  //password
		driver.findElement(By.xpath("//input[@id='Login']")).click();   // login click
		driver.findElement(By.xpath("//li[contains(@class, 'slds-dropdown-trigger slds-dropdown-trigger_click')]")).click(); // SFDC list
		driver.findElement(By.xpath("//*[@title='Log in to Experience as User']")).click(); //login as exp user
		driver.findElement(By.xpath("//button[text()='Continue']")).click();   //to click on contiune
		
		
		try {
		     driver.findElement(By.xpath("//*[text()='All Products']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[text()='All Products']")));  //to click on all products
		  }  
		
		
		try {
		     driver.findElement(By.xpath("//a[text()='125B PR125B 20X8 5X120 M-BLACK +35MM']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='125B PR125B 20X8 5X120 M-BLACK +35MM']")));
		  } // to add wheel 
		
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click(); // add to cart
		
		
		try {
		     driver.findElement(By.xpath("//*[@id='cartHeader']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id='cartHeader']"))); //to click on cart header
		  }
		
		try {
		     driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[text()='Checkout']"))); //to checkout
		  }
		
		
		//using Stored cc
		
		try {
		     driver.findElement(By.xpath("(//*[@id='storedPaymentSelectiona1i7h00000243sqAAA'])[1]")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//*[@id='storedPaymentSelectiona1i7h00000243sqAAA'])[1]")));
		  }
		
		driver.findElement(By.xpath("//button[@id='storePaymentBtnTemp']")).click();
		}
	}
	
