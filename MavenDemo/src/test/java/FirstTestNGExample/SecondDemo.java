package FirstTestNGExample;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class SecondDemo {
	@Test(dependsOnMethods={"secondTest"}, alwaysRun=true)
	public void firstTest() {
		System.out.println("first test");
	}
	@Test(timeOut=2000)
	public void secondTest() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		System.out.println( "second  test");
		
	}
	@Test(enabled=false)
	public void thirdTest() {
		System.out.println( "third  test");
	}
}
