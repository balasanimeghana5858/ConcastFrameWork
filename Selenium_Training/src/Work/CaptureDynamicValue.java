package Work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureDynamicValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		String text = driver.findElement(By.xpath("//div[contains(.,'Apple iPhone 16 (Black, 128 GB)') and @class='ZFwe0M row']/descendant::div[@class='hZ3P6w DeU9vF']"))
.getText();
		System.out.println(text);
		driver.quit();
	}
	
}
