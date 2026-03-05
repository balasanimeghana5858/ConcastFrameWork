package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_On_Demo_WOrkShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");

Thread.sleep(1000);

driver.findElement(By.linkText("Register")).click();
driver.findElement(By.id("gender-female")).click();
driver.findElement(By.name("FirstName")).sendKeys("maggi");
driver.findElement(By.xpath("(//input[contains(@class,'text-box')])[2]")).sendKeys("balasani");
driver.findElement(By.id("Email")).sendKeys("test123@gmail.com");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123");
driver.findElement(By.id("register-button")).click();

	}

}
