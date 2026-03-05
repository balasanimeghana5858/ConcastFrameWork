package testngPackage;

import org.testng.annotations.Test;

public class Include {
@Test
public void Register() {
	System.out.println("do registration");
}
@Test
public void Login() {
	System.out.println("do login");
}
@Test
public void Search() {
	System.out.println("do search");
}
}
