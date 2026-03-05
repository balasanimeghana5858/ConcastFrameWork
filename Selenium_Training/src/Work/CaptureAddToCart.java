package Work;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CaptureAddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.easemytrip.com/flights.html?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gad_campaignid=788997081&gbraid=0AAAAADo_0-j1lyfjNjDp1aIgIMLYkjcC0&gclid=Cj0KCQiA5I_NBhDVARIsAOrqIsY84tE_Jb0pq_lprawy7oYdrmQ-nfVSFil6oHQvabmD5LNnvlhPdsoaAnVlEALw_wcB");
	
	
	}
}
