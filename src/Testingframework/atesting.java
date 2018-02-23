package Testingframework;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class atesting {

	static Properties prop = new Properties();
	static WebDriver driver =new FirefoxDriver();
	@Test
	public void launchbrowser()throws InterruptedException
	{

		 File file = new File(System.getProperty("user.dir")+"//src//Library//OR.properties");
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
			//load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
		 
		driver.get(prop.getProperty("URL"));  
		
		

		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("Entertainment"))).click();
		
		  Thread.sleep(2000);
		  System.out.println("2");
		  driver.findElement(By.xpath(prop.getProperty("Audio"))).click();
		 Thread.sleep(2000);
	   }
		
	@Test
	  public void playaudio() throws InterruptedException{
		  
		  
		  
		  List<WebElement> listofalbums =driver.findElements(By.cssSelector(".media-box__poster"));
		  System.out.println(listofalbums);

		 
		  
		  for(int i=0;i<listofalbums.size();i++)
		  {
	
			 WebElement element = listofalbums.get(i);
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			 		  
		  element.click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(prop.getProperty("AudioBackButton"))).click();
		   Thread.sleep(2000);
	}
}
}


/*Actions action = new Actions(webdriver);
WebElement we = webdriver.findElement(By.cssSelector(".media-box__poster"));
action.moveToElement(we).moveToElement(webdriver.findElement(By.cssSelector(".media-box__poster"))).click().build().perform();	*/