package week6.day2.asignpages;

import org.openqa.selenium.By;

import week6day2TestNGpage.TestNgHooks;

public class Incident extends TestNgHooks{
	
	public Incident clickincidents() {
		dirver.findElement(By.xpath("//div[text()='Incidents']")).click();
		return this ;
	
}
	
	public Incident switchtoframe() {
		dirver.switchTo().frame("gsft_main");
		return this;
}
	public Newincirecord2 clickFirstincident() {
		dirver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	return new Newincirecord2();
	
}
	
}
