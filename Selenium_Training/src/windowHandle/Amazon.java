package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.amazon.in/");
String parentId = driver.getWindowHandle();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
driver.findElement(By.id("nav-search-submit-button")).click();
driver.findElement(By.xpath("(//span[contains(.,'iPhone 15')])[3]")).click();
Set<String> child = driver.getWindowHandles();
for(String a:child) {
	//driver.switchTo().window(a);
	System.out.println(driver.getTitle());
	if(driver.getTitle().contains("Apple")) {
		driver.manage().window().minimize();
		driver.close();
	}
	driver.quit();
}


	}

}
