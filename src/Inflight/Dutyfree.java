package Inflight;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Dutyfree {
	WebDriver driver =new FirefoxDriver();
  @Test
  public void duty()throws InterruptedException {
	  
		// WebDriver driver =new FirefoxDriver();
	  
	  
		 driver.get("http://54.72.215.193");
		 System.out.println("Inflight "+driver.getTitle());
		 driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div[1]/section-selector/ion-scroll/div/div/span[3]")).click();
		 System.out.println(" Duty Free "+driver.getTitle());
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div[1]/div/div/ul/li[1]/img")).click();
		 System.out.println(" Select Duty Free Product "+driver.getTitle());
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/ion-content/div/div/ul/li[1]/div[2]/div/media-box[1]/div[1]/img")).click();
		 System.out.println(" Duty Free Product Description "+driver.getTitle());
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/product-detail/div/div[2]/div[2]/button")).click();
		// driver.findElement(By.cssSelector(".watch-now")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button")).click();
		 
		 System.out.println(" Select Duty Free Product "+driver.getTitle());
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/ion-content/div/div/ul/li[1]/div[2]/div/media-box[2]/div[1]/img")).click();
		 System.out.println(" Duty Free Product Description "+driver.getTitle());
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/product-detail/div/div[2]/div[2]/button")).click();
		 // driver.findElement(By.cssSelector(".watch-now")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button")).click();
		 Thread.sleep(2000);
		 
		 System.out.println(" Select Duty Free Product "+driver.getTitle());
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/ion-content/div/div/ul/li[2]/div[2]/div/media-box[3]/div[1]/img")).click();
		 System.out.println(" Duty Free Product Description "+driver.getTitle());
		 Thread.sleep(2000);
		  
		 driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/product-detail/div/div[2]/div[2]/button")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button")).click();
		 Thread.sleep(3000);
		 
		 
		 driver.findElement(By.cssSelector("[nav-bar=entering] .ion-ios-cart,[nav-bar=active] .ion-ios-cart")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button[2]")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("[nav-bar=entering] .ion-ios-cart,[nav-bar=active] .ion-ios-cart")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button")).click();
		 Thread.sleep(2000);
		 
		 
		// driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/product-detail/div/div[2]/div[2]/button")).click();
		 // driver.findElement(By.cssSelector(".watch-now")).click();
		// Thread.sleep(2000);
		 //driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button")).click();
		 //Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("[nav-bar=entering] .logo,[nav-bar=active] .logo")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("[nav-bar=active] [menu-toggle]")).click();
		 System.out.println(" Drop down  "+driver.getTitle());
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath(" /html/body/div[1]/ion-side-menus/ion-side-menu/ion-content/div[1]/div[3]/span/i")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu/ion-content/div[1]/div[3]/ion-list/div/ion-item[1]/a/span")).click();
		 System.out.println(" Duty  "+driver.getTitle());
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		 /*driver.navigate().back();
		 Thread.sleep(1000);
		 System.out.println(" Movie Description on return after Movie "+driver.getTitle());
	     driver.findElement(By.cssSelector(".back-button")).click();
	     System.out.println(" Entertainment "+driver.getTitle());
	     Assert.assertEquals(driver.getTitle(), "EverHub");
	     Thread.sleep(2000);*/
  }
}
