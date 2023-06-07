package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	String name = "Mathi";

	@Test
	public void nameEquals() {
//		if (name.equals("Mathi")) {
//			System.out.println("It is a valid");
//		} else {
//			System.out.println("It is not valid");
//		}

		Assert.assertEquals(name, "Mathi");
	}
}
