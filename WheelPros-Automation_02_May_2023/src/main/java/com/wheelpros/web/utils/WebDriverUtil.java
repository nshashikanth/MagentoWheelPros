package com.wheelpros.web.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtil {

	private WebDriver driver;
	
	
	public WebDriver initiateWebDriver(String browserName) {
		switch(browserName.toLowerCase()) {
		case "chrome":
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--remote-allow-origins=*");
			 options.addArguments("--disable-notifications");
			 options.addArguments("--start-maximized");
			 driver = new ChromeDriver(options);
			break;
		case "edge":
			//WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
			break;
			default:
				throw new RuntimeException("browser name is not valid");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://wheelpros--wpuat.sandbox.my.site.com/CreditApp/s/n?language=en_CA");
		return driver;	
	}
	public WebDriver getDriver() {
		return driver;	
	}
	
}
