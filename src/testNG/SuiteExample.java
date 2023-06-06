package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

	WebDriver driver;
	Long start;
	Long End;

	@BeforeSuite
	public void lauchBrowse() {
		System.setProperty("Webdriver.drive.chromedriver", "D:\\\\Selenium_training\\\\chromedriver.exe");

		driver = new ChromeDriver();
		start = System.currentTimeMillis();
	}

	@Test
	public void google() {

		driver.get("http://www.google.com");

	}

	@Test
	public void bing() {

		driver.get("http://www.bing.com");

	}

	@Test
	public void yahoo() {
		driver.get("http://www.yahoo.com");

	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		End = System.currentTimeMillis();
		long total = End - start;
		System.out.println(total);
	}
}
