package week6.day2.asignpages;

import org.openqa.selenium.By;

import week6day2TestNGpage.TestNgHooks;


public class Login extends TestNgHooks{
	
	public Login typeuserName() {
		dirver.findElement(By.id("user_name")).clear();
		dirver.findElement(By.id("user_name")).sendKeys("admin");
	return this;
	} 
	public Login typepassword() {
		dirver.findElement(By.id("user_password")).clear();
		 dirver.findElement(By.id("user_password")).sendKeys("India@123");
		return this;
		} 
	
	public Home clicklogin() {
		 dirver.findElement(By.id("sysverb_login")).click();
		return new Home();
	}
}