package testngPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SubscribeTest {
	@Test
	public void votetest() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		Reporter.log("application was launched successfully");
		
		driver.findElement(By.id("newsletter-email")).sendKeys("mobiles@123");
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		Reporter.log("click is completed");
		driver.quit();
		
	}
}
