package com.wheelpros.qa.testflows;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.wheelpros.qa.ca.pages.CompanyPage;
import com.wheelpros.qa.ca.pages.ContactPage;
import com.wheelpros.qa.ca.pages.CreditTermsPage;
import com.wheelpros.qa.ca.pages.PersonalGuaranteePage;



public class NewCreditAppFlows {
	WebDriver driver;

	public NewCreditAppFlows(WebDriver driver) {
		this.driver = driver;
	}
	// Canada 
	public void enterCompanyDetailsForCa() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1234567");
		cmpny.enterGST1("123456789");
		cmpny.enterHST1("123456789");
		cmpny.enterTireRecycling("2000");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
	}

	public void enterContactDetailsCa() {
		ContactPage contact=new ContactPage(driver);
		contact.enterFirstName("Neil");
		contact.enterLastName("David");
		contact.enterEmailAddress("neil@gmail.com");
		contact.enterPhone("1111111111");
		contact.enterAPFirstName("Neil");
		contact.enterAPLastName("DAvid");
		contact.enterAPEmailAddress("neil@gmail.com");
		contact.enterAPPhone("1111111111");
		contact.clickContinue();
	}

	public void enterCreditTermsDetailsCa() {
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.enterSevenDigitWheelProsAccountNumber("1234567");
		credit.clickTermsCondition();
		credit.enterBankName("HDFC");
		credit.enterBankAccountNumberr("98765432");
		credit.enterCity("New");
		credit.clickProvince("AB");

		//Credit Ref 1
		credit.enterCR1VendorName("Rock");
		credit.enterCR1Phone("1111111111");
		credit.enterCR1Emailaddress("rock@gmail.com");
		credit.enterCR1City("new");
		credit.selectOptionFromCR1ProvinceDropDown("AB");

		//Credit Ref 2
		credit.enterCR2VendorName("Rock");
		credit.enterCR2Phone("1111111111");
		credit.enterCR2Emailaddress("rock@gmail.com");
		credit.enterCR2City("new");
		credit.selectOptionFromCR2ProvinceDropDown("AB");

		//Credit Ref 3
		credit.enterCR3VendorName("Rock");
		credit.enterCR3Phone("1111111111");
		credit.enterCR3Emailaddress("rock@gmail.com");
		credit.enterCR3City("new");
		credit.selectOptionFromCR3ProvincDropDown("AB");

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
		credit.selectOptionFromSIinfoProvinceDropDown("AB");
		credit.enterSInfoPostalCode("P0A 1J0");
		credit.enterSInfoSignature("Xavier");
		credit.clickContinue();			
	}

	public void enterPersonalGuarantee1DetailsCa() {
		PersonalGuaranteePage guarantee1=new PersonalGuaranteePage(driver);
		guarantee1.enterGuarantor1FirstName("Max");
		guarantee1.enterGuarantor1LastName("David");
		guarantee1.enterPg1StreetAddress("land");
		guarantee1.enterPg1City("Nox");
		guarantee1.selectOptionFromPg1ProvinceDropDown();
		guarantee1.enterPg1PostalCode("P0A 1J0");
		guarantee1.enterPg1SIN("1111111111");
		guarantee1.enterPg1Signature("Shany");	
	}


	public void testValidPostalCodecompanyCa() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("shashi CA");
		cmpny.enterCompanyNameTrade("with credit terms");
		cmpny.enterParentCompany("Ratan Tata");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("550wada22");
		cmpny.enterGST1("785222222");
		cmpny.enterHST1("9992222222");
		cmpny.enterTireRecycling("1000");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterStreetAddress("kings road");
		cmpny.enterCity("Pune");
		cmpny.selectOptionFromlstProvinceDropDown("AB");
		cmpny.clickYes();
		ContactPage cont=new ContactPage(driver);

		List<String> postcode = Arrays.asList("A1A 1A1", "B1B 1B1", "C1B 1B1", "E1B 1B1", "G1B 1B1", "H1B 1B1", "J1B 1B1", "K1B 1B1",
				"L1B 1B1", "M1B 1B1", "N1B 1B1", "P1B 1B1", "R1B 1B1", "S1B 1B1", "T1B 1B1", "V1B 1B1", "Y1B 1B1","X1B 1B1" );
		for (String postalcode : postcode) {
			cmpny.enterPostalCode(postalcode);
			cmpny.enterCity("new");
			cmpny.clickContinue();
			cont.clikBack();
		}
	}

	public void testInvalidPostalCodecompanyCa() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterCompanyName("shashi CA");
		cmpny.enterPostalCode("D1A 1A1");
		cmpny.enterCompanyNameTrade("with credit terms");
		cmpny.enterParentCompany("Ratan Tata");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterStreetAddress("kings road");
		cmpny.enterCity("Pune");
		cmpny.selectOptionFromlstProvinceDropDown("AB");
		cmpny.clickYes();

		List<String> postalCodes = Arrays.asList("F1F 2F2", "I1F 2F2", "O1A 1A1", "Q1A 1A1", "U1A 1A1", "W1A 1A1", "Z1A 1A1");
		for (String postalCode : postalCodes) {
			cmpny.enterPostalCode(postalCode);
			cmpny.enterCity("new");
			cmpny.clickContinue();
		}
	}


	public void testPostalCodeCreditTermsCA() {
		enterCompanyDetailsForCa();
		enterContactDetailsCa();
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.clickTermsCondition();
		credit.enterBankName("HDFC");
		credit.enterBankAccountNumberr("98765432");
		credit.enterCity("New");
		credit.clickProvince("AB");
		//Credit Ref 1
		credit.enterCR1VendorName("Rock");
		credit.enterCR1Phone("1111111111");
		credit.enterCR1Emailaddress("rock@gmail.com");
		credit.enterCR1City("new");
		credit.selectOptionFromCR1ProvinceDropDown("AB");
		//Credit Ref 2
		credit.enterCR2VendorName("Rock");
		credit.enterCR2Phone("1111111111");
		credit.enterCR2Emailaddress("rock@gmail.com");
		credit.enterCR2City("new");
		credit.selectOptionFromCR2ProvinceDropDown("AB");
		//Credit Ref 3
		credit.enterCR3VendorName("Rock");
		credit.enterCR3Phone("1111111111");
		credit.enterCR3Emailaddress("rock@gmail.com");
		credit.enterCR3City("new");
		credit.selectOptionFromCR3ProvincDropDown("AB");
		//Owner info 1
		credit.enterOwner1FirstName("Rain");
		credit.enterOwner1LastName("Roy");
		credit.enterOwner1Phone("Roy");
		credit.enterOwner1Phone("1111111111");
		credit.enterOwner1Emailaddress("xyz@gmail.com");
		credit.enterProjectedMonthlyPurchaseTotal("1");
		//Siganture
		credit.enterSInfoFirstName("Dany");
		credit.enterSInfoLastName("Paul");
		credit.enterSInfoPhone("1111211111");
		credit.enterSInfoEmailAddress("paul@gmail.com");
		credit.enterSInfoStreetAddress("Hill street");
		credit.enterSInfoCity("MainLand");
		credit.selectOptionFromSIinfoProvinceDropDown("AB");
		credit.enterSInfoPostalCode("A1A 1A1");
		credit.enterSInfoSignature("Xavier");
		credit.clickContinue();
		PersonalGuaranteePage personal=new PersonalGuaranteePage(driver);
		personal.clickBack();

		List<String> postcode = Arrays.asList("A1A 1A1", "B1B 1B1", "C1B 1B1", "E1B 1B1", "G1B 1B1", "H1B 1B1", "J1B 1B1", "K1B 1B1",
				"L1B 1B1", "M1B 1B1", "N1B 1B1", "P1B 1B1", "R1B 1B1", "S1B 1B1", "T1B 1B1", "V1B 1B1", "Y1B 1B1","X1B 1B1" );
		for (String postalcode : postcode) {
			credit.enterSInfoPostalCode(postalcode);
			credit.clickTermsCondition();
			credit.enterSInfoSignature("boney");
			credit.clickContinue();
			personal.clickBack();
		}
	}

	public void testInvalidPostalCodecreditTermsCa() {
		enterCompanyDetailsForCa();
		enterContactDetailsCa();
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.clickTermsCondition();
		credit.enterBankName("HDFC");
		credit.enterBankAccountNumberr("98765432");
		credit.enterCity("New");
		credit.clickProvince("AB");
		//Credit Ref 1
		credit.enterCR1VendorName("Rock");
		credit.enterCR1Phone("1111111111");
		credit.enterCR1Emailaddress("rock@gmail.com");
		credit.enterCR1City("new");
		credit.selectOptionFromCR1ProvinceDropDown("AB");
		//Credit Ref 2
		credit.enterCR2VendorName("Rock");
		credit.enterCR2Phone("1111111111");
		credit.enterCR2Emailaddress("rock@gmail.com");
		credit.enterCR2City("new");
		credit.selectOptionFromCR2ProvinceDropDown("AB");
		//Credit Ref 3
		credit.enterCR3VendorName("Rock");
		credit.enterCR3Phone("1111111111");
		credit.enterCR3Emailaddress("rock@gmail.com");
		credit.enterCR3City("new");
		credit.selectOptionFromCR3ProvincDropDown("AB");
		//Owner info 1
		credit.enterOwner1FirstName("Rain");
		credit.enterOwner1LastName("Roy");
		credit.enterOwner1Phone("Roy");
		credit.enterOwner1Phone("1111111111");
		credit.enterOwner1Emailaddress("xyz@gmail.com");
		credit.enterProjectedMonthlyPurchaseTotal("1");
		//Siganture
		credit.enterSInfoFirstName("Dany");
		credit.enterSInfoLastName("Paul");
		credit.enterSInfoPhone("1111211111");
		credit.enterSInfoEmailAddress("paul@gmail.com");
		credit.enterSInfoStreetAddress("Hill street");
		credit.enterSInfoCity("MainLand");
		credit.selectOptionFromSIinfoProvinceDropDown("AB");
		credit.enterSInfoPostalCode("D1A 1A1");
		credit.enterSInfoSignature("Xavier");
		credit.clickContinue();

		List<String> postalCodes = Arrays.asList("F1F 2F2", "I1F 2F2", "O1A 1A1", "Q1A 1A1", "U1A 1A1", "W1A 1A1", "Z1A 1A1");
		for (String postalCode : postalCodes) {
			credit.enterSInfoPostalCode(postalCode);
			credit.clickTermsCondition();
			credit.clickContinue();
			credit.staticThreadWait(2);
		}
	}

	public void testInvalidPostalCodepersonalGuaranteeCa() {
		enterCompanyDetailsForCa();
		enterContactDetailsCa();
		enterCreditTermsDetailsCa();
		PersonalGuaranteePage personal=new PersonalGuaranteePage(driver);
		personal.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		personal.enterGuarantor1FirstName("joy");
		personal.enterGuarantor1LastName("paul");
		personal.enterPg1City("Toranto");
		personal.enterPg1StreetAddress("test");
		personal.selectOptionFromPg1ProvinceDropDown();
		personal.enterPg1SIN("111-111-111");
		personal.enterPg1Signature("paul");
		personal.enterGuarantor2FirstName("joy");
		personal.enterGuarantor2LastName("paul");
		personal.enterPg2City("Toranto");
		personal.enterPg2StreetAddress("test");
		personal.selectOptionFromPg2ProvinceDropDown();
		personal.enterPg2SIN("111-111-111");
		personal.enterPg2Signature("paul");
		String[] postalcodes= {"D1D 1D1", "F1F 2F2", "I1F 2F2", "O1A 1A1", "Q1A 1A1", "U1A 1A1", "W1A 1A1", "Z1A 1A1"};
		for (String postalcode:postalcodes) {
			personal.enterPg1PostalCode(postalcode);
			personal.staticThreadWait(2);
			personal.enterPg2PostalCode(postalcode);
			personal.clickSubmit(); 
		}
	}

	public void testProvinceCompanyCa() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		ContactPage cont=new ContactPage(driver);

		List<String> pro=Arrays.asList("AB", "BC", "MB", "NB", "NL", "NT", "NS", "NU", "ON", "PE", "QC", "SK", "YT");
		for(String prov:pro) {
			cmpny.selectOptionFromlstProvinceDropDown(prov);
			cmpny.staticThreadWait(1);
			cmpny.clickContinue();
			cont.clikBack();
		}
	}

	public void testProvinceCreditTermsCa() {
		enterCompanyDetailsForCa();
		enterContactDetailsCa();
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.enterBankName("HDFC");
		credit.enterBankAccountNumberr("98765432");
		credit.enterCity("New");

		//Credit Ref 1
		credit.enterCR1VendorName("Rock");
		credit.enterCR1Phone("1111111111");
		credit.enterCR1Emailaddress("rock@gmail.com");
		credit.enterCR1City("new");

		//Credit Ref 2
		credit.enterCR2VendorName("Rock");
		credit.enterCR2Phone("1111111111");
		credit.enterCR2Emailaddress("rock@gmail.com");
		credit.enterCR2City("new");

		//Credit Ref 3
		credit.enterCR3VendorName("Rock");
		credit.enterCR3Phone("1111111111");
		credit.enterCR3Emailaddress("rock@gmail.com");
		credit.enterCR3City("new");

		//Owner info 1
		credit.enterOwner1FirstName("Rain");
		credit.enterOwner1LastName("Roy");
		credit.enterOwner1Phone("Roy");
		credit.enterOwner1Phone("1111111111");
		credit.enterOwner1Emailaddress("xyz@gmail.com");
		credit.enterProjectedMonthlyPurchaseTotal("1");
		//Siganture
		credit.enterSInfoFirstName("Dany");
		credit.enterSInfoLastName("Paul");
		credit.enterSInfoPhone("1111211111");
		credit.enterSInfoEmailAddress("paul@gmail.com");
		credit.enterSInfoStreetAddress("Hill street");
		credit.enterSInfoCity("MainLand");

		credit.enterSInfoPostalCode("A1A 1A1");
		PersonalGuaranteePage personal=new PersonalGuaranteePage(driver);

		List<String> pro=Arrays.asList("AB", "BC", "MB", "NB", "NL", "NT", "NS", "NU", "ON", "PE", "QC", "SK", "YT");
		for(String pros:pro) {
			credit.clickTermsCondition();
			credit.enterSInfoSignature("A");
			credit.clickProvince(pros);
			credit.selectOptionFromCR1ProvinceDropDown(pros);
			credit.selectOptionFromCR2ProvinceDropDown(pros);
			credit.selectOptionFromCR3ProvincDropDown(pros);
			credit.selectOptionFromSIinfoProvinceDropDown(pros);
			credit.clickContinue();
			credit.staticThreadWait(1);
			personal.clickBack();
		}
	}

	//GB(UK)
	public void enterCompanyDetailsForUk() {
		com.wheelpros.qa.uk.pages.CompanyPage cmpny = new com.wheelpros.qa.uk.pages.CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.enterCompanyNumber("123456789012345678");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("123456789");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("hello");
		cmpny.enterStreetAddress("104 Hill Road");
		cmpny.enterCity("Huddersfield");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("HD3 3JB");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();
	}

	public void enterContactDetailsUk() {
		com.wheelpros.qa.uk.pages.ContactPage cont = new com.wheelpros.qa.uk.pages.ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterLastName("Hessel");
		cont.enterEmailAddress("Giovanni@gmail.com");
		cont.enterPhone("+447975777666");
		cont.enterAPFirstName("Giovanni");
		cont.enterAPLastName("Hessel");
		cont.enterAPEmailAddress("Giovanni@gmail.com");
		cont.enterAPPhone("+447975777666");
		cont.clickContinue();
	}

	public void enterCreditTermsDetailsUk() {
		com.wheelpros.qa.uk.pages.CreditTermsPage credit= new com.wheelpros.qa.uk.pages.CreditTermsPage(driver);
		credit.clickYes();
		credit.enterSevenDigitWheelProsAccountNumber("1234567");
		credit.enterCR1VendorName("Henry");
		credit.enterCR1Phone("+447975777666");
		credit.enterCR1Emailaddress("Henry@gmail.com");
		credit.enterCR1City("New");
		credit.selectOptionFromCR1RegionDropDown("ABC");

		//CR2
		credit.enterCR2VendorName("Henry");
		credit.enterCR2Phone("+447975777666");
		credit.enterCR2Emailaddress("Henry@gmail.com");
		credit.enterCR2City("New");
		credit.selectOptionFromCR2RegionDropDown("ABC");

		//CR3
		credit.enterCR3VendorName("Henry");
		credit.enterCR3Phone("+447975777666");
		credit.enterCR3Emailaddress("Henry@gmail.com");
		credit.enterCR3City("New");
		credit.selectOptionFromCR3RegionDropDown("ABC");

		//owner1
		credit.enterOwner1FirstName("Dim");
		credit.enterOwner1LastName("Carry");
		credit.enterOwner1Phone("+447975777666");
		credit.enterOwner1Emailaddress("dim@gmail.com");

		//owner2
		credit.enterOwner2FirstName("Dim");
		credit.enterOwner2LastName("Carry");
		credit.enterOwner2Phone("+447975777666");
		credit.enterOwner2Emailaddress("dim@gmail.com");

		//project
		credit.enterProjectedMonthlyPurchaseTotal("200");

		//signer info
		credit.enterSInfoFirstName("Rax");
		credit.enterSInfoLastName("Ben");
		credit.enterSInfoPhone("+447975777666");
		credit.enterSInfoEmailAddress("ben@gmail.com");
		credit.enterSInfoStreetAddress("Xroads");
		credit.enterSInfoCity("DE");
		credit.selectOptionFromCountryDropDown("GB-England");
		credit.selectOptionFromSInfoRegionDropDown("ABC");
		credit.enterPostCode("FY1 6BF");
		credit.enterSignature("Shahsi");
		credit.clickContinue();
	}

	//personalGuarantee page
	public void enterPersonalGuarantee1DetailsUk() {
		com.wheelpros.qa.uk.pages.PersonalGuaranteePage guarantee1=new com.wheelpros.qa.uk.pages.PersonalGuaranteePage(driver);
		guarantee1.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		guarantee1.enterGuarantor1FirstName("Hilton");
		guarantee1.enterGuarantor1LastName("Huvi");
		guarantee1.enterPg1StreetAddress("New town");
		guarantee1.enterPg1City("Colo");
		guarantee1.selectOptionFromPg1RegionDropDown("ABC");
		guarantee1.enterPg1PostCode("FY1 6BF");
		guarantee1.enterPg1Signature("Sandy");
	}
	
	public void testCompanyNumberValidationUk() {
		com.wheelpros.qa.uk.pages.CompanyPage cmpny = new com.wheelpros.qa.uk.pages.CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("123456789");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("hello");
		cmpny.enterStreetAddress("104 Hill Road");
		cmpny.enterCity("Huddersfield");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("HD3 3JB");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		com.wheelpros.qa.uk.pages.ContactPage cont = new com.wheelpros.qa.uk.pages.ContactPage(driver);
		List<String> companynumber=Arrays.asList("12345678", "AB123456", "AB123456", "ab123456", "cd4567890", "zo123456","ZZ000000", "DD111111");
				for (String company : companynumber) {
					cmpny.enterCompanyNumber(company);
					cmpny.staticThreadWait(1);
					cmpny.btnContinue();
					cont.clikBack();
				}
	}

	public void testCompanyNumberInValidationUk() {
		com.wheelpros.qa.uk.pages.CompanyPage cmpny = new com.wheelpros.qa.uk.pages.CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("123456789");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("hello");
		cmpny.enterStreetAddress("104 Hill Road");
		cmpny.enterCity("Huddersfield");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("HD3 3JB");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		com.wheelpros.qa.uk.pages.ContactPage cont = new com.wheelpros.qa.uk.pages.ContactPage(driver);
		List<String> companynumber=Arrays.asList("1234567", "AB13456", "A@123456", "!@b123456", "cd**67890", "zoAD3456","ZZ0dd000", "DD11AB11");
				for (String company : companynumber) {
					cmpny.enterCompanyNumber(company);
					cmpny.staticThreadWait(1);
					cmpny.btnContinue();
					cont.clikBack();
				}
				cont.clikBack();
	}
	//========USA==============
	//to check state in company page USA
	public void enterCompanyDetailsUs() {
		com.wheelpros.qa.us.pages.CompanyPage cmpny=new com.wheelpros.qa.us.pages.CompanyPage(driver);
		cmpny.enterCompanyName("Shashi");
		cmpny.enterCompanyNameTrade("test");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLP");
		cmpny.enterFederalEmployerIdentificationNumber("11-1200111");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("others");
		cmpny.uploadSalesTaxorBusinessLicense(System.getProperty("user.dir")+"\\src\\test\\resources\\filesToUpload\\test.jpg");
		cmpny.clickSalesTaxorBusinessLicense();
		cmpny.enterStreetAddress("Main lane1");
		cmpny.enterCity("New Yrk");

		cmpny.selectOptionFromStateDropDown("AK");
		cmpny.enterZipCode("72764");
		cmpny.clickYes();
		cmpny.takeScreenShot("dealerEnrollmentTest-1");
		cmpny.clickContinue();	
	}

	public void enterContactDetailsUs() {
		com.wheelpros.qa.us.pages.ContactPage cont = new com.wheelpros.qa.us.pages.ContactPage(driver);
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
	}

	public void enterCreditTermsUs() {
		com.wheelpros.qa.us.pages.CreditTermsPage credit= new com.wheelpros.qa.us.pages.CreditTermsPage(driver);

		credit.clickYes();
		credit.clickTermsCondition();
		credit.enterBankName("HSBC");
		credit.enterBankAccountNumberr("274881280093");
		credit.enterCity("New");

		credit.enterCR1VendorName("Rock");
		credit.enterCR1Phone("1111441111");	
		credit.enterCR1Emailaddress("abcd@gmail.com");
		credit.enterCR1City("New");

		//CRef 2
		credit.enterCR2VendorName("Danny");
		credit.enterCR2Phone("1114411111");
		credit.enterCR2Emailaddress("abc5@gmail.com");
		credit.enterCR2City("New5");

		//Cref 3
		credit.enterCR3VendorName("Jack");
		credit.enterCR3Phone("1111551111");
		credit.enterCR3Emailaddress("abc5@gmail.com");
		credit.enterCR3City("New");

		//Owner info 1
		credit.enterOwner1FirstName("Rain5");
		credit.enterOwner1LastName("Roy5");
		credit.enterOwner1Phone("1155111111");
		credit.enterOwner1Emailaddress("xyz@gmail.com");
		credit.enterProjectedMonthlyPurchaseTotal("10");

		//Siganture
		credit.enterSInfoFirstName("Dany5");
		credit.enterSInfoLastName("Paul5");
		credit.enterSInfoPhone("1111215511");
		credit.enterSInfoEmailAddress("paul5@gmail.com");
		credit.enterSInfoStreetAddress("Hi5street");
		credit.enterSInfoCity("MainLand5");
		credit.enterSInfoZipCode("95340");
		credit.enterSInfoSignature("Xavier");

		credit.selectOptionFromStateDropDown("AR");
		credit.selectOptionFromCR1StateDropDown("AR");
		credit.selectOptionFromCR2StateDropDown("AR");
		credit.selectOptionFromCR3StateDropDown("AR");
		credit.selectOptionFromSIinfoStateDropDown("AR");
		credit.clickContinue();
	}
	//test all the states are valid in company page
	public void testAllStateUS() {
		com.wheelpros.qa.us.pages.CompanyPage cmpny = new com.wheelpros.qa.us.pages.CompanyPage(driver);
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

		List<String> states = Arrays.asList("AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "GU", "HI", "IA", "ID",
				"IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MP", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", 
				"NM", "NV", "NY", "OH", "OK", "OR", "PA", "PR", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VI", "VT", "WA", "WI", "WV", "WY");

		for (String state : states) {
			cmpny.selectOptionFromStateDropDown(state);
			cmpny.takeScreenShot(state);
			cmpny.clickContinue();
			cont.clikBack();
		}
	}



	//USA credit terms page testing for all the states for 5 fields.
	public void testCreditTermsStateus() {
		com.wheelpros.qa.us.pages.CreditTermsPage credit= new com.wheelpros.qa.us.pages.CreditTermsPage(driver);
		enterCompanyDetailsUs();
		enterContactDetailsUs();

		credit.clickYes();
		credit.clickTermsCondition();
		credit.enterBankName("HSBC");
		credit.enterBankAccountNumberr("274881280093");
		credit.enterCity("New");

		credit.enterCR1VendorName("Rock");
		credit.enterCR1Phone("1111441111");	
		credit.enterCR1Emailaddress("abcd@gmail.com");
		credit.enterCR1City("New");

		//CRef 2
		credit.enterCR2VendorName("Danny");
		credit.enterCR2Phone("1114411111");
		credit.enterCR2Emailaddress("abc5@gmail.com");
		credit.enterCR2City("New5");

		//Cref 3
		credit.enterCR3VendorName("Jack");
		credit.enterCR3Phone("1111551111");
		credit.enterCR3Emailaddress("abc5@gmail.com");
		credit.enterCR3City("New");

		//Owner info 1
		credit.enterOwner1FirstName("Rain5");
		credit.enterOwner1LastName("Roy5");
		credit.enterOwner1Phone("1155111111");
		credit.enterOwner1Emailaddress("xyz@gmail.com");
		credit.enterProjectedMonthlyPurchaseTotal("10");

		//Siganture
		credit.enterSInfoFirstName("Dany5");
		credit.enterSInfoLastName("Paul5");
		credit.enterSInfoPhone("1111215511");
		credit.enterSInfoEmailAddress("paul5@gmail.com");
		credit.enterSInfoStreetAddress("Hi5street");
		credit.enterSInfoCity("MainLand5");
		credit.enterSInfoZipCode("95340");
		credit.enterSInfoSignature("Xavier");

		credit.selectOptionFromStateDropDown("AR");
		credit.selectOptionFromCR1StateDropDown("AR");
		credit.selectOptionFromCR2StateDropDown("AR");
		credit.selectOptionFromCR3StateDropDown("AR");
		credit.selectOptionFromSIinfoStateDropDown("AR");
		credit.clickContinue();

		PersonalGuaranteePage personal=new PersonalGuaranteePage(driver);
		personal.clickBack();

		String[] stateCodes = {"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "GU", "HI", "IA", "ID",
				"IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MP", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", 
				"NM", "NV", "NY", "OH", "OK", "OR", "PA", "PR", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VI", "VT", "WA", "WI", "WV", "WY"};
		for (String stateCode : stateCodes) {
			// Click terms and conditions and enter signature
			credit.clickTermsCondition();
			credit.enterSInfoSignature("Shashi");

			// Select options for state and related fields
			credit.selectOptionFromStateDropDown(stateCode);
			credit.selectOptionFromCR1StateDropDown(stateCode);
			credit.selectOptionFromCR2StateDropDown(stateCode);
			credit.selectOptionFromCR3StateDropDown(stateCode);
			credit.selectOptionFromSIinfoStateDropDown(stateCode);
		}
		// Click continue and then click back to return to previous page
		credit.clickContinue();
	}

	//test all the states valid for PG page
	public void testPersonalGuaranteeStateus() {
		enterCompanyDetailsUs();
		enterContactDetailsUs();
		enterCreditTermsUs();
		com.wheelpros.qa.us.pages.PersonalGuaranteePage personal=new com.wheelpros.qa.us.pages.PersonalGuaranteePage(driver);
		personal.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
	}
} 	  












