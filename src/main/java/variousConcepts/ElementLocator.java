package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocator {
	WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// if Element Node is INPUT use .sendkeys OR use .ROBOT class
	@Test
	public void elementTest() {
		driver.findElement(By.name("firstname")).sendKeys("selenium");// By.ID can also be used.
		driver.findElement(By.className("input-file"))
				.sendKeys("C:\\Users\\NISHA\\Desktop\\Techfios october2021\\Java Eclipse");
		driver.findElement(By.linkText("Zip File")).click();
		driver.findElement(By.partialLinkText("TF-API")).click();

	}

	@Test // css selector
	public void cssLocators() {
		driver.findElement(By.cssSelector("input#exp-0")).click();// Instead of ID # is used.
		driver.findElement(By.cssSelector("input[value='1']")).click();
		driver.findElement(By.cssSelector("input[name='sex'][value='Female']")).click();

		// Xpath -Relative//Xpath -Absolute always starts from ' /' root tag<html>
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//a[text()='API Documentations']")).click();
		//driver.findElement(By.xpath("//strong[contains(text(),'Link Test : Page Change')]")).click();

	}

}
