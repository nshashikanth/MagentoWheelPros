package testmagento;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestWebSite {

	
public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Shashi\\Desktop\\shashi\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.bbc.com/");
		driver.findElement(By.xpath("(//span[text()='News'])[1]")).click();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dblclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		Actions act=new Actions(driver);
		act.doubleClick(dblclick).perform();
		
		
		WebElement drpdown=driver.findElement(By.xpath("//select[@name='speed']"));
		Select select=new Select(drpdown);
		select.selectByVisibleText("Fast");
		
		
		WebElement drag=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions dd=new Actions(driver);
		dd.dragAndDrop(drag, drop).perform();
		
		WebElement dragpic=driver.findElement(By.xpath("//img[@alt='the peaks of high tatras']"));
		WebElement dragpic1=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
		
		dd.dragAndDrop(dragpic, trash).perform();
		dd.dragAndDrop(dragpic1, trash).perform();
		
				
		if(trash.isDisplayed()) {
		  dragpic.isDisplayed();
		  System.out.println("image moved to trash");
		} if(trash.isDisplayed()) {
			dragpic1.isDisplayed();
			System.out.println("image1 moved to trash");
		
		}
		
		WebElement text=driver.findElement(By.xpath("//name[text()='David']"));
		
		System.out.println(text.getText());
		
		WebElement text1=driver.findElement(By.xpath("//designation[text()='Senior Engineer']"));
		System.out.println(text1.getText());
		
		Assert.assertEquals(text.getText(),"David");
				
		
		
		
}

}