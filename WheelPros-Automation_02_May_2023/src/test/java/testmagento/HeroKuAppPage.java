package testmagento;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wheelpros.web.utils.BasePage;

public class  HeroKuAppPage extends BasePage{
	WebDriver dirver;
	public  HeroKuAppPage(WebDriver driver) {
		super(driver);
		this.dirver=driver;
		PageFactory.initElements(driver,this);
	}


	@FindBy(xpath = "//a[@href='/abtest']")
	WebElement lnkabtest;

   // for addd remvoe element
	
	@FindBy(xpath ="//a[@href='/add_remove_elements/']")
	WebElement lnkAddRemove;
	
	@FindBy(xpath="//button[@onclick='addElement()']")
	WebElement btnAddElement;
	
	@FindBy(xpath="//button[@onclick='deleteElement()']")
	WebElement btnDeleteElement;

	
	// Basic Auth
	
	@FindBy(xpath="//a[@href='/basic_auth']")
	WebElement lnkBasicAuth;

	@FindBy(xpath="//a[@href='/broken_images']")
	WebElement lnkBrokeImage;

	@FindBy(xpath="//a[@href='/challenging_dom']")
	WebElement lnkChallengingDom;
	
	@FindBy(xpath = "//a[@href='/checkboxes']")
	WebElement lnkCheckBoxes;
	
	@FindBy(xpath = "//a[@href='/context_menu']")
	WebElement lnkContextMenu;
	
	@FindBy(xpath="//a[@href='/digest_auth']")
	WebElement lnkDigestAuth;
	
	@FindBy(xpath="//a[@href='/disappearing_elements']")
	WebElement lnkDisappearingElements;
	
	@FindBy(xpath="//a[@href='/drag_and_drop']")
	WebElement lnkDragDrop;
	
	@FindBy(xpath="//a[@href='/dropdown']")
	WebElement lnkDropDown;
	
	@FindBy(xpath="//a[@href='/dynamic_content']")
	WebElement lnkDynamicContent;
	
	@FindBy(xpath="//a[@href='/dynamic_controls']")
	WebElement lnkDynamicControls;
	

	@FindBy(xpath="//a[@href='/dynamic_loading']")
	WebElement lnkDynamicLoading;

	public void clickabtest() {
		lnkabtest.click();
	}

	
	//Add or remove element
	public void clickAddRemove() {
		lnkAddRemove.click();
	}
	public void clickAddElement() {
		btnAddElement.click();
	}
	
	public void clickDeleteElement() {
		btnDeleteElement.click();
	}
	
	//Basic auth
	
	public void clickBasicAuth() {
		lnkBasicAuth.click();
	}

	public void clickBrokenImage() {
		lnkBrokeImage.click();
	}

	public void clickChallengingDom() {
		lnkChallengingDom.click();
	}
	
	public void clickCheckBoxes() {
		lnkCheckBoxes.click();
	}
	
	public void clickContextMenu() {
		lnkContextMenu.click();
	}
	
	public void clickDigestAuth() {
		lnkDigestAuth.click();
	}
	
	public void clickDisappearingElement() {
		lnkDisappearingElements.click();
	}
	
	public void clickDragDrop() {
		lnkDragDrop.click();
	}
	
	public void clickDropDown() {
		lnkDropDown.click();
	}
	
	public void clickDynamicContent() {
		lnkDynamicContent.click();
	}
	
	public void clickDynamicControl() {
		lnkDynamicControls.click();
	}
	
	public void clickDynamicLoading() {
		lnkDynamicLoading.click();
	}
	
}

