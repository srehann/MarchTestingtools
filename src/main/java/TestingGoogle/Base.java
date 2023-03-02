package TestingGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Base {
	public static WebDriver driver;
	@BeforeTest
	public void bTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}
	@AfterTest
	public void aTest() {
		driver.quit();
	}

}
