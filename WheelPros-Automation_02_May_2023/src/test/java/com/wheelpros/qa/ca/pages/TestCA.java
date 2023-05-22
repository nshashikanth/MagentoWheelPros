package com.wheelpros.qa.ca.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCA {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://wheelpros--wpuat.sandbox.my.site.com/CreditApp/s/n?language=en_CA");
		
		driver.get("https://wheelpros--preprod.sandbox.my.site.com/CreditApp/s/n?language=en_CA");

		//Company
		driver.findElement(By.xpath("//*[contains(@class, 'company_name_input')]//input")).sendKeys("Gekko & Co");
		driver.findElement(By.xpath("//*[contains(@class, 'company_name_trade_dba')]//input")).sendKeys("Kuvalis - Ledner"); // Trade name
		driver.findElement(By.xpath("//*[contains(@class, 'parent_company')]//input")).sendKeys("Light"); //Parent company  
		driver.findElement(By.xpath("//*[contains(@class, 'business_legal_structure_combobox')]")).click();
		driver.findElement(By.xpath("//*[@data-value='LLC']")).click();
		
		driver.findElement(By.xpath("//*[@name='PlaceOfFormationOfApplication']")).click();
		
		driver.findElement(By.xpath("//*[@data-value='BC']")).click();
		
		
		
		
		driver.findElement(By.xpath("//*[contains(@class, 'pst_input')]//input")).sendKeys("12345"); //pst1
		driver.findElement(By.xpath("//*[contains(@class, 'gst_input')]//input")).sendKeys("6789"); //gst1
		driver.findElement(By.xpath("//*[contains(@class, 'hst_input')]//input")).sendKeys("45678"); //hst1
		driver.findElement(By.xpath("(//label[text()='Tire Recycling#'])[2]//../div/input")).sendKeys("56789"); //trie recycling
		driver.findElement(By.xpath("//*[contains(@class, 'year_input')]//input")).sendKeys("2002");  //year  
		driver.findElement(By.xpath("//*[contains(@class, 'other_notes')]//input")).sendKeys("Helo"); //other notes
		
		
		//adress
		
		driver.findElement(By.xpath("//*[contains(@class, 'street_address')]//input")).sendKeys("hyd");
		driver.findElement(By.xpath("//*[contains(@class, 'city')]//input")).sendKeys("hyd"); //city 
	  	driver.findElement(By.xpath("//button[@name='StatesPicklist']")).click();
	  	Thread.sleep(2000);
	  	
	  	
//	  	WebElement sel=driver.findElement(By.xpath("(//*[@data-value=\"NL\"])[1]"));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", sel);   
	  	
	  	WebElement sel=driver.findElement(By.xpath("//*[@id=\"combobox-button-32-0-32\"]"));
	  	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", sel); 
		
	  	
	  	
	  	driver.findElement(By.xpath("//*[contains(@class, 'zip_code')]//input")).sendKeys("P0A 1J0");
	  	
	 
	  	
	  	try {
			driver.findElement(By.xpath("//input[@value='Yes']")).click();
		} catch (Exception e) {
			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
			executor1.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='Yes']"))); //yes
		}
//	  	
//	  	try {
//			driver.findElement(By.xpath("//input[@value='No']")).click();
//		} catch (Exception e) {
//			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
//			executor2.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='No']"))); //yes
//		}
//		
		
	  	WebElement con=driver.findElement(By.xpath("//*[contains(@class,'slds-button slds-button_brand')]"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", con); 
		
		
		//contact page for CA
		
		
		
		
		
driver.findElement(By.xpath("//*[contains(@class, 'sci_first_name')]//input")).sendKeys("Giovanni"); //Firstname
		
		driver.findElement(By.xpath("//*[contains(@class, 'sci_last_name')]//input")).sendKeys("Hessel"); //Last name
		
		driver.findElement(By.xpath("//*[contains(@class, 'sci_email')]//input")).sendKeys("Hessel@gmail.com");  //Email
		
		driver.findElement(By.xpath("//*[contains(@class, 'sci_phone')]//input")).sendKeys("1111111111"); // Phone#
		
		//Accounts Payable Contact Information
		
		driver.findElement(By.xpath("//*[contains(@class, 'cap_first_name')]//input")).sendKeys("Giovanni"); //Firstname
		
		driver.findElement(By.xpath("//*[contains(@class, 'cap_last_name')]//input")).sendKeys("Hessel"); //Last name
		
		driver.findElement(By.xpath("//*[contains(@class, 'cap_email')]//input")).sendKeys("Hessel@gmail.com");  //Email
		
		driver.findElement(By.xpath("//*[contains(@class, 'cap_phone')]//input")).sendKeys("1111111111"); // Phone#
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		//Credit terms page
		
		
		try {
			driver.findElement(By.xpath("//input[@value='Yes']")).click();
		} catch (Exception e) {
			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='Yes']"))); //yes
		}
		
		
//		try {
//			driver.findElement(By.xpath("//input[@value='No']")).click();
//		} catch (Exception e) {
//			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='No']"))); //yes
//		}
		
		
		
driver.findElement(By.xpath("//*[contains(@class,'wp_AccNumber_input')]//input")).sendKeys("1234567"); //WPacuntnum
		
		WebElement element = driver.findElement(By.xpath("//span[text()='I HAVE READ AND AGREE TO American Racing Equipment CREDIT TERMS AND CONDITIONS.']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element );
		
		
		
	driver.findElement(By.xpath("//*[contains(@class,'bi_bank_name_input')]//input")).sendKeys("HDFC"); //BankNme;
		
		
		driver.findElement(By.xpath("//*[contains(@class,'bi_bank_accNumber_input')]//input")).sendKeys("12345678"); //AccountNumber
		
		driver.findElement(By.xpath("//*[contains(@class,'bi_bank_city_input')]//input")).sendKeys("Huntsville"); //City
		
		
		
		
		driver.findElement(By.xpath("(//button[@name='StatesPicklist'])[1]")).click(); //state and city;
		
		driver.findElement(By.xpath("//*[@data-value='AB']")).click(); // province
		
		
		
		// Credit References 1  
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorName')]//input")).sendKeys("Harry"); //Name
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorPhone')]//input")).sendKeys("1111111111"); //phone
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorEmail')]//input")).sendKeys("harry@gmail.com"); //mail
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorCity')]//input")).sendKeys("New");  //city
		driver.findElement(By.xpath("(//button[@name='StatesPicklist'])[2]")).click(); // Select Province
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorState_input')]//*[@data-value='AB']")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"combobox-button-131-0-131\"]")).click();
		
		
		
		// Credit References 2
		
				driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorName')]//input")).sendKeys("Harry"); //Name
				driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorPhone')]//input")).sendKeys("1111111111"); //phone
				driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorEmail')]//input")).sendKeys("harry@gmail.com"); //mail
				driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorCity')]//input")).sendKeys("New");  //city
				driver.findElement(By.xpath("(//button[@name='StatesPicklist'])[3]")).click(); // Select Province
				driver.findElement(By.xpath("//*[@id=\"combobox-button-123-0-123\"]")).click(); //to select city
				
				
				// Credit References 3
				
				driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorName')]//input")).sendKeys("Harry"); //Name
				driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorPhone')]//input")).sendKeys("1111111111"); //phone
				driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorEmail')]//input")).sendKeys("harry@gmail.com"); //mail
				driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorCity')]//input")).sendKeys("New");  //city
				driver.findElement(By.xpath("(//button[@name='StatesPicklist'])[4]")).click(); // Select Province
				driver.findElement(By.xpath("//*[@id=\"combobox-button-115-1-115\"]")).click(); //to select city
				
				
				//Owner Information
				//Owner #1
				
				driver.findElement(By.xpath("//*[contains(@class,'bi_owner1_firstName_input')]//input")).sendKeys("Tom"); // first name
				driver.findElement(By.xpath("//*[contains(@class,'bi_owner1_lastName_input')]//input")).sendKeys("Wills"); // Last name
				driver.findElement(By.xpath("//*[contains(@class,'bi_owner1_phone_input')]//input")).sendKeys("1111111112"); // Phone
				driver.findElement(By.xpath("//*[contains(@class,'bi_owner1_email_input')]//input")).sendKeys("tom@gmail.com"); // Email
				
				//Owner #2
				
				driver.findElement(By.xpath("//*[contains(@class,'bi_owner2_fName_input')]//input")).sendKeys("Tom"); // first name
				driver.findElement(By.xpath("//*[contains(@class,'bi_owner2_lName_input')]//input")).sendKeys("Wills"); // Last name
				driver.findElement(By.xpath("//*[contains(@class,'bi_owner2_phone_input')]//input")).sendKeys("1111111112"); // Phone
				driver.findElement(By.xpath("//*[contains(@class,'bi_owner2_email_input')]//input")).sendKeys("tom@gmail.com"); // Email
		
				//Projected Purchases
				
				driver.findElement(By.xpath("//*[contains(@class,'projected_monthly_purchase')]//input")).sendKeys("150");
				
				
				//Sig info
				

				driver.findElement(By.xpath("//*[contains(@class,'bi_signer_fName')]//input")).sendKeys("Danny"); //FirstNAme;
				driver.findElement(By.xpath("//*[contains(@class,'bi_signer_lName')]//input")).sendKeys("roy"); //FirstNAme;
				driver.findElement(By.xpath("//*[contains(@class,'bi_signer_Phone')]//input")).sendKeys("1111111111"); // phone
				driver.findElement(By.xpath("//*[contains(@class,'bi_signer_email')]//input")).sendKeys("roy@gmail.com"); // mail
				
				driver.findElement(By.xpath("//*[contains(@class,'bi_signer_street')]//input")).sendKeys("Toy Road"); //street
				driver.findElement(By.xpath("//*[contains(@class,'bi_signer_city')]//input")).sendKeys("New York"); // City
				driver.findElement(By.xpath("(//button[@name='StatesPicklist'])[5]")).click(); // Select State
				

				driver.findElement(By.xpath("//*[@id=\"combobox-button-96-2-96\"]")).click();
				driver.findElement(By.xpath("//*[contains(@class,'bi_signer_zipCode')]//input")).sendKeys("P0A 1J0\""); //Zipcode
				driver.findElement(By.xpath("//*[contains(@class,'bi_signer_signature')]//input")).sendKeys("Shashi");
				driver.findElement(By.xpath("//*[@title='Continue']")).click();
				
				//driver.findElement(By.xpath("//button[@title='Back']")).click();
				

				//driver.findElement(By.xpath("/span[text()='I ACKNOWLEDGE AND AUTHORIZE THE CONTINUING PERSONAL GUARANTEE.']"));
				
				//driver.findElement(By.xpath("(//input[@name='businessAtResidence'])[1]")).click();
				
				
			WebElement element2 = driver.findElement(By.xpath("(//input[@name='businessAtResidence'])[1]"));
				JavascriptExecutor jsea = (JavascriptExecutor)driver;
				jse.executeScript("arguments[0].click();", element2 );  //Accept
				
				
//				WebElement element2 = driver.findElement(By.xpath("(//input[@name='businessAtResidence'])[2]"));
//				JavascriptExecutor jsea = (JavascriptExecutor)driver;
//				jse.executeScript("arguments[0].click();", element2 );  //Not Accept
//				
//				
				
				//PG1
				driver.findElement(By.xpath("//*[contains(@class,'pg1_first_name')]//input")).sendKeys("Rony");
				driver.findElement(By.xpath("//*[contains(@class,'pg1_last_name')]//input")).sendKeys("Rom");
				driver.findElement(By.xpath("//*[contains(@class,'pg1_street_address')]//input")).sendKeys("Hill town"); //Streeb
				driver.findElement(By.xpath("//*[contains(@class,'pg1_city')]//input")).sendKeys("LA"); //city
				
				driver.findElement(By.xpath("(//div[contains(@class,'slds-combobox slds-dropdown')])[1]")).click(); //state
				
				driver.findElement(By.xpath("(//*[contains(@class,'slds-combobox')]//*[@data-value='MB'])[1]")).click();
				
				
				
				driver.findElement(By.xpath("//*[contains(@class,'pg1_zip_code')]//input")).sendKeys("P0A 1J0"); //Zip code
				driver.findElement(By.xpath("//*[contains(@class,'pg1_ssn')]//input")).sendKeys("111111111");  //ssn
				driver.findElement(By.xpath("//*[contains(@class,'pg1_sign_input')]//input")).sendKeys("Land"); 
				
				//PG2
				driver.findElement(By.xpath("//*[contains(@class,'pg2_first_name')]//input")).sendKeys("Rony");
				driver.findElement(By.xpath("//*[contains(@class,'pg2_last_name')]//input")).sendKeys("Rom");
				driver.findElement(By.xpath("//*[contains(@class,'pg2_street_address')]//input")).sendKeys("Hill town"); //Streeb
				driver.findElement(By.xpath("//*[contains(@class,'pg2_city')]//input")).sendKeys("LA"); //city
			//	driver.findElement(By.xpath("//*[contains(@class,'pg2_state_combobox')]//button")).click(); //state pending
				
				driver.findElement(By.xpath("//*[contains(@class,'pg2_zip_code')]//input")).sendKeys("P0A 1J0"); //Zip code
				driver.findElement(By.xpath("//*[contains(@class,'pg2_ssn')]//input")).sendKeys("111111111");  //ssn
				driver.findElement(By.xpath("//*[contains(@class,'pg2_sign_input')]//input")).sendKeys("Mar"); 
				
		       driver.findElement(By.xpath("(//div[contains(@class,'slds-combobox slds-dropdown')])[2]")).click();
		       
				driver.findElement(By.xpath("(//*[contains(@class,'slds-combobox')]//*[@data-value='MB'])[2]")).click();
				
				
				//driver.findElement(By.xpath("//button[text()='Back']")).click();
				
				//driver.findElement(By.xpath("//button[text()='Close']")).click();
			} 

}

