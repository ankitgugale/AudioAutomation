package Inflight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scrolltest {
  @Test
  public void f() throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		//driver.manage().window().maximize() ;
		 driver.get("http://54.72.215.193/#/inflight/dutyfree");
		 Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("javascript:window.scrollBy(250,350)");
		 ff.executeScript("document.getElementById('text-8').scrollIntoView(true);");
  }
}
