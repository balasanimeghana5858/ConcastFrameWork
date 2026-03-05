package testngPackage;

import org.testng.annotations.Test;

public class Groups {
@Test(groups = "smokeTest")
public void DWS() {
	System.out.println("hello");
}
@Test
public void Az() {
	System.out.println("hi");
}
@Test(groups = "smokeTest")
public void flip() {
	System.out.println("bye");
}
}
