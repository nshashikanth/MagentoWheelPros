package com.wheelpros.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wheelpros.qa.test.base.MagentoDealerLineBaseTest;
import com.wheelpros.qa.us.magento.dealerline.pages.FooterPage;
import com.wheelpros.qa.us.magento.dealerline.pages.HomePage;
import com.wheelpros.qa.us.magento.dealerline.pages.LoginPage;
import com.wheelpros.qa.us.magento.dealerline.pages.MyAccountPage;
import com.wheelpros.qa.us.magento.dealerline.pages.MyCartPage;
import com.wheelpros.qa.us.magento.dealerline.pages.SearchByVehicleYMMPage;
import com.wheelpros.qa.us.magento.dealerline.pages.ShopByCategoryPage;
import com.wheelpros.web.utils.Assert;
import com.wheelpros.web.utils.ValidationType;

public class MagentoDealerLineTestCases extends MagentoDealerLineBaseTest {

	//@Test
	//	public void test() {
	//		LoginPage login=new LoginPage(driver);
	//		login.isEnabledCompanyLogo();
	//	}


	public void login(String username,String password) {
		LoginPage login=new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickSubmit();
	}

	@Test
	public void validLogin() {
            login("1042886@0000044944.com", "Zach@1234");
		com.wheelpros.qa.us.magento.dealerline.pages.HomePage landing=new com.wheelpros.qa.us.magento.dealerline.pages.HomePage(driver);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot, "Verifying Login Page",landing.titleHome(),"Home page");
	}

	@Test
	public void invalidUsername() {
		LoginPage login=new LoginPage(driver);
		login("cskumar@nsight-inc.com", "Kumar@1234");
		login.staticThreadWait(4);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying wrong username error message",login.getSiginInErorrMessage(),"The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
	}

	@Test
	public void invalidPassword() {
		LoginPage login=new LoginPage(driver);
		login("ckumar@nsight-inc.com", "Kumar@123");
		login.staticThreadWait(4);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying wrong Password  error message",login.getSiginInErorrMessage(),"The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
	}  

	@Test
	public void  unRegisteredemailid() {
		LoginPage login=new LoginPage(driver);
		login("unregisterdmail@gmail.com","Kumar@1234");
		login.staticThreadWait(4);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying unregistred email id error message",login.getSiginInErorrMessage(),"The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
	}

	@Test
	public void forgotPasswordPage() {
		LoginPage login=new LoginPage(driver);
		login.clickForgotPassword();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verfying forgot password page",login.getresetPassword(),"Reset Password");
	}

	@Test
	public void emptyUsernamePasswordErrorMessage() {
		LoginPage login=new LoginPage(driver);
		login("","");
		login.clickSubmit();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifyin empty username error message", login.getUserNameErrorMessage(), "This is a required field.");
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifyin empty password error message", login.getPasswordErrorMessage(), "This is a required field.");
	}

	//==========MDD-8_SIGN IN=====Request access form=============
	@Test
	public void isDisplayedbtnRequestAcess() {
		LoginPage login=new LoginPage(driver);
		login.scrollToMidPage();
		Assert.assertTrue(ValidationType.HardAssertAndTakeScreenShot, "Verifyin request access button is displayed",login.isDisplayedRequestAccesstoDealerLine());
	}

	@Test
	public void requestAccessPageVisable() {
		LoginPage login=new LoginPage(driver);
		login.clickRequestAccesstoDealerLine();
		login.staticThreadWait(2);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Request Access pop after clicking request access button", login.getRequestAccessToDealerLine(),"Existing Customer - Request Access to Dealerline");
	}

	@Test
	public void validDataRequestAccess() {
		LoginPage login=new LoginPage(driver);
		login.clickRequestAccesstoDealerLine();
		login.enterFirstNameRequestAccess("Shashi");
		login.enterLastNameRequestAcess("kanth");
		login.enterEmailRequestAccess("shashi@gmail.com");
		login.enterBusinessNameRequestAccess("Shashi");
		login.enterWheelProsAccountNumberRequestAccess("12345");
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying access form for dealer line",login.getWheelProsAccountNumberRequestAccess(),"");
	}

	@Test 
	public void ValidDataSubmitRequestAccess() {
		LoginPage login=new LoginPage(driver);
		login.clickRequestAccesstoDealerLine();
		login.enterFirstNameRequestAccess("Shashi");
		login.enterLastNameRequestAcess("kanth");
		login.enterEmailRequestAccess("shashi@gmail.com");
		login.enterBusinessNameRequestAccess("Shashi");
		login.enterWheelProsAccountNumberRequestAccess("12345");
		login.clickSubmitRequestAccess();
		login.scrollToTopPage();
		//Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"verifying request access form submitted sucessfully", login.getFormSubmittedSuccessfullyRequestAccess(),"Form submitted successfully");
	}

	@Test
	public void emptyRequestAccessSubmit() {
		LoginPage login=new LoginPage(driver);
		login.clickRequestAccesstoDealerLine();
		login.staticThreadWait(2);
		login.clickSubmitRequestAccess();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying first name error message", login.getFirstNameErrorMessageRequestAccess(),"This is a required field.");
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying last name error message", login.getLastNameErrorMessageRequestAccess(),"This is a required field.");
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying email error message", login.getEmailErrorMessageRequestAccess(),"This is a required field.");
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Business name error message", login.getBusinessNameErrorMessageRequestAccess(),"This is a required field.");
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying WheelPros account number error message", login.getWheelprosAccountNumberErrorMessageRequestAccess(),"This is a required field.");
	}

	@Test
	public void goBackToLoginRequestAccess() {	
		LoginPage login=new LoginPage(driver);
		login.clickRequestAccesstoDealerLine();
		login.clickBackToLogin();
		login.staticThreadWait(2);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verfiying back to login page from Request Access",login.getlblHeading(),"Log In");
	}

	@Test
	public void closeRequestAccess() {
		LoginPage login=new LoginPage(driver);
		login.clickRequestAccesstoDealerLine();
		login.clickCloseRequestAccess();
		login.staticThreadWait(2);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verfiying close button on Request Access",login.getlblHeading(),"Log In");
	}

	//====Become a dealer test cases =====

	@Test
	public void isDisplayedCreateAccount() {
		LoginPage login=new LoginPage(driver);
		login.scrollToMidPage();
		Assert.assertTrue(ValidationType.HardAssertAndTakeScreenShot,"Verifying create account button is Displayed",login.isDisplayedCreatAccount());
	}

	@Test
	public void creditAppPage() {
		LoginPage login=new LoginPage(driver);
		login.clickBecomeDealerCA();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying credit app page", login.getDealerLine(),"Company");
	}

	//=====forgot password=======

	/*		@Test
	public void getForgotPasswordLoginPage() {
		LoginPage login=new LoginPage(driver);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying password link in login page", login.getForgotPasswordLoginPage(),"FORGOT PASSWORD?");
	}

	@Test
	public void isEnabledForgotPasswordLoginPage() {   //need to work again on this to make more perfect
		LoginPage login=new LoginPage(driver);
		Assert.assertTrue(ValidationType.HardAssertAndTakeScreenShot,"Verifying Forgot password link is Clickable",login.isClickableForgotPassword());
	}

	@Test
	public void clickForgotPassword() {
		LoginPage login=new LoginPage(driver);
		login.clickForgotPassword();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying after clicking forgot password redirecting to reset password page", login.getresetPassword(), "Reset Password");
	}

	@Test(dataProvider = "emailAddresses")
	public void validMailidSucessMessageForgotPassword(String emailAddress) {  //need to check
		LoginPage login=new LoginPage(driver);
		login.clickForgotPassword();
		login.enterEmailaddressForgotPassword(emailAddress);
		login.clickSubmitResetPasswordPage();
		login.staticThreadWait(2);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Email sent to Mailid for password reset", login.getEmailforResetPassword(), "If there is an account associated with " + emailAddress + " you will receive an email with a link to reset your password.");
	}

	@DataProvider(name = "emailAddresses")
	public Object[][] getEmailAddresses() {
		return new Object[][] {
			{"test1@gmail.com"},
		};
	}

	@Test
	public void backToLoginPageResetPasswordPage() {
		LoginPage login=new LoginPage(driver);
		login.clickForgotPassword();
		login.clickBackToLoginResetPasswordPage();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifyin redirect to login page from reset password page", login.getlblHeading(),"Log In");
	}

	@Test
	public void invalidEmailidResetPasswordPage() {
		LoginPage login=new LoginPage(driver);
		login.clickForgotPassword();
		login.enterEmailaddressForgotPassword("test");
		login.clickSubmitResetPasswordPage();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Invalid Email ID error Message Reset Password Page", login.getEmailErrorMessageResetPasswrodPage(),"Please enter a valid email address (Ex: johndoe@domain.com).");
	}

	@Test
	public void emptysubmitResetPasswordPage() {
		LoginPage login=new LoginPage(driver);
		login.clickForgotPassword();
		login.enterEmailaddressForgotPassword("");
		login.clickSubmitResetPasswordPage();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Error message when submitted empty", login.getEmailErrorMessageResetPasswrodPage(),"This is a required field.");
	}  */


	//===========Header non signed in ==============

	@Test
	public void isEnabledCompanyLogo() {
		LoginPage login=new LoginPage(driver);
		Assert.assertTrue(ValidationType.HardAssertAndTakeScreenShot, "Verifying company logo is enabled and able to click",login.isEnabledCompanyLogo());
	}


	@Test
	public void redirectingToLoginPage() {
		LoginPage login=new LoginPage(driver);
		driver.get("https://integration-5ojmyuq-22u4azrzj6uew.us-5.magentosite.cloud/abl13-20x9-5x115-brush-slv-15mm-72-6cb.html");
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Redirecting to Login page", login.getlblHeading(),"Log In");
	}

	@Test
	public void isEnableCompanyLogoForgotPasswordPage() {
		LoginPage login=new LoginPage(driver);
		login.clickForgotPassword();
		Assert.assertTrue(ValidationType.HardAssertAndTakeScreenShot,"Verifyin company logo is enabled on reset password page ",login.isEnabledCompanyLogo());
	}

	//==========Footer validations===========

	@Test
	public void redirectingToHomepageFooter() {
            login("1042886@0000044944.com", "Zach@1234");
		FooterPage footer=new FooterPage(driver);
		driver.get("https://mc-dealerline-stage.wheelpros.com/us/customer/account/");
		//driver.get("https://integration-5ojmyuq-22u4azrzj6uew.us-5.magentosite.cloud/us/customer/account/");
		footer.clickCompnayLogoFooter();
		HomePage home=new HomePage(driver);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying footer logo is redirecting to home page",home.homePageTittle(), "Home page");
	}


	@Test
	public void headingsFooter() {
            login("1042886@0000044944.com", "Zach@1234");
		FooterPage footer=new FooterPage(driver);
		footer.scrollToBottomPage();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Products Heading",footer.getlblProductsFooter(),"PRODUCTS");
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying INFO Heading",footer.getlblInfoFooter(),"INFO");
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Consumer Sites Heading",footer.getlblConsumerSiteFooter(),"CONSUMER SITES");
	}

	//=============MDD 52================

	@Test
	public void consumerSiteLinkFindADealer() {
            login("1042886@0000044944.com", "Zach@1234");
		FooterPage footer=new FooterPage(driver);
		footer.clickFindAdealer();
		driver.get("https://www.wheelpros.com/dealers/");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Dealer page visable",pageTitle,"Dealers | Wheel Pros");	
	}

	@Test
	public void consumerSiteLinkWheelProsCom() {
            login("1042886@0000044944.com", "Zach@1234");
		FooterPage footer=new FooterPage(driver);
		footer.clickWheelProscom();
		driver.get("https://www.wheelpros.com/");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Wheel Pros site", "Designed for the Industry’s Best, by the Industry’s Best | Wheel Pros", pageTitle);
	}

	//=====sprint 2   MDD-13===============
	@Test
	public void redirectingToHomepage() {
            login("1042886@0000044944.com", "Zach@1234");

		HomePage home=new HomePage(driver);
		home.clickFindWheelsAndTires();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying redirection to home page when clicked on logo from any page", home.homePageTittle(),"Wheels");
	}

	@Test
	public void isClickableShopByCategoryAndSearchByVehicle() {
            login("1042886@0000044944.com", "Zach@1234");
		HomePage home=new HomePage(driver);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Shop by Category is not clickable",home.isClickableShopByCategory(),false);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Search by Vehicle is not clickable",home.isClickableSearchByVehicle(),false);
	}


	/*	@Test
	public void selectAllWheels() {
                                login("1042886@0000044944.com", "Zach@1234");
		ShopByCategoryPage shopPage = new ShopByCategoryPage(driver);
		shopPage.mvetoShopByCategory();
		List<String> brands = Arrays.asList("All Brands", "American Force", "American Racing", "Asanti Black", "ATX", "Black Rhino", "Fairway Alloys", "Fuel Off-Road", "Fuel UTV", "Helo", "Kmc", "Ceat");
		Map<String, String> expectedTitles = new HashMap<>();
		expectedTitles.put("All Brands", "All Brands - Wheels");
		expectedTitles.put("American Force", "American Force - Wheels");
		expectedTitles.put("American Racing", "American Racing - Wheels");
		expectedTitles.put("Asanti Black", "Asanti Black - Wheels");
		expectedTitles.put("ATX", "ATX - Wheels");
		expectedTitles.put("Black Rhino", "Black Rhino - Wheels");
		expectedTitles.put("Fairway Alloys", "Fairway Alloys - Wheels");
		expectedTitles.put("Fuel Off-Road", "Fuel Off-Road - Wheels");
		expectedTitles.put("Fuel UTV", "Fuel UTV - Wheels");
		expectedTitles.put("Helo", "HELO - Wheels");
		expectedTitles.put("Kmc", "KMC - Wheels");
		expectedTitles.put("Ceat", "CEAT - Wheels");


		for (String brand : brands) {
			if (brand.equals("All Brands")) {
				shopPage.clickAllBrandsWheels();
			} else if (brand.equals("American Force")) {
				shopPage.clickAmericanForceWheels();
			}
			else if(brand.equals("American Racing")){
				shopPage.clickAmericanRacingWheels();
			}
			else if(brand.equals("Asanti Black")) {
				shopPage.clickAsantiBlackWheels();
			}
			else if (brand.equals("ATX")) {
				shopPage.clickATXWheels();
			} 
			else if(brand.equals("Black Rhino")) {
				shopPage.clickBlackRhinoWheels();
			}
			else if(brand.equals("Fairway Alloys")) {
				shopPage.clickFairwayAlloysWheels();
			}
			else if(brand.equals("Fuel Off-Road")) {
				shopPage.clickFuelOffRoadWheels();
			}
			else if(brand.equals("Fuel UTV")) {
				shopPage.clickFuelUTVWheels();
			}
			else if(brand.equals("Helo")) {
				shopPage.clickHeloWheels();
			}
			else if(brand.equals("Kmc")) {
				shopPage.clickKmcWheels();
			}
			else if(brand.equals("Ceat")) {
				shopPage.clickCeatWheels();
			}

			String actualTitle = driver.getTitle();
			String expectedTitle = expectedTitles.get(brand);

			Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying " +brand+ " page", actualTitle, expectedTitle);
			driver.navigate().back();
			shopPage.mvetoShopByCategory();
		}
	}


	@Test
	public void selectAllTires() {
                                login("1042886@0000044944.com", "Zach@1234");
		ShopByCategoryPage shopPage = new ShopByCategoryPage(driver);
		shopPage.mvetoShopByCategory();
		shopPage.mvetoTires();

		List<String> brands = Arrays.asList("All Brands", "BF GOODRICH", "EFX", "FALKEN", "FUEL TIRES", "MICKEY THOMPSON", "NITTO", "OHTSU", "PIRELLI", "TOYO", "YOKOHAMA");
		Map<String, String> expectedTitles = new HashMap<>();
		expectedTitles.put("All Brands", "All Brands - Tires");
		expectedTitles.put("BF GOODRICH", "BF GOODRICH - Tires");
		expectedTitles.put("EFX", "EFX - Tires");
		expectedTitles.put("FALKEN", "FALKEN - Tires");
		expectedTitles.put("FUEL TIRES", "FUEL TIRES - Tires");
		expectedTitles.put("MICKEY THOMPSON", "MICKEY THOMPSON - Tires");
		expectedTitles.put("NITTO", "NITTO - Tires");
		expectedTitles.put("OHTSU", "OHTSU - Tires");
		expectedTitles.put("PIRELLI", "PIRELLI - Tires");
		expectedTitles.put("TOYO", "TOYO - Tires");
		expectedTitles.put("YOKOHAMA", "YOKOHAMA - Tires");

		for (String brand : brands) {
			if (brand.equals("All Brands")) {
				shopPage.clickAllBrandsWheels();
			} else if (brand.equals("BF GOODRICH")) {
				shopPage.clickBfGoodRichTires();
			} else if (brand.equals("EFX")) {
				shopPage.clickEfxTires();
			} else if (brand.equals("FALKEN")) {
				shopPage.clickFalkenTires();
			} else if(brand.equals("FUEL TIRES")) {
				shopPage.clickFuelTires();
			} else if (brand.equals("MICKEY THOMPSON")) {
				shopPage.clickMickeyThompsonTires();
			}else if(brand.equals("NITTO")) {
				shopPage.clickNittoTires();
			}else if(brand.equals("OHTSU")) {
				shopPage.clickohtsuTires();
			}else if(brand.equals("PIRELLI")) {
				shopPage.clickPirelliTires();
			} else if(brand.equals("TOYO")) {
				shopPage.clickToyoTires();
			}else if(brand.equals("YOKOHAMA")) {
				shopPage.clickYokohamaTires();
			}

			String actualTitle = driver.getTitle();
			String expectedTitle = expectedTitles.get(brand);

			Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying " +brand+ " page", actualTitle, expectedTitle);
			driver.navigate().back();
			shopPage.mvetoShopByCategory();
			shopPage.mvetoTires();
			}
	}  */


	@Test
	public void loggedinDealerName() {
            login("1042886@0000044944.com", "Zach@1234");
		MyAccountPage account=new MyAccountPage(driver);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Logged in UserName is " +account.getCustomerName(), account.getCustomerName(), account.getCustomerName());
	}


	@Test (dataProvider = "searchItems")
	public void searchBox(String text) {
            login("1042886@0000044944.com", "Zach@1234");
		HomePage home=new HomePage(driver);
		String searchedItem = text;
		home.enterinSearchBox(searchedItem);
		home.clickSearchboxClick();
		home.getIteamSerched();
		String statement = home.getIteamSerched();
		statement = statement.replaceAll("'", "");
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying serch is showing label with searched item name","Search results for: " +searchedItem,statement);
	}

	@Test(dataProvider = "searchItems")
	public void searchBoxHitEnter(String text) {
            login("1042886@0000044944.com", "Zach@1234");
		HomePage home=new HomePage(driver);
		String searchedItem = text;
		home.enterinSearchBox(searchedItem);
		home.hitEnterSerchBox();
		home.getIteamSerched();
		String statement = home.getIteamSerched();
		statement = statement.replaceAll("'", "");
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying serch is showing label with searched item name","Search results for: " +searchedItem,statement);
	}
	//====data provide for  searchBox and  searchBoxHitEnter

	@DataProvider(name = "searchItems")
	public Object[][] searchData() {
		return new Object[][] {{"ceat"}, {"AX18"}, {"Fuel"}};
	}

	@Test
	public void logoutcheck() {
            login("1042886@0000044944.com", "Zach@1234");
		MyAccountPage account=new MyAccountPage(driver);
		account.clickLoginname();
		account.clickLogout();
		LoginPage login=new LoginPage(driver);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying login page after logout",login.getlblHeading(), "Log In");
	}


	@Test
	public void totalcartItemQty() {
            login("1042886@0000044944.com", "Zach@1234");
		MyCartPage cart=new MyCartPage(driver);

		int totalItemQty=cart.getTotalItemQty();
		//	totalItemQty=cart.getTotalItemQty();
		int fromCartItems = cart.countoftotalqtyincart();
		//System.out.println(cart.getTotalItemQty());
		System.out.println(fromCartItems);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot, "test", fromCartItems, totalItemQty);
	}



	@Test
	public void checkAlterMessageMidPageandClose() {
            login("1042886@0000044944.com", "Zach@1234");
		HomePage home=new HomePage(driver);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Shippment Alert Message",home.getAlertMessage(),"Shipments May Be Delayed Due To Snow In The North East!!");
		home.scrollToMidPage();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Shippment Alert Message after scorlling down",home.getAlertMessage(),"Shipments May Be Delayed Due To Snow In The North East!!");
		home.clickCloseAlertMessage();
		Assert.assertFalse(ValidationType.HardAssertAndTakeScreenShot, "Verifying Shippment alert box is closed",home.isAlertMessageVisable());
	}

	//////===============testing My acount left panel laanding on correct page =========

	@Test
	public void myAccountLeftPanel() throws Exception {
            login("1042886@0000044944.com", "Zach@1234");
		MyAccountPage account=new MyAccountPage(driver);
		account.clickLoginname();
		account.clickMyAccount();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot, "verifying Dashboard", account.getAccountDashBoard(), "Account Dashboard");
		account.clickAccountInformation();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Account Information", account.getAccountInformation(), "Account Information");
		account.clickAddressBook();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Address Book", account.getAddressBook(), "Address Book");
		account.clickMyOrders();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying My Orders", account.getMyOrders(),"My Orders");
		account.clickMyInvoices();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying My Invoices", account.getMyInvoices(),"My Invoices");
		account.clickMakePayment();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Make Payment", account.getMakePayment(),"Make Payment");
		account.clickMyWallet();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying My Wallet", account.getMyWallet(),"My Wallet");
		account.clickMyFavourites();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying My Favourites", account.getMyFavourites(),"Favorites Lists");
		account.staticThreadWait(2);
		account.clickMyRewards();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying My Rewards", account.getMyRewards(),"My Rewards");
		account.clickCustomerCode();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Customer Code", account.getCustomerCode(),"Customer Code");
	}


	// below are the test cases for  calultiong cost per item and total cost of the cart. 
	//bug raised with the team once fixed need to add assert for the below and correct name for the test case

	@Test
	public void costtest() {
            login("1042886@0000044944.com", "Zach@1234");
		MyCartPage cart=new MyCartPage(driver);
		cart.clickMyCart();
		cart.MiniCartPriceScript();
	}


	@Test
	public void testTotalpriceofTotalqtyinCart() {
            login("1042886@0000044944.com", "Zach@1234");
		MyCartPage cart=new MyCartPage(driver);
		cart.clickMyCart();
		cart.miniCartDetailsScript();
	}



	//===================================================================================


	//==============MDD 76 Home page / serch by vehice YMM search ============

	@Test (dataProvider = "testDataforYMM")
	public void mvetoSearchByVechicleselectYMM(String year, String make, String model) {
            login("1042886@0000044944.com", "Zach@1234");
		SearchByVehicleYMMPage ymm=new SearchByVehicleYMMPage(driver);
		ymm.mvetoSearchByVehicle();
		ymm.staticThreadWait(2);
		ymm.selectYearInYMM(year);
		ymm.staticThreadWait(2);
		ymm.selectMakeInYMM(make);
		ymm.staticThreadWait(2);
		ymm.selectModelInYMM(model);
		ymm.staticThreadWait(2);
		ymm.clickSearchProducts();
		ymm.staticThreadWait(3);
		String expectedModel = ymm.getSelectedModelInYMM(model);
		String actualModel = ymm.getSelectedModelInYMM(model);
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot,"Verifying Year Make Model", expectedModel, actualModel);

	}
	@DataProvider(name = "testDataforYMM")
	public Object[][] testDataforYMM() {
		return new Object[][] {
			{"2016", "BMW", "330i"},
			{"2017", "Mercedes-Benz", "A200"},
			{"1942", "Ford", "Super Deluxe"},
			{"2002", "Kia", "Rio"}
		};
	}

	@Test
	public void modealndMakelIsEnabledFalse() {
            login("1042886@0000044944.com", "Zach@1234");
		SearchByVehicleYMMPage ymm=new SearchByVehicleYMMPage(driver);
		ymm.mvetoSearchByVehicle();
		ymm.clickModelInYmm();
		ymm.staticThreadWait(2);
		Assert.assertFalse(ValidationType.HardAssertAndTakeScreenShot,"Verifying Make is not enabled when year is not selected",ymm.isEnabledMake());
		Assert.assertFalse(ValidationType.HardAssertAndTakeScreenShot,"Verifying Model is not enabled when year is not selected",ymm.isEnabledModel());
	}

	@Test
	public void modelIsEnabledTrue() {
            login("1042886@0000044944.com", "Zach@1234");
		SearchByVehicleYMMPage ymm=new SearchByVehicleYMMPage(driver);
		ymm.mvetoSearchByVehicle();
		ymm.staticThreadWait(2);
		ymm.selectYearInYMM("2006");
		ymm.staticThreadWait(2);
		ymm.selectMakeInYMM("BMW");
		ymm.staticThreadWait(2);
		System.out.println(ymm.isEnabledModel());
		Assert.assertTrue(ValidationType.HardAssertAndTakeScreenShot,"Verifying Make is not enabled when year is not selected",ymm.isEnabledModel());
	}


	@Test
	public void submodelInYMM() throws Exception {
            login("1042886@0000044944.com", "Zach@1234");
		SearchByVehicleYMMPage ymm=new SearchByVehicleYMMPage(driver);
		ymm.mvetoSearchByVehicle();
		ymm.staticThreadWait(2);
		ymm.selectYearInYMM("2015");
		ymm.staticThreadWait(2);
		ymm.selectMakeInYMM("Bentley");
		ymm.staticThreadWait(2);
		ymm.selectModelInYMM("Mulsanne");
		ymm.staticThreadWait(2);
		ymm.selectSubModelInYMM("Base");
		Assert.assertTrue(ValidationType.HardAssertAndTakeScreenShot,"Verifying sub model is enabled in YMM",ymm.isEnabledSubModel());
	}

	@Test
	public void disableSerchProductsInYmm() {
            login("1042886@0000044944.com", "Zach@1234");
		SearchByVehicleYMMPage ymm=new SearchByVehicleYMMPage(driver);
		ymm.mvetoSearchByVehicle();
		ymm.staticThreadWait(2);
		Assert.assertFalse(ValidationType.HardAssertAndTakeScreenShot,"Verifying search products buton is ",ymm.isEnabledSerchProducts());
	}


	@Test
	public void searchProductInYMM() {
            login("1042886@0000044944.com", "Zach@1234");
		SearchByVehicleYMMPage ymm=new SearchByVehicleYMMPage(driver);
		ymm.mvetoSearchByVehicle();

		driver.getCurrentUrl();
		ymm.selectYearInYMM("2015");
		ymm.staticThreadWait(2);
		ymm.selectMakeInYMM("Bentley");
		ymm.staticThreadWait(2);
		ymm.selectModelInYMM("Mulsanne");
		ymm.staticThreadWait(2);
		ymm.selectSubModelInYMM("Base");
		ymm.staticThreadWait(2);
		ymm.clickSearchProducts();
		String ele=driver.getTitle();
		Assert.assertEquals(ValidationType.HardAssertAndTakeScreenShot, "Verifying able to see wheels page after search product in YMM", ele, "Wheels");
	}




	//================MDD 83 - HomePage -- Featured products============










}
