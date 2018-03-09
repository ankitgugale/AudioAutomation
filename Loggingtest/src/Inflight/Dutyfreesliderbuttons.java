package Inflight;

import org.testng.annotations.Test;
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

public class Dutyfreesliderbuttons {
	WebDriver driver =new FirefoxDriver();
  @Test
  public void dutyfreeslideroperations() throws InterruptedException{
	  
	// WebDriver driver =new FirefoxDriver();
	  
	  
			 driver.get("http://54.72.215.193");
			 System.out.println("Inflight "+driver.getTitle());
			 driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div[1]/section-selector/ion-scroll/div/div/span[3]")).click();
			 System.out.println(" Duty Free "+driver.getTitle());
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div[1]/div/div/ul/li[1]/img")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("ion-view[nav-view=active] .swiper-slide-active:not(.swiper-slide-duplicate) .play-media-button")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("ion-view[nav-view=active] .swiper-slide-active:not(.swiper-slide-duplicate) .info-button")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/product-detail/div/div[2]/div[2]/button")).click();
			// driver.findElement(By.cssSelector(".watch-now")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button")).click();
			 Thread.sleep(2000); 
				
				 

  
  
  }
}
