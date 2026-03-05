package testngPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTC {
	@DataProvider(name="TestData")
	public Object[][] m1() {
		Object[][] data=new Object[3][2];
		data[0][0]="maggi";
		data[0][1]="anu";
		
		data[1][0]="megha";
		data[1][1]="nani";
		
		data[2][0]="mom";
		data[2][1]="dad";
		
		return data;
	}
	
	@Test(dataProvider = "TestData")
	public void m2(String Name,String With) {
		System.out.println(Name);
		System.out.println(With);
	}

}
