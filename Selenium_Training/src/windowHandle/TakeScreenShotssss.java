package windowHandle;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotssss{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

driver.get("https://demowebshop.tricentis.com/");
WebElement textField = driver.findElement(By.id("small-searchterms"));
TakesScreenshot ts = (TakesScreenshot) driver;
File src=textField.getScreenshotAs(OutputType.FILE);
File dest= new File("./ScreenShot/searchField2.png");
org.openqa.selenium.io.FileHandler.copy(src, dest);

driver.quit();

	}

}
