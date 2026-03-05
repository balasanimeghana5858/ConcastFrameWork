package testngPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
	@Parameters({"URL","search"})
	@Test
	public void votetest(String url,String search) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
		//Reporter.log("application was launched successfully");
		
		driver.findElement(By.id("small-searchterms")).sendKeys(search);
		driver.findElement(By.xpath("//input[@type='submit']"));
		
		Reporter.log("click is completed");
		driver.quit();
	}
}
