package Testingframework;

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

public class dynamicaudio {

	static Properties prop = new Properties();
	static WebDriver driver =new FirefoxDriver();
public void launchbrowser()throws InterruptedException
{

	 File file = new File(System.getProperty("user.dir")+"//src//Library//OR.properties");
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
	 
	driver.get(prop.getProperty("URL"));  
	
	

	Thread.sleep(1000);
	System.out.println("1");
	Thread.sleep(2000);
	driver.findElement(By.xpath(prop.getProperty("Entertainment"))).click();
	
	  Thread.sleep(2000);
	  System.out.println("2");
	  driver.findElement(By.xpath(prop.getProperty("Audio"))).click();
	 
	  Thread.sleep(2000);
	  
	  
}
	

/*public void Albumname(String albumtitle)throws InterruptedException
{
	driver.findElement(By.xpath(albumtitle)).click();
}*/
public void Launch(String albumXpath) throws InterruptedException
	 {
		
		zoomOut();
	  int counter=0;
		driver.findElement(By.xpath(albumXpath)).click();
	  Thread.sleep(2000);
	  List<WebElement> playNow1=driver.findElements(By.cssSelector(".track-status"));
	 // zoomIn();
	  set100();
	  System.out.println("Counter is "+counter);
	  for(int i=0;i<playNow1.size();i++)
	     {

		
	      playNow1.get(i).click();
	      Thread.sleep(2500);
	      counter++;
	     }
	
	  System.out.println("Number of songs in an album are  "+counter);
	 // System.out.println("Album number"+playNow1);
		driver.findElement(By.xpath(prop.getProperty("AudioBackButton"))).click();
	
		
	}
	public void zoomIn(){
		  //To zoom In page 4 time using CTRL and + keys.
		  for(int i=0; i<2; i++){   
		  driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		  }
	}
	
	public void zoomOut(){
		  //To zoom out page 4 time using CTRL and - keys.
		  for(int i=0; i<4; i++){
		   driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		  }
		 }
	public void set100(){
		  //To set browser to default zoom level 100%
		  driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
		 }
	 public static void main(String[] args) throws InterruptedException
	 {
		
		 
		 ATest AD=new ATest();
		 AD.launchbrowser();
		 //String album = Album;
		 
		 String album1= prop.getProperty("Album1");
		 String album2= prop.getProperty("Album2");
		 String album3= prop.getProperty("Album3");
		 String album4= prop.getProperty("Album4");
		 String album5= prop.getProperty("Album5");
	     String album6= prop.getProperty("Album6");
		 String album7= prop.getProperty("Album7");
		 String album8= prop.getProperty("Album8");
		 String album9= prop.getProperty("Album9");
		 String album10= prop.getProperty("Album10");
		 String album11= prop.getProperty("Album11");
		 String album12= prop.getProperty("Album12");
		 String album13= prop.getProperty("Album13");
		 String album14= prop.getProperty("Album14");
		 String album15= prop.getProperty("Album15");
		 String album16= prop.getProperty("Album16");
		 String album17= prop.getProperty("Album17");
		 
		
	 // String album="//img[@src='http://54.72.215.193/resource/images/Classical_Gewandhausorchester_BrahmsSerenades_300x300.jpg']";
	 // AD.Launch(album);
	 // String album1="//img[@src='http://54.72.215.193/resource/images/Classical_LSO_MendelssohnSymphonyNo3_300x300.jpg']";
	 // String album2="//img[@src='http://54.72.215.193/resource/images/Classical_NuritStark_SchumannWorksforViolon_300x300.jpg']
	  AD.Launch(album1);
	  AD.Launch(album2);
	  AD.Launch(album3);
	  AD.Launch(album4);
	  AD.Launch(album5);
	  AD.Launch(album6);
	  AD.Launch(album7);
	  AD.Launch(album8);
	  AD.Launch(album9);
	  AD.Launch(album10);
	  AD.Launch(album11);
	  AD.Launch(album12);
	  AD.Launch(album13);
	  AD.Launch(album14);
	  AD.Launch(album15);
	  AD.Launch(album16);
	  AD.Launch(album17);
	  
	  System.out.println("Sucess");
	 }
}
