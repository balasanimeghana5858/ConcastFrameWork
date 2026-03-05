package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DemoWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);

String parentWindow = driver.getWindowHandle();

driver.findElement(By.linkText("Facebook")).click();

Set<String> childWindow = driver.getWindowHandles();

for(String window:childWindow) {
driver.switchTo().window(window);
	if(driver.getTitle().contains("Facebook")) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("meghana");
		driver.close();
		
	}
}
driver.switchTo().window(parentWindow);
Thread.sleep(2000);

driver.findElement(By.name("q")).sendKeys("mobiles");
Thread.sleep(3000);
driver.quit();
	}

}
