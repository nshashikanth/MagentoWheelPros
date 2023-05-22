package com.wheelpros.qa.simplifiedcheckout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDealerLineBG {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://wheelpros--wpuat.sandbox.my.site.com/dealerline/\r\n");
	
		
		
		
		driver.get("https://wheelpros--preprod.sandbox.lightning.force.com/lightning/r/Contact/00374000008yuMVAAY/view");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shashikanthn@nsight-inc.com.preprod");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pre-Prod1");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//li[contains(@class, 'slds-dropdown-trigger slds-dropdown-trigger_click')]")).click();
		driver.findElement(By.xpath("//*[@title='Log in to Experience as User']")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.findElement(By.xpath("//*[text()='All Products']")).click();
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	driver.get("https://wheelpros--wpuat.sandbox.my.salesforce.com/0037h00000eFiMb");
//	driver.findElement(By.xpath("//input[@id='emailField']")).sendKeys("rmatavalam@nsight-inc.com.devtest");
//	driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Shashi.1");
	//	driver.findElement(By.xpath("//input[@value='Login']")).click();
//		driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();
//		driver.findElement(By.xpath("//*[@title='Log in to Experience as User']")).click(); //sales force
//		
//		driver.findElement(By.xpath("//button[text()='Continue']")).click(); //alert box
//		driver.findElement(By.xpath("//div[@class='cc_store_logo_img center-block']")).click(); //wheels pro
//		driver.findElement(By.xpath("//a[text()='All Products']")).click(); // link for all products
//		
//		driver.findElement(By.xpath("//a[text()='5LUG 14-1.50 SPLINE BOLT WIK CHR 30MM']//..//..//..//..//button[@role='button']")).click(); // add to cart
//		driver.findElement(By.xpath("//a[@id='cartHeader']/span")).click();
//		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
//		
		
		
		
		
		
		
		
		
	
}
}

