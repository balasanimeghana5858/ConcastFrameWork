package xpath;

import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Svg1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		
		
		Thread.sleep(1500);
		//handled the popup
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		//search icon, svg tag
		WebElement search = driver.findElement(By.xpath("//button[@class='XFwMiH'and @type='submit']/child::*[name()='svg' and .='Search Icon']"));
				
				
		File scr = search.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/searchIconImage.png");
	FileHandler.copy(scr, dest);
	
		//location icon
		WebElement icon = driver.findElement(By.xpath("//div[.='Location not set']/child::*[name()='svg' and @fill='none']"));
		
		File scr1 = icon.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./ScreenShot/iconImage.png");
	FileHandler.copy(scr1, dest1);
	
		driver.quit();
		
	}

}
