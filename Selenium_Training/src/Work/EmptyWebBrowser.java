package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class EmptyWebBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.youtube.com/");

driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
driver.findElement(By.cssSelector("[title='Search']")).click();
//Thread.sleep(100);
driver.findElement(RelativeLocator.with(By.tagName("yt-formatted-string")).below(By.xpath("//yt-formatted-string[.='Shorts']"))).click();
//driver.findElement(By.xpath("//yt-formatted-string[.='Shorts']")).click();
////yt-formatted-string[.='Shorts']
	}

}
