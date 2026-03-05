package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Values {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");

Thread.sleep(1000);

driver.findElement(By.xpath("//a[contains(.,'Books')]")).click();

WebElement sortby = driver.findElement(By.id("products-orderby"));
Select select= new Select(sortby);
select.selectByIndex(3);

WebElement display =driver.findElement(By.id("products-pagesize"));
Select select1= new Select(display);
select1.selectByVisibleText("12");

//Thread.sleep(1000);

driver.quit();
	}

}
