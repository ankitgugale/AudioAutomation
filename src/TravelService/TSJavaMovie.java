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

public class TSJavaMovie {

	static Properties prop = new Properties();
	// static WebDriver driver = new FirefoxDriver();

	// static WebDriver driver = new ChromeDriver();
	static WebDriver driver;
	static Logger logger = Logger.getLogger("Travelservice");

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

		driver.get(prop.getProperty("TravelserviceURL"));// Main URL for the
		Thread.sleep(1000);												// application
		// Thread.sleep(2000);
		WebElement VoucherLandingPage = driver.findElement(
				By.cssSelector(".button.button-energized.voucher.ng-binding"));

		VoucherLandingPage.click();
	Thread.sleep(1000);	
		WebElement 	VoucherCode = driver.findElement(By.cssSelector(".ng-pristine.ng-valid.ng-empty.ng-touched"));
		VoucherCode.sendKeys("0VK5LW-02-QS");
		
		WebElement VoucherActivatePage = driver.findElement(
				By.cssSelector(".button.button-energized.play-media-button.ng-binding"));
		VoucherActivatePage.click();
		
		Thread.sleep(1000);	
		WebElement VoucherActivatePage1 = driver.findElement(
				By.cssSelector(".button-menu"));
		VoucherActivatePage1.click();
	//	driver.findElement(By.cssSelector("button.button-energized.voucher.ng-binding")).click();
		Thread.sleep(1000);	
		WebElement Gridster = driver.findElement(By.className("gridster"));
		WebElement ULGridster = Gridster.findElement(By.tagName("ul"));
		List<WebElement> listofmenu = ULGridster.findElements(By.tagName("li"));
		System.out.println("Tags" + listofmenu);
		Thread.sleep(1000);
		for (int i = 0; i < listofmenu.size(); i++) {
			WebElement onemenu = listofmenu.get(i);
			WebElement menuspan = onemenu.findElement(By.tagName("span"));
			String nameofmenu = menuspan.getText();
			System.out.println("" + nameofmenu);

			if (nameofmenu.matches("Filmy") || nameofmenu.matches("Movies")) {

				menuspan.click();
				System.out.println("found!!!");
			}
		}

		System.out.println("Movie Section");
		// Thread.sleep(2000);
	}

	@Test
	public void playmovie() throws InterruptedException {

		// WebDriver wait = new WebDriverWait(driver, 10);

		/* CSS selector selection for Thumb nails of albums */
		List<WebElement> links = driver.findElements(By.cssSelector(".media-box__poster"));

		List<WebElement> Moviename = driver.findElements(By.className("media-box__title"));
		Thread.sleep(400);

		/* Total number of albums on the page */
		System.out.println("Total number of movies " + links.size());
		int counter = 1;

		for (int i = 0; i <= links.size(); i++) {

			/*
			 * We are waiting until clickableBlock will have class
			 * .click-block-hide
			 */
			WebElement clickableBlock = driver.findElement(By.cssSelector(".click-block.click-block-hide"));

			WebElement element = links.get(i);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver);
			Thread.sleep(400);
			System.out.println("Movie number :" + counter + " Movie name : " + Moviename.get(i).getText());
			Thread.sleep(400);
			// Scroll into View and then Click on the Element
			actions.moveToElement(element).click().perform();
			Thread.sleep(1000);
			WebElement clickableBlock1 = driver.findElement(By.cssSelector(".click-block.click-block-hide"));
			WebElement movieActionElement = driver.findElement(By.cssSelector(".video-detail__content__actions"));

			WebElement a = driver.findElement(By.cssSelector(".button.button-stable.play-media-button.ng-binding"));
			a.click();

			// System.out.println("Movie Played :" +
			// Moviename.get(i).getText());

			List<WebElement> moviePopUpclass = driver.findElements(By.className("lang_container"));
			if (!moviePopUpclass.isEmpty()) {
				List<WebElement> langSelect = moviePopUpclass.get(0).findElements(By.tagName("div"));

				System.out.println("Tags" + langSelect);
				for (int j = 0; j < langSelect.size(); j++) {
					WebElement onemenu = langSelect.get(j);
					WebElement menuspan = onemenu.findElement(By.tagName("span"));
					String nameofmenu = menuspan.getText();

					if (nameofmenu.matches("English") || nameofmenu.matches("English")) {
						menuspan.click();
						System.out.println("found!!!");
					}

				}

				WebElement clickableBlock2 = driver.findElement(
						By.cssSelector(".button.button-energized.play-media-button.selectLanguage.ng-binding"));

				clickableBlock2.click();

			}

			Thread.sleep(1500);
			TSJavaMovie.captureScreenShot(driver);
			driver.navigate().back();

			// System.out.println("Counter is"+counter);
			if (counter == links.size()) {
				driver.get(prop.getProperty("TravelserviceURL"));
				System.out.println("test case passed");
				break;
			}
			counter++;
		}
	}

	public static void captureScreenShot(WebDriver ldriver) {
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the screenshot to desired location using copyFile method

			FileUtils.copyFile(src, new File("D:\\Eclispe Workspace\\Audio Automation\\Screenshots\\Movie\\MovieJava\\"
					+ System.currentTimeMillis() + ".png"));
		} catch (IOException e)

		{
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws InterruptedException {

		// Here we need to create logger instance so we need to pass Class name
		// for
		// which we want to create log file in my case Google is classname
		Logger logger = Logger.getLogger("Travelservice");

		// configure log4j properties file
		PropertyConfigurator.configure("log4j.properties");
		// Open browser
		// static WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Seleniumdriver\\sel\\chromedriver.exe");
		driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		logger.info("Browser Opened");

		// Set implicit wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		logger.info("Implicit wait given");

		// Load application
		// driver.get("https://www.google.co.in/");
		// logger.info("Url opened");

		TSJavaMovie ad = new TSJavaMovie();

		ad.launchbrowser();
		ad.playmovie();
	}
}