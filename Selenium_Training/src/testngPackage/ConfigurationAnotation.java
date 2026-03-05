package testngPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnotation {
@BeforeSuite
public void Suite() {
	System.out.println("executing suite");
}
@BeforeTest
public void test() {
	System.out.println("executing test");
}
@BeforeClass
public void BeClass() {
	System.out.println("executing class");
}
@BeforeMethod
public void method() {
	System.out.println("executing Method");
}
@Test
public void maintest() {
	System.out.println("executing main_Test");
}
@AfterMethod
public void AfMethod() {
	System.out.println("executing Af_method");
}
@AfterClass
public void AfClass() {
	System.out.println("executing Af_class");
}
@AfterTest
public void afTest() {
	System.out.println("executing af_test");
}
@AfterSuite
public void AfSuite() {
	System.out.println("executing afsuite");
}
}
