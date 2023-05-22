package com.wheelpros.qa.us.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://wheelpros--wpuat.sandbox.my.site.com/CreditApp/s/n?language=en_US");
		
	driver.findElement(By.xpath("//*[contains(@class, 'company_name_input')]//input")).sendKeys("Kuvalis - Ledner"); //company name
		driver.findElement(By.xpath("//*[contains(@class, 'company_name_trade_dba')]//input")).sendKeys("Kuvalis - Ledner"); // Trade name
		
		
		driver.findElement(By.xpath("//*[contains(@class, 'business_legal_structure_combobox')]")).click();
		
		driver.findElement(By.xpath("//*[@data-value='LLP']")).click();
		
		
		driver.findElement(By.xpath("//*[contains(@class, 'federal_identification_number')]//input")).sendKeys("11-1111111");
		driver.findElement(By.xpath("//*[contains(@class, 'year_input')]//input")).sendKeys("2002");  //year
		driver.findElement(By.xpath("//*[contains(@class, 'other_notes')]//input")).sendKeys("Hello");  //other notes
		
		driver.findElement(By.xpath("//input[contains(@class, 'slds-file-selector__input' )]")).sendKeys("C:\\Users\\Shashi\\Desktop\\test.jpg");
		Thread.sleep(5000);
       driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button--neutral')]")).click();	
//		driver.findElement(By.xpath("//*[contains(@class, 'slds-file-selector__button')]")).click();
//		String title = driver.getTitle(); System.out.println(title);
//		Robot rb = new Robot();
//		StringSelection str = new StringSelection("C:\\Users\\Shashi\\Desktop\\test.jpg");
//		
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//	    
//	    rb.keyPress(KeyEvent.VK_CONTROL);
//	     rb.keyPress(KeyEvent.VK_V);
//	     rb.delay(2000);
//	     
//	     rb.keyRelease(KeyEvent.VK_CONTROL);
//	     rb.keyRelease(KeyEvent.VK_V);
//	     rb.delay(2000);
//	     
//	     rb.keyPress(KeyEvent.VK_ENTER);
//	     rb.keyRelease(KeyEvent.VK_ENTER);
//	     rb.delay(2000);
//	     driver.getWindowHandle();
//	     
//	     Thread.sleep(5000);
//	    // driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral ok uiButton--default uiButton--brand uiButton']")).click();
//	     
	     // driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button--icon')]")).click();
	     
	      Thread.sleep(5000);
	      driver.findElement(By.xpath("//*[contains(@class, 'street_address')]//input")).sendKeys("hyd");  //street adress
	  	driver.findElement(By.xpath("//*[contains(@class, 'city')]//input")).sendKeys("hyd"); //city 
	  	
	  	driver.findElement(By.xpath("//button[@name='StatesPicklist']")).click();
	  	
	  	driver.findElement(By.xpath("//*[@data-value='AK']")).click();
	  	driver.findElement(By.xpath("//*[contains(@class, 'zip_code')]//input")).sendKeys("95340");
	  	
	  	
	  	
	  	
	  	
	  	
	  	
		try {
			driver.findElement(By.xpath("//input[@id='radio-0-28']")).click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='radio-0-28']"))); //yes
		}
		
		
		WebElement con=driver.findElement(By.xpath("//*[contains(@class,'slds-button slds-button_brand')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", con); 
		
		//driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand no-border-radius slds-var-p-horizontal_xx-large slds-var-p-vertical_small nav-button']")).click();
		
		WebElement chk=driver.findElement(By.xpath("//div[@class='slds-text-heading_large slds-var-m-top_xx-large slds-clearfix formTitle']"));
		System.out.println(chk.getText());
		
		
		//contact
		
		//Sales Contact Information
		
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
		//driver.findElement(By.xpath("//button[text()='Back']")).click();
		
		
		
		//Credit terms page
		
		//driver.findElement(By.xpath("//input[@value='No']")).click();
		
		try {
		driver.findElement(By.xpath("//input[@value='Yes']")).click();
	} catch (Exception e) {
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='Yes']"))); //yes
	}
	
		
		
		
		
		
//		try {
//			driver.findElement(By.xpath("//input[@id='radio-0-111']")).click();
//		} catch (Exception e) {
//			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='radio-0-111']"))); //yes
//		}
		
		
		try {
			driver.findElement(By.xpath("//*[contains(@class,'wp_AccNumber_input')]//input")).click();
		} catch (Exception e) {
			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[contains(@class,'wp_AccNumber_input')]//input"))); //yes
		}
		
		
		driver.findElement(By.xpath("//*[contains(@class,'wp_AccNumber_input')]//input")).sendKeys("1234567"); //WPacuntnum
		
		WebElement element = driver.findElement(By.xpath("//span[text()='I HAVE READ AND AGREE TO WHEEL PROS’ CREDIT TERMS AND CONDITIONS.']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element );
		
		
		
		
		//driver.findElement(By.xpath("//span[text()='I HAVE READ AND AGREE TO WHEEL PROS’ CREDIT TERMS AND CONDITIONS.']")).click(); //check box
		
		
		
		//Bank Information
		
		driver.findElement(By.xpath("//*[contains(@class,'bi_bank_name_input')]//input")).sendKeys("HDFC"); //BankNme;
		
		
	driver.findElement(By.xpath("//*[contains(@class,'bi_bank_accNumber_input')]//input")).sendKeys("12345678"); //AccountNumber
	
	driver.findElement(By.xpath("//*[contains(@class,'bi_bank_city_input')]//input")).sendKeys("Huntsville"); //City
	
	
	
	
	driver.findElement(By.xpath("(//button[@name='StatesPicklist'])[1]")).click(); //state and city;
	
	driver.findElement(By.xpath("//*[@data-value='AL']")).click(); // state
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Credit References 1
	
	driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorName')]//input")).sendKeys("Harry"); //Name
	driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorPhone')]//input")).sendKeys("1111111111"); //phone
	driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorEmail')]//input")).sendKeys("harry@gmail.com"); //mail
	driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc1_vendorCity')]//input")).sendKeys("New");  //city
	driver.findElement(By.xpath("(//button[@name='StatesPicklist'])[2]")).click(); // Select State
	driver.findElement(By.xpath("//*[@id='combobox-button-156-0-156']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	// Credit References 2
	
			driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorName')]//input")).sendKeys("Harry"); //Name
			driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorPhone')]//input")).sendKeys("1111111111"); //phone
			driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorEmail')]//input")).sendKeys("harry@gmail.com"); //mail
			driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc2_vendorCity')]//input")).sendKeys("New");  //city
			driver.findElement(By.xpath("(//button[@name='StatesPicklist'])[3]")).click(); // Select State
			driver.findElement(By.xpath("//*[@id=\"combobox-button-148-1-148\"]")).click(); //to select city
	
	
	 
	

	
	// Credit References 3
	
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorName')]//input")).sendKeys("Harry"); //Name
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorPhone')]//input")).sendKeys("1111111111"); //phone
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorEmail')]//input")).sendKeys("harry@gmail.com"); //mail
		driver.findElement(By.xpath("//*[contains(@class,'bi_crdtRfrnc3_vendorCity')]//input")).sendKeys("New");  //city
		driver.findElement(By.xpath("(//button[@name='StatesPicklist'])[4]")).click(); // Select State
		driver.findElement(By.xpath("//*[@id='combobox-button-140-3-140']")).click(); //to select city
		
		
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
		
		driver.findElement(By.xpath("//*[@id='combobox-button-121-0-121']")).click();
		driver.findElement(By.xpath("//*[contains(@class,'bi_signer_zipCode')]//input")).sendKeys("95340"); //Zipcode
		
		WebElement sign=driver.findElement(By.xpath("//*[contains(@class,'bi_signer_signature')]//input"));
		
				sign.sendKeys("Shashi");
				 String val = sign.getAttribute("value");
				 System.out.println(val);
				
				Assert.assertEquals(sign.getAttribute("value"), "Shashi");
				
//				//Asert for signature
//				
//				 String val1 = sign.getAttribute("value");
//				 System.out.println("signature is " +val1);
//				 
				
				
			//	Assert.assertEquals(sign.getAttribute("value"), "");
				
		
		//driver.findElement(By.xpath("//*[contains(@class,'bi_signer_signature')]//input")).getAttribute(title);
		
		
	driver.findElement(By.xpath("//*[@title='Continue']")).click(); //contijnue 
		//driver.findElement(By.xpath("//button[@title='Back']")).click();  //back
		
		//Personal Guarantee 
	
	driver.findElement(By.xpath("//button[@title='Back']")).click();
	
		
		
		
		//driver.findElement(By.xpath("/span[text()='I ACKNOWLEDGE AND AUTHORIZE THE CONTINUING PERSONAL GUARANTEE.']"));
		
		//driver.findElement(By.xpath("(//input[@name='businessAtResidence'])[1]")).click();
		
		
		WebElement element2 = driver.findElement(By.xpath("(//input[@name='businessAtResidence'])[1]"));
		JavascriptExecutor jsea = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element2 );  //Accept
		
		
//		WebElement element2 = driver.findElement(By.xpath("(//input[@name='businessAtResidence'])[2]"));
//		JavascriptExecutor jsea = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click();", element2 );  //Not Accept
//		
//		
		
		//PG1
		driver.findElement(By.xpath("//*[contains(@class,'pg1_first_name')]//input")).sendKeys("Rony");
		driver.findElement(By.xpath("//*[contains(@class,'pg1_last_name')]//input")).sendKeys("Rom");
		driver.findElement(By.xpath("//*[contains(@class,'pg1_street_address')]//input")).sendKeys("Hill town"); //Streeb
		driver.findElement(By.xpath("//*[contains(@class,'pg1_city')]//input")).sendKeys("LA"); //city
		driver.findElement(By.xpath("(//div[contains(@class,'slds-combobox slds-dropdown')])[1]")).click(); //state
		driver.findElement(By.xpath("(//*[contains(@class,'slds-combobox')]//*[@data-value='AK'])[1]")).click();
		
		driver.findElement(By.xpath("//*[contains(@class,'pg1_zip_code')]//input")).sendKeys("95340"); //Zip code
		driver.findElement(By.xpath("//*[contains(@class,'pg1_ssn')]//input")).sendKeys("111111111");  //ssn
		driver.findElement(By.xpath("//*[contains(@class,'pg1_sign_input')]//input")).sendKeys("Land"); 
		
		//PG2
		driver.findElement(By.xpath("//*[contains(@class,'pg2_first_name')]//input")).sendKeys("Rony");
		driver.findElement(By.xpath("//*[contains(@class,'pg2_last_name')]//input")).sendKeys("Rom");
		driver.findElement(By.xpath("//*[contains(@class,'pg2_street_address')]//input")).sendKeys("Hill town"); //Streeb
		driver.findElement(By.xpath("//*[contains(@class,'pg2_city')]//input")).sendKeys("LA"); //city
	//	driver.findElement(By.xpath("//*[contains(@class,'pg2_state_combobox')]//button")).click(); //state pending
		
		driver.findElement(By.xpath("//*[contains(@class,'pg2_zip_code')]//input")).sendKeys("95340"); //Zip code
		driver.findElement(By.xpath("//*[contains(@class,'pg2_ssn')]//input")).sendKeys("111111111");  //ssn
		driver.findElement(By.xpath("//*[contains(@class,'pg2_sign_input')]//input")).sendKeys("Mar"); 
		
       driver.findElement(By.xpath("(//div[contains(@class,'slds-combobox slds-dropdown')])[2]")).click();
       
		driver.findElement(By.xpath("(//*[contains(@class,'slds-combobox')]//*[@data-value='AK'])[2]")).click();
		
		
		//driver.findElement(By.xpath("//button[text()='Back']")).click();
		
		//driver.findElement(By.xpath("//button[text()='Close']")).click();
		

	 
	}
	
}

	     

	     
	     
	     
	     
				

