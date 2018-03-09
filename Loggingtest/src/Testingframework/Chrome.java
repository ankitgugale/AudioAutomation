package Testingframework;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;
import java.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Chrome {

	  public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver" , "C:\\Program Files (x86)\\Seleniumdriver\\sel\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();              
	        driver.get("http://www.google.com");

	    }

	}