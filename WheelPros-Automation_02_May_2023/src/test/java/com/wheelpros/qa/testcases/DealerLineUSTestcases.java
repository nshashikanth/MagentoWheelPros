package com.wheelpros.qa.testcases;



import org.testng.annotations.Test;

import com.wheelpros.qa.test.base.DealerLineBasetest;
import com.wheelpros.qa.us.dealerline.pages.CommonHeaderPage;
import com.wheelpros.qa.us.dealerline.pages.ContactInformationPage;
import com.wheelpros.qa.us.dealerline.pages.FinalCheckOutPage;
import com.wheelpros.qa.us.dealerline.pages.LandingPage;
import com.wheelpros.qa.us.dealerline.pages.PdpPage;
import com.wheelpros.qa.us.dealerline.pages.ShoppingCartPage;
import com.wheelpros.web.utils.Assert;
import com.wheelpros.web.utils.ValidationType;

public class DealerLineUSTestcases extends DealerLineBasetest {


	@Test
	public void test() throws Exception {
		CommonHeaderPage header=new CommonHeaderPage(driver);
		header.clickContinue();
		header.chkCartHeaderPrice();
		header.clickMyaccount();
		



		ContactInformationPage contact=new ContactInformationPage(driver);
		contact.buttonEditProfile();		
		//		 ContactInformationpage contact=new ContactInformationpage(driver);
		//		
		//		 contact.buttonEditProfile();


		//	header.clickEffectiveAccountSelection();

		//		header.dropdownCustomerCode();
		//		header.selectMSRP();
		//		header.serchboxSearchProducts("D78920908450");

		//		header.dropdownWheels();
		//		header.dropdownTires();
		//		header.dropdownAccessories();
		//		
		//		header.dropdownMyAccount();
		//	
		//		header.linkContactInformation();
		//		Thread.sleep(10);
		//		header.dropdownMyAccount();
		//		header.linkMyOrders();
		//		header.serchboxSearchProducts("D78920908450");
		//		header.dropdownCustomerCode();
		//		header.selectBlank();	 
	}

	@Test
	public void landingPage() throws Exception {
		CommonHeaderPage common=new CommonHeaderPage(driver);
		common.clickContinue();
		LandingPage land=new LandingPage(driver);
		land.clickSpotlightProduct2();
		PdpPage pdp=new PdpPage(driver);
		pdp.clickAddtoCartpdp();
		driver.navigate().refresh();
		common.clickCartHeader();

		ShoppingCartPage cart=new ShoppingCartPage(driver);
		cart.clickCheckout();

		FinalCheckOutPage payment=new FinalCheckOutPage(driver);
		//		 payment.enterShippingNotes("near metro station");
		//		 payment.staticThreadWait(2);
		//		 payment.clickSameAsBillingAddress();

		payment.clickAddOneTimeShippingAddress();


		payment.enterShippingAddressFirstName("Shashi");
		payment.enterShippingAddressLastName("Kanth");
		payment.enterShippingAddressCompanyName("test");
		payment.enterAddress("13-3-506");
		payment.enterCity("hyd");
		payment.enterPostalCode("92481");
		payment.enterPhone("12345567");
		payment.enterPhoneExt("123456789");
		payment.enterEmail("a@g.com");
		payment.clickSaveOneTimeShippingAddress();

		// payment.checkboxSameAsBillingAddress();
		//		 payment.staticThreadWait(5);
		//		 payment.checkboxStoredPayment1();
		//		 payment.clickPayNow();


		//		 pdp.enterqty("4");
		//		 pdp.clickAddtoCartpdp();
		//		 pdp.takeScreenShot("pdp.png");
		//		 pdp.staticThreadWait(4);
		//		 pdp.screentShotSpecs("specs.png");


		//		 land.enterSKU1("KM67324962730");
		//		 land.enterQty1("2");
		//		 land.enterSKU2("KM67324962730");
		//		 land.enterQty2("4");
		//		 land.enterSKU3("HE7917960918");
		//		 land.enterQty3("5");
		//		 land.clickAddMore();
		//		 land.enterSKU4("HE7917960918");
		//		 land.enterQty4("6");
	}


        @Test
		public void footerTest(){
        	CommonHeaderPage common=new CommonHeaderPage(driver);
    		common.clickContinue();
			common.clickEffectiveAccountSelection();
			common.staticThreadWait(4);
			common.clickCloseEffectiveAccountSelection();
			
			LandingPage land=new LandingPage(driver);
			land.enterSKU1("HE7917960918");
			land.clickAddtoCart();
			land.clickAddtoCart();
			common.clickCartHeader();
			
			ShoppingCartPage cart=new ShoppingCartPage(driver);
			cart.clickCheckout();
			
			FinalCheckOutPage payment=new FinalCheckOutPage(driver);
			payment.staticThreadWait(5);
			payment.checkboxStoredPayment1();
			payment.clickPayNow();
        }

        
        @Test
        public void testFinalpage() {
        	CommonHeaderPage common=new CommonHeaderPage(driver);
    		common.clickContinue();
    		LandingPage land=new LandingPage(driver);
    		land.clickSpotlightProduct2();
    		PdpPage pdp=new PdpPage(driver);
    		pdp.clickAddtoCartpdp();
    		driver.navigate().refresh();
    		common.clickCartHeader();
    		ShoppingCartPage cart=new ShoppingCartPage(driver);
    		cart.clickCheckout();
    		
    		FinalCheckOutPage fin=new FinalCheckOutPage(driver);
    		fin.chekboxCreditcard();
    		fin.clickAddNewCard();
        }
        
        @Test
        public void testPrice() {
        	CommonHeaderPage common=new CommonHeaderPage(driver);
    		common.clickContinue();
    		common.chkCartHeaderPrice();
    		LandingPage landing=new LandingPage(driver);
    		landing.staticThreadWait(2);
    		landing.txtTotalPrice();
    		//Assert.assertEquals(ValidationType.HardAssert,"price on my cart and totat price is same",common.chkCartHeaderPrice(),landing.txtTotalPrice());
        }

	}
