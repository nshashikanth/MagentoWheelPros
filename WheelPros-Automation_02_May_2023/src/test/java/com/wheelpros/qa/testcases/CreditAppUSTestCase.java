package com.wheelpros.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wheelpros.qa.test.base.CreditAppBaseTest;
import com.wheelpros.qa.testflows.NewCreditAppFlows;
import com.wheelpros.qa.us.pages.CompanyPage;
import com.wheelpros.qa.us.pages.ContactPage;
import com.wheelpros.qa.us.pages.CreditTermsPage;
import com.wheelpros.qa.us.pages.PersonalGuaranteePage;


public class CreditAppUSTestCase extends CreditAppBaseTest {

	@Test(groups = {"us"})	
	public void dealerEnrollmentTest() throws Exception {
		CompanyPage cmpny=new CompanyPage(driver);
		Assert.assertEquals("Company", cmpny.getPageHeader());
		cmpny.enterCompanyName("test 79409 zip code");
		cmpny.enterCompanyNameTrade("test");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLP");
		cmpny.enterFederalEmployerIdentificationNumber("11-1200111");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		//cmpny.enterOtherNotes("checkin email template for customer");
		cmpny.uploadSalesTaxorBusinessLicense(System.getProperty("user.dir")+"\\src\\test\\resources\\filesToUpload\\test.jpg");
		cmpny.clickSalesTaxorBusinessLicense();
		cmpny.enterStreetAddress("Main lane1");
		cmpny.enterCity("New Yrk");
		
		cmpny.selectOptionFromStateDropDown("AK");
		cmpny.enterZipCode("79409");
		cmpny.clickYes();
		cmpny.clickContinue();	

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("test 79409 zipcode");
		cont.enterLastName("usa");
		cont.enterEmailAddress("s@g.com");
		cont.enterPhone("1111111221");
		cont.enterAPFirstName("shashi");
		cont.enterAPLastName("kanth");
		cont.enterAPEmailAddress("a@g.com");
		cont.enterAPPhone("1001441111");
		cont.clickContinue();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.enterSevenDigitWheelProsAccountNumber("Texas");
		credit.clickTermsCondition();
		credit.takeScreenShot("credit.png");
		credit.enterBankName("HSBC");

		credit.enterBankAccountNumberr("274881280093");
		credit.enterCity("New");
		credit.selectOptionFromStateDropDown("AL");

		credit.enterCR1VendorName("Rock");
		credit.enterCR1Phone("1111441111");	
		credit.enterCR1Emailaddress("abcd@gmail.com");
		credit.enterCR1City("New");
		credit.selectOptionFromCR1StateDropDown("AZ");

		//CRef 2
		credit.enterCR2VendorName("Danny");
		credit.enterCR2Phone("1114411111");
		credit.enterCR2Emailaddress("abc5@gmail.com");
		credit.enterCR2City("New5");
		credit.selectOptionFromCR2StateDropDown("AZ");


		//Cref 3
		credit.enterCR3VendorName("Jack");
		credit.enterCR3Phone("1111551111");
		credit.enterCR3Emailaddress("abc5@gmail.com");
		credit.enterCR3City("New");
		credit.selectOptionFromCR3StateDropDown("AZ");


		//Owner info 1
		credit.enterOwner1FirstName("Rain5");
		credit.enterOwner1LastName("Roy5");
		//credit.enterOwner1Phone("Roy5");
		credit.enterOwner1Phone("1155111111");
		credit.enterOwner1Emailaddress("xyz@gmail.com");

		//Owner info 2
		credit.enterOwner2FirstName("Rain5");
		credit.enterOwner2LastName("Rain5");
		credit.enterOwner2Phone("1111155111");
		credit.enterOwner2Emailaddress("xyz5@gmail.com");
		credit.enterProjectedMonthlyPurchaseTotal("15500");

		//Siganture

		credit.enterSInfoFirstName("Dany5");
		credit.enterSInfoLastName("Paul5");
		credit.enterSInfoPhone("1111215511");
		credit.enterSInfoEmailAddress("paul5@gmail.com");
		credit.enterSInfoStreetAddress("Hi5street");
		credit.enterSInfoCity("MainLand5");
		credit.selectOptionFromSIinfoStateDropDown("AL");
		credit.enterSInfoZipCode("79382");
		credit.enterSInfoSignature("Xavier");

		credit.clickContinue();

		//Personal Guarantee

		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);

		//Assert.assertEquals("Personal Guarantee", cont.getPageHeader());
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		guarantee.takeScreenShot("personal.png");
		guarantee.enterGuarantor1FirstName("Max5");
		guarantee.enterGuarantor1LastName("David5");
		guarantee.enterPg1StreetAddress("land5");
		guarantee.enterPg1City("Nox5");
		guarantee.staticThreadWait(5);
		guarantee.selectOptionFromPg1StateDropDown("AR");
		guarantee.enterPg1ZipCode("79382");
		guarantee.enterPg1SSN("111551111");
		guarantee.enterPg1Signature("Shany5");

		//pg2
		guarantee.enterGuarantor2FirstName("Max5");
		guarantee.enterGuarantor2LastName("David5");
		guarantee.enterPg2StreetAddress("land5");
		guarantee.enterPg2City("Nox5");
		guarantee.selectOptionFromPg2StateDropDown();
		guarantee.enterPg2ZipCode("79382");
		guarantee.enterPg2SSN("111551111");
		guarantee.enterPg2Signature("Shany5");
		//guarantee.clickSubmit(); 
	}

	
	@Test(groups = {"us"})	
	public void testBilling() {

		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("LS Harness Connection");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterFederalEmployerIdentificationNumber("11-12003353");
		cmpny.enterYearEstablishedByCurrentOwnership("2020");
		cmpny.uploadSalesTaxorBusinessLicense(System.getProperty("user.dir")+"\\src\\test\\resources\\filesToUpload\\test.jpg");
		cmpny.clickSalesTaxorBusinessLicense();
		cmpny.enterStreetAddress("8101 Boat Club Road, Ste 240");
		cmpny.enterCity("Fort Worth");
		
		cmpny.selectOptionFromStateDropDown("TX");
		//cmpny.enterZipCode("95340");
		cmpny.enterZipCode("76179");
		cmpny.clickNo();
		cmpny.clickContinue();	

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Matthew");
		cont.enterLastName("Pingel");
		cont.enterEmailAddress("s@g.com");
		cont.enterPhone("1111111221");
		cont.enterAPFirstName("Matthew");
		cont.enterAPLastName("Pingel");
		cont.enterAPEmailAddress("a@g.com");
		cont.enterAPPhone("1001441111");
		cont.clickContinue();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.enterSevenDigitWheelProsAccountNumber("Texas");
		credit.clickTermsCondition();
		credit.enterBankName("Bank of America");

		credit.enterBankAccountNumberr("400109881111");
		credit.enterCity("Fort Worth");
		credit.selectOptionFromStateDropDown("TX");

		credit.enterCR1VendorName("Mouser Electronics");
		credit.enterCR1Phone("1111441111");	
		credit.enterCR1Emailaddress("abcd@gmail.com");
		credit.enterCR1City("Mansfield");
		credit.selectOptionFromCR1StateDropDown("TX");

		//CRef 2
		credit.enterCR2VendorName("Waytek Wire");
		credit.enterCR2Phone("1114411111");
		credit.enterCR2Emailaddress("abc5@gmail.com");
		credit.enterCR2City("Chanhassen");
		credit.selectOptionFromCR2StateDropDown("MN");


		//Cref 3
		credit.enterCR3VendorName("Brian Tooley Racing");
		credit.enterCR3Phone("1111551111");
		credit.enterCR3Emailaddress("abc5@gmail.com");
		credit.enterCR3City("Bardstown");
		credit.selectOptionFromCR3StateDropDown("KY");


		//Owner info 1
		credit.enterOwner1FirstName("Matthew");
		credit.enterOwner1LastName("Pingel");
		credit.enterOwner1Phone("1155111111");
		credit.enterOwner1Emailaddress("xyz@gmail.com");

		
		credit.enterProjectedMonthlyPurchaseTotal("4000");

		//Siganture

		credit.enterSInfoFirstName("Matthew");
		credit.enterSInfoLastName("Pingel");
		credit.enterSInfoPhone("1111215511");
		credit.enterSInfoEmailAddress("paul5@gmail.com");
		credit.enterSInfoStreetAddress("8101 Boat Club Road");
		credit.enterSInfoCity("Fort Worth");
		credit.selectOptionFromSIinfoStateDropDown("TX");
		credit.enterSInfoZipCode("76179");
		credit.enterSInfoSignature("Matthew Pingel");

		credit.clickContinue();

		//Personal Guarantee

		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);

		//Assert.assertEquals("Personal Guarantee", cont.getPageHeader());
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		guarantee.enterGuarantor1FirstName("Matthew");
		guarantee.enterGuarantor1LastName("Pingel");
		guarantee.enterPg1StreetAddress("7116 Kickapoo Drive");
		guarantee.enterPg1City("Fort Worth");
		guarantee.staticThreadWait(2);
		guarantee.selectOptionFromPg1StateDropDown("AR");
		guarantee.enterPg1ZipCode("76179");
		guarantee.enterPg1SSN("111551111");
		guarantee.enterPg1Signature("Matthew Pingel");
		
	}

	
	@Test(groups = {"us"})	
	public void companyMandatoryFieldErrorMessageValidations() throws Exception {
		CompanyPage cmpny=new CompanyPage(driver);

		Assert.assertEquals("Company", cmpny.getPageHeader());		
		cmpny.clickContinue();	
		Assert.assertEquals(cmpny.getCompanyNameErrorMessage(), "This field is required.");
		cmpny.takeScreenShot("companyfieldrequired.png");

	}


	@Test(groups = {"us"})	
	public void contactMandatoryFieldErrorMessageValidations() throws Exception {
		CompanyPage cmpny=new CompanyPage(driver);

		Assert.assertEquals("Company", cmpny.getPageHeader());

		cmpny.enterCompanyName("Night");
		cmpny.enterCompanyNameTrade("4sight");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLP");
		cmpny.enterFederalEmployerIdentificationNumber("11-1111111");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		Thread.sleep(5000);
		cmpny.enterOtherNotes("Hello");
		cmpny.uploadSalesTaxorBusinessLicense(System.getProperty("user.dir")+"\\src\\test\\resources\\filesToUpload\\test.jpg");
		Thread.sleep(4000);
		cmpny.clickSalesTaxorBusinessLicense();
		Thread.sleep(2000);
		cmpny.enterStreetAddress("Main lane");
		cmpny.enterCity("New York");
		Thread.sleep(4000);
		cmpny.selectOptionFromStateDropDown("AZ");
		cmpny.enterZipCode("95340");
		cmpny.clickYes();
		cmpny.clickContinue();	
		Thread.sleep(2000);
		ContactPage cont=new ContactPage(driver);
		cont.clickContinue();
		Assert.assertEquals(cont.getFirstNameErrorMessage(),"This field is required.");
		cont.takeScreenShot("contactFieldrequiredError.png");
	}


	@Test(groups = {"us"})	
	public void creditTermsMandatoryFieldErrorMessageValidations() throws Exception {
		CompanyPage cmpny=new CompanyPage(driver);
		Assert.assertEquals("Company", cmpny.getPageHeader());
		cmpny.enterCompanyName("Night");
		cmpny.enterCompanyNameTrade("4sight");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLP");
		cmpny.enterFederalEmployerIdentificationNumber("11-1111111");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		Thread.sleep(5000);
		cmpny.enterOtherNotes("Hello");
		cmpny.uploadSalesTaxorBusinessLicense(System.getProperty("user.dir")+"\\src\\test\\resources\\filesToUpload\\test.jpg");
		Thread.sleep(4000);
		cmpny.clickSalesTaxorBusinessLicense();
		Thread.sleep(2000);
		cmpny.enterStreetAddress("Main lane");
		cmpny.enterCity("New York");
		Thread.sleep(4000);
		cmpny.selectOptionFromStateDropDown("AZ");
		cmpny.enterZipCode("95340");
		cmpny.clickYes();
		cmpny.clickContinue();	
		Thread.sleep(2000);


		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterLastName("Hessel");
		cont.takeScreenShot("contact.png");
		cont.enterEmailAddress("Giovanni@gmail.com");
		cont.enterPhone("1111111111");
		cont.enterAPFirstName("Giovanni");
		cont.enterAPLastName("Hessel");
		cont.enterAPEmailAddress("Giovanni@gmail.com");
		cont.enterAPPhone("1111111111");
		cont.clickContinue();
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.clickContinue();
		Assert.assertEquals(credit.getAgreeTcErrorMessage(), "This field is required.");
		credit.takeScreenShot("creditFieldrequiredError.png");
	}


	@Test(groups = {"us"})	
	public void PersonalGuaranteeMandatoryFieldErrorMessageValidations() throws Exception {
		CompanyPage cmpny=new CompanyPage(driver);

		Assert.assertEquals("Company", cmpny.getPageHeader());

		cmpny.enterCompanyName("Night");
		cmpny.enterCompanyNameTrade("4sight");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLP");
		cmpny.enterFederalEmployerIdentificationNumber("11-1111111");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		Thread.sleep(5000);
		cmpny.enterOtherNotes("Hello");
		cmpny.uploadSalesTaxorBusinessLicense(System.getProperty("user.dir")+"\\src\\test\\resources\\filesToUpload\\test.jpg");
		Thread.sleep(4000);
		cmpny.clickSalesTaxorBusinessLicense();
		cmpny.enterStreetAddress("Main lane");
		cmpny.enterCity("New York");
		Thread.sleep(2000);
		cmpny.selectOptionFromStateDropDown("AZ");
		cmpny.enterZipCode("95340");
		cmpny.clickYes();
		cmpny.clickContinue();	
		Thread.sleep(2000);


		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterLastName("Hessel");
		cont.takeScreenShot("contact.png");
		cont.enterEmailAddress("Giovanni@gmail.com");
		cont.enterPhone("1111111111");
		cont.enterAPFirstName("Giovanni");
		cont.enterAPLastName("Hessel");
		cont.enterAPEmailAddress("Giovanni@gmail.com");
		cont.enterAPPhone("1111111111");
		cont.clickContinue();
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.enterSevenDigitWheelProsAccountNumber("1234567");
		credit.clickTermsCondition();
		credit.takeScreenShot("credit.png");
		credit.enterBankName("HDFC");

		credit.enterBankAccountNumberr("2537488123");
		credit.enterCity("New");
		credit.selectOptionFromStateDropDown("AZ");

		credit.enterCR1VendorName("Rock");
		credit.enterCR1Phone("1111111111");	
		credit.enterCR1Emailaddress("abc@gmail.com");
		credit.enterCR1City("New");
		credit.selectOptionFromCR1StateDropDown("AZ");

		//CRef 2
		credit.enterCR2VendorName("Danny");
		credit.enterCR2Phone("1111111111");
		credit.enterCR2Emailaddress("abc@gmail.com");
		credit.enterCR2City("New");
		credit.selectOptionFromCR2StateDropDown("AZ");


		//Cref 3
		credit.enterCR3VendorName("Jack");
		credit.enterCR3Phone("1111111111");
		credit.enterCR3Emailaddress("abc@gmail.com");
		credit.enterCR3City("New");
		credit.selectOptionFromCR3StateDropDown("AZ");


		//Owner info 1
		credit.enterOwner1FirstName("Rain");
		credit.enterOwner1LastName("Roy");
		credit.enterOwner1Phone("Roy");
		credit.enterOwner1Phone("1111111111");
		credit.enterOwner1Emailaddress("xyz@gmail.com");

		//Owner info 2
		credit.enterOwner2FirstName("Rain");
		credit.enterOwner2LastName("Rain");
		credit.enterOwner2Phone("1111111111");
		credit.enterOwner2Emailaddress("xyz@gmail.com");
		credit.enterProjectedMonthlyPurchaseTotal("1500");

		//Siganture

		credit.enterSInfoFirstName("Dany");
		credit.enterSInfoLastName("Paul");
		credit.enterSInfoPhone("1111211111");
		credit.enterSInfoEmailAddress("paul@gmail.com");
		credit.enterSInfoStreetAddress("Hill street");
		credit.enterSInfoCity("MainLand");
		credit.selectOptionFromSIinfoStateDropDown("AZ");
		credit.enterSInfoZipCode("95340");
		credit.enterSInfoSignature("Xavier");
		credit.clickContinue();

		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);

		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		guarantee.clickSubmit();
		Assert.assertEquals(guarantee.getGuarantor1FirstNameErrorMessage(), "Complete this field.");		

	}


	@Test(groups = {"us"})	
	public void creditTermsSelectNoSubmit() throws Exception {
		CompanyPage cmpny=new CompanyPage(driver);

		Assert.assertEquals("Company", cmpny.getPageHeader());
		cmpny.takeScreenShot("company.png");
		cmpny.enterCompanyName("Night");
		cmpny.enterCompanyNameTrade("4sight");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLP");
		cmpny.enterFederalEmployerIdentificationNumber("11-1111111");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.uploadSalesTaxorBusinessLicense(System.getProperty("user.dir")+"\\src\\test\\resources\\filesToUpload\\test.jpg");
		Thread.sleep(4000);
		cmpny.clickSalesTaxorBusinessLicense();
		cmpny.enterStreetAddress("Main lane");
		cmpny.enterCity("New York");
		Thread.sleep(4000);
		cmpny.selectOptionFromStateDropDown("AZ");
		cmpny.enterZipCode("95340");
		cmpny.clickYes();
		cmpny.clickContinue();	

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterLastName("Hessel");
		cont.takeScreenShot("contact.png");
		cont.enterEmailAddress("Giovanni@gmail.com");
		cont.enterPhone("1111111111");
		cont.enterAPFirstName("Giovanni");
		cont.enterAPLastName("Hessel");
		cont.enterAPEmailAddress("Giovanni@gmail.com");
		cont.enterAPPhone("1111111111");
		cont.clickContinue();

		//CreditTermsPage credit=new CreditTermsPage(driver);
		//credit.clickSubmit();

	}



	@Test(groups = {"us"})	
	public void personalGuaranteeIDoNotWishSubmit() throws Exception {

		CompanyPage cmpny=new CompanyPage(driver);

		Assert.assertEquals("Company", cmpny.getPageHeader());
		cmpny.takeScreenShot("company.png");
		cmpny.enterCompanyName("Night");
		cmpny.enterCompanyNameTrade("4sight");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLP");
		cmpny.enterFederalEmployerIdentificationNumber("11-1111111");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.uploadSalesTaxorBusinessLicense(System.getProperty("user.dir")+"\\src\\test\\resources\\filesToUpload\\test.jpg");
		Thread.sleep(4000);
		cmpny.clickSalesTaxorBusinessLicense();
		Thread.sleep(2000);
		cmpny.enterStreetAddress("Main lane");
		cmpny.enterCity("New York");
		cmpny.selectOptionFromStateDropDown("AZ");
		cmpny.enterZipCode("95340");
		cmpny.clickYes();
		cmpny.takeScreenShot("dealerEnrollmentTest-1");
		cmpny.clickContinue();	

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterLastName("Hessel");
		cont.takeScreenShot("contact.png");
		cont.enterEmailAddress("Giovanni@gmail.com");
		cont.enterPhone("1111111111");
		cont.enterAPFirstName("Giovanni");
		cont.enterAPLastName("Hessel");
		cont.enterAPEmailAddress("Giovanni@gmail.com");
		cont.enterAPPhone("1111111111");
		cont.clickContinue();

		CreditTermsPage credit=new CreditTermsPage(driver);

		credit.clickYes();
		credit.enterSevenDigitWheelProsAccountNumber("1234567");
		credit.clickTermsCondition();
		credit.takeScreenShot("credit.png");
		credit.enterBankName("HDFC");

		credit.enterBankAccountNumberr("2537488123");
		credit.enterCity("New");
		credit.selectOptionFromStateDropDown("AL");

		credit.enterCR1VendorName("Rock");
		credit.enterCR1Phone("1111111111");	
		credit.enterCR1Emailaddress("abc@gmail.com");
		credit.enterCR1City("New");
		credit.selectOptionFromCR1StateDropDown("AZ");

		//CRef 2
		credit.enterCR2VendorName("Danny");
		credit.enterCR2Phone("1111111111");
		credit.enterCR2Emailaddress("abc@gmail.com");
		credit.enterCR2City("New");
		credit.selectOptionFromCR2StateDropDown("AZ");


		//Cref 3
		credit.enterCR3VendorName("Jack");
		credit.enterCR3Phone("1111111111");
		credit.enterCR3Emailaddress("abc@gmail.com");
		credit.enterCR3City("New");
		credit.selectOptionFromCR3StateDropDown("AZ");


		//Owner info 1
		credit.enterOwner1FirstName("Rain");
		credit.enterOwner1LastName("Roy");
		credit.enterOwner1Phone("Roy");
		credit.enterOwner1Phone("1111111111");
		credit.enterOwner1Emailaddress("xyz@gmail.com");

		//Owner info 2
		credit.enterOwner2FirstName("Rain");
		credit.enterOwner2LastName("Rain");
		credit.enterOwner2Phone("1111111111");
		credit.enterOwner2Emailaddress("xyz@gmail.com");
		credit.enterProjectedMonthlyPurchaseTotal("1500");

		//Siganture

		credit.enterSInfoFirstName("Dany");
		credit.enterSInfoLastName("Paul");
		credit.enterSInfoPhone("1111211111");
		credit.enterSInfoEmailAddress("paul@gmail.com");
		credit.enterSInfoStreetAddress("Hill street");
		credit.enterSInfoCity("MainLand");
		credit.selectOptionFromSIinfoStateDropDown("AL");
		credit.enterSInfoZipCode("95340");
		credit.enterSInfoSignature("Xavier");

		credit.clickContinue();

		//Personal Guarantee

		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIDONOTWISHTOAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		//guarantee.clickSubmit();

	}

	@Test(groups = {"us"})	
	public void creditTermsClearSignatureandclearTermsCondition() throws Exception {

		CompanyPage cmpny=new CompanyPage(driver);
		Assert.assertEquals("Company", cmpny.getPageHeader());
		cmpny.takeScreenShot("company.png");
		cmpny.enterCompanyName("Night");
		cmpny.enterCompanyNameTrade("4sight");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLP");
		cmpny.enterFederalEmployerIdentificationNumber("11-1111111");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.uploadSalesTaxorBusinessLicense(System.getProperty("user.dir")+"\\src\\test\\resources\\filesToUpload\\test.jpg");
		Thread.sleep(4000);
		cmpny.clickSalesTaxorBusinessLicense();
		cmpny.enterStreetAddress("Main lane");
		cmpny.enterCity("New York");
		Thread.sleep(2000);
		cmpny.selectOptionFromStateDropDown("AZ");
		cmpny.enterZipCode("95340");
		cmpny.clickYes();
		cmpny.takeScreenShot("dealerEnrollmentTest-1");
		cmpny.clickContinue();	

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterLastName("Hessel");
		cont.takeScreenShot("contact.png");
		cont.enterEmailAddress("Giovanni@gmail.com");
		cont.enterPhone("1111111111");
		cont.enterAPFirstName("Giovanni");
		cont.enterAPLastName("Hessel");
		cont.enterAPEmailAddress("Giovanni@gmail.com");
		cont.enterAPPhone("1111111111");
		cont.clickContinue();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.enterSevenDigitWheelProsAccountNumber("1234567");
		credit.clickTermsCondition();
		credit.takeScreenShot("credit.png");
		credit.enterBankName("HDFC");
		credit.enterBankAccountNumberr("2537488123");
		credit.enterCity("New");
		credit.selectOptionFromStateDropDown("AZ");
		credit.enterCR1VendorName("Rock");
		credit.enterCR1Phone("1111111111");	
		credit.enterCR1Emailaddress("abc@gmail.com");
		credit.enterCR1City("New");
		credit.selectOptionFromCR1StateDropDown("AZ");

		//CRef 2
		credit.enterCR2VendorName("Danny");
		credit.enterCR2Phone("1111111111");
		credit.enterCR2Emailaddress("abc@gmail.com");
		credit.enterCR2City("New");
		credit.selectOptionFromCR2StateDropDown("AZ");

		//Cref 3
		credit.enterCR3VendorName("Jack");
		credit.enterCR3Phone("1111111111");
		credit.enterCR3Emailaddress("abc@gmail.com");
		credit.enterCR3City("New");
		credit.selectOptionFromCR3StateDropDown("AZ");

		//Owner info 1
		credit.enterOwner1FirstName("Rain");
		credit.enterOwner1LastName("Roy");
		credit.enterOwner1Phone("Roy");
		credit.enterOwner1Phone("1111111111");
		credit.enterOwner1Emailaddress("xyz@gmail.com");

		//Owner info 2
		credit.enterOwner2FirstName("Rain");
		credit.enterOwner2LastName("Rain");
		credit.enterOwner2Phone("1111111111");
		credit.enterOwner2Emailaddress("xyz@gmail.com");
		credit.enterProjectedMonthlyPurchaseTotal("1500");

		//Siganture
		credit.enterSInfoFirstName("Dany");
		credit.enterSInfoLastName("Paul");
		credit.enterSInfoPhone("1111211111");
		credit.enterSInfoEmailAddress("paul@gmail.com");
		credit.enterSInfoStreetAddress("Hill street");
		credit.enterSInfoCity("MainLand");
		credit.selectOptionFromSIinfoStateDropDown("AZ");
		credit.enterSInfoZipCode("95340");
		credit.enterSInfoSignature("Xavier");
		credit.clickContinue();

		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		guarantee.clickBack();
		Assert.assertEquals(credit.enterInfoSignatureAttributee(""), "");
		credit.isSelectedTermsCondition();
		boolean check=credit.isSelectedTermsCondition();
		System.out.println(check);

	}
	
	
	
	@Test(groups = {"us"})	
	public void testState(){
		CompanyPage cmpny=new CompanyPage(driver);

		Assert.assertEquals("Company", cmpny.getPageHeader());
		cmpny.enterCompanyName("check mail template us no credit");
		cmpny.enterCompanyNameTrade("test");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLP");
		cmpny.enterFederalEmployerIdentificationNumber("11-1200111");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("checkin email template for customer");
		cmpny.uploadSalesTaxorBusinessLicense(System.getProperty("user.dir")+"\\src\\test\\resources\\filesToUpload\\test.jpg");
		cmpny.clickSalesTaxorBusinessLicense();
		cmpny.enterStreetAddress("Main lane1");
		cmpny.enterCity("New Yrk");
		
		cmpny.selectOptionFromStateDropDown("AK");
		cmpny.enterZipCode("72764");
		cmpny.clickYes();
		cmpny.takeScreenShot("dealerEnrollmentTest-1");
		cmpny.clickContinue();	
		
		ContactPage cont=new ContactPage(driver);
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("AL");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("AR");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("AR");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("AZ");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("CA");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("CO");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("CT");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("DC");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("DE");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("FL");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("GA");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("GU");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("HI");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("IA");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("ID");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("IL");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("IN");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("KS");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("KY");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("LA");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("MA");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("MD");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("ME");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("MI");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("MN");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("MO");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("MP");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("MS");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("MT");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("NC");
		cmpny.clickContinue();cont.clikBack();
		cmpny.selectOptionFromStateDropDown("ND");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("NE");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("NH");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("NJ");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("NM");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("NV");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("NY");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("OH");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("OK");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("OR");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("PA");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("PR");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("RI");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("SC");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("SD");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("TN");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("TX");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("UT");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("VA");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("VI");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("VT");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("WA");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("WI");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("WV");
		cmpny.clickContinue();
		cont.clikBack();
		cmpny.selectOptionFromStateDropDown("WY");
		cmpny.clickContinue();
		cont.clikBack();	
	}
	
	
	@Test
	public void testAllState(){
	NewCreditAppFlows state=new NewCreditAppFlows(driver);
	state.testAllStateUS();	
	}
	


	@Test(groups = {"us"})	
	public void testStateCreditTermsPage() throws Exception {
		CompanyPage cmpny=new CompanyPage(driver);
		Assert.assertEquals("Company", cmpny.getPageHeader());
		cmpny.enterCompanyName("check mail template us no credit");
		cmpny.enterCompanyNameTrade("test");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLP");
		cmpny.enterFederalEmployerIdentificationNumber("11-1200111");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("checkin email template for customer");
		cmpny.uploadSalesTaxorBusinessLicense(System.getProperty("user.dir")+"\\src\\test\\resources\\filesToUpload\\test.jpg");
		cmpny.clickSalesTaxorBusinessLicense();
		cmpny.enterStreetAddress("Main lane1");
		cmpny.enterCity("New Yrk");
		
		cmpny.selectOptionFromStateDropDown("AK");
		//cmpny.enterZipCode("95340");
		cmpny.enterZipCode("72764");
		cmpny.clickYes();
		cmpny.takeScreenShot("dealerEnrollmentTest-1");
		cmpny.clickContinue();	

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("test existing customer number");
		cont.enterLastName("usa");
		cont.takeScreenShot("contact.png");
		cont.enterEmailAddress("s@g.com");
		cont.enterPhone("1111111221");
		cont.enterAPFirstName("shashi");
		cont.enterAPLastName("kanth");
		cont.enterAPEmailAddress("a@g.com");
		cont.enterAPPhone("1001441111");
		cont.clickContinue();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.enterSevenDigitWheelProsAccountNumber("Texas");
		credit.clickTermsCondition();
		credit.takeScreenShot("credit.png");
		credit.enterBankName("HSBC");

		credit.enterBankAccountNumberr("274881280093");
		credit.enterCity("New");
		credit.selectOptionFromStateDropDown("CO");

		credit.enterCR1VendorName("Rock");
		credit.enterCR1Phone("1111441111");	
		credit.enterCR1Emailaddress("abcd@gmail.com");
		credit.enterCR1City("New");
		credit.selectOptionFromCR1StateDropDown("CO");

		//CRef 2
		credit.enterCR2VendorName("Danny");
		credit.enterCR2Phone("1114411111");
		credit.enterCR2Emailaddress("abc5@gmail.com");
		credit.enterCR2City("New5");
		credit.selectOptionFromCR2StateDropDown("CO");


		//Cref 3
		credit.enterCR3VendorName("Jack");
		credit.enterCR3Phone("1111551111");
		credit.enterCR3Emailaddress("abc5@gmail.com");
		credit.enterCR3City("New");
		credit.selectOptionFromCR3StateDropDown("CO");


		//Owner info 1
		credit.enterOwner1FirstName("Rain5");
		credit.enterOwner1LastName("Roy5");
		credit.enterOwner1Phone("1155111111");
		credit.enterOwner1Emailaddress("xyz@gmail.com");

		//Owner info 2
		credit.enterOwner2FirstName("Rain5");
		credit.enterOwner2LastName("Rain5");
		credit.enterOwner2Phone("1111155111");
		credit.enterOwner2Emailaddress("xyz5@gmail.com");
		credit.enterProjectedMonthlyPurchaseTotal("15500");

		//Siganture
		credit.enterSInfoFirstName("Dany5");
		credit.enterSInfoLastName("Paul5");
		credit.enterSInfoPhone("1111215511");
		credit.enterSInfoEmailAddress("paul5@gmail.com");
		credit.enterSInfoStreetAddress("Hi5street");
		credit.enterSInfoCity("MainLand5");
		credit.selectOptionFromSIinfoStateDropDown("CO");
		credit.enterSInfoZipCode("95340");
		credit.enterSInfoSignature("Xavier");

		credit.clickContinue();
		PersonalGuaranteePage personal=new PersonalGuaranteePage(driver);
		personal.clickBack();
	}
	
	
	@Test(groups = {"us"})
	public void testAllStatetest(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
	cmpnyData.testAllStateUS();
	}
	
	@Test(groups = {"us"})
	public void testAllstateCreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.testCreditTermsStateus();
	}
	
	
	@Test(groups = {"us"})
	public void testAllStatePersonalGuarantee() {
		NewCreditAppFlows statepg=new NewCreditAppFlows(driver);
		statepg.testPersonalGuaranteeStateus();
	}
	

}





