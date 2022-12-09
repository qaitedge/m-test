package pratice.itedge;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class LoginTest {
	WebDriver driver;
	String baseurl;
	Praticepage p1 = new Praticepage();

	@BeforeClass
	public void beforeclass() {
		baseurl = "https://itedge.ca/";
		driver = new FirefoxDriver();

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseurl);
		Thread.sleep(2000);

		Praticepage.practicebutton(driver).click();
		Praticepage.searchbutton(driver).sendKeys("Anees");

	}

	@AfterClass
	public void afterclass() {
		driver.quit();

	}

}
