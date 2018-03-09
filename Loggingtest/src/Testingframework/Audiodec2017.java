package Testingframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.w3c.dom.Document;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
public class Audiodec2017
{ 
	boolean verifyPlay;
	public void Launch() throws InterruptedException{

		WebDriver driver =new FirefoxDriver();

		driver.get("http://54.72.215.193");
		driver.findElement(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div[1]/section-selector/ion-scroll/div/div/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div[1]/div/div/ul/li[3]/span")).click();
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/media-filters/div/ion-scroll/div/span[4]/span")).click();
		Thread.sleep(2000);*/
		int counter=0;
		//driver.findElement(By.xpath("//img[@src='http://54.72.215.193/resource/images/Classical_Gewandhausorchester_BrahmsSerenades_300x300.jpg']")).click();
		//driver.findElement(By.xpath("html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/ion-content/div/div/ul/li[3]/div[2]/div/media-box[1]/div[1]/img")).click();
	/*	Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();*/
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 550)");
		ExecuteScript executeScript= new ExecuteScript(null);
		
		driver.executeScript("document.getElementByXpath('img[@src='http://54.72.215.193/resource/images/Alternative_MichelleChamuel_FacetheFire_300x300.jpg').scrollIntoView(true);");*/
		
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");*/
		
		/*for (int second = 0;; second++) {
		    if(second >=2){
		        break;
		    }
		    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", ""); //y value '400' can be altered
		    Thread.sleep(3000);
		}
		Document.getElementByID("Myid")
		WebElement element = driver.findElement(By.xpath("//img[@src='http://54.72.215.193/resource/images/Alternative_MichelleChamuel_FacetheFire_300x300.jpg']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		WebElement scroll = driver.findElement(By.xpath("//img[@src='http://54.72.215.193/resource/images/Alternative_Kodaline_ComingUpforAir_300x300.jpg']"));
		scroll.sendKeys(Keys.PAGE_DOWN);
		System.out.println("Scrolled");*/
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[@src='http://54.72.215.193/resource/images/Alternative_MichelleChamuel_FacetheFire_300x300.jpg']")).click();
		
		//Thread.sleep(2000);
		
		WebElement html = driver.findElement(By.tagName("html"));
		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		
		Thread.sleep(1000);html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		Thread.sleep(1000);html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		Thread.sleep(1000);html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@src='http://54.72.215.193/resource/images/Alternative_MichelleChamuel_FacetheFire_300x300.jpg']")).click();
		Thread.sleep(1000);
	//abc()throws InterruptedException{
		List<WebElement> playNow1=driver.findElements(By.cssSelector(".track-status"));
		for(int i=0;i<playNow1.size();i++)
		{
			playNow1.get(i).click();
			Thread.sleep(2000);
			verifyPlay=driver.findElement(By.className("added-track")).isDisplayed();
			if(verifyPlay==false)
			{
				System.out.println("Failed for item id "+ i);
				break;
			}

			else
				System.out.println("Pass"+ i);
		}
	
		System.out.println("Incremented "+ counter);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/modal-header/div/div[3]/div")).click();
		counter++;
		
		
		if (counter == 1) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@src='http://54.72.215.193/resource/images/Classical_LSO_MendelssohnSymphonyNo3_300x300.jpg']")).click();
		
		}
		
	
	}
	/*driver.navigate().back();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//img[@src='http://54.72.215.193/resource/images/Classical_LSO_MendelssohnSymphonyNo3_300x300.jpg']")).click();
	  Thread.sleep(2000);
	  List<WebElement> playNow2=driver.findElements(By.cssSelector(".track-status"));
	  for(int i=0;i<playNow1.size();i++)
	     {
	      playNow2.get(i).click();
	     }
	}*/
	public static void main(String[] args) throws InterruptedException
	{
		AnkitDemo AD=new AnkitDemo();
		AD.Launch();

	}
}