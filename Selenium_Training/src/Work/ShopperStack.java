package Work;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ShopperStack {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.shoppersstack.com/user-signin");
//driver.findElement(By.xpath("//button[.='Login']")).click();
//driver.findElement(By.xpath("//span[.='Create Account']")).click();
driver.findElement(By.id("First Name")).sendKeys("meghana");
driver.findElement(By.id("Last Name")).sendKeys("balasani");
driver.findElement(By.id("Female")).click();
driver.findElement(By.id("Phone Number")).sendKeys("9860154302");
driver.findElement(By.id("Email Address")).sendKeys("magggi1234000@gmail.com");
driver.findElement(By.id("Password")).sendKeys("M@gggggi0023");
driver.findElement(By.id("Confirm Password")).sendKeys("M@gggggi0023");
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
driver.findElement(By.id("btnDisabled")).click();

driver.findElement(By.className("Toastify")).click();

driver.findElement(By.id("loginBtn")).click();
driver.findElement(By.name("Email")).sendKeys("magggi1234000@gmail.com");
driver.findElement(By.name("Password")).sendKeys("M@ggggi123");
driver.findElement(By.xpath("//span[.='Login']")).click();


Thread.sleep(10);

driver.findElement(By.xpath("//span[.='3.1']")).click();
String text = driver.findElement(By.xpath("//h2[.='boat']/../../div/p")).getText();
String text1 = driver.findElement(By.xpath("(//h2[.='boat']/../../div)[5]")).getText();

driver.findElement(By.xpath("//span[.='add to cart']")).click();
TakesScreenshot ts= (TakesScreenshot) driver;
 File src=ts.getScreenshotAs(OutputType.FILE);
 File dest=new File("./ScreenShot/product.png");
FileHandler.copy(src, dest);

////h2[.='boat']/../../div/p




	}

}
