package com.wheelpros.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wheelpros.qa.test.base.CreditAppBaseTest;
import com.wheelpros.qa.testflows.NewCreditAppFlows;
import com.wheelpros.qa.uk.pages.CompanyPage;
import com.wheelpros.qa.uk.pages.ContactPage;
import com.wheelpros.qa.uk.pages.CreditTermsPage;
import com.wheelpros.qa.uk.pages.PersonalGuaranteePage;
import com.wheelpros.web.utils.ValidationType;

public class CreditAppUKTestCase1 extends CreditAppBaseTest{

	@Test(groups = {"uk","creditTerms","Validation"})
	public void validDataInSignerInformationCreditTerms(){
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//cr1
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		
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
		
		Assert.assertEquals(credit.getCR1VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR1PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1CityaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1RegionaddressErrorMessage(),"This field is required.");

		//cr2
		Assert.assertEquals(credit.getCR2VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR2PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2CityaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2RegionaddressErrorMessage(),"This field is required.");

		//cr3
		Assert.assertEquals(credit.getCR3VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR3PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3CityaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3RegionaddressErrorMessage(),"This field is required.");

		//Owner1
		Assert.assertEquals(credit.getOwner1FirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getOwner1LastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getOwner1PhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getOwner1EmailaddressErrorMessage(), "This field is required.");

		//project purchase
		Assert.assertEquals(credit.getProjectedMonthlyPurchaseTotalErrorMessage(),"This field is required.");
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data only in signer inof and error message",credit.getProjectedMonthlyPurchaseTotalErrorMessage(), "This field is required.");
	}
	
	@Test(groups = {"uk","creditTerms","Validation"})
	public void validDataAllMandatoryFieldsCreditTerms() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//cr1
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
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
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data in credit terms page",guarantee.getPageHeader(), "Personal Guarantee");
	}

	@Test(groups = {"uk","creditTerms","Validation"})
	public void ProjectedMonthlyPurchaseTotalCreditTerms() {
		
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//cr1
		CreditTermsPage credit=new CreditTermsPage(driver);
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
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Projected Monthly Purchase Total error message",credit.getProjectedMonthlyPurchaseTotalErrorMessage(), "This field is required.");
	}
	
	@Test(groups = {"uk","creditTerms","Validation"})
	public void clickNoCreditTerms() {  //fluent wait issue need to write finsin element in credit page
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();
		
		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//cr1
		CreditTermsPage credit=new CreditTermsPage(driver);
		Assert.assertTrue(credit.isSelectedNo());
		//credit.clickSubmit();
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.staticThreadWait(2);
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying No credit terms and submit",guarantee.getCreditAppHeaderFinish(), "FINISH");
	}
	
	@Test(groups = {"uk","creditTerms","Validation"})
	public void clickYesCreditTerms() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();
		
		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//cr1
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		Assert.assertTrue(credit.isSelectedYes());
		com.wheelpros.web.utils.Assert.assertTrue(ValidationType.HardAssertAndTakeScreenShot,"Verifying  is selected Yes in credit terms page.", true);
	}
	
	@Test(groups = {"uk","PersonalGuarantee","Validation"})
	public void clickIDoNotWishToAuthorizePersonalGuarantee(){  //need to check for submit asseert
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();
		
		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIDONOTWISHTOAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		Assert.assertTrue(guarantee.isSelectedIDONOTWISHTOAUTHORIZETHECONTINUINGPERSONALGUARANTEE());
		com.wheelpros.web.utils.Assert.assertTrue(ValidationType.HardAssertAndTakeScreenShot,"verifying I DO NOT WISH TO AUTHORIZE THE CONTINUING PERSONAL GUARANTEE is selected", true);
		//guarantee.clickSubmit();
	}
	
	@Test(groups = {"uk","PersonalGuarantee","Validation"})
	public void clickIAcknowledgeAndAuthorizeTheContinuingPersonalGuarantee(){
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		Assert.assertTrue(guarantee.isSelectedIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE());
		com.wheelpros.web.utils.Assert.assertTrue(ValidationType.HardAssertAndTakeScreenShot,"verifying I ACKNOWLEDGE AND AUTHORIZE THE CONTINUING PERSONALGUARANTEE is selected", true);
	}
	

	
	@Test(groups = {"uk","PersonalGuarantee","Validation"})
	public void  validDataGuarantor1PersonalGuarantee() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		guarantee.enterGuarantor1FirstName("Rock");
		guarantee.enterGuarantor1LastName("Huvi");
		guarantee.enterPg1StreetAddress("New town");
		guarantee.enterPg1City("Colo");
		guarantee.selectOptionFromPg1RegionDropDown("ABC");
		guarantee.enterPg1PostCode("FY1 6BF");
		guarantee.enterPg1Signature("Sandy");
		//guarantee.clickSubmit();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Data in only PG1 and submit",guarantee.getCreditAppHeaderFinish(), "FINISH");
	}
	
	@Test(groups = {"uk","CreditTerms","Validation"})
	public void signatureNeedstoClearedCreditTerms() {
	//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

	//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

	//cr1
	CreditTermsPage credit=new CreditTermsPage(driver);
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

	PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
	guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
	guarantee.enterGuarantor1FirstName("");
	
	guarantee.clickBack();
	Assert.assertEquals(credit.getSignature(), "");
    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Signature clear in credit term page",credit.getSignature(), "");	
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor1PersonalGuaranteeFirstName() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		guarantee.enterGuarantor1LastName("Huvi");
		guarantee.enterPg1StreetAddress("New town");
		guarantee.enterPg1City("Colo");
		guarantee.selectOptionFromPg1RegionDropDown("ABC");
		guarantee.enterPg1PostCode("FY1 6BF");
		guarantee.enterPg1Signature("Sandy");
		guarantee.clickSubmit();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 First Name error message.",guarantee.getGuarantor1FirstNameErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor1PersonalGuaranteeLastName() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		guarantee.enterGuarantor1FirstName("Hilton");
		guarantee.enterPg1StreetAddress("New town");
		guarantee.enterPg1City("Colo");
		guarantee.selectOptionFromPg1RegionDropDown("ABC");
		guarantee.enterPg1PostCode("FY1 6BF");
		guarantee.enterPg1Signature("Sandy");
		guarantee.clickSubmit();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 Last Name error message.",guarantee.getGuarantor1LasstNameErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor1PersonalGuaranteeStreetAddress() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		guarantee.enterGuarantor1FirstName("Hilton");
		guarantee.enterGuarantor1LastName("Huvi");
		guarantee.enterPg1City("Colo");
		guarantee.selectOptionFromPg1RegionDropDown("ABC");
		guarantee.enterPg1PostCode("FY1 6BF");
		guarantee.enterPg1Signature("Sandy");
		guarantee.clickSubmit();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 Street Address error message.",guarantee.getPg1StreetAddressErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor1PersonalGuaranteeCity() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		guarantee.enterGuarantor1FirstName("Hilton");
		guarantee.enterGuarantor1LastName("Huvi");
		guarantee.enterPg1StreetAddress("New town");
		guarantee.selectOptionFromPg1RegionDropDown("ABC");
		guarantee.enterPg1PostCode("FY1 6BF");
		guarantee.enterPg1Signature("Sandy");
		guarantee.clickSubmit();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 City error message.",guarantee.getPg1CityErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor1PersonalGuaranteeRegion() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		guarantee.enterGuarantor1FirstName("Hilton");
		guarantee.enterGuarantor1LastName("Huvi");
		guarantee.enterPg1StreetAddress("New town");
		guarantee.enterPg1City("Colo");
		guarantee.enterPg1PostCode("FY1 6BF");
		guarantee.enterPg1Signature("Sandy");
		guarantee.clickSubmit();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 Region error message.",guarantee.getPg1RegionErrorMessage(), "This field is required.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor1PersonalGuaranteePostCode() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		guarantee.enterGuarantor1FirstName("Hilton");
		guarantee.enterGuarantor1LastName("Huvi");
		guarantee.enterPg1StreetAddress("New town");
		guarantee.enterPg1City("Colo");
		guarantee.selectOptionFromPg1RegionDropDown("ABC");
		guarantee.enterPg1Signature("Sandy");
		guarantee.clickSubmit();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 PostCode error message.",guarantee.getPg1PostCodeErrorMessage(), "This field is required.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor1PersonalGuaranteeSignature() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		guarantee.enterGuarantor1FirstName("Hilton");
		guarantee.enterGuarantor1LastName("Huvi");
		guarantee.enterPg1StreetAddress("New town");
		guarantee.enterPg1City("Colo");
		guarantee.selectOptionFromPg1RegionDropDown("ABC");
		guarantee.enterPg1PostCode("FY1 6BF");
		guarantee.clickSubmit();
		Assert.assertEquals(guarantee.getPg1SignatureErrorMessage(), "Complete this field.");
		guarantee.staticThreadWait(4);
		guarantee.takeScreenShot("excludeDataGuarantor1PersonalGuaranteeSignature.png");
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 Signature error message.",guarantee.getPg1SignatureErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor2PersonalGuaranteeFirstName() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		NewCreditAppFlows guarantee1=new NewCreditAppFlows(driver);
		guarantee1.enterPersonalGuarantee1DetailsUk();
		
		//pg2
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
			guarantee.enterGuarantor2LastName("days");
			guarantee.enterPg2StreetAddress("ghatkopar");
			guarantee.enterPg2City("navi mumbai");
			guarantee.selectOptionFromPg2RegionDropDown("ABC");
			guarantee.enterPg2PostCode("FY1 6BF");
			guarantee.enterPg2Signature("vivan");
			guarantee.clickSubmit();
		    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 First Name error message.",guarantee.getGuarantor2FirstNameErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor2PersonalGuaranteeLastName() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		NewCreditAppFlows guarantee1=new NewCreditAppFlows(driver);
		guarantee1.enterPersonalGuarantee1DetailsUk();
		
		//pg2
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
			guarantee.enterGuarantor2FirstName("Shashi");
			guarantee.enterPg2StreetAddress("ghatkopar");
			guarantee.enterPg2City("navi mumbai");
			guarantee.selectOptionFromPg2RegionDropDown("ABC");
			guarantee.enterPg2PostCode("FY1 6BF");
			guarantee.enterPg2Signature("vivan");
			guarantee.clickSubmit();
		    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 Last Name error message.",guarantee.getGuarantor2LasstNameErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor2PersonalGuaranteeStreetAddress() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		NewCreditAppFlows guarantee1=new NewCreditAppFlows(driver);
		guarantee1.enterPersonalGuarantee1DetailsUk();
		
		//pg2
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
			guarantee.enterGuarantor2FirstName("Shashi");
			guarantee.enterGuarantor2LastName("days");
			guarantee.enterPg2City("navi mumbai");
			guarantee.selectOptionFromPg2RegionDropDown("ABC");
			guarantee.enterPg2PostCode("FY1 6BF");
			guarantee.enterPg2Signature("vivan");
			guarantee.clickSubmit();
		    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 Street Address error message.",guarantee.getPg2StreetAddressErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor2PersonalGuaranteeCity() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		NewCreditAppFlows guarantee1=new NewCreditAppFlows(driver);
		guarantee1.enterPersonalGuarantee1DetailsUk();
		
		//pg2
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
			guarantee.enterGuarantor2FirstName("Shashi");
			guarantee.enterGuarantor2LastName("days");
			guarantee.enterPg2StreetAddress("ghatkopar");
			guarantee.selectOptionFromPg2RegionDropDown("ABC");
			guarantee.enterPg2PostCode("FY1 6BF");
			guarantee.enterPg2Signature("vivan");
			guarantee.clickSubmit();
		    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 City error message.",guarantee.getPg2CityErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor2PersonalGuaranteeRegion() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		NewCreditAppFlows guarantee1=new NewCreditAppFlows(driver);
		guarantee1.enterPersonalGuarantee1DetailsUk();
		
		//pg2
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
			guarantee.enterGuarantor2FirstName("Shashi");
			guarantee.enterGuarantor2LastName("days");
			guarantee.enterPg2StreetAddress("ghatkopar");
			guarantee.enterPg2City("navi mumbai");
			guarantee.enterPg2PostCode("FY1 6BF");
			guarantee.enterPg2Signature("vivan");
			guarantee.clickSubmit();
		    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 Region error message.",guarantee.getPg2RegionErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor2PersonalGuaranteePostCode() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		NewCreditAppFlows guarantee1=new NewCreditAppFlows(driver);
		guarantee1.enterPersonalGuarantee1DetailsUk();
		
		//pg2
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
			guarantee.enterGuarantor2FirstName("Shashi");
			guarantee.enterGuarantor2LastName("days");
			guarantee.enterPg2StreetAddress("ghatkopar");
			guarantee.enterPg2City("navi mumbai");
			guarantee.selectOptionFromPg2RegionDropDown("ABC");
			guarantee.enterPg2Signature("vivan");
			guarantee.clickSubmit();
		    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 Post Code error message.",guarantee.getPg2PostCodeErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","exclude"})
	public void  excludeDataGuarantor2PersonalGuaranteeSignature() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//creditTerms page
		NewCreditAppFlows credit=new NewCreditAppFlows(driver);
		credit.enterCreditTermsDetailsUk();

		//personalGuarantee page
		NewCreditAppFlows guarantee1=new NewCreditAppFlows(driver);
		guarantee1.enterPersonalGuarantee1DetailsUk();
		
		//pg2
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
			guarantee.enterGuarantor2FirstName("Shashi");
			guarantee.enterGuarantor2LastName("days");
			guarantee.enterPg2StreetAddress("ghatkopar");
			guarantee.enterPg2City("navi mumbai");
			guarantee.selectOptionFromPg2RegionDropDown("ABC");
			guarantee.enterPg2PostCode("FY1 6BF");
			guarantee.clickSubmit();
		    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 Street Address error message.",guarantee.getPg2SignatureErrorMessage(), "Complete this field or delete guarantor #2 information, second guarantor is not required.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","validate"})
	public void testCompanyNumberValidation() {
		NewCreditAppFlows testcompanynumber=new NewCreditAppFlows(driver);
		testcompanynumber.testCompanyNumberValidationUk();
	}
	
	
	@Test(groups = {"uk","PersonalGuarantee","validate"})
	public void testCompanyNumberInValidation() {
		NewCreditAppFlows testcompanynumber=new NewCreditAppFlows(driver);
		testcompanynumber.testCompanyNumberInValidationUk();
	}
	
	
	@Test(groups = {"uk","PersonalGuarantee","validate"})
	public void testcompanynumber() {
		NewCreditAppFlows test=new NewCreditAppFlows(driver);
		test.testCompanyNumberInValidationUk();
	}
	
}

	

