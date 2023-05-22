package com.wheelpros.qa.us.dealerline.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckoutTest {
	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://wheelpros--wpuat.sandbox.my.site.com/dealerline/ccrz__CCSiteLogin ");
		driver.findElement(By.xpath("//input[@id='emailField']")).sendKeys("eswar.ravi@gmail.com.uat");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Testing123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click(); 
		
		
		//spotlight products
		
		driver.findElement(By.xpath("(//img[@class='spot img-responsive center-block'])[2]")).click();
		WebElement pdpaddtocart=driver.findElement(By.xpath("//input[@id='qty']"));
		pdpaddtocart.clear();
		pdpaddtocart.sendKeys("4");
		
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		driver.findElement(By.xpath("//*[@id='cartHeader']")).click();   //cart heaerd click
		
		driver.findElement(By.xpath("//button[text()='Checkout']")).click(); //Checkout
		
		
		//===right panel============
		
		//quick order
//		driver.findElement(By.xpath("//input[@id='quickorder[0].sku']")).sendKeys("KM67324962730");
//		WebElement qty=driver.findElement(By.xpath("//input[@id='quickorder[0].qty']"));
//		qty.clear();
//		qty.sendKeys("4");
		
//		driver.findElement(By.xpath("//input[@id='quickorder[1].sku']")).sendKeys("KM67324962730");
//		driver.findElement(By.xpath("//input[@id='quickorder[2].sku']")).sendKeys("KM67324962730");
//		
//		driver.findElement(By.xpath("//button[text()='Add More']")).click();
//		driver.findElement(By.xpath("//input[@id='quickorder[3].sku']")).sendKeys("KM67324962730");
	
		//driver.findElement(By.xpath("//button[text()='Add To Cart']")).click();
		
		
		//==========left panel ============
		
		
	//driver.findElement(By.xpath("//*[@id=\"a0K0S0000027ZCSUA2\"]/h5/a[text()='Tires']")).click();  // tires
	//driver.findElement(By.xpath("//*[@id=\"a0K0S0000027ZCUUA2\"]/h5/a[text()='Wheels']")).click();  //wheels
	//driver.findElement(By.xpath("//*[@id='a0K0S0000027ZCTUA2']/h5/a[text()='Accessories']")).click();  //accessiorires 
	//	driver.findElement(By.xpath("//a[text()='All Products']")).click();  all products
		
		
		
		
		//driver.findElement(By.xpath("//img[@alt='HE866 20X8.5 5.5 CHR/G-BLK +10MM']")).click();  // to select product
		//driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();  //to clik on add to cart
	}
	

}

