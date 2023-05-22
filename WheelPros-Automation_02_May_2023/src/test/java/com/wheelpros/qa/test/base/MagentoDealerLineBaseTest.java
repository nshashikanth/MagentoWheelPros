package com.wheelpros.qa.test.base;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.wheelpros.web.utils.EnvConfig;
import com.wheelpros.web.utils.EnvConfigMagento;
import com.wheelpros.web.utils.Report;
import com.wheelpros.web.utils.WebDriverUtil;

public class MagentoDealerLineBaseTest {
	
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
		
	//	driver.get("https://integration-5ojmyuq-22u4azrzj6uew.us-5.magentosite.cloud");
		
		//stagaing sever details 
		
		//is the login link for staging given by sandesh
		//driver.get("https://mc-dealerline-stage.wheelpros.com/us/customer/account/login/");
		
	driver.get("https://mc-dealerline-stage.wheelpros.com/us/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Report.startTest(method.getName(), method.getName(), groups);
		Report.setDriver(driver);

	}

	@AfterMethod(alwaysRun = true)
	public void tearDownDriver(ITestResult result) throws Exception {
		Report.endTest(result);
		driver.quit();
		 Thread.sleep(1000); // 1 second delay
	  
	}
	}
	


