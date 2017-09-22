package FirstTestNGExample;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups= {"group1"})
	public void firstGroup() {
		System.out.println("first group");
	}
	@Test(groups= {"group2"})
	public void secondGroup() {
		System.out.println("second group");
	}
}
