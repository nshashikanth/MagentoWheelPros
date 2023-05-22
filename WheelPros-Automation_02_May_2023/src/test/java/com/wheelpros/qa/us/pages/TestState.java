package com.wheelpros.qa.us.pages;

	import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





	public class TestState {
		public static void main(String[] args) throws Exception {

			System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://wheelpros--preprod.sandbox.my.site.com/CreditApp/s/?language=en_US");
			
			
		 driver.findElement(By.xpath("//*[@name='StatesPicklist']")).click();
			WebElement stateDropdown = driver.findElement(By.id("(//*[@role='listbox'])[1]"));

			Select select = new Select(stateDropdown);
	        
	        List<WebElement> options = select.getOptions();

	        
	        for (WebElement option : options) {
	            System.out.println(option.getText());
	            
	            driver.quit();
	        }
			
			
		}
	}

	       
	    

