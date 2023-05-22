package com.wheelpros.qa.test.base;

	import java.lang.reflect.Method;
	import java.time.Duration;
	import org.openqa.selenium.WebDriver;
	import org.testng.ITestResult;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;
	import com.wheelpros.web.utils.EnvConfig;
	import com.wheelpros.web.utils.Report;
	import com.wheelpros.web.utils.WebDriverUtil;
	public class HeroKuAppBaseTest {

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
			
			driver.get("http://the-internet.herokuapp.com/");

			
			

			
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Report.startTest(method.getName(), method.getName(), groups);
			Report.setDriver(driver);

		}

		@AfterMethod(alwaysRun = true)
		public void tearDownDriver(ITestResult result) {
			
			Report.endTest(result);
			//driver.quit();
		}

		
	}

