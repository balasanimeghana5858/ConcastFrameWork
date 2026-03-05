package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthScenario4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//ul[@class='top-menu']/child::li[contains(.,'Books')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@data-productid='13' and contains(.,'Computing and Internet')]/descendant::input[@value='Add to cart']")).click();
		//div[@data-productid='13' and contains(.,'Computing and Internet') ]/descendant::input[@value='Add to cart']
		driver.quit();
		
	}

}
