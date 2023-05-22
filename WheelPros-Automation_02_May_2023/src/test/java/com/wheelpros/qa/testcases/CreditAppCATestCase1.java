package com.wheelpros.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wheelpros.qa.ca.pages.CompanyPage;
import com.wheelpros.qa.ca.pages.ContactPage;
import com.wheelpros.qa.ca.pages.CreditTermsPage;
import com.wheelpros.qa.ca.pages.PersonalGuaranteePage;
import com.wheelpros.qa.test.base.CreditAppBaseTest;
import com.wheelpros.qa.testflows.NewCreditAppFlows;
import com.wheelpros.web.utils.ValidationType;


public class CreditAppCATestCase1 extends CreditAppBaseTest {
	
	@Test(groups = {"ca","creditTerms","037","validate"})
	public void validDataInCreditReference1CreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact Page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.enterSevenDigitWheelProsAccountNumber("1234567");
		credit.clickTermsCondition();
		//Credit Ref 1
		credit.enterCR1VendorName("Rock");
		credit.enterCR1Phone("1111111111");
		credit.enterCR1Emailaddress("rock@gmail.com");
		credit.enterCR1City("new");
		credit.selectOptionFromCR1ProvinceDropDown("AB");
		credit.clickContinue();
		//Bank info
		Assert.assertEquals(credit.getBankAccountNumberErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getBankAccountNumberErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCityrErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getProvinceErrorMessage(), "This field is required.");

		//cr2
		Assert.assertEquals(credit.getCR2VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR2PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2CityErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2ProvinceErrorMessage(),"This field is required.");

		//cr3
		Assert.assertEquals(credit.getCR3VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR3PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3CityErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3ProvinceErrorMessage(),"This field is required.");

		//Owner1
		Assert.assertEquals(credit.getCOwner1FirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCOwner1LastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCOwner1PhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCOwner1EmailaddressErrorMessage(), "This field is required.");

		//project purchase
		Assert.assertEquals(credit.getProjectedMonthlyPurchaseTotalErrorMessage(),"This field is required.");

		//signer info 
		Assert.assertEquals(credit.getSInfoFirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoLastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoEmailAddressErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoStreetAddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoCityErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoProvinceErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPostalCodeErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoSignatureErrorMessage(), "This field is required.");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data in only credit ref1 and other fields error message.",credit.getSInfoSignatureErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","creditTerms","038","validate"})
	public void validDataInCreditReference2CreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();

		//Credit Ref 2
		credit.enterCR2VendorName("Rock");
		credit.enterCR2Phone("1111111111");
		credit.enterCR2Emailaddress("rock@gmail.com");
		credit.enterCR2City("new");
		credit.selectOptionFromCR2ProvinceDropDown("AB");
		credit.clickContinue();
		Assert.assertEquals(credit.getAgreeTcErrorMessage(),"This field is required.");

		//Bank info
		Assert.assertEquals(credit.getBankAccountNumberErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getBankAccountNumberErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCityrErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getProvinceErrorMessage(), "This field is required.");
		//cr1
		Assert.assertEquals(credit.getCR1VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR1PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1CityErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1ProvinceErrorMessage(),"This field is required.");

		//cr3
		Assert.assertEquals(credit.getCR3VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR3PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3CityErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3ProvinceErrorMessage(),"This field is required.");

		//Owner1
		Assert.assertEquals(credit.getCOwner1FirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCOwner1LastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCOwner1PhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCOwner1EmailaddressErrorMessage(), "This field is required.");

		//project purchase
		Assert.assertEquals(credit.getProjectedMonthlyPurchaseTotalErrorMessage(),"This field is required.");

		//signer info 
		Assert.assertEquals(credit.getSInfoFirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoLastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoEmailAddressErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoStreetAddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoCityErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoProvinceErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPostalCodeErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoSignatureErrorMessage(), "This field is required.");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data in only credit ref2 and other fields error message.",credit.getSInfoSignatureErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","creditTerms","039","validate"})
	public void validDataInOwner1CreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact Page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();

		//Owner info 1
		credit.enterOwner1FirstName("Rain");
		credit.enterOwner1LastName("Roy");
		credit.enterOwner1Phone("Roy");
		credit.enterOwner1Phone("1111111111");
		credit.enterOwner1Emailaddress("xyz@gmail.com");
		credit.clickContinue();
		Assert.assertEquals(credit.getAgreeTcErrorMessage(),"This field is required.");

		//Bank info
		Assert.assertEquals(credit.getBankAccountNumberErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getBankAccountNumberErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCityrErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getProvinceErrorMessage(), "This field is required.");
		//cr1
		Assert.assertEquals(credit.getCR1VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR1PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1CityErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1ProvinceErrorMessage(),"This field is required.");

		//cr2
		Assert.assertEquals(credit.getCR2VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR2PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2CityErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2ProvinceErrorMessage(),"This field is required.");

		//cr3
		Assert.assertEquals(credit.getCR3VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR3PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3CityErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3ProvinceErrorMessage(),"This field is required.");

		//project purchase
		Assert.assertEquals(credit.getProjectedMonthlyPurchaseTotalErrorMessage(),"This field is required.");

		//signer info 
		Assert.assertEquals(credit.getSInfoFirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoLastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoEmailAddressErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoStreetAddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoCityErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoProvinceErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPostalCodeErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoSignatureErrorMessage(), "This field is required.");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data in only owner1 and other fields error message.",credit.getSInfoSignatureErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","creditTerms","040","validate"})
	public void validDataInOwner2CreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();

		//Owner info 2
		credit.enterOwner2FirstName("Rain");
		credit.enterOwner2LastName("Rain");
		credit.enterOwner2Phone("1111111111");
		credit.enterOwner2Emailaddress("xyz@gmail.com");
		credit.clickContinue();
		Assert.assertEquals(credit.getAgreeTcErrorMessage(),"This field is required.");

		//Bank info
		Assert.assertEquals(credit.getBankAccountNumberErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getBankAccountNumberErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCityrErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getProvinceErrorMessage(), "This field is required.");
		//cr1
		Assert.assertEquals(credit.getCR1VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR1PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1CityErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1ProvinceErrorMessage(),"This field is required.");

		//cr2
		Assert.assertEquals(credit.getCR2VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR2PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2CityErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2ProvinceErrorMessage(),"This field is required.");

		//cr3
		Assert.assertEquals(credit.getCR3VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR3PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3CityErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3ProvinceErrorMessage(),"This field is required.");
		//Owner1
		Assert.assertEquals(credit.getCOwner1FirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCOwner1LastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCOwner1PhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCOwner1EmailaddressErrorMessage(), "This field is required.");

		//project purchase
		Assert.assertEquals(credit.getProjectedMonthlyPurchaseTotalErrorMessage(),"This field is required.");

		//signer info 
		Assert.assertEquals(credit.getSInfoFirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoLastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoEmailAddressErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoStreetAddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoCityErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoProvinceErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPostalCodeErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoSignatureErrorMessage(), "This field is required.");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data in only owner2 and other fields error message.",credit.getSInfoSignatureErrorMessage(), "This field is required.");
	}
	
	@Test(groups = {"ca","creditTerms","041","validate"})
	public void validDataInSignerInformationCreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
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
		Assert.assertEquals(credit.getAgreeTcErrorMessage(),"This field is required.");

		//Bank info
		Assert.assertEquals(credit.getBankAccountNumberErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getBankAccountNumberErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCityrErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getProvinceErrorMessage(), "This field is required.");
		//cr1
		Assert.assertEquals(credit.getCR1VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR1PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1CityErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1ProvinceErrorMessage(),"This field is required.");

		//cr2
		Assert.assertEquals(credit.getCR2VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR2PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2CityErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR2ProvinceErrorMessage(),"This field is required.");

		//cr3
		Assert.assertEquals(credit.getCR3VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR3PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3CityErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR3ProvinceErrorMessage(),"This field is required.");
		//Owner1
		Assert.assertEquals(credit.getCOwner1FirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCOwner1LastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCOwner1PhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCOwner1EmailaddressErrorMessage(), "This field is required.");
		//project purchase
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Projected Monthly Purchase Total Error Message",credit.getProjectedMonthlyPurchaseTotalErrorMessage(), "This field is required.");
	}
	
	@Test(groups = {"ca","creditTerms","042","validate"})
	public void validDataAllMandatoryFieldsCreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

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

		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.staticThreadWait(2);
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data and Personal Guarantee page",guarantee.getPageHeader(), "Personal Guarantee");
	}
	
	@Test(groups = {"ca","creditTerms","043","validate"})
	public void ProjectedMonthlyPurchaseTotalCreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();
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
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying project monthly purchase total error message",credit.getProjectedMonthlyPurchaseTotalErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","creditTerms","044","validate"})
	public void clickNoCreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		Assert.assertTrue(credit.isSelectedNo());
		//credit.clickSubmit();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying credit terms no and submit",credit.getFinishPageHeader(), "FINISH");
	}
	
	@Test(groups = {"ca","creditTerms","045","validate"})
	public void clickYesCreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		com.wheelpros.web.utils.Assert.assertTrue(ValidationType.HardAssertAndTakeScreenShot,"credit terms is selected yes", true);
	}
	
	@Test(groups = {"ca","PersonalGuarantee","047","validate"})
	public void clickIDoNotWishToAuthorizePersonalGuarantee() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();
		
		//CreditTerms Page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIDONOTWISHTOAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		Assert.assertTrue(guarantee.isSelectedIDONOTWISHTOAUTHORIZETHECONTINUINGPERSONALGUARANTEE());
		//guarantee.clickSubmit();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"verfying I Do Not Wish To Authorize Personal Guarantee and submit",guarantee.getFinishPageHeader(), "FINISH");
	}
	
	@Test(groups = {"ca","PersonalGuarantee","048","validate"})
	public void clickIAcknowledgeAndAuthorizeTheContinuingPersonalGuarantee() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//CreditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		com.wheelpros.web.utils.Assert.assertTrue(ValidationType.HardAssertAndTakeScreenShot,"I ACKNOWLEDGE AND AUTHORIZE THE CONTINUING PERSONAL GUARANTEE is selected.", true);
	}
	
	@Test(groups = {"ca","PersonalGuarantee","050","validate"})	
	public void  validDataGuarantor1PersonalGuarantee() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		guarantee.takeScreenShot("CA_Personal.png");
		guarantee.enterGuarantor1FirstName("Max");
		guarantee.enterGuarantor1LastName("David");
		guarantee.enterPg1StreetAddress("land");
		guarantee.enterPg1City("Nox");
		guarantee.selectOptionFromPg1ProvinceDropDown();
		guarantee.enterPg1PostalCode("P0A 1J0");
		guarantee.enterPg1SIN("1111111111");
		guarantee.enterPg1Signature("Shany");
		//guarantee.clickSubmit();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data in PG1 and submit",guarantee.getFinishPageHeader(), "FINISH");
	}
	
	@Test(groups = {"ca","PersonalGuarantee","051","exclude"})	
	public void  excludeDataGuarantor1PersonalGuaranteeFirstName() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		guarantee.takeScreenShot("CA_Personal.png");
		guarantee.enterGuarantor1LastName("David");
		guarantee.enterPg1StreetAddress("land");
		guarantee.enterPg1City("Nox");
		guarantee.selectOptionFromPg1ProvinceDropDown();
		guarantee.enterPg1PostalCode("P0A 1J0");
		guarantee.enterPg1SIN("1111111111");
		guarantee.enterPg1Signature("Shany");
		guarantee.clickSubmit();
		guarantee.staticThreadWait(4);
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 first name error message.",guarantee.getGuarantor1FirstNameErrorMessage(), "Complete this field.");
	}

	@Test(groups = {"ca","PersonalGuarantee","052","exclude"})	
	public void  excludeDataGuarantor1PersonalGuaranteeLastName() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		guarantee.enterGuarantor1FirstName("Max");
		guarantee.enterPg1StreetAddress("land");
		guarantee.enterPg1City("Nox");
		guarantee.selectOptionFromPg1ProvinceDropDown();
		guarantee.enterPg1PostalCode("P0A 1J0");
		guarantee.enterPg1SIN("1111111111");
		guarantee.enterPg1Signature("Shany");
		guarantee.clickSubmit();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 last name error message.",guarantee.getGuarantor1LastNameErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"ca","PersonalGuarantee","053","exclude"})	
	public void  excludeDataGuarantor1PersonalGuaranteeStreetAddress() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		guarantee.takeScreenShot("CA_Personal.png");
		guarantee.enterGuarantor1FirstName("Max");
		guarantee.enterGuarantor1LastName("David");
		guarantee.enterPg1City("Nox");
		guarantee.selectOptionFromPg1ProvinceDropDown();
		guarantee.enterPg1PostalCode("P0A 1J0");
		guarantee.enterPg1SIN("1111111111");
		guarantee.enterPg1Signature("Shany");
		guarantee.clickSubmit();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 street address error message.",guarantee.getPg1StreetAddressErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"ca","PersonalGuarantee","054","exclude"})	
	public void  excludeDataGuarantor1PersonalGuaranteeCity() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		guarantee.takeScreenShot("CA_Personal.png");
		guarantee.enterGuarantor1FirstName("Max");
		guarantee.enterGuarantor1LastName("David");
		guarantee.enterPg1StreetAddress("land");
		guarantee.selectOptionFromPg1ProvinceDropDown();
		guarantee.enterPg1PostalCode("P0A 1J0");
		guarantee.enterPg1SIN("1111111111");
		guarantee.enterPg1Signature("Shany");
		guarantee.clickSubmit();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 city error message.",guarantee.getPg1CityErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"ca","PersonalGuarantee","055","exclude"})	
	public void  excludeDataGuarantor1PersonalGuaranteeProvince(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		guarantee.takeScreenShot("CA_Personal.png");
		guarantee.enterGuarantor1FirstName("Max");
		guarantee.enterGuarantor1LastName("David");
		guarantee.enterPg1StreetAddress("land");
		guarantee.enterPg1City("Nox");
		guarantee.enterPg1PostalCode("P0A 1J0");
		guarantee.enterPg1SIN("1111111111");
		guarantee.enterPg1Signature("Shany");
		guarantee.clickSubmit();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 Province error message.",guarantee.getPg1ProvinceErrorMessage(), "This field is required.");
	}
	
	@Test(groups = {"ca","PersonalGuarantee","056","exclude"})	
	public void  excludeDataGuarantor1PersonalGuaranteePostalCode(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		guarantee.takeScreenShot("CA_Personal.png");
		guarantee.enterGuarantor1FirstName("Max");
		guarantee.enterGuarantor1LastName("David");
		guarantee.enterPg1StreetAddress("land");
		guarantee.enterPg1City("Nox");
		guarantee.selectOptionFromPg1ProvinceDropDown();
		guarantee.enterPg1SIN("1111111111");
		guarantee.enterPg1Signature("Shany");
		guarantee.clickSubmit();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 Postal code error message.",guarantee.getPg1PostalCodeErrorMessage(), "This field is required.");
	}
	
	@Test(groups = {"ca","PersonalGuarantee","057","exclude"})	
	public void  excludeDataGuarantor1PersonalGuaranteeSignature(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		guarantee.takeScreenShot("CA_Personal.png");
		guarantee.enterGuarantor1FirstName("Max");
		guarantee.enterGuarantor1LastName("David");
		guarantee.enterPg1StreetAddress("land");
		guarantee.enterPg1City("Nox");
		guarantee.selectOptionFromPg1ProvinceDropDown();
		guarantee.enterPg1PostalCode("P0A 1J0");
		guarantee.enterPg1SIN("1111111111");
		guarantee.clickSubmit();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #1 signature error message.",guarantee.getPg1SignatureCodeErrorMessage(), "Complete this field.");
	}

	@Test(groups = {"ca","PersonalGuarantee","057","exclude"})	
	public void  excludeDataGuarantor2PersonalGuaranteeFirstName(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		NewCreditAppFlows gurantee1=new NewCreditAppFlows(driver);
		gurantee1.enterPersonalGuarantee1DetailsCa();
		
	    //pg2
		guarantee.enterGuarantor2LastName("shah");
		guarantee.enterPg2StreetAddress("pune");
		guarantee.enterPg2City("pune1");
		guarantee.selectOptionFromPg2ProvinceDropDown();
		guarantee.enterPg2PostalCode("P0A 1J0");
		guarantee.enterPg2SIN("1122228811");
		guarantee.enterPg2Signature("janvi");
		guarantee.clickSubmit();	
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 first name error message.",guarantee.getGuarantor2FirstNameErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"ca","PersonalGuarantee","058","exclude"})	
	public void  excludeDataGuarantor2PersonalGuaranteeLastName(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		NewCreditAppFlows gurantee1=new NewCreditAppFlows(driver);
		gurantee1.enterPersonalGuarantee1DetailsCa();
		
	    //pg2
		guarantee.enterGuarantor2FirstName("janvi");
		guarantee.enterPg2StreetAddress("pune");
		guarantee.enterPg2City("pune1");
		guarantee.selectOptionFromPg2ProvinceDropDown();
		guarantee.enterPg2PostalCode("P0A 1J0");
		guarantee.enterPg2SIN("1122228811");
		guarantee.enterPg2Signature("janvi");
		guarantee.clickSubmit();	
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 last name error message.",guarantee.getGuarantor2LastNameErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"ca","PersonalGuarantee","059","exclude"})	
	public void  excludeDataGuarantor2PersonalGuaranteeStreetAddress(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		NewCreditAppFlows gurantee1=new NewCreditAppFlows(driver);
		gurantee1.enterPersonalGuarantee1DetailsCa();
		
	    //pg2
		guarantee.enterGuarantor2FirstName("janvi");
		guarantee.enterGuarantor2LastName("shah");
		guarantee.enterPg2City("pune1");
		guarantee.selectOptionFromPg2ProvinceDropDown();
		guarantee.enterPg2PostalCode("P0A 1J0");
		guarantee.enterPg2SIN("1122228811");
		guarantee.enterPg2Signature("janvi");
		guarantee.clickSubmit();	
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 Street Address error message.",guarantee.getPg2StreetAddressErrorMessage(), "Complete this field.");
	}
	@Test(groups = {"ca","PersonalGuarantee","058","exclude"})	
	public void  excludeDataGuarantor2PersonalGuaranteeCity(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		NewCreditAppFlows gurantee1=new NewCreditAppFlows(driver);
		gurantee1.enterPersonalGuarantee1DetailsCa();
		
	    //pg2
		guarantee.enterGuarantor2FirstName("janvi");
		guarantee.enterGuarantor2LastName("shah");
		guarantee.enterPg2StreetAddress("pune");
		guarantee.selectOptionFromPg2ProvinceDropDown();
		guarantee.enterPg2PostalCode("P0A 1!0");
		guarantee.enterPg2SIN("1122228811");
		guarantee.enterPg2Signature("janvi");
		guarantee.clickSubmit();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 city error message.",guarantee.getPg2CityErrorMessage(), "Complete this field.");
	}	
	
	@Test(groups = {"ca","PersonalGuarantee","059","exclude"})	
	public void  excludeDataGuarantor2PersonalGuaranteeProvince(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		NewCreditAppFlows gurantee1=new NewCreditAppFlows(driver);
		gurantee1.enterPersonalGuarantee1DetailsCa();
		
	    //pg2
		guarantee.enterGuarantor2FirstName("janvi");
		guarantee.enterGuarantor2LastName("shah");
		guarantee.enterPg2StreetAddress("pune");
		guarantee.enterPg2City("pune1");
		guarantee.enterPg2PostalCode("P0A 1J0");
		guarantee.enterPg2SIN("1122228811");
		guarantee.enterPg2Signature("janvi");
		guarantee.clickSubmit();	
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 Province error message.",guarantee.getPg2ProvinceErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"ca","PersonalGuarantee","060","exclude"})	
	public void  excludeDataGuarantor2PersonalGuaranteePostalCode(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		NewCreditAppFlows gurantee1=new NewCreditAppFlows(driver);
		gurantee1.enterPersonalGuarantee1DetailsCa();
		
	    //pg2
		guarantee.enterGuarantor2FirstName("janvi");
		guarantee.enterGuarantor2LastName("shah");
		guarantee.enterPg2StreetAddress("pune");
		guarantee.enterPg2City("pune1");
		guarantee.selectOptionFromPg2ProvinceDropDown();
		guarantee.enterPg2SIN("1122228811");
		guarantee.enterPg2Signature("janvi");
		guarantee.clickSubmit();
		Assert.assertEquals(guarantee.getPg2PostalCodeErrorMessage(),"Complete this field.");	
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 Postal code error message.",guarantee.getPg2PostalCodeErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"ca","PersonalGuarantee","061","exclude"})	
	public void  excludeDataGuarantor2PersonalGuaranteeSin(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		NewCreditAppFlows gurantee1=new NewCreditAppFlows(driver);
		gurantee1.enterPersonalGuarantee1DetailsCa();
		
	    //pg2
		guarantee.enterGuarantor2FirstName("janvi");
		guarantee.enterGuarantor2LastName("shah");
		guarantee.enterPg2StreetAddress("pune");
		guarantee.enterPg2City("pune1");
		guarantee.selectOptionFromPg2ProvinceDropDown();
		guarantee.enterPg2PostalCode("P0A 1J0");
		guarantee.enterPg2Signature("janvi");
		guarantee.clickSubmit();
		Assert.assertEquals(guarantee.getPg2SINErrorMessage(),"Complete this field.");	
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 SIN error message.",guarantee.getPg2SINErrorMessage(), "Complete this field.");
	}
	
	@Test(groups = {"ca","PersonalGuarantee","062","exclude"})	
	public void  excludeDataGuarantor2PersonalGuaranteeSign(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		
		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		//creditTerms page
		NewCreditAppFlows creditData=new NewCreditAppFlows(driver);
		creditData.enterCreditTermsDetailsCa();
		
		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		NewCreditAppFlows gurantee1=new NewCreditAppFlows(driver);
		gurantee1.enterPersonalGuarantee1DetailsCa();
		
	    //pg2
		guarantee.enterGuarantor2FirstName("janvi");
		guarantee.enterGuarantor2LastName("shah");
		guarantee.enterPg2StreetAddress("pune");
		guarantee.enterPg2City("pune1");
		guarantee.selectOptionFromPg2ProvinceDropDown();
		guarantee.enterPg2PostalCode("P0A 1J0");
		guarantee.enterPg2SIN("1122228811");
		guarantee.clickSubmit();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Guarantor #2 second guarantor is not required message.",guarantee.getPg2SignatureCodeErrorMessage(), "Complete this field or delete guarantor #2 information, second guarantor is not required.");
	}

	
	@Test(groups = {"ca"})	
	public void validPostalCodeCompanyCa() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.testValidPostalCodecompanyCa();
		ContactPage cont=new ContactPage(driver);
		cont.staticThreadWait(2);
	    //com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid postal code.",cont.getPageHeader(), "Contact");
	}
	

	@Test(groups = {"ca"})	
	public void invalidPostalCodeCompanyCa() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.testInvalidPostalCodecompanyCa();
		CompanyPage cmpny=new CompanyPage(driver);
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying error message for postal code", cmpny.getPostalCodeErrorMessage(), "Please enter a valid value.");
	}
	
	@Test(groups = {"ca"})
	public void validPostalCodeCreditTermsCa() {
		NewCreditAppFlows creditpostal=new NewCreditAppFlows(driver);
		creditpostal.testPostalCodeCreditTermsCA();
	}
	
	@Test(groups = {"ca"})
	public void invalidPostalCodeCreditCa() {
		NewCreditAppFlows creditpostal=new NewCreditAppFlows(driver);
		creditpostal.testInvalidPostalCodecreditTermsCa();
	}
	
	@Test(groups = {"ca"})
	public void validPostalCodePerosnalGuaranteeCa() {
		NewCreditAppFlows pgpostalcode=new NewCreditAppFlows(driver);
		pgpostalcode.testInvalidPostalCodepersonalGuaranteeCa();
	}
	

	@Test(groups = {"ca"})
	public void testProvinceCompanyca() {
		NewCreditAppFlows testProvinceCompanyca=new NewCreditAppFlows(driver);
		testProvinceCompanyca.testProvinceCompanyCa();
	}
	

	@Test(groups = {"ca"})
	public void testProvinceCreditca() {
		NewCreditAppFlows testProvinceCreditca=new NewCreditAppFlows(driver);
		testProvinceCreditca.testProvinceCreditTermsCa();

}
}

	
	
	
	
	
	
