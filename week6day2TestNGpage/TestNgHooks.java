package week6day2TestNGpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgHooks {
	
	public static ChromeDriver dirver;
	@BeforeMethod
	public void init() {
    WebDriverManager.chromedriver().setup();
	dirver = new ChromeDriver();
	dirver.get("https://dev103117.service-now.com");
	dirver.manage().window().maximize();
	dirver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	@AfterMethod
	public void close() {
		dirver.close();
	}
	
}