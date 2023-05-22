package com.wheelpros.qa.simplifiedcheckout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsSimplifiedCheckoutPo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//UAT
//		driver.get("https://wheelpros--wpuat.sandbox.my.salesforce.com/0037h00000j4Blt");   // link
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shashikanthn@nsight-inc.com.uat"); // usernmae
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shashi.Manoj1");  //password
		
		//prorpod 
		
		driver.get("https://wheelpros--preprod.sandbox.my.salesforce.com/0031U00001KyQhu");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shashikanthn@nsight-inc.com.preprod"); // usernmae
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(" Pre-Prod1");  //password

		
		
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
		
		
		//wheel to add uat
		
//		try {
//		     driver.findElement(By.xpath("//a[text()='125B PR125B 20X8 5X120 M-BLACK +35MM']")).click();
//		  } catch (Exception e) {
//		     JavascriptExecutor executor = (JavascriptExecutor) driver;
//		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='125B PR125B 20X8 5X120 M-BLACK +35MM']")));
//		  } // to add wheel 
		
		
		//wheel to add for pre prod
		
		try {
		     driver.findElement(By.xpath("//img[@alt='BUC 20X10.5 5X4.5 72.56 BD +45']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//img[@alt='BUC 20X10.5 5X4.5 72.56 BD +45']"))); //to click on cart header
		  }
		
		
		
		
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
		
		
		
		//clicking on add one time shiping addres
		
		try {
		     driver.findElement(By.xpath("//*[text()='ADD ONE-TIME SHIPPING ADDRESS']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[text()='ADD ONE-TIME SHIPPING ADDRESS']")));
		  }
		
		// addding data in the one time shipping adress form
		
		driver.findElement(By.xpath("(//input[@id='firstName'])[2]")).sendKeys("Shashi"); // first name
		driver.findElement(By.xpath("(//input[@id='lastName'])[2]")).sendKeys("Kanth"); // last name
		driver.findElement(By.xpath("(//input[@id='phone'])[2]")).sendKeys("9448150240"); // enter ph#
		driver.findElement(By.xpath("//button[@onclick='saveOneTimeShipping()']")).click();  // to save
		
		
		//uncheck Same as billing address.
		
		try {
		     driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")));
		  }

		
		
		//using PO#
		driver.findElement(By.xpath("//input[@id='poCheckbox']")).click();
		driver.findElement(By.xpath("//input[@id='accountNumberTemp']")).sendKeys("125678");
		driver.findElement(By.xpath("//input[@id='displayNameTemp']")).sendKeys("using automation");
		//driver.findElement(By.xpath("//button[@id='storePaymentBtnTemp']")).click();
		
		
		
 	}
}
