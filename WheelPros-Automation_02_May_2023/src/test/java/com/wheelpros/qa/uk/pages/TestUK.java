package com.wheelpros.qa.uk.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestUK {


	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://wheelpros--wpuat.sandbox.my.site.com/CreditApp/s/n?language=en_GB");
		
		//driver.get("https://wheelpros--preprod.sandbox.my.site.com/CreditApp/s/n?language=en_GB");
		


		driver.findElement(By.xpath("//*[contains(@class, 'company_name_input')]//input")).sendKeys("Kuvalis - Ledner"); //Registered Name*
		driver.findElement(By.xpath("//*[contains(@class, 'company_name_trade_dba')]//input")).sendKeys("Kuvalis - Ledner"); //Trading Name 
		driver.findElement(By.xpath("//*[contains(@class, 'company_name_trade_cn')]//input")).sendKeys("12345567"); // Company Number*

		driver.findElement(By.xpath("//*[contains(@class, 'business_legal_structure_combobox')]")).click();

		driver.findElement(By.xpath("//*[@data-value='Trust']")).click();

		driver.findElement(By.xpath("//*[contains(@class, 'vat')]//input")).sendKeys("12345abcd"); // vat registraion

		driver.findElement(By.xpath("//*[contains(@class, 'year_input')]//input")).sendKeys("2002");  //year
		driver.findElement(By.xpath("//*[contains(@class, 'other_notes')]//input")).sendKeys("Hello");  //other notes

		driver.findElement(By.xpath("//*[contains(@class, 'street_address')]//input")).sendKeys("hyd");  //street adress
		driver.findElement(By.xpath("//*[contains(@class, 'city')]//input")).sendKeys("hyd"); //city 

		driver.findElement(By.xpath("//button[@name='StatesPicklist']")).click();

		driver.findElement(By.xpath("//*[@data-value='ABC']")).click();
		driver.findElement(By.xpath("//*[contains(@class, 'zip_code')]//input")).sendKeys("HD3 3JB"); // postcode 





		try {
			driver.findElement(By.xpath("//input[@value='Yes']")).click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='Yes']"))); //yes
		}


		try {
			driver.findElement(By.xpath("//input[@value='No']")).click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='No']"))); //yes
		}


		WebElement con=driver.findElement(By.xpath("//*[contains(@class,'slds-button slds-button_brand')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", con); 




		//contact page




		driver.findElement(By.xpath("//*[contains(@class, 'sci_first_name')]//input")).sendKeys("Giovanni"); //Firstname

		driver.findElement(By.xpath("//*[contains(@class, 'sci_last_name')]//input")).sendKeys("Hessel"); //Last name

		driver.findElement(By.xpath("//*[contains(@class, 'sci_email')]//input")).sendKeys("Hessel@gmail.com");  //Email

		driver.findElement(By.xpath("//*[contains(@class, 'sci_phone')]//input")).sendKeys("+447975777666"); // Phone#

		//Accounts Payable Contact Information

		driver.findElement(By.xpath("//*[contains(@class, 'cap_first_name')]//input")).sendKeys("Giovanni"); //Firstname

		driver.findElement(By.xpath("//*[contains(@class, 'cap_last_name')]//input")).sendKeys("Hessel"); //Last name

		driver.findElement(By.xpath("//*[contains(@class, 'cap_email')]//input")).sendKeys("Hessel@gmail.com");  //Email

		driver.findElement(By.xpath("//*[contains(@class, 'cap_phone')]//input")).sendKeys("+447975777666"); // Phone#

		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		//driver.findElement(By.xpath("//button[text()='Back']")).click();
		
		
		//credit refrance  

		try {
			driver.findElement(By.xpath("//input[@value='Yes']")).click();
		} catch (Exception e) {
			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='Yes']"))); //yes
		}






		//			try {
		//				driver.findElement(By.xpath("//input[@id='radio-0-111']")).click();
		//			} catch (Exception e) {
		//				JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		//				executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='radio-0-111']"))); //yes
		//			}


		try {
			driver.findElement(By.xpath("//*[contains(@class,'wp_AccNumber_input')]//input")).click();
		} catch (Exception e) {
			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[contains(@class,'wp_AccNumber_input')]//input"))); //yes
		}


		driver.findElement(By.xpath("//*[contains(@class,'wp_AccNumber_input')]//input")).sendKeys("1234567"); //WPacuntnum

		






		// Credit References 1

		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorName')]//input")).sendKeys("Harry"); //Name
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorPhone')]//input")).sendKeys("+447975777666"); //phone
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorEmail')]//input")).sendKeys("harry@gmail.com"); //mail
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorCity')]//input")).sendKeys("New");  //city
		driver.findElement(By.xpath("(//button[@name='StatesPicklist'])[1]")).click(); // Select State
		driver.findElement(By.xpath("//*[@data-value='ABC']")).click();



		// Credit References 2

		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorName')]//input")).sendKeys("Harry"); //Name
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorPhone')]//input")).sendKeys("+447975777666"); //phone
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorEmail')]//input")).sendKeys("harry@gmail.com"); //mail
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorCity')]//input")).sendKeys("New");  //city
		driver.findElement(By.xpath("(//button[@name='StatesPicklist'])[2]")).click(); // Select State
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@data-value='ABC'])[2]")).click(); //to select city



		// Credit References 3

		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorName')]//input")).sendKeys("Harry"); //Name
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorPhone')]//input")).sendKeys("+447975777666"); //phone
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorEmail')]//input")).sendKeys("harry@gmail.com"); //mail
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorCity')]//input")).sendKeys("New");  //city
		driver.findElement(By.xpath("(//button[@name='StatesPicklist'])[3]")).click(); // Select State
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@data-value='ABC'])[3]")).click(); //to select city


		//Owner Information
		//Owner #1

		driver.findElement(By.xpath("//*[contains(@class,'bi_owner1_firstName_input')]//input")).sendKeys("Tom"); // first name
		driver.findElement(By.xpath("//*[contains(@class,'bi_owner1_lastName_input')]//input")).sendKeys("Wills"); // Last name
		driver.findElement(By.xpath("//*[contains(@class,'bi_owner1_phone_input')]//input")).sendKeys("+447975777666"); // Phone
		driver.findElement(By.xpath("//*[contains(@class,'bi_owner1_email_input')]//input")).sendKeys("tom@gmail.com"); // Email

		//Owner #2

		driver.findElement(By.xpath("//*[contains(@class,'bi_owner2_fName_input')]//input")).sendKeys("Tom"); // first name
		driver.findElement(By.xpath("//*[contains(@class,'bi_owner2_lName_input')]//input")).sendKeys("Wills"); // Last name
		driver.findElement(By.xpath("//*[contains(@class,'bi_owner2_phone_input')]//input")).sendKeys("+447975777666"); // Phone
		driver.findElement(By.xpath("//*[contains(@class,'bi_owner2_email_input')]//input")).sendKeys("tom@gmail.com"); // Email

		//Projected Purchases

		driver.findElement(By.xpath("//*[contains(@class,'projected_monthly_purchase')]//input")).sendKeys("150");


		//Sig info
		
		
		
		driver.findElement(By.xpath("//*[contains(@class,'bi_signer_fName')]//input")).sendKeys("Danny");
		driver.findElement(By.xpath("//*[contains(@class,'bi_signer_lName')]//input")).sendKeys("roy"); 
		driver.findElement(By.xpath("//*[contains(@class,'bi_signer_Phone')]//input")).sendKeys("01222111111");
		driver.findElement(By.xpath("//*[contains(@class,'bi_signer_email')]//input")).sendKeys("roy@gmail.com");
		driver.findElement(By.xpath("//*[contains(@class,'bi_signer_street')]//input")).sendKeys("Yeadon Way");
		driver.findElement(By.xpath("//*[contains(@class,'bi_signer_city')]//input")).sendKeys("Blackpool"); 
		
		//chnge needed
		
		driver.findElement(By.xpath("//button[@id='combobox-button-279']")).click(); //Country
		driver.findElement(By.xpath("//*[@id=\'combobox-button-279-0-279\']")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"combobox-button-283\"]")).click(); //region
		driver.findElement(By.xpath("//*[@id=\"combobox-button-283-0-283\"]")).click();
		driver.findElement(By.xpath("//input[@id='input-286']")).sendKeys("FY1 6BF");//PostalCode
		driver.findElement(By.xpath("//*[contains(@class,'bi_signer_signature')]//input")).sendKeys("Shashi");
		driver.findElement(By.xpath("//*[@title='Continue']")).click(); //contijnue 
		//driver.findElement(By.xpath("//button[@title='Back']")).click();  //back
		
		WebElement element2 = driver.findElement(By.xpath("(//input[@name='businessAtResidence'])[1]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element2 );  //Accept
		
//		WebElement element2 = driver.findElement(By.xpath("(//input[@name='businessAtResidence'])[2]"));
//		JavascriptExecutor jsea = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click();", element2 );  //Not Accept
		
		//PG1
		driver.findElement(By.xpath("//*[contains(@class,'pg1_first_name')]//input")).sendKeys("Rony");
		driver.findElement(By.xpath("//*[contains(@class,'pg1_last_name')]//input")).sendKeys("Rom");
		driver.findElement(By.xpath("//*[contains(@class,'pg1_street_address')]//input")).sendKeys("Hill town"); //Streeb
		driver.findElement(By.xpath("//*[contains(@class,'pg1_city')]//input")).sendKeys("LA"); //city
		
		driver.findElement(By.xpath("(//div[contains(@class,'slds-combobox slds-dropdown')])[1]")).click(); //state
		driver.findElement(By.xpath("(//*[contains(@class,'slds-combobox')]//*[@data-value='ABC'])[1]")).click();
		driver.findElement(By.xpath("//*[contains(@class,'pg1_zip_code')]//input")).sendKeys("FY1 6BF"); //Zip code
		driver.findElement(By.xpath("//*[contains(@class,'pg1_sign_input')]//input")).sendKeys("Land"); 
		
		
		//PG2
		driver.findElement(By.xpath("//*[contains(@class,'pg2_first_name')]//input")).sendKeys("Rony");
		driver.findElement(By.xpath("//*[contains(@class,'pg2_last_name')]//input")).sendKeys("Rom");
		driver.findElement(By.xpath("//*[contains(@class,'pg2_street_address')]//input")).sendKeys("Hill town"); //Streeb
		driver.findElement(By.xpath("//*[contains(@class,'pg2_city')]//input")).sendKeys("LA"); //city
		
		driver.findElement(By.xpath("//*[contains(@class,'pg2_zip_code')]//input")).sendKeys("FY1 6BF"); //Zip code
		driver.findElement(By.xpath("//*[contains(@class,'pg2_sign_input')]//input")).sendKeys("Mar"); 
		
       driver.findElement(By.xpath("(//div[contains(@class,'slds-combobox slds-dropdown')])[2]")).click();
       
		driver.findElement(By.xpath("(//*[contains(@class,'slds-combobox')]//*[@data-value='ABC'])[2]")).click();

	}

}
