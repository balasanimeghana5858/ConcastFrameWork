package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AVpair2 {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");

	//ul[@class='top-menu' and contains(.,'Jewelry')]
	driver.findElement(By.xpath("//ul[@class='top-menu']/child::li[contains(.,'Jewelry')]")).click();
	driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("MAggi12@gmail.com");
	driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
	
	driver.quit();
	
	
}
}