package com.wheelpros.qa.testcases;

import com.wheelpros.qa.ca.pages.CompanyPage;
import com.wheelpros.qa.ca.pages.ContactPage;
import com.wheelpros.qa.ca.pages.CreditTermsPage;
import com.wheelpros.qa.ca.pages.PersonalGuaranteePage;
import com.wheelpros.qa.test.base.CreditAppBaseTest;
import com.wheelpros.qa.testflows.NewCreditAppFlows;
import com.wheelpros.web.utils.ValidationType;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreditAppCATestCase extends CreditAppBaseTest{


	@Test(groups = {"ca","company", "001"})
	public void companyDetailsPageload() {
		CompanyPage cmpny = new CompanyPage(driver);
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot, "Verifying company name page load", cmpny.getPageHeader(), "Company");
	}

	@Test(groups = {"ca","company","003"})
	public void companyAllMandatoryFieldsEmptyCompany(){
		CompanyPage cmpny = new CompanyPage(driver);
		cmpny.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.SoftAssertAndTakeScreenShot, "Verifying company All Mandatory Fields Empty","" , "");

	}

	@Test(groups = {"ca","company","004","exclude"}, testName = "", description = "")
	public void excludeCompanyNameCompany() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200000");
		cmpny.enterGST1("456784564");
		cmpny.enterHST1("1234564444");
		cmpny.enterTireRecycling("200000");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot, "Verifying company name field is mandatory", cmpny.getCompanyNameErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","company","005","exclude"})
	public void excludeBusinessLegalStructureCompany() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.enterPST1("1200000");
		cmpny.enterGST1("456784564");
		cmpny.enterHST1("1234564444");
		cmpny.enterTireRecycling("200000");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying BusinessLegalStructure", cmpny.getBusinessLegalStructureErrorMessage(), "This field is required.");
	}
	
	
	//===========Adding new changes for PST,GST,HST and Tire recycling============//

	@Test(groups = {"ca","company","validate"})
	public void validatePST7Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200ABC");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying 7 characters in PST", cont.getPageHeader(), "Contact");		
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validatePST10Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200ABC789");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying 10 characters in PST", cont.getPageHeader(), "Contact");		
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validatePSTOnlyAlphabtes() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("GHIJABC");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying only alphabet in PST", cont.getPageHeader(), "Contact");		
	}
	@Test(groups = {"ca","company","validate"})
	public void validatePST11Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200ABC7890");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering  11 characters in PST should accept only 10 characters", cont.getPageHeader(), "Contact");		
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validatePST5Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("12345");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
	
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering 5 charactersin PST should display error message", cmpny.getPST1ErrorMessage(), "Your entry does not match the allowed pattern.");		
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validatePSTSpclCharacters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("!@#$%^&*");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
	
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering special characters in PST it will not accept", cont.getPageHeader(), "Contact");
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validateGST9Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200ABC789");
		cmpny.enterGST1("123456789");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"verifying GST accepting 9 characters", cont.getPageHeader(), "Contact");		
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validateGST9Alphabets() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200ABC789");
		cmpny.enterGST1("GHBJDRGHJ");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"verifying GST accepting 9 alphabets", cont.getPageHeader(), "Contact");		
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validateGST10Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200ABC789");
		cmpny.enterGST1("GHBJD56HJ0");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering  11 characters in GST should accept only 9 characters", cont.getPageHeader(), "Contact");		
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validateGST8Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200ABC789");
		cmpny.enterGST1("89768543");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering 8 characters in GST it should display error message", cmpny.getGST1ErrorMessage(), "Your entry does not match the allowed pattern.");		
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validateGSTSpclCharacters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterGST1("!@#$%^&*");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
	
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering special characters in PST it will not accept", cont.getPageHeader(), "Contact");
	}
	
	
	@Test(groups = {"ca","company","validate"})
	public void validateHST9Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterGST1("123456789");
		cmpny.enterHST1("123456789");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
	
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering 9 character in HST", cont.getPageHeader(), "Contact");
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validateHST15Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterGST1("123456789");
		cmpny.enterHST1("123456789AB2567");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
	
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering 15 character in HST", cont.getPageHeader(), "Contact");
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validateHST16Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterGST1("123456789");
		cmpny.enterHST1("123456789AB25670");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
	
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering 16 character in HST", cont.getPageHeader(), "Contact");
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validateHST8Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterGST1("123456789");
		cmpny.enterHST1("12345678");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering 8 character in HST", cmpny.getHST1ErrorMessage(), "Your entry does not match the allowed pattern.");
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validateHSTSpclCharacters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterGST1("123456789");
		cmpny.enterHST1("!@#$%^&*())(");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
	
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering special character in HST", cont.getPageHeader(), "Contact");
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validateTireRecycling15Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterGST1("123456789");
		cmpny.enterHST1("1234567899");
		cmpny.enterTireRecycling("123456789012345");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
	
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering 15 character in Tire Recycling", cont.getPageHeader(), "Contact");
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validateTireRecycling1Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterGST1("123456789");
		cmpny.enterHST1("1234567899");
		cmpny.enterTireRecycling("1");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
	
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering 1 character in Tire Recycling", cont.getPageHeader(), "Contact");
	}
	
	@Test(groups = {"ca","company","validate"})
	public void validateTireRecycling16Characters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterGST1("123456789");
		cmpny.enterHST1("1234567899");
		cmpny.enterTireRecycling("1234567890123450");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
	
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering 16 character in Tire Recycling", cont.getPageHeader(), "Contact");
	}
	
	
	@Test(groups = {"ca","company","validate"})
	public void validateTireRecyclingSpclCharacters() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterGST1("123456789");
		cmpny.enterHST1("1234567899");
		cmpny.enterTireRecycling("!@#%^&*((*&*");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
	
		ContactPage cont=new ContactPage(driver);
		cont.enterFirstName("s");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"entering Special character in Tire Recycling", cont.getPageHeader(), "Contact");
	}
	
	
	@Test(groups = {"ca","company","006","exclude"})
	public void excludeYearEstablishedByCurrentOwnershipCompany() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200000");
		cmpny.enterGST1("456780008");
		cmpny.enterHST1("123456008");
		cmpny.enterTireRecycling("200000");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Established Year",cmpny.getYearEstablishedByCurrentOwnershipErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","company","007","exclude"})
	public void excludeStreetAddressCompany() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200000");
		cmpny.enterGST1("456780008");
		cmpny.enterHST1("123456008");
		cmpny.enterTireRecycling("200000");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Street Address error message",cmpny.getStreetAddressErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","company","008","exclude"})
	public void InvalidYearEstablishedByCurrentOwnership() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("12000000");
		cmpny.enterGST1("456780900");
		cmpny.enterHST1("123456005");
		cmpny.enterTireRecycling("200000");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.enterYearEstablishedByCurrentOwnership("100");
		cmpny.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying year error message",cmpny.getValidYearEstablishedByCurrentOwnershipErrorMessage(), "Please enter a valid Year");
	}

	@Test(groups = {"ca","company","009","exclude"})
	public void excludeCity() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200");
		cmpny.enterGST1("45678");
		cmpny.enterHST1("123456");
		cmpny.enterTireRecycling("200000");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying city error message",cmpny.getCityErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","company","010","exclude"})
	public void excludeProvinceCompany() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200");
		cmpny.enterGST1("45678");
		cmpny.enterHST1("123456");
		cmpny.enterTireRecycling("200000");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying province error message",cmpny.getProvinceErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","company","011","exclude"})
	public void excludeIstheBusinessOperatingAtTheOwnerResidenceCompany() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200000");
		cmpny.enterGST1("456780004");
		cmpny.enterHST1("123456004");
		cmpny.enterTireRecycling("200000");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Business Operating At The Owner Residence error message",cmpny.getIsTheBusinessOperatingAtTheOwnerResidenceErrorMessage(), "This field is required.");
	}


	@Test(groups = {"ca","company","012","exclude"})
	public void excludeOtherNotesCompany() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200908");
		cmpny.enterGST1("456788907");
		cmpny.enterHST1("123456098");
		cmpny.enterTireRecycling("200000");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();

		ContactPage contact=new ContactPage(driver);
		contact.staticThreadWait(2);
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying other notes",contact.getPageHeader(), "Contact");
	}


	@Test(groups = {"ca","company","018","Validation"})
	public void  VaildDatasubmitCompany() {
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.enterCompanyName("Wheels");
		cmpny.takeScreenShot("CA_Compnay.png");
		cmpny.enterCompanyNameTrade("world");
		cmpny.enterParentCompany("Highway");
		cmpny.selectOptionFromBusinessLegalStructureDropDown("LLC");
		cmpny.enterPST1("1200876");
		cmpny.enterGST1("456789087");
		cmpny.enterHST1("123456908");
		cmpny.enterTireRecycling("200000");
		cmpny.enterYearEstablishedByCurrentOwnership("2002");
		cmpny.enterOtherNotes("Hello");
		cmpny.enterStreetAddress("New");
		cmpny.enterCity("Rock");
		cmpny.selectOptionFromlstProvinceDropDown("QC");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();

		ContactPage contact=new ContactPage(driver);
		contact.staticThreadWait(2);
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying data submitted in company page and move to contact page",contact.getPageHeader(), "Contact");
	}

	@Test(groups = {"ca","contact","020","Validation"})
	public void validateContactPageMandatoryErrorContact() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		ContactPage contact=new ContactPage(driver);
		contact.staticThreadWait(2);
		contact.clickContinue();
		
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Contact Page mandatory error message",contact.getFirstNameErrorMessage(), "This field is required.");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Contact Page mandatory error message",contact.getLastNameErrorMessage(), "This field is required.");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Contact Page mandatory error message",contact.getPhoneErrorMessage(), "This field is required.");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Contact Page mandatory error message",contact.getEmailAddressErrorMessage(), "This field is required.");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Contact Page mandatory error message",contact.getAPFirstNameMessage(), "This field is required.");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Contact Page mandatory error message",contact.getAPLastNameMessage(), "This field is required.");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Contact Page mandatory error message",contact.getAPPhonesMessage(), "This field is required.");
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Contact Page mandatory error message",contact.getAPEmailAddressMessage(), "This field is required.");
	}


	@Test(groups = {"ca","contact","021","exclude"})
	public void excludeFirstNameContact() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		ContactPage contact=new ContactPage(driver);
		contact.enterLastName("David");
		contact.enterEmailAddress("neil@gmail.com");
		contact.enterPhone("1111111111");
		contact.enterAPFirstName("Neil");
		contact.enterAPLastName("DAvid");
		contact.enterAPEmailAddress("neil@gmail.com");
		contact.enterAPPhone("1111111111");
		contact.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying First name error message",contact.getFirstNameErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","contact","022","exclude"})
	public void excludeLastNameContact() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		ContactPage contact=new ContactPage(driver);
		contact.enterFirstName("Neil");
		contact.enterEmailAddress("neil@gmail.com");
		contact.enterPhone("1111111111");
		contact.enterAPFirstName("Neil");
		contact.enterAPLastName("DAvid");
		contact.enterAPEmailAddress("neil@gmail.com");
		contact.enterAPPhone("1111111111");
		contact.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Last name error message",contact.getLastNameErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","contact","023","exclude"})
	public void excludeEmailAddressContact() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		ContactPage contact=new ContactPage(driver);
		contact.enterFirstName("Neil");
		contact.enterLastName("David");
		contact.enterPhone("1111111111");
		contact.enterAPFirstName("Neil");
		contact.enterAPLastName("DAvid");
		contact.enterAPEmailAddress("neil@gmail.com");
		contact.enterAPPhone("1111111111");
		contact.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Email address error message",contact.getEmailAddressErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","contact","024","exclude"})
	public void excludePhoneContact() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		ContactPage contact=new ContactPage(driver);
		contact.enterFirstName("Neil");
		contact.enterLastName("David");
		contact.enterEmailAddress("neil@gmail.com");
		contact.enterAPFirstName("Neil");
		contact.enterAPLastName("DAvid");
		contact.enterAPEmailAddress("neil@gmail.com");
		contact.enterAPPhone("1111111111");
		contact.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Phone error message",contact.getPhoneErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","contact","025","exclude"})
	public void ValidationInvaliEmailContact() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		ContactPage contact=new ContactPage(driver);
		contact.enterFirstName("Neil");
		contact.enterLastName("David");
		contact.enterEmailAddress("neil@gmai");
		contact.enterPhone("1111111111");
		contact.enterAPFirstName("Neil");
		contact.enterAPLastName("DAvid");
		contact.enterAPEmailAddress("neil@gmail.com");
		contact.enterAPPhone("1111111111");
		contact.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying invalid email address error message",contact.getEmailAddressInvalidErrorMessage(), "Your entry does not match the allowed pattern.");
	}

	@Test(groups = {"ca","contact","030","validate"})
	public void VaildDataContact() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

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
		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.staticThreadWait(2);
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying valid data and continue credit terms page ",credit.getPageHeader(), "Credit Terms");
	}

	@Test(groups = {"ca","creditTerms","031","validate"})
	public void lbl10thProxCreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Credit terms yes page visable",credit.getPageHeader(), "Credit Terms");
	}

	@Test(groups = {"ca","creditTerms","032","validate"})
	public void submitFormselectNoCreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		//Assert.assertTrue(credit.isSelectedNo());
		//credit.clickSubmit();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Finsih page",credit.getFinishPageHeader(), "FINISH");
	}

	@Test(groups = {"ca","creditTerms","033","validate"})
	public void clickYesCreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//contact page 
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Credit terms selecting yes",credit.getPersonalGuaranteePageHeader(), "PERSONAL GUARANTEE");
	}

	@Test(groups = {"ca","creditTerms","035","validate"})
	public void mandatroyFiledsEmptyCreditTerms(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.clickContinue();
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
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying mandatroy fields empty error message creditterms",credit.getSInfoSignatureErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca","creditTerms","036","validate"})
	public void validDataInBankInformationCreditTerms() {
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact Page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		//Bank info 
		credit.enterSevenDigitWheelProsAccountNumber("1234567");
		credit.clickTermsCondition();
		credit.enterBankName("HDFC");
		credit.enterBankAccountNumberr("98765432");
		credit.enterCity("New");
		credit.clickProvince("AB");
		credit.clickContinue();

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
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying mandatroy fields empty error message creditterms and entring valid data in bank information",credit.getSInfoSignatureErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca"})	
		public void dealerEnrollmentTest() {
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
		cmpny.enterOtherNotes("Customer template with credit terms");
		cmpny.enterStreetAddress("kings road");
		cmpny.enterCity("Pune");
		cmpny.selectOptionFromlstProvinceDropDown("AB");
		cmpny.enterPostalCode("P0A 1J0");
		cmpny.clickYes();
		cmpny.clickContinue();

		ContactPage contact=new ContactPage(driver);
		contact.enterFirstName("check DBA name");
		contact.enterLastName("test");
		contact.enterEmailAddress("test@g.com");
		contact.enterPhone("9111348811");
		contact.enterAPFirstName("rajtest");
		contact.enterAPLastName("kamtest");
		contact.enterAPEmailAddress("test@g.com");
		contact.enterAPPhone("1221113421");
		contact.clickContinue();

	    CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		//credit.enterSevenDigitWheelProsAccountNumber("1234567");
		credit.clickTermsCondition();
		credit.enterBankName("ICICI");
		credit.enterBankAccountNumberr("7689034720");
		credit.enterCity("mumbai");
		credit.clickProvince("AB");

		//Credit Ref 1
		credit.enterCR1VendorName("govinda");
		credit.enterCR1Phone("1221123422");
		credit.enterCR1Emailaddress("goivnda@gmail.com");
		credit.enterCR1City("kurla");
		credit.selectOptionFromCR1ProvinceDropDown("AB");

		//Credit Ref 2
		credit.enterCR2VendorName("suni");
		credit.enterCR2Phone("1111221452");
		credit.enterCR2Emailaddress("suni@gmail.com");
		credit.enterCR2City("mysore");
		credit.selectOptionFromCR2ProvinceDropDown("AB");

		//Credit Ref 3
		credit.enterCR3VendorName("abhisehk");
		credit.enterCR3Phone("1111221145");
		credit.enterCR3Emailaddress("abhi@gmail.com");
		credit.enterCR3City("blore");
		credit.selectOptionFromCR3ProvincDropDown("AB");

		//Owner info 1
		credit.enterOwner1FirstName("swathi");
		credit.enterOwner1LastName("puls");
		credit.enterOwner1Phone("activ");
		credit.enterOwner1Phone("1112221111");
		credit.enterOwner1Emailaddress("activ@gmail.com");

		//Owner info 2
		credit.enterOwner2FirstName("anil");
		credit.enterOwner2LastName("kapoor");
		credit.enterOwner2Phone("1551212211");
		credit.enterOwner2Emailaddress("kappor@gmail.com");
		credit.enterProjectedMonthlyPurchaseTotal("1500");

		//Siganture
		credit.enterSInfoFirstName("boney");
		credit.enterSInfoLastName("singh");
		credit.enterSInfoPhone("1222214421");
		credit.enterSInfoEmailAddress("bony@gmail.com");
		credit.enterSInfoStreetAddress("new max road");
		credit.enterSInfoCity("indore");
		credit.selectOptionFromSIinfoProvinceDropDown("AB");
		credit.enterSInfoPostalCode("P0A 1J0");
		credit.enterSInfoSignature("boney");
		credit.clickContinue();			

		//Personal Guarantee
		PersonalGuaranteePage guarantee=new PersonalGuaranteePage(driver);
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		guarantee.enterGuarantor1FirstName("sridevi");
		guarantee.enterGuarantor1LastName("sri");
		guarantee.enterPg1StreetAddress("ctc");
		guarantee.enterPg1City("secundrabad");
		guarantee.selectOptionFromPg1ProvinceDropDown();
		guarantee.enterPg1PostalCode("P0A 1J0");
		guarantee.enterPg1SIN("1221212211");
		guarantee.enterPg1Signature("Sri");

		//pg2
		guarantee.enterGuarantor2FirstName("janvi");
		guarantee.enterGuarantor2LastName("shah");
		guarantee.enterPg2StreetAddress("pune");
		guarantee.enterPg2City("pune1");
		guarantee.selectOptionFromPg2ProvinceDropDown();
		guarantee.enterPg2PostalCode("D0A 1J0");
		guarantee.enterPg2SIN("1122228811");
		guarantee.enterPg2Signature("janvi");
		//guarantee.click();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Finish page",credit.getFinishPageHeader(), "FINISH");
	}

	@Test(groups = {"ca"})	
	public void Guarantor2onlyFirstnameSubmitPersonalGuarantee() {

		//CompanyPage
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact Page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.enterSevenDigitWheelProsAccountNumber("1234567");
		credit.takeScreenShot("CA_Credit.png");
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
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();

		//pg1
		guarantee.takeScreenShot("CA_Personal.png");
		guarantee.enterGuarantor1FirstName("Max");
		guarantee.enterGuarantor1LastName("David");
		guarantee.enterPg1StreetAddress("land");
		guarantee.enterPg1City("Nox");
		//guarantee.selectOptionFromPg1ProvinceDropDown();
		guarantee.enterPg1PostalCode("P0A 1J0");
		guarantee.enterPg1SIN("1111111111");
		guarantee.enterPg1Signature("Shany");

		//pg2
		guarantee.enterGuarantor2FirstName("Max");
		guarantee.clickSubmit();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Finish page",credit.getFinishPageHeader(), "FINISH");
	}

	@Test(groups = {"ca"})
	public void companyMandatoryFieldErrorMessageValidations(){
		CompanyPage cmpny=new CompanyPage(driver);
		cmpny.clickContinue();	
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying company name error message",cmpny.getCompanyNameErrorMessage(), "This field is required.");
	}


	@Test (groups = {"ca"})	
	public void contactMandatoryFieldErrorMessageValidations(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();
		ContactPage contact=new ContactPage(driver);
		contact.staticThreadWait(4);
		contact.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Credit terms yes page visable",contact.getFirstNameErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca"})
	public void creditTermsMandatoryFieldErrorMessageValidations(){
		NewCreditAppFlows cmpnyData=new NewCreditAppFlows(driver);
		cmpnyData.enterCompanyDetailsForCa();

		//Contact page
		NewCreditAppFlows contactData=new NewCreditAppFlows(driver);
		contactData.enterContactDetailsCa();

		CreditTermsPage credit=new CreditTermsPage(driver);
		credit.clickYes();
		credit.enterSevenDigitWheelProsAccountNumber("1234567");
		credit.clickTermsCondition();
		credit.clickTermsCondition();
		credit.clickContinue();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying agree terms and condition error message",credit.getAgreeTcErrorMessage(), "This field is required.");
	}

	@Test(groups = {"ca"})
	public void   personalGuaranteeMandatoryFieldErrorMessageValidations(){
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
		guarantee.clickIACKNOWLEDGEANDAUTHORIZETHECONTINUINGPERSONALGUARANTEE();
		guarantee.clickSubmit();
		com.wheelpros.web.utils.Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying personal Guarantee Mandatory Field Error Message",guarantee.getGuarantor1FirstNameErrorMessage(), "Complete this field.");
	} 

}
