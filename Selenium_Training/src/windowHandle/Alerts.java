package windowHandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/cart");
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(1000);
Alert alert = driver.switchTo().alert();
alert.accept();
Thread.sleep(1000);
driver.findElement(By.name("q")).sendKeys("mobiles");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.quit();
	}

}
