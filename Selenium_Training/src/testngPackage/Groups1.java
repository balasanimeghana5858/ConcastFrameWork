package testngPackage;

import org.testng.annotations.Test;

public class Groups1 {
	@Test(groups = "smokeTest")
	public void DWS() {
		System.out.println("come");
	}
	@Test
	public void Az() {
		System.out.println("lets go");
	}
	@Test(groups = "smokeTest")
	public void flip() {
		System.out.println("go");
	}
}
