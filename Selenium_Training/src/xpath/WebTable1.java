package xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//String VALUE = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr[2]/td[1]")).getText();
		//System.out.println(VALUE);
		WebElement VALUE = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr[1]/td[3]"));
		
		WebElement a = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr[last()]/td[last()]"));
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr[1]/td"));
		System.out.println(VALUE.getText());
		System.out.println(a.getText());
		
		for(WebElement web: row) {
			System.out.print("whole row values"+   web.getText()+",");
		}
		
		driver.quit();
		
	}

}
