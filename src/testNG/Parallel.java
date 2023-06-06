package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	@Test
	public void openChrome() {

		System.setProperty("Webdriver.drive.chromedriver", "D:\\\\Selenium_training\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
	}

	@Test
	public void openBing() {
		System.setProperty("Webdriver.drive.chromedriver", "D:\\\\Selenium_training\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com");
	}

}

//XML File

/*
 * <?xml version="1.0" encoding="UTF-8"?> <!DOCTYPE suite SYSTEM
 * "https://testng.org/testng-1.0.dtd"> <suite name="Suite" verbose="2"
 * parallel="methods" thread-count="2"> <test thread-count="5" name="Test">
 * 
 * <classes> <class name="testNG.Parallel"/> </classes> </test> </suite>
 */
