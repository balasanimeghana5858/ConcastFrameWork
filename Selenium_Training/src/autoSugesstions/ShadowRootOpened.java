package autoSugesstions;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootOpened {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");

Thread.sleep(1000);

driver.findElement(By.xpath("//section[contains(text(),'Shadow')]")).click();
driver.findElement(By.xpath("//a[(.='Shadow Root')]")).click();
Thread.sleep(2000);
SearchContext host1 = driver.findElement(By.xpath("(//form/div)[1]")).getShadowRoot();
host1.findElement(By.cssSelector("input[type='text']")).sendKeys("maggi");

Thread.sleep(1000);

SearchContext host2 = driver.findElement(By.xpath("(//form/div)[2]")).getShadowRoot();
host2.findElement(By.cssSelector("input[type='text']")).sendKeys("maggi");



	}

}
