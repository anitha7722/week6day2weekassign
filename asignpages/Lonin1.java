package week6.day2.asignpages;

import org.openqa.selenium.By;

import week6day2TestNGpage.TestNgHooks;

public class Lonin1 extends TestNgHooks{
	
	public Lonin1 typeuserName() {
		dirver.findElement(By.id("user_name")).clear();
		dirver.findElement(By.id("user_name")).sendKeys("admin");
	return this;
	} 
	public Lonin1 typepassword() {
		dirver.findElement(By.id("user_password")).clear();
		 dirver.findElement(By.id("user_password")).sendKeys("India@123");
		return this;
		} 
	
	public Home1 clicklogin() {
		 dirver.findElement(By.id("sysverb_login")).click();
		return new Home1();

}
}
