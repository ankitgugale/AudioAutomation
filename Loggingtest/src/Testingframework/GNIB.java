package Testingframework;
import java.io.File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GNIB {
	static Properties prop = new Properties();
	static WebDriver driver =new FirefoxDriver();
	@Test
public void launchbrowser()throws InterruptedException
{

	/* File file = new File(System.getProperty("user.dir")+"//src//Library//OR.properties");
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
	 
	driver.get(prop.getProperty("URL"));  */
		Thread.sleep(1000);
	driver.get("https://burghquayregistrationoffice.inis.gov.ie/Website/AMSREG/AMSRegWeb.nsf/AppSelect?OpenForm");
	Thread.sleep(1000);
	/*driver.findElement(By.id(")).click();
	Thread.sleep(1000);*/
	
	
	Select category = new Select(driver.findElement(By.id("Category")));
	category.selectByVisibleText("Work");
	category.selectByIndex(3);
	/*driver.findElement(By.xpath("")).sendKeys("");
	Thread.sleep(1500);*/
	Thread.sleep(1000);
	
	Select subcategory = new Select(driver.findElement(By.id("SubCategory")));
	subcategory.selectByVisibleText("Work Permit Holder");
	subcategory.selectByIndex(2);
	/*driver.findElement(By.xpath("")).sendKeys("");
	Thread.sleep(1500);*/
	Thread.sleep(1000);
	
	Select GNIB = new Select(driver.findElement(By.id("ConfirmGNIB")));
	GNIB.selectByVisibleText("Yes");
	GNIB.selectByIndex(1);
	/*driver.findElement(By.xpath("")).sendKeys("");
	Thread.sleep(1500);*/
	Thread.sleep(1000);
	
	driver.findElement(By.id("GNIBNo")).sendKeys("123456");
	Thread.sleep(1000);
	
	
	
	driver.findElement(By.id("GNIBExDT")).click();
	Thread.sleep(2000);
	
	
	
	//driver.findElement(By.xpath("html/body/div[6]/div[3]/table/tfoot/tr[1]/th")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("html/body/div[6]/div[3]/table/tbody/tr/td/span[10]")).click();
	
	driver.findElement(By.className("year")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.className("month")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.className("day")).click();
	Thread.sleep(2000);
	//Select months = new Select(driver.findElement(By.className("month")));
	//months.selectByVisibleText("Feb");
	//months.selectByIndex(1);
	/*driver.findElement(By.xpath("")).sendKeys("");
	Thread.sleep(1500);*/
	Thread.sleep(1000);
	
	/*driver.findElement(By.xpath("html/body/div[6]/div[2]/table/tbody/tr/td/span[2]")).click();
	Thread.sleep(1000);*/
	
	//driver.findElement(By.xpath("html/body/div[6]/div[1]/table/tbody/tr[3]/td[3]")).click();
	//Thread.sleep(1000);
	
	driver.findElement(By.id("UsrDeclaration")).click();
	Thread.sleep(1000);
	
	
	driver.findElement(By.id("GivenName")).sendKeys("John");
	Thread.sleep(1000);
	
	driver.findElement(By.id("SurName")).sendKeys("smith");
	Thread.sleep(1000);
	
	driver.findElement(By.id("DOB")).click();
	Thread.sleep(1000);
	
	/*driver.findElement(By.id("prev")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.id("prev")).click();
	Thread.sleep(1000);*/
	
	
	driver.findElement(By.className("year")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.className("month")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.className("day")).click();
	Thread.sleep(2000);
	
	
	Select nation = new Select(driver.findElement(By.id("SubCategory")));
	nation.selectByVisibleText("Albania, Republic of");
	nation.selectByIndex(2);
	Thread.sleep(1000);
	
	driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
	Thread.sleep(1000);
	
	driver.findElement(By.id("EmailConfirm")).sendKeys("abc@gmail.com");
	Thread.sleep(1000);
	
	
	Select familyapp = new Select(driver.findElement(By.id("FamAppYN")));
	familyapp.selectByVisibleText("No");
	familyapp.selectByIndex(2);
	Thread.sleep(1000);
	
	Select passport = new Select(driver.findElement(By.id("PPNoYN")));
	passport.selectByVisibleText("Yes");
	passport.selectByIndex(1);
	Thread.sleep(1000);
	
	
	driver.findElement(By.id("PPNo")).sendKeys("L2311666");
	Thread.sleep(1000);
	
	
	driver.findElement(By.id("btLook4Ap")).click();
	Thread.sleep(1000);
	
	
	Select datesel = new Select(driver.findElement(By.id("AppSelectChoice")));
	datesel.selectByVisibleText("closest to today");
	datesel.selectByIndex(2);
	Thread.sleep(1000);
	
	driver.findElement(By.id("btSrch4Apps")).click();
	Thread.sleep(1000);
	
	

	
	
}
}
