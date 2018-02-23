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

public class NewTest {
  @Test
  public void f() throws InterruptedException{
	  
	  WebDriver driver =new FirefoxDriver();
	  driver.get("http://54.72.215.193/#/inflight/dutyfree");
	  Thread.sleep(2000);
	 System.out.println("Dutyfree "+driver.getTitle());
	// driver.findElement(By.id("dtimage")).getText();
	 //driver.findElement(By.className("media-box__poster")).click();
	 //System.out.println("suscess");
	 //Thread.sleep(2000);
	// driver.findElement(By.className("media-box__poster")).getTagName();
	// Thread.sleep(2000);
	// driver.findElement(By.className("media-box__poster")).click();
		//	System.out.println("suscess");
	 
	/* driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/div/div/div/input")).sendKeys("Yellow diamond");
	  Thread.sleep(2000);
		
	 WebElement temp = driver.findElement(By.xpath("//img[@src= '/images/ecommerce/41ozPsoLse/NJ1eZwsoLig-8.jpg']"));
	 temp.click();
	 Thread.sleep(2000);
	 */
	 
	 
	 WebElement temp = driver.findElement(By.xpath("//img[@src= '/images/ecommerce/41ozPsoLse/NJ1eZwsoLig-8.jpg']"));
	 temp.click();
	 Thread.sleep(3000);
	
	 driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/product-detail/div/div[2]/div[2]/button")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/button")).click();
	 Thread.sleep(2000);

	// String temp = driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/ion-content/div/div/ul/li[2]/div[2]/div/media-box[1]/div[2]")).getText();

	 Thread.sleep(2000);	 
	// String temp1 = driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/ion-content/div/div/ul/li[2]/div[2]/div/media-box[1]/div[2]")).getCssValue(temp);
	// System.out.println("pppppp"+temp1);
	 Thread.sleep(2000);
	 Class<? extends WebElement> temp2 = driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/ion-content/div/div/ul/li[2]/div[2]/div/media-box[1]/div[2]")).getClass();
	 System.out.println("aaaa"+getClass());
	 
	String arg0 = null;
	String  temp3 = driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/ion-content/div/div/ul/li[2]/div[2]/div/media-box[1]/div[2]")).getAttribute(arg0);
	 System.out.println("pppppp"+arg0);
  }
}
