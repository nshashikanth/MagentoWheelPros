package com.wheelpros.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wheelpros.qa.uk.pages.CreditTermsPage;
import com.wheelpros.qa.uk.pages.PersonalGuaranteePage;
import com.wheelpros.web.utils.ValidationType;
import com.wheelpros.qa.test.base.CreditAppBaseTest;
import com.wheelpros.qa.testflows.NewCreditAppFlows;
import com.wheelpros.qa.uk.pages.CompanyPage;
import com.wheelpros.qa.uk.pages.ContactPage;

public class CreditAppUKTestCase extends CreditAppBaseTest {

	@Test(groups = {"uk","company"})
	public void companyDetailsPageload() {
		CompanyPage cmpny = new CompanyPage(driver);
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying company page load",cmpny.getPageHeader(), "Company");
	}

	@Test(groups = {"uk","company"})
	public void companyAllMandatoryFields(){
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.btnContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying company mandatory field error message",cmpny.getCompanyNameErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","company","exclude"})
	public void excludeRegisteredName() {
		CompanyPage cmpny = new CompanyPage(driver);
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
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Registered Name error message",cmpny.getCompanyNameErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","company","exclude"})
	public void excludeCompanyNumber() {
		CompanyPage cmpny = new CompanyPage(driver);
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
		cmpny.btnContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying company number error message",cmpny.getCompanyNumberErrorMessage(), "Complete this field.");
	}

	@Test(groups = {"uk","PersonalGuarantee","validate"})
	public void validateCompanyNumber() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("UKtestUAT");
		cmpny.enterTradingName("test");
		cmpny.enterCompanyNumber("156782456789012345");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("109811230");
		cmpny.enterYearEstablishedByCurrentOwnership("2006");
		cmpny.enterOtherNotes("new test");
		cmpny.enterStreetAddress("tilak road");
		cmpny.enterCity("gujrat");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("FY1 6BF");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();

		ContactPage cont=new ContactPage(driver);
		cont.staticThreadWait(2);
		cont.enterFirstName(" ");
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying company number error message",cont.getPageHeader(), "Contact");
	}

	@Test(groups = {"uk","PersonalGuarantee","Invalid"})
	public void InvalidCompanyNumber() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("UKtestUAT");
		cmpny.enterTradingName("test");
		cmpny.enterCompanyNumber("1567824567890345");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("109811230");
		cmpny.enterYearEstablishedByCurrentOwnership("2006");
		cmpny.enterOtherNotes("new test");
		cmpny.enterStreetAddress("tilak road");
		cmpny.enterCity("gujrat");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("FY1 6BF");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying company number error message",cmpny.getCompanyNumberErrorMessage(), "Your entry does not match the allowed pattern.");
	}
	
	@Test(groups = {"uk","PersonalGuarantee","Invalid"})
	public void InvalidCompanyNumberEnterAlphabets() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("UKtestUAT");
		cmpny.enterTradingName("test");
		cmpny.enterCompanyNumber("shashikanthshashik");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("109811230");
		cmpny.enterYearEstablishedByCurrentOwnership("2006");
		cmpny.enterOtherNotes("new test");
		cmpny.enterStreetAddress("tilak road");
		cmpny.enterCity("gujrat");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("FY1 6BF");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying company number entering alphabets error message",cmpny.getCompanyNumberErrorMessage(), "Your entry does not match the allowed pattern.");
	}

	@Test(groups = {"uk","PersonalGuarantee","Invalid"})
	public void InvalidCompanyNumberEnterspclCharacters() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("UKtestUAT");
		cmpny.enterTradingName("test");
		cmpny.enterCompanyNumber("!@#$%^&*()_+!@#$%^");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("109811230");
		cmpny.enterYearEstablishedByCurrentOwnership("2006");
		cmpny.enterOtherNotes("new test");
		cmpny.enterStreetAddress("tilak road");
		cmpny.enterCity("gujrat");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("FY1 6BF");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying company number entering special characters error message",cmpny.getCompanyNumberErrorMessage(), "Complete this field.");
	}

	@Test(groups = {"uk","company","exclude"})
	public void excludeBusinessLegalStructure() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.enterCompanyNumber("123456789012345678");
		cmpny.enterVATRegistration("123456789");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("hello");
		cmpny.enterStreetAddress("104 Hill Road");
		cmpny.enterCity("Huddersfield");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("HD3 3JB");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Business Legal Structure error message",cmpny.getBusinessLegalStructureErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","company","exclude"})
	public void excludeVATRegistration() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.enterCompanyNumber("123456789012345678");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("hello");
		cmpny.enterStreetAddress("104 Hill Road");
		cmpny.enterCity("Huddersfield");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("HD3 3JB");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("");
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying not passing value in VAT Registration",cont.getPageHeader(), "Contact");
	}

	@Test(groups = {"uk","company","Invalid"})
	public void InvalidVATRegistration() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.enterCompanyNumber("123456789012345678");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("123dh");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("hello");
		cmpny.enterStreetAddress("104 Hill Road");
		cmpny.enterCity("Huddersfield");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("HD3 3JB");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying invalid entry in Vat registration field error message",cmpny.getVATRegistrationErrorMessage(), "Your entry does not match the allowed pattern.");
	}

	@Test(groups = {"uk","company","Invalid"})
	public void InvalidVATRegistrationspclCharacter() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.enterCompanyNumber("123456789012345678");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("!@#$%^&*");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("hello");
		cmpny.enterStreetAddress("104 Hill Road");
		cmpny.enterCity("Huddersfield");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("HD3 3JB");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();
		
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("");
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Vat Registration entering special characters",cont.getPageHeader(), "Contact");
	}


	@Test(groups = {"uk","company","exclude"})
	public void excludeYearEstablishedByCurrentOwnership() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.enterCompanyNumber("123456789012345678");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("123456789");
		cmpny.enterOtherNotes("hello");
		cmpny.enterStreetAddress("104 Hill Road");
		cmpny.enterCity("Huddersfield");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("HD3 3JB");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Year of Establishment by Current year error message",cmpny.getYearEstablishedByCurrentOwnershipErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","company","exclude"})
	public void excludeStreetAddress() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.enterCompanyNumber("123456789012345678");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("123456789");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("hello");
		cmpny.enterCity("Huddersfield");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("HD3 3JB");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying street address error message",cmpny.getStreetAddressErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","company","Invalid"})
	public void InvalidYearEstablishedByCurrentOwnership(){
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.enterCompanyNumber("123456789012345678");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("123456789");
		cmpny.enterYearEstablishedByCurrentOwnership("10000");
		cmpny.enterOtherNotes("hello");
		cmpny.takeScreenShot("InvalidYearEstablishedByCurrentOwnership.png");
		cmpny.enterStreetAddress("104 Hill Road");
		cmpny.enterCity("Huddersfield");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("HD3 3JB");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();;
		cmpny.btnContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying invalid year error message",cmpny.getYearEstablishedByCurrentOwnershipErrorMessage(), "Please enter a valid year.");
	}

	@Test(groups = {"uk","company","exclude"})
	public void excludeCity() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.enterCompanyNumber("123456789012345678");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("123456789");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("hello");
		cmpny.enterStreetAddress("104 Hill Road");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("HD3 3JB");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying City error message",cmpny.getCityErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","company","exclude"})
	public void excludeRegion() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.enterCompanyNumber("123456789012345678");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("123456789");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("hello");
		cmpny.enterStreetAddress("104 Hill Road");
		cmpny.enterCity("Huddersfield");
		cmpny.enterPostCode("HD3 3JB");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Region error message",cmpny.getRegioErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","company","exclude"})
	public void excludeIstheBusinessOperatingAtTheOwnerResidenceCompany() {
		CompanyPage cmpny = new CompanyPage(driver);
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
		cmpny.btnContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Is the Business Operating At The Owner Residence error message",cmpny.getIstheBusinessOperatingAtTheOwnerResidenceErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","company","exclude"})
	public void excludeOtherNotes()  {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.enterCompanyNumber("123456789012345678");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("123456789");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterStreetAddress("104 Hill Road");
		cmpny.enterCity("Huddersfield");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("HD3 3JB");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();

		ContactPage cont=new ContactPage(driver);
		cont.staticThreadWait(4);
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying other notes field blank empty ",cont.getPageHeader(), "Contact");
	}

	@Test(groups = {"uk","company","Validation"}, testName = "testid")
	public void drpDwnselectLastRegionandMiddleRegion() {
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("Nsight");
		cmpny.enterTradingName("4sight");
		cmpny.enterCompanyNumber("123456789012345678");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("123456789");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("hello");
		cmpny.enterStreetAddress("104 Hill Road");
		cmpny.enterCity("Huddersfield");
		cmpny.clickRegion("ZET");
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying select Last region ",cmpny.getRegionName(), "Shetland Islands");
		cmpny.clickRegion("LBC");
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying select Middle region ",cmpny.getRegionName(), "Lisburn&Castlereagh");
	}

	@Test(groups = {"uk","company","Validation"})
	public void VaildDatasubmitCompanyPage() {
		CompanyPage cmpny = new CompanyPage(driver);
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
		ContactPage cont=new ContactPage(driver);
		cont.staticThreadWait(2);
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data in company page",cont.getPageHeader(), "Contact");
	}

	@Test(groups = {"uk","contact","exclude"})
	public void excludeFirstNameContactPage(){
		//Company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		ContactPage cont=new ContactPage(driver);
		cont.enterLastName("Hessel");
		cont.enterEmailAddress("Giovanni@gmail.com");
		cont.enterPhone("+447975777666");
		cont.enterAPFirstName("Giovanni");
		cont.enterAPLastName("Hessel");
		cont.enterAPEmailAddress("Giovanni@gmail.com");
		cont.enterAPPhone("+447975777666");
		cont.clickContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying contact page first name error message",cont.getFirstNameErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","contact","exclude"})
	public void excludeLastNameContactPage(){
		//Company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterEmailAddress("Giovanni@gmail.com");
		cont.enterPhone("+447975777666");
		cont.enterAPFirstName("Giovanni");
		cont.enterAPLastName("Hessel");
		cont.enterAPEmailAddress("Giovanni@gmail.com");
		cont.enterAPPhone("+447975777666");
		cont.clickContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying contact page last name error message",cont.getLastNameErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","contact","exclude"})
	public void excludeEmailAddressContactPage(){
		//Company Page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterLastName("Hessel");
		cont.enterPhone("+447975777666");
		cont.enterAPFirstName("Giovanni");
		cont.enterAPLastName("Hessel");
		cont.enterAPEmailAddress("Giovanni@gmail.com");
		cont.enterAPPhone("+447975777666");
		cont.clickContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying contact page Email address error message",cont.getEmailAddressErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","contact","exclude"})
	public void excludePhoneContactPage() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterLastName("Hessel");
		cont.enterEmailAddress("Giovanni@gmail.com");
		cont.enterAPFirstName("Giovanni");
		cont.enterAPLastName("Hessel");
		cont.enterAPEmailAddress("Giovanni@gmail.com");
		cont.enterAPPhone("+447975777666");
		cont.clickContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying contact page phone error message",cont.getPhoneErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","contact","Validation"})
	public void ValidationInvaliEmailContactPage() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterLastName("Hessel");
		cont.enterEmailAddress("Giovanni@gmail");
		cont.enterPhone("+447975777666");
		cont.enterAPFirstName("Giovanni");
		cont.enterAPLastName("Hessel");
		cont.enterAPEmailAddress("Giovanni@gmail.com");
		cont.enterAPPhone("+447975777666");
		cont.clickContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying contact page Email address invalid error message",cont.getEmailAddressInvalidErrorMessage(), "Your entry does not match the allowed pattern.");
	}

	@Test(groups = {"uk","contact","Validation"})
	public void ValidationInvalidPhoneContactPage(){
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterLastName("Hessel");
		cont.enterEmailAddress("Giovanni@gmail.com");
		cont.enterPhone("0245678909");
		cont.clickContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying contact page phone invalid error message",cont.getPhoneErrorMessage(), "Invalid Format");
	}

	@Test(groups = {"uk","contact","Validation"})
	public void ValidationLessThanTenDigitPhoneContactPage(){
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterLastName("Hessel");
		cont.enterEmailAddress("Giovanni@gmail.com");
		cont.enterPhone("024567890");
		cont.clickContinue();
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying contact page phone number less than 10 digits invalid error message",cont.getPhoneErrorMessage(), "Invalid Format");
	}

	@Test(groups = {"uk","contact","Validation"})
	public void ValidationMoreThanTenDigitPhoneContactPage(){
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterLastName("Hessel");
		cont.enterEmailAddress("Giovanni@gmail.com");
		cont.enterPhone("07700900077");
		cont.enterAPFirstName("Giovanni");
		cont.enterAPLastName("Hessel");
		cont.enterAPEmailAddress("Giovanni@gmail.com");
		cont.enterAPPhone("+447975777666");
		cont.clickContinue();
		CreditTermsPage credit=new CreditTermsPage(driver);
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying contact page phone number enter more than 10 digits and it trims etc digit",credit.getPageHeader(), "Credit Terms");
	}

	@Test(groups = {"uk","contact","Validation"})
	public void VaildDataContactPage() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("Giovanni");
		cont.enterLastName("Hessel");
		cont.enterEmailAddress("Giovanni@gmail.com");
		cont.enterPhone("+447975777666");
		cont.enterAPFirstName("Giovanni");
		cont.enterAPLastName("Hessel");
		cont.enterAPEmailAddress("Giovanni@gmail.com");
		cont.enterAPPhone("+447975777666");
		cont.clickContinue();
		//cr1
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.staticThreadWait(2);
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data in contact page ",credit.getPageHeader(), "Credit Terms");
	}

	@Test(groups = {"uk","creditTerms","Validation"})
	public void lbl20thProxCreditTerms() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//cr1
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.staticThreadWait(2);
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying 20th Prox Credit Terms  page ",credit.get20thProxCreditTerms(), "Would you like to request Net 20th Prox credit terms? (Payment due on or before the 20th day of the following month).*");
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
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying select yes for credit terms",credit.getCreditAppHeader(), "PERSONAL GUARANTEE");
	}

	@Test(groups = {"uk","creditTerms","Validation"})
	public void mandatroyFiledsEmptyCreditTerms() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//cr1
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
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

		//signer info 
		Assert.assertEquals(credit.getSInfoFirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoLastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoEmailAddressErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoStreetAddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoCityErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoCountryErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoRegionErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPostCodeErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoSignatureErrorMessage(), "This field is required.");
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying mandatroy Fileds Empty Credit Terms page",credit.getSInfoSignatureErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","creditTerms","Validation"})
	public void validDataInCreditReference1CreditTerms(){
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
		credit.clickContinue();
		credit.takeScreenShot("validDataInCreditReference1.png");

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

		//signer info 
		Assert.assertEquals(credit.getSInfoFirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoLastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoEmailAddressErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoStreetAddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoCityErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoCountryErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoRegionErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPostCodeErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoSignatureErrorMessage(), "This field is required.");
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data only in CR1 and error message",credit.getSInfoSignatureErrorMessage(), "This field is required.");
	}

  /*	@Test(groups = {"uk","creditTerms","Validation"}) //Need to check on this 039
	public void validDataInCreditReference2CreditTerms(){
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		//cr2
		credit.enterCR2VendorName("Henry");
		credit.enterCR2Phone("+447975777666");
		credit.enterCR2Emailaddress("Henry@gmail.com");
		credit.enterCR2City("New");
		//credit.staticThreadWait(2);
		credit.selectOptionFromCR2RegionDropDown("AGB");
		credit.staticThreadWait(2);
		credit.clickContinue();

		//cr1
		Assert.assertEquals(credit.getCR1VendorNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getCR1PhoneErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1EmailaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1CityaddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getCR1RegionaddressErrorMessage(),"This field is required.");
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

		//signer info 
		Assert.assertEquals(credit.getSInfoFirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoLastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoEmailAddressErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoStreetAddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoCityErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoCountryErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoRegionErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPostCodeErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoSignatureErrorMessage(), "This field is required.");
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data only in CR2 and error message",credit.getSInfoSignatureErrorMessage(), "This field is required.");
	}	*/

	@Test(groups = {"uk","creditTerms","Validation"})
	public void validDataInOwner1CreditTerms() {
		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		//cr1
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();

		//owner1
		credit.enterOwner1FirstName("Dim");
		credit.enterOwner1LastName("Carry");
		credit.enterOwner1Phone("+447975777666");
		credit.enterOwner1Emailaddress("dim@gmail.com");
		credit.clickContinue();

		//cr1
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

		//project purchase
		Assert.assertEquals(credit.getProjectedMonthlyPurchaseTotalErrorMessage(),"This field is required.");

		//signer info 
		Assert.assertEquals(credit.getSInfoFirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoLastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoEmailAddressErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoStreetAddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoCityErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoCountryErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoRegionErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPostCodeErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoSignatureErrorMessage(), "This field is required.");
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data only in owner1 and error message",credit.getSInfoSignatureErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk","creditTerms","Validation"})
	public void validDataInOwner2CreditTerms() {

		//company page
		NewCreditAppFlows cmpny=new NewCreditAppFlows(driver);
		cmpny.enterCompanyDetailsForUk();

		//contact page
		NewCreditAppFlows cont=new NewCreditAppFlows(driver);
		cont.enterContactDetailsUk();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.enterOwner2FirstName("Dim");
		credit.enterOwner2LastName("Carry");
		credit.enterOwner2Phone("+447975777666");
		credit.enterOwner2Emailaddress("dim@gmail.com");
		credit.clickContinue();

		//cr1
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

		//signer info 
		Assert.assertEquals(credit.getSInfoFirstNameErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoLastNameErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPhoneErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoEmailAddressErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoStreetAddressErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoCityErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoCountryErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoRegionErrorMessage(), "This field is required.");
		Assert.assertEquals(credit.getSInfoPostCodeErrorMessage(),"This field is required.");
		Assert.assertEquals(credit.getSInfoSignatureErrorMessage(), "This field is required.");
	    com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data only in owner2 and error message",credit.getSInfoSignatureErrorMessage(), "This field is required.");
	}

	@Test(groups = {"uk"})
	public void dealerEnrollmentTest(){
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.enterRegisteredName("test trade name");
		cmpny.enterTradingName("uk");
		cmpny.enterCompanyNumber("156786789054345678");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("Trust");
		cmpny.enterVATRegistration("109811288");
		cmpny.enterYearEstablishedByCurrentOwnership("2006");
		cmpny.enterOtherNotes("with credit terms");
		cmpny.enterStreetAddress("tilak road");
		cmpny.enterCity("gujrat");
		cmpny.clickRegion("ABC");
		cmpny.enterPostCode("FY1 6BF");
		cmpny.clickYesIstheBusinessOperatingAtTheOwnerResidence();
		cmpny.btnContinue();

		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("test UK");
		cont.enterLastName("trade name");
		cont.enterEmailAddress("a@g.com");
		cont.enterPhone("+447972996996");
		cont.enterAPFirstName("Adaniport");
		cont.enterAPLastName("sea3");
		cont.enterAPEmailAddress("a@g.com");
		cont.enterAPPhone("+447955279926");
		cont.clickContinue();

		//cr1
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		//credit.enterSevenDigitWheelProsAccountNumber("1234567");
		credit.enterCR1VendorName("adani power");
		credit.enterCR1Phone("+447235777996");
		credit.enterCR1Emailaddress("power@gmail.com");
		credit.enterCR1City("ahmdbad");
		credit.selectOptionFromCR1RegionDropDown("ABC");

		//CR2
		credit.enterCR2VendorName("solar");
		credit.enterCR2Phone("+444975788266");
		credit.enterCR2Emailaddress("solar@gmail.com");
		credit.enterCR2City("power");
		credit.selectOptionFromCR2RegionDropDown("ABC");

		//CR3
		credit.enterCR3VendorName("airport");
		credit.enterCR3Phone("+447225777996");
		credit.enterCR3Emailaddress("airport9@gmail.com");
		credit.enterCR3City("plane");
		credit.selectOptionFromCR3RegionDropDown("ABC");

		//owner1
		credit.enterOwner1FirstName("GVK");
		credit.enterOwner1LastName("SMT");
		credit.enterOwner1Phone("+447998777266");
		credit.enterOwner1Emailaddress("gvk@gmail.com");

		//owner2
		credit.enterOwner2FirstName("blore");
		credit.enterOwner2LastName("mysore");
		credit.enterOwner2Phone("+447972997666");
		credit.enterOwner2Emailaddress("blore@gmail.com");

		//project
		credit.enterProjectedMonthlyPurchaseTotal("980");

		//signer info
		credit.enterSInfoFirstName("rahul");
		credit.enterSInfoLastName("james");
		credit.enterSInfoPhone("+447989947666");
		credit.enterSInfoEmailAddress("rahulk@gmail.com");
		credit.enterSInfoStreetAddress("water");
		credit.enterSInfoCity("DE");
		credit.selectOptionFromCountryDropDown("GB-England");
		credit.selectOptionFromSInfoRegionDropDown("ABC");
		credit.enterPostCode("FY1 6BF");
		credit.enterSignature("rahul");
		credit.clickContinue();

		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		guarantee.enterGuarantor1FirstName("jay");
		guarantee.enterGuarantor1LastName("hiten");
		guarantee.enterPg1StreetAddress("powai");
		guarantee.enterPg1City("airoli");
		guarantee.selectOptionFromPg1RegionDropDown("ABC");
		guarantee.enterPg1PostCode("FY1 6BF");
		guarantee.enterPg1Signature("jay");

		//Guarantee 2
		guarantee.enterGuarantor2FirstName("vivan");
		guarantee.enterGuarantor2LastName("days");
		guarantee.enterPg2StreetAddress("ghatkopar");
		guarantee.enterPg2City("navi mumbai");
		guarantee.selectOptionFromPg2RegionDropDown("ABC");
		guarantee.enterPg2PostCode("FY1 6BF");
		guarantee.enterPg2Signature("vivan");
		//guarantee.click();
	  com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data and submit finish page",guarantee.getCreditAppHeaderFinish(), "FINISH");
	}

}
