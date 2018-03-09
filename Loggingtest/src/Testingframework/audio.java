package Testingframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import bsh.org.objectweb.asm.Label;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
 import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class audio {

	

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new FirefoxDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("http://54.72.215.193/#/entertainment/audio");
		 Thread.sleep(1500);
		List<WebElement> links=driver.findElements(By.cssSelector(".media-box__poster"));
		List<WebElement> Albumname = driver.findElements(By.cssSelector(".media-box__title"));
		/*
		for(int z=0;z<links.size();z++)
		{
			System.out.println("List of albums on the page"+Albumname.get(z).getText());
		}*/
		
		FileInputStream fis = new FileInputStream("D:\\DCMS\\Abc.xlsx");
	    FileOutputStream fos = null;
	    XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    XSSFSheet sheet = workbook.getSheetAt(0);
	    XSSFRow row = null;
	    XSSFCell cell = null;
	    XSSFCell cell1 = null;
	    XSSFRow row1 = null;
	    
	    XSSFFont font = workbook.createFont();
	    XSSFCellStyle style = workbook.createCellStyle();
		row = sheet.getRow(1);
        if(row == null)
            row = sheet.createRow(1);
 
        cell = row.getCell(4);
        if(cell == null)
            cell = row.createCell(4);
 
        row1 = sheet.getRow(2);
        if(row1 == null)
            row1 = sheet.createRow(2);
 
        cell1 = row.getCell(2);
        if(cell1 == null)
            cell1 = row.createCell(2);
        
        
        
        
        
        
        
        
        
        font.setFontName("Comic Sans MS");
        font.setFontHeight(14.0);
        font.setBold(true);
        font.setColor(HSSFColor.WHITE.index);
 
        style.setFont(font);
        style.setFillForegroundColor(HSSFColor.GREEN.index);
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
 
        cell.setCellStyle(style);
      //  cell.setCellValue("PASS");
 
        fos = new FileOutputStream("D:\\DCMS\\Abc.xlsx");
        workbook.write(fos);
        System.out.println("Sucess");
       // fos.close();
		
		//System.out.println("Album name "+Albumname.get(0).getText());
		System.out.println("Total links are "+links.size());
		for(int z=1;z<links.size();z++)
			
			
			{
			WebElement ele = links.get(z);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);

			System.out.println("List of albums on the page"+Albumname.get(z).getText());
			Thread.sleep(1500);
			}
		System.out.println("Album name"+Albumname);
		
	
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	 		  
			  ele.click();
			String url=ele.getAttribute("href");
			
			
			int counter =0;
			  System.out.println("  sucess "+driver.getTitle()); 
			  List<WebElement> playNow1=driver.findElements(By.cssSelector(".track-status"));
			  List<WebElement> titlesOfSongs = driver.findElements(By.cssSelector(".track-title>span"));
			  List<WebElement> tracknumber = driver.findElements(By.cssSelector(".track-number"));
			// List<WebElement> Albumname = driver.findElements(By.cssSelector(".media-detail__metadata__title"));
			  
			  List<WebElement> Artistname = driver.findElements(By.cssSelector(".media-detail__metadata__subtitle"));
			  //System.out.println("Songs    "+titlesOfSongs);
			  String url1=ele.getAttribute("href");
				
				verifyLinkActive(url1);
				 // zoomIn();
				 // set100();
				  System.out.println("Counter is "+counter);
				  Thread.sleep(1500);
				  System.out.println("Album name "+Albumname.get(0).getText());
				  System.out.println("Artist name "+Artistname.get(0).getText());
				//  System.out.println(+cell1.setCellValue("")+Artistname.get(0).getText());
				  
				  for(int j=0;j<playNow1.size();j++)
				     {
					
					  Thread.sleep(1500);
				      playNow1.get(j).click();
					/*  WebElement element=(WebElement) driver.findElements(By.cssSelector(".track-title>span"));
					  
					  String val=playNow1.get(j).getAttribute("innerText");*/
							 
							 
							  System.out.println(""+tracknumber.get(j).getText()+" "+  titlesOfSongs.get(j).getText());
							 // System.out.println("Song    "+titlesOfSongs.get(j));
					 
					  
				 verifyLinkActive("http://54.72.215.193/audios_brahmsserenades_5_a6a2985dc6d7f71988f87085c87289466e0b106f.mp3");
				      Thread.sleep(1500);
				      counter++;
				     }
				  
				  System.out.println("Number of songs in an album are  "+counter);
					 // System.out.println("Album number"+playNow1);
						driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/modal-header/div/div[3]/div")).click();
						
						 Thread.sleep(1500);
						System.out.println("Print i"+i);
						//zoomOut();
			 }
			
			
		}
		
	
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           URL url1 = new URL(linkUrl);
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
    } 
	
	
	 
	 public  void writedata(String args[]) throws IOException 
	    {
	        
	        /*row = sheet.getRow(1);
	        if(row == null)
	            row = sheet.createRow(1);
	 
	        cell = row.getCell(4);
	        if(cell == null)
	            cell = row.createCell(4);
	 
	        font.setFontName("Comic Sans MS");
	        font.setFontHeight(14.0);
	        font.setBold(true);
	        font.setColor(HSSFColor.WHITE.index);
	 
	        style.setFont(font);
	        style.setFillForegroundColor(HSSFColor.GREEN.index);
	        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	 
	        cell.setCellStyle(style);
	        cell.setCellValue("PASS");
	 
	        fos = new FileOutputStream("D:\\DCMS\\Abc.xlsx");
	        workbook.write(fos);
	        System.out.println("Sucess");
	        fos.close();*/
	    }

}

