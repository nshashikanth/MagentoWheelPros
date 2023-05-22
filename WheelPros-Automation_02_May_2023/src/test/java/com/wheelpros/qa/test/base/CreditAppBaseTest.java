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
import com.wheelpros.web.utils.Report;
import com.wheelpros.web.utils.WebDriverUtil;

public class CreditAppBaseTest {

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
		
		
		String env = EnvConfig.getProperty("env");
		String url = null;
		if(Arrays.asList(groups).contains("uk")) {
			url = EnvConfig.getProperty(env+"_uk_url");
		}else if(Arrays.asList(groups).contains("us")) {
			url = EnvConfig.getProperty(env+"_us_url");
		}else if(Arrays.asList(groups).contains("ca")) {
			url = EnvConfig.getProperty(env+"_ca_url");
		}
		else {
			throw new RuntimeException("country is not defined for test case");
		}
		WebDriverUtil util = new WebDriverUtil();
		driver = util.initiateWebDriver(EnvConfig.getProperty("browser"));	
		//driver = util.initiateWebDriver("edge");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[1]/span[1]/a/img")).click(); // for canada
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[1]/span[2]/a")).click(); // for UK
		Report.startTest(method.getName(), method.getName(), groups);
		Report.setDriver(driver);

	}

	@AfterMethod(alwaysRun = true)
	public void tearDownDriver(ITestResult result) {
		
		Report.endTest(result);
		driver.quit();
	}
}
