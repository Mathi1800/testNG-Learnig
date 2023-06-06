package testNG;

import org.testng.annotations.Test;

public class GroupExample {
	@Test(groups = { "apple" })
	public void apple1() {
		System.out.println("Apple Testing");
	}

	@Test(groups = { "apple" })

	public void apple2() {
		System.out.println("Apple Testing");

	}

	@Test(groups = { "moto" })

	public void moto1() {
		System.out.println("Moto testing");
	}

	@Test(groups = { "moto" })

	public void moto2() {
		System.out.println("Moto testing");
	}

	@Test(groups = { "vivo" })

	public void vivo1() {
		System.out.println("Vivo testing");
	}

	@Test(groups = { "vivo" })

	public void vivo2() {
		System.out.println("Vivo testing");
	}

	@Test(groups = { "lenovo" })

	public void Lenovo1() {
		System.out.println("Lenovo testing");
	}

	@Test(groups = { "lenovo" })

	public void Lenovo2() {
		System.out.println("Lenovo testing");
	}
}
