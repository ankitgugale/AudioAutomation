package TravelService;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.google.common.base.Function;

//import TravelService.TSJavaAudio;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class TSJavaPublication {

	
	
	
	static Properties prop = new Properties();
	//static WebDriver driver = new FirefoxDriver();
	
	
	//static  WebDriver driver = new ChromeDriver(); 
	static  WebDriver driver;
	 static Logger logger=Logger.getLogger("Travelservice");
	@Test
	public void launchbrowser() throws InterruptedException {

		/*
		 * Launch the Browser 1. Read the file of xpath from config/OR
		 * properties file
		 */
		File file = new File(System.getProperty("user.dir") + "//src//Library//OR.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		driver.get(prop.getProperty("TravelserviceURL"));// Main URL for the application
		//Thread.sleep(2000);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Gridster = driver.findElement(By.className("gridster"));
		WebElement ULGridster= Gridster.findElement(By.tagName("ul"));
		List<WebElement> listofmenu = ULGridster.findElements(By.tagName("li"));
		System.out.println("Tags"+listofmenu);
		for (int i = 0; i < listofmenu.size(); i++) {
			WebElement onemenu = listofmenu.get(i);
			WebElement menuspan= onemenu.findElement(By.tagName("span"));
			String nameofmenu= menuspan.getText();
			System.out.println(""+nameofmenu);

			if(nameofmenu.matches("Publications") || nameofmenu.matches("Publikace")) {
				menuspan.click();			
				System.out.println("found!!!");
			}
		}

		System.out.println("Publications Section");
		Thread.sleep(2000);
	}
	
	
	@Test
	public void playaudio() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		/* CSS selector selection for Thumb nails of albums */
		List<WebElement> links = driver.findElements(By.cssSelector(".media-box__poster img"));
		//List<WebElement> Albumname = driver.findElements(By.cssSelector(".media-detail__metadata__title"));

		/* Total number of albums on the page */
		System.out.println("Total number of Publications " + links.size());


		int counter =1;
		// Logic for getting into all album on the page 
		for (int i = 0; i <= links.size(); i++) {
			
		
			//Thread.sleep(1000);
		//	 We are waiting until clickableBlock will have class .click-block-hide 
			/*WebElement web=	driver.findElement(By.cssSelector(".media-detail__metadata__title"));
			System.out.println("Name" +web.getText());
			Thread.sleep(1000);*/
			WebElement clickableBlock = driver.findElement(By.cssSelector(".click-block.click-block-hide"));
			 
			WebElement element = links.get(i);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver);
			
			// Scroll into View and then Click on the Element 
			actions.moveToElement(element).click().perform();
			
			Thread.sleep(2000);
			//Thread.sleep(1500);
			List<WebElement> Publicationname = driver.findElements(By.cssSelector(".media-detail__metadata__title"));
			//System.out.println("Publication name " + Publicationname.get(0).getText());
			//System.out.println("Publication name " + Publicationname.get(0).getText());
			driver.findElement(By.cssSelector(".media-detail__actions button")).click();	
			String Publicationurl=driver.findElement(By.cssSelector(".media-detail__actions button")).getAttribute("data-url");
			
			verifyLinkActive(Publicationurl);
			Thread.sleep(1000);
			System.out.println("Publication Number :  "+counter + "    Publication name :  " + Publicationname.get(0).getText());
			counter++;
			
			
		
			//System.out.println("Download " + Albumname.get(0).getText());
			driver.findElement(By.cssSelector(".back-button")).click(); 
			
			if(counter>10)
			{
				driver.get(prop.getProperty("TravelserviceURL"));
				System.out.println("test case passed");
				break;
			}
			}

			// Go back to list of albums 
			
		
			
			
			// zoomOut();
			//driver.get(prop.getProperty("TravelserviceURL"));
	
	}
	
	
	/* Response to check whether each album is being played */
	public static void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(3000);

			switch (httpURLConnect.getResponseCode()){
				case 200:
					System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
					
					
					break;
				case HttpURLConnection.HTTP_NOT_FOUND:
					System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
							+ HttpURLConnection.HTTP_NOT_FOUND);
					logger.info(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
							+ HttpURLConnection.HTTP_NOT_FOUND);
					//TSJavaAudio.captureScreenShot(driver);
					System.out.println("Screenshot taken");
					
				//	System.out.println("Screenshot taken "+Albumname.get(0).getText());
					break;
				default:
					System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
					logger.info(linkUrl + " - " + httpURLConnect.getResponseMessage());
				return;
			}
									
		} catch (Exception e) {
			System.out.println(linkUrl + " - " + e);
		}
	}

	public static void main(String[] args) throws InterruptedException {

	    // Here we need to create logger instance so we need to pass Class name for 
	    //which  we want to create log file in my case Google is classname
	   Logger logger=Logger.getLogger("Travelservice");

	      // configure log4j properties file
	       PropertyConfigurator.configure("log4j.properties");
	         // Open browser
	   	//static  WebDriver driver = new ChromeDriver(); 
		System.setProperty("webdriver.chrome.driver" , "C:\\Program Files (x86)\\Seleniumdriver\\sel\\chromedriver.exe");
		driver = new ChromeDriver(); 
	        //WebDriver driver = new FirefoxDriver();
	        logger.info("Browser Opened");

	        // Set implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        logger.info("Implicit wait given");

	        // Load application
	    // driver.get("https://www.google.co.in/");
	    // logger.info("Url opened");
	        
	       TSJavaPublication ad= new  TSJavaPublication();
	       
	     
	        ad.launchbrowser();
	        ad.playaudio(); 
	     //   ad.playaudio();
}}
