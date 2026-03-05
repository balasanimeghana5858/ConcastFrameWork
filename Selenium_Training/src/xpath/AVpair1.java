package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AVpair1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/25-virtual-gift-card");
		
		//product image
		driver.findElement(By.xpath("//ul[@class='top-menu' and contains(.,'Books')]")).click();
		
		driver.findElement(By.xpath("//img[@alt='Picture of Science']")).click();
		driver.quit();
	}

}
