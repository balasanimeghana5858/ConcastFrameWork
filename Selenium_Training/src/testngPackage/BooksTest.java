package testngPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BooksTest {
	@Test
	public void books() {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	Reporter.log("application was launched successfully");
	
	driver.findElement(By.xpath("//a[contains(.,'Books')]")).click();
	
	
	Reporter.log("clicked on books");
	driver.quit();
	}
}
