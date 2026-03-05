package testngPackage;

import org.testng.annotations.Test;

public class DataProvider2 {
@Test(dataProvider = "TestData",dataProviderClass = DataProviderTC.class)
public void m3(String name,String with) {
	System.out.println(name);
	System.out.println(with);
	System.out.println("hi");
}
}
