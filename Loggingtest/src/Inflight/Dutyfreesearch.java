package Inflight;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

@Test
public class Dutyfreesearch {
	WebDriver driver =new FirefoxDriver();
  public void fsearchdutyfree() throws InterruptedException {
	  
	  driver.get("http://54.72.215.193");
		 System.out.println("Entertainment "+driver.getTitle());
		 driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div[1]/section-selector/ion-scroll/div/div/span[3]")).click();
		 System.out.println(" Dutyfree "+driver.getTitle());
		 Thread.sleep(2000);
	      
		 driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div[1]/div/div/ul/li[1]/img")).click();
		 System.out.println(driver.getTitle());
		 Thread.sleep(2000);
	  
		 driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/div/div/input")).sendKeys("Yellow diamond");
		  Thread.sleep(2000);
		
		
			
			driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/ion-scroll/div/span[2]")).click();
			System.out.println("Searching Section : Family");
			Thread.sleep(1500);
			
			driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/ion-scroll/div/span[3]")).click();
			System.out.println("Searching Section : Drama");
			Thread.sleep(1500);
			
			driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/ion-scroll/div/span[4]")).click();
			System.out.println("Searching Section : Comedy");
			Thread.sleep(1500);
			
			driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/ion-scroll/div/span[5]")).click();
			System.out.println("Searching Section : Thriller");
			Thread.sleep(1500);
			
			driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/ion-scroll/div/span[6]")).click();
			System.out.println("Searching Section : Action");
			Thread.sleep(1500);
			

			
			driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/div/div/input")).clear();
			System.out.println("Clear the Search data");
			Thread.sleep(2000);
			
			

			    driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/div/div/input")).sendKeys("21u9skdfbsk");
			    Thread.sleep(2000);
			
			
				driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/ion-scroll/div/span[2]")).click();
				System.out.println("Searching Section : Family");
				Thread.sleep(1500);
				
				driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/ion-scroll/div/span[3]")).click();
				System.out.println("Searching Section : Drama");
				Thread.sleep(1500);
				
				driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/ion-scroll/div/span[4]")).click();
				System.out.println("Searching Section : Comedy");
				Thread.sleep(1500);
				
				driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/ion-scroll/div/span[5]")).click();
				System.out.println("Searching Section : Thriller");
				Thread.sleep(1500);
				
				driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/ion-scroll/div/span[6]")).click();
				System.out.println("Searching Section : Action");
				Thread.sleep(1500);
				
				  driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/div/div/input")).click();
				Thread.sleep(2500);
				
				
				driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/div/div/input")).clear();
				System.out.println("Clear the Search data");
				Thread.sleep(2000);
				
				
				driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/ion-scroll/div/span[1]")).click();
				Thread.sleep(2000); 
				driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/div/div/input")).sendKeys("Yellow diamond");
				 Thread.sleep(2000);
				
				 WebElement temp = driver.findElement(By.xpath("//img[@src= '/images/ecommerce/41ozPsoLse/NJ1eZwsoLig-8.jpg']"));
				 temp.click();
				 Thread.sleep(3000);
				
				 driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/product-detail/div/div[2]/div[2]/button")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button")).click();
				 //driver.findElement(By.name("okbutton")).click();
				 //driver.findElement(By.className("button ng-binding button-positive")).click();
				 
				// Assert.assertEquals("By.tagName: Button", By.tagName("Button"));
				//WebElement tbt= driver.findElement(By.tagName("BUTTON"));
				//tbt.click();
				
				
				 Thread.sleep(2000);
  }
}
