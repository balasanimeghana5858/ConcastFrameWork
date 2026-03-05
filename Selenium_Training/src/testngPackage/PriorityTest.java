package testngPackage;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 1)
public void RegisterTest() {
	System.out.println("registration successfull");
}
	@Test(priority = 2)
public void LoginTest() {
	System.out.println("Login is done");
}
	@Test(priority = 3)
public void SearchTest() {
	System.out.println("Search one product");
}
	@Test(priority = 4)
public void AddToCartTest() {
	System.out.println("added to cart");
}
	@Test(priority = 5)
public void LogOutTest() {
	System.out.println("logged out successfull");
}

}
