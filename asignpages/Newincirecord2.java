package week6.day2.asignpages;

import org.openqa.selenium.By;

import week6day2TestNGpage.TestNgHooks;

public class Newincirecord2 extends TestNgHooks{
	

	public Newincirecord2 getincidentvalue() {
		String incr = dirver.findElement(By.id("incident.number")).getAttribute("value");
		return this;
	}
	public Newincirecord2 clickdelete() {
		dirver.findElement(By.id("sysverb_delete")).click();
		return this;
}
	public Newincirecord2 clickokdelete() {
		dirver.findElement(By.id("ok_button")).click();
		return this;
	}
}

	