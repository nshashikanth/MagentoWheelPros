package testmagento;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMagentoLinks {
public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shashi\\Desktop\\shashi\\chromedriver_win32\\chromedriver.exe" );
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");
		 options.addArguments("--start-maximized");
	    WebDriver  driver = new ChromeDriver(options);
		
	    //============intigrtion server================
		
//		driver.get("https://integration-5ojmyuq-22u4azrzj6uew.us-5.magentosite.cloud");
//		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("ckumar@nsight-inc.com");
//		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("Kumar@1234");
		
		
	    //=================staging server ==================
		
		driver.get("https://mc-dealerline-stage.wheelpros.com/us/customer/account/login/");
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("1042886@0000044944.com");
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("Zach@1234");
		
		
		driver.findElement(By.xpath("//button[@type='submit']//span[text()='Log In']")).submit();
		
		
		//driver.get("https://integration-5ojmyuq-22u4azrzj6uew.us-5.magentosite.cloud/");
		// Find all the links on the page using <a> tag
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Loop through each link and check if it is working
		for (WebElement link : links) {
		    String url = link.getAttribute("href");
		    try {
		        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		        connection.connect();
		        int responseCode = connection.getResponseCode();
		        if (responseCode >= 400) {
		            System.out.println(url + " is a broken link");
		        } else {
		            System.out.println(url + " is a working link");
		        }
		    } catch (Exception e) {
		        System.out.println(url + " is a broken link");
		    }
		}

		// Close the browser
		driver.quit();
		
		
}

}
