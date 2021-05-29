package week6.day2.asignpages;

import org.openqa.selenium.By;
import week6day2TestNGpage.TestNgHooks;

public class Iicident extends TestNgHooks{
	
	public Iicident clickincidents() {
		dirver.findElement(By.xpath("//div[text()='Incidents']")).click();
		return this ;
	
}
	
	public Iicident switchtoframe() {
		dirver.switchTo().frame("gsft_main");
		return this;
}
	public Newincirecord clicknew() {
		dirver.findElement(By.id("sysverb_new")).click();
		return new Newincirecord();
}
}
