package Testingframework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Audiofunctionality {
	@Test
	  public void AudioFeatures() throws InterruptedException {
		  
		  WebDriver driver =new FirefoxDriver();
		  driver.get("http://54.72.215.193/#/entertainment/audio");
		  Thread.sleep(2000);
		  System.out.println(" Audio Description "+driver.getTitle());
		  driver.findElement(By.xpath("//html/body/div[1]/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-nav-view/ion-view/ion-content/div/div/ul/li[1]/div[2]/div/media-box[1]/div[1]/img")).click();
		  Thread.sleep(3000);
		  
		  /*   Add to playlist button: Audio */ 
		  System.out.println("  Add to playlist " +driver.getTitle());
		  driver.findElement(By.cssSelector(" .media-detail__actions button")).click();
		  Thread.sleep(1500);
		  System.out.println("   Removing tracks from playlist " +driver.getTitle());
		  //driver.findElement(By.cssSelector(".audio-actions")).click();
		  
		  /*   Remove song by click button: Audio (Heart shaped buuton)*/	
		  
		  	driver.findElement(By.className("added-track")).click();
		  	System.out.println("    Track 1 Removed ");
		  	Thread.sleep(1000);
			
			driver.findElement(By.className("added-track")).click();
			System.out.println("    Track 2 Removed ");
			Thread.sleep(1000);
			
			driver.findElement(By.className("added-track")).click();
			System.out.println("    Track 3 Removed ");
			Thread.sleep(1000);
			
			driver.findElement(By.className("added-track")).click();
			System.out.println("    Track 4 Removed ");
			Thread.sleep(1000);
			
			driver.findElement(By.className("added-track")).click();
			System.out.println("    Track 5 Removed ");
			Thread.sleep(1000);
			
			/*  Add song by click button: Audio */
			System.out.println("   Add song to playlist ");
			Thread.sleep(1000);
			
			driver.findElement(By.className("add-track")).click();
			System.out.println("    Track 1 added ");
			Thread.sleep(1000);
			
			driver.findElement(By.className("add-track")).click();
			System.out.println("    Track 2 added ");
			Thread.sleep(1000);
			
			driver.findElement(By.className("add-track")).click();
			System.out.println("    Track 3 added ");
			Thread.sleep(1000);

			driver.findElement(By.className("add-track")).click();
			System.out.println("    Track 4 added ");
			Thread.sleep(1000);
			
			driver.findElement(By.className("add-track")).click();
			System.out.println("    Track 5 added ");
			Thread.sleep(1000);
		
			/*   Navigate to Playlist and open playlist: Audio */
			System.out.println(" Navigate to Playlist and open playlist: Audio ");
			Thread.sleep(1000);
			driver.findElement(By.className("toggle-music-player")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("playlist")).click();
			Thread.sleep(3000);
			System.out.println(" Playlist opened");
			Thread.sleep(1000);
			
			System.out.println("   Remove songs from Playlist: Audio ");
			/*   Remove songs from Playlist: Audio */
			driver.findElement(By.cssSelector(".audio-remove")).click();
			System.out.println("    Track 1 Removed ");
			Thread.sleep(3000);
			
			driver.findElement(By.cssSelector(".audio-remove")).click();
			System.out.println("    Track 2 Removed ");
			Thread.sleep(3000);
			
			driver.findElement(By.cssSelector(".audio-remove")).click();
			System.out.println("    Track 3 Removed ");
			Thread.sleep(3000);
			
			driver.findElement(By.cssSelector(".audio-remove")).click();
			System.out.println("    Track 4 Removed ");
			Thread.sleep(3000);
			
			
			/*   Close Playlist POP UP from playlist: Audio */
			
			driver.findElement(By.className("popover-backdrop")).click();
			System.out.println("  Playlist PoP Up closed  ");
			Thread.sleep(2000);
		  
			/*   Forward  songs from playlist: Audio */
			System.out.println("  Forward  songs from playlist: Audio ");
			
			driver.findElement(By.xpath("/html/body/div[1]/audio-player-bar/div/div/div[2]/div[2]/button[3]")).click();
			System.out.println("   Next Song : 1 ");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[1]/audio-player-bar/div/div/div[2]/div[2]/button[3]")).click();
			System.out.println("   Next Song : 2 ");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[1]/audio-player-bar/div/div/div[2]/div[2]/button[3]")).click();
			System.out.println("   Next Song : 3 ");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[1]/audio-player-bar/div/div/div[2]/div[2]/button[3]")).click();
			System.out.println("   Next Song : 4 ");
			Thread.sleep(2000);
			
			/*   Play previous songs from playlist: Audio */
			System.out.println("  Play previous songs from playlist: Audio ");
			driver.findElement(By.xpath("/html/body/div[1]/audio-player-bar/div/div/div[2]/div[2]/button[1]")).click();
			System.out.println("   Previous Song : 1 ");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[1]/audio-player-bar/div/div/div[2]/div[2]/button[1]")).click();
			System.out.println("   Previous Song : 2 ");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[1]/audio-player-bar/div/div/div[2]/div[2]/button[1]")).click();
			System.out.println("   Previous Song : 3 ");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[1]/audio-player-bar/div/div/div[2]/div[2]/button[1]")).click();
			System.out.println("   Previous Song : 4 ");
			Thread.sleep(2000);
			
			
			/*   pause and play songs from playlist: Audio */
			System.out.println("  Play previous songs from playlist: Audio ");
			driver.findElement(By.xpath("/html/body/div[1]/audio-player-bar/div/div/div[2]/div[2]/button[2]")).click();
			System.out.println("  Song paused ");
			Thread.sleep(2000);		
			
			driver.findElement(By.xpath("/html/body/div[1]/audio-player-bar/div/div/div[2]/div[2]/button[2]")).click();
			System.out.println("  Song played ");
			Thread.sleep(2000);	
			
			driver.findElement(By.className("toggle-music-player")).click();
			System.out.println(" Hide music player ");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/modal-header/div/div[3]/div")).click();
			
			System.out.println("Sucess");
			
			
		
	  }
}
