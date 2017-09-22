package FirstTestNGExample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I m the before method test");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("I m the before all method test");
	}
	@Test
	public void firstTest() {
		System.out.println("I m in the first testing test");
	}
	@Test
	public void secondTest() {
		System.out.println("I m in the second testing test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I m in the after testing test");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("I m in the after method testing test");
	}
}
