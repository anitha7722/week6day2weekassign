package week6.day2.asignpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import week6day2TestNGpage.TestNgHooks;

public class Home1 extends TestNgHooks {
	public Incident enterincident() {
		dirver.findElement(By.id("filter")).sendKeys("Incident" + Keys.ENTER);
		return new Incident();
}
}
