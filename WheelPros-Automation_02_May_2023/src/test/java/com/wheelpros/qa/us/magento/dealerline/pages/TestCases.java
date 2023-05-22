package com.wheelpros.qa.us.magento.dealerline.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wheelpros.web.utils.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
	

	public static void main(String[] args) throws Exception {

		//WebDriverManager.chromedriver().setup();
		
		//WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shashi\\Desktop\\shashi\\chromedriver_win32\\chromedriver.exe" );
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");
		 options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://integration-5ojmyuq-22u4azrzj6uew.us-5.magentosite.cloud");
		driver.findElement(By.name("login[username]")).sendKeys("ckumar@nsight-inc.com");
		driver.findElement(By.name("login[password]")).sendKeys("Kumar@1234");
		driver.findElement(By.xpath("//button[@type='submit']//span[text()='Log In']")).submit();
		driver.findElement(By.xpath("//div[@class='minicart-wrapper']")).click();
		
	// List<WebElement> qty=driver.findElements("//ol[@id='mini-cart']/li//input");
		 WebElement test;
		
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		test = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mini-cart\"]/li[1]/div/div/div[3]/div[1]/span[1]/span/span/span")));
		
		
	System.out.println(test.getText());
	driver.close();




		
	}
	
	
	

}
