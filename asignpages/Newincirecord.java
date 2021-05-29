package week6.day2.asignpages;

import org.openqa.selenium.By;

import week6day2TestNGpage.TestNgHooks;

public class Newincirecord extends TestNgHooks{
	public Newincirecord getincidentvalue() {
		String intc = dirver.findElement(By.id("incident.number")).getAttribute("value");
		return this;
	}

	public Newincirecord fillshortdescription() {
		dirver.findElement(By.id("incident.short_description")).sendKeys("create incident");
		return this;
	}
	public Newincirecord clicksubmitte() {
		dirver.findElement(By.id("sysverb_insert")).click();
		return this;
	}
}
	 
