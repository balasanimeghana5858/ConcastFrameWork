package testngPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	int sum;
	@Parameters({"numb1","numb2"})
	@Test
public void M1(int numb1,int numb2) {
		sum=numb1+numb2;
		System.out.println(sum);
		
	
}
}
