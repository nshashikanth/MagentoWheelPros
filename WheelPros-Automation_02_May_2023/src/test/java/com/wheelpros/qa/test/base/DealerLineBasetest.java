package com.wheelpros.qa.test.base;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.wheelpros.web.utils.EnvConfig;
import com.wheelpros.web.utils.Report;
import com.wheelpros.web.utils.WebDriverUtil;

public class DealerLineBasetest{



	protected WebDriver driver;

	@BeforeSuite(alwaysRun = true)
	public void preparingTestEnv() {
		EnvConfig.loadConfigFile();
		Report.startReport();
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeTestCase(Method method) {
		Test test = method.getDeclaredAnnotation(Test.class);
		String[] groups = test.groups();

		WebDriverUtil util = new WebDriverUtil();
		driver = util.initiateWebDriver(EnvConfig.getProperty("browser"));	
		//driver = util.initiateWebDriver("edge");
		
		
		//uat login
//		driver.get("https://wheelpros--wpuat.sandbox.my.site.com/dealerline/ccrz__CCSiteLogin ");
//		driver.findElement(By.xpath("//input[@id='emailField']")).sendKeys("eswar.ravi@gmail.com.uat");
//		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Testing123");
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//pre prod login
		
		driver.get("https://wheelpros--preprod.sandbox.my.site.com/dealerline/ccrz__CCSiteLogin");
		driver.findElement(By.xpath("//input[@id='emailField']")).sendKeys("test@gmail.compreprod");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Nsight@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//driver.findElement(By.xpath("//button[text()='Continue']")).click();   //to click on contiune
		
		
		//=============loign using sandbox========================
		
//		driver.get("https://wheelpros--preprod.sandbox.lightning.force.com/lightning/r/Contact/00374000008yuMVAAY/view");
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shashikanthn@nsight-inc.com.preprod"); // usernmae
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(" Pre-Prod1");  //password
//		driver.findElement(By.xpath("//input[@id='Login']")).click();   // login click
//		driver.findElement(By.xpath("//li[contains(@class, 'slds-dropdown-trigger slds-dropdown-trigger_click')]")).click(); // SFDC list
//		driver.findElement(By.xpath("//*[@title='Log in to Experience as User']")).click(); //login as exp user
//		driver.findElement(By.xpath("//button[text()='Continue']")).click();   //to click on contiune
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Report.startTest(method.getName(), method.getName(), groups);
		Report.setDriver(driver);

	}

	@AfterMethod(alwaysRun = true)
	public void tearDownDriver(ITestResult result) {
		
		Report.endTest(result);
		driver.quit();
	}

	
}
