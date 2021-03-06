package TravelService;


import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.google.common.base.Function;

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

public class TSJavaAudio {

	
	
	
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
		
		WebElement Gridster = driver.findElement(By.className("gridster"));
		WebElement ULGridster= Gridster.findElement(By.tagName("ul"));
		List<WebElement> listofmenu = ULGridster.findElements(By.tagName("li"));
		System.out.println("Tags"+listofmenu);
		for (int i = 0; i < listofmenu.size(); i++) {
			WebElement onemenu = listofmenu.get(i);
			WebElement menuspan= onemenu.findElement(By.tagName("span"));
			String nameofmenu= menuspan.getText();
			System.out.println(""+nameofmenu);

			if(nameofmenu.matches("Hudba") || nameofmenu.matches("Audio")) {
				menuspan.click();			
				System.out.println("found!!!");
			}
		}
		//driver.findElement(By.xpath("html/body/div[1]/div/ion-nav-view/ion-view/ion-content/div[1]/div/ul/li[3]/img")).click();
		//driver.findElement(By.xpath(prop.getProperty("TravelserviceAudio"))).click();// Main URL for the application
		
		//driver.findElement(By.xpath("//img[@src='http://ifd.aero/resource/images/menus/t-audio.png?1518018576609']")).click();
		//Thread.sleep(2000);
		
/*		driver.findElement(By.xpath(prop.getProperty("Entertainment"))).click(); // Navigate
																					// to
																					// Entertainment
																					// section
		System.out.println("Main landing Everhub Page Section");
		Thread.sleep(2000);
		System.out.println("Entertainment Section");*/
		//driver.findElement(By.xpath(prop.getProperty("TravelserviceAudio"))).click(); // Navigate
																			// to
																			// Audio
																			// section
	//driver.get("http://www.msftconnecttest.com/#/entertainment/audio");
		System.out.println("Audio Section");
		Thread.sleep(2000);
	}

	@Test
	public void playaudio() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		/* CSS selector selection for Thumb nails of albums */
		List<WebElement> links = driver.findElements(By.cssSelector(".media-box__poster"));

		/* Total number of albums on the page */
		System.out.println("Total number of Albums " + links.size());
int counter =1;

		/* Logic for getting into all album on the page */
		for (int i = 0; i <= links.size(); i++) {
			
			
			/* We are waiting until clickableBlock will have class .click-block-hide */
			WebElement clickableBlock = driver.findElement(By.cssSelector(".click-block.click-block-hide"));
			 
			WebElement element = links.get(i);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver);
			
			/* Scroll into View and then Click on the Element */
			actions.moveToElement(element).click().perform();
			
			 
			/* List for playing each track one by one */
			List<WebElement> playNow1 = driver.findElements(By.cssSelector(".track-status"));

			/* List for printing title of each song */
			List<WebElement> titlesOfSongs = driver.findElements(By.cssSelector(".track-title>span"));

			/* List for printing Track number of each song */
			List<WebElement> tracknumber = driver.findElements(By.cssSelector(".track-number"));

			/* List for printing each album name */
			List<WebElement> Albumname = driver.findElements(By.cssSelector(".media-detail__metadata__title"));

			/* List for printing Artist for each album */
			List<WebElement> Artistname = driver.findElements(By.cssSelector(".media-detail__metadata__subtitle"));

			// System.out.println("Songs "+titlesOfSongs);
			//String url1 = ele.getAttribute("href");


			/* Printing Album name */
			System.out.println("Album number " + counter);
			Thread.sleep(400);
			System.out.println("Album name " + Albumname.get(0).getText());
			Thread.sleep(400);
			System.out.println("Number of songs in an album are  " + playNow1.size());
			logger.info("Album number" + counter + "Album name " + Albumname.get(0).getText());
			
			
			/* Logic for playing all songs of album */
			for (int j = 0; j < playNow1.size(); j++) {

				
				
				/* We are waiting until clickableBlock inside Album will have class .click-block-hide */
				WebElement clickableBlockInsideAlbum = driver.findElement(By.cssSelector(".click-block.click-block-hide"));

				/* Play each song of the album */
				WebElement songselement = playNow1.get(j);

				songselement.click();

				/* Print Track number followed by track name */
				System.out.println("" + tracknumber.get(j).getText() + " " + titlesOfSongs.get(j).getText());

				String songurl=playNow1.get(j).getAttribute("data-url");
				//Thread.sleep(1000);
				verifyLinkActive(songurl);
			}

			/* Go back to list of albums */
			driver.findElement(By.cssSelector(".back-button")).click(); 
			counter++;
			

			// zoomOut();
		}
	driver.close();
		logger.info(" album Tested ");
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
					TSJavaAudio.captureScreenShot(driver);
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

	public static void captureScreenShot(WebDriver ldriver){
		// Take screenshot and store as a file format             
		 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);          
		try {
		// now copy the  screenshot to desired location using copyFile method
		 
		FileUtils.copyFile(src, new File("D:\\Eclispe Workspace\\Audio Automation\\Screenshots\\Audio\\AudioTestng\\"+System.currentTimeMillis()+".png"));                              } catch (IOException e)
		 
		{
		  System.out.println(e.getMessage()) ;
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
	        
	       TSJavaAudio ad= new  TSJavaAudio();
	       
	     
	        ad.launchbrowser();
	        ad.playaudio();

	}
}
