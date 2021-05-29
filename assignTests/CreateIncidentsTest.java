package week6.day2.assignTests;

import org.testng.annotations.Test;

import week6.day2.asignpages.Login;
import week6day2TestNGpage.TestNgHooks;
public class CreateIncidentsTest extends TestNgHooks {
@Test
public void  login() {
	  
	   new Login().typeuserName()
	               .typepassword()
	               .clicklogin()
	               .enterincident()
	               .clickincidents()
	               .switchtoframe()
	               .clicknew()
	               .getincidentvalue()
	               .fillshortdescription()
	               .clicksubmitte();
	               
	               
}
}