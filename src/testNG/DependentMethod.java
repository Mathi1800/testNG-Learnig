package testNG;

import org.testng.annotations.Test;

public class DependentMethod {
	@Test(enabled = false)
	public void highSchool() {
		System.out.println("HighSchool");
	}

	@Test(dependsOnMethods = "highSchool")

	public void higherSec() {
		System.out.println("Higher Sec School");
	}

	@Test(dependsOnMethods = "higherSec")

	public void engineering() {
		System.out.println("College");

	}

}
