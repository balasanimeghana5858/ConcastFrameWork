package xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllDataFromWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//String VALUE = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr[2]/td[1]")).getText();
		//System.out.println(VALUE);
		 List<WebElement> VALUE = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr/td"));
		
		 for(WebElement  a:VALUE) {
			 System.out.println(a.getText());
		 }
		 driver.quit();
	}

}
