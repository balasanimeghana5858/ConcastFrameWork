package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthScenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/25-virtual-gift-card");
		driver.findElement(By.xpath(" //h1[contains(.,' $25 Virtual Gift Card')]/ancestor::div[@class='overview']/descendant::input[@id='add-to-cart-button-2']")).click();
		driver.quit();
		
	}

}
