package com.wheelpros.qa.us.magento.dealerline.pages;



import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wheelpros.web.utils.BasePage;

public class MyCartPage extends BasePage{

	WebDriver driver;

	public MyCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//div[@class='minicart-wrapper']")
	WebElement btnMyCart;
	
	


  

   
   
  @FindBy(xpath = "//span[@class='count theme-primary']")
  WebElement txtSumOfIteamQty;
   
 
	  public int countoftotalqtyincart() {
		  List <WebElement> items=driver.findElements(By.xpath("//ol[@id='mini-cart']/li//input"));
		  int totalQty = 0;
		  for (WebElement item : items) {
			  String qty = item.getAttribute("data-item-qty");
//			    WebElement qtyInput = item.findElement(By.xpath("//input[@data-item-qty='" + qty + "']"));
//			  // Extract the quantity value as a string and parse it as an integer
//		        String qtyStr = qtyInput.getAttribute("value");
		        int qty1 = Integer.parseInt(qty);
		        
		        // Add the quantity to the running total
		     totalQty += qty1;
		  }
		// Print the total quantity to the console
		    System.out.println("Total quantity in cart: " + totalQty);
		    return totalQty;
	  }
   
   
   
   
   
   
   
   
   
   
   
   public void clickMyCart() {
	   waitForVisibilityOfElement(btnMyCart).click();
   }
   
 
   public int getTotalItemQty() {
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   String theTextIWant = jse.executeScript("return arguments[0].innerHTML;",txtSumOfIteamQty).toString();
	   theTextIWant = theTextIWant.split("\n")[1].split("-->")[1].split("<")[0];
	  return Integer.parseInt(theTextIWant);
	  
   }
   
   
   //below is the method for the calculation of total qty
   
   public int testcarttotalcostandperItem() {
		  List <WebElement> items=driver.findElements(By.xpath("//ol[@id='mini-cart']/li//input"));
		  int totalQty = 0;
		  for (WebElement item : items) {
			  String qty = item.getAttribute("data-item-qty");
		    WebElement qtyInput = item.findElement(By.xpath("//input[@data-item-qty='" + qty + "']"));
//			  // Extract the quantity value as a string and parse it as an integer
	        String qtyStr = qtyInput.getAttribute("value");
		        int qty1 = Integer.parseInt(qty);
		        // Add the quantity to the running total
		  }
		return totalQty;
	  }
    
    //below are the metods for totatal qty and cost of the cart in total

   public void MiniCartPriceScript() {
	   List<WebElement> priceElements = driver.findElements(By.xpath("//ol[@id='mini-cart']/li//span[@class='price']"));
WebElement wait=driver.findElement(By.xpath("//ol[@id='mini-cart']/li//span[@class='price']"));
waitForVisibilityOfElement(wait);
       Pattern pattern = Pattern.compile("\\$([\\d,]+\\.\\d{2})");
       for (WebElement priceElement : priceElements) {
           String priceText = priceElement.getText();
           Matcher matcher = pattern.matcher(priceText);
           if (matcher.find()) {
               String priceValue = matcher.group(1);
               System.out.println(priceValue);
   }
       }
  
   }
   
   
   private static double grandTotalCost = 0.0;
   public void miniCartDetailsScript() {
	    List<WebElement> priceElements = driver.findElements(By.xpath("//ol[@id='mini-cart']/li//span[@class='price']"));
	    List<WebElement> qtyElements = driver.findElements(By.xpath("//ol[@id='mini-cart']/li//input[@data-item-qty]"));
	    double totalCost = 0.0;
	    int totalQty = 0;

	    for (int i = 0; i < priceElements.size(); i++) {
	        String priceText = priceElements.get(i).getText();
	        String qtyStr = qtyElements.get(i).getAttribute("value");
	        int qty = Integer.parseInt(qtyStr);
	        if (priceText != null && priceText.length() >= 2) {
	            double priceValue = Double.parseDouble(priceText.substring(1).replaceAll(",", ""));
	            double costPerItem = priceValue * qty;
	            System.out.println("Cost per item: $" + String.format("%.2f", costPerItem));
	            totalCost += costPerItem;
	            totalQty += qty;
	        }
	    }
	    // add total cost to grand total
	    grandTotalCost += totalCost;

	    System.out.println("Total quantity of items: " + totalQty);
	    System.out.println("Total cost of items in mini cart: $" + String.format("%.2f", totalCost));
	    System.out.println("Grand total cost of all items: $" + String.format("%.2f", grandTotalCost));
	}
//==========================================
   
 
   }
	















