package testngPackage;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
public void RegisterTest() {
	System.out.println("registration successfull");
}
	@Test(dependsOnMethods = "RegisterTest")
public void LoginTest() {
	System.out.println("Login is done");
}
	@Test(dependsOnMethods = "LoginTest")
public void SearchTest() {
	System.out.println("Search one product");
}
	@Test(dependsOnMethods = "SearchTest")
public void AddToCartTest() {
	System.out.println("added to cart");
}
	@Test(dependsOnMethods = "AddToCartTest")
public void LogOutTest() {
	System.out.println("logged out successfull");
}
}
