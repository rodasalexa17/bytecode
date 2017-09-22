package FirstTestNGExample;

//import java.util.Arrays;
//import java.util.Collection;

import org.testng.annotations.Test;

public class paramstest {
	@Test(dataProvider="getData")
	public void UserId(String username,String subject) {
		System.out.println("username"+username+"subject"+subject);
	}
	public static Object[][]getData(){
		Object obj[][] = {
				{"Bairon","Computer Science"},
				{"Mark","Math"},
				
		};
		return obj;
	}

}
