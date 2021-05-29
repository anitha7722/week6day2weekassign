package week6.day2.assignTests;

import org.testng.annotations.Test;

import week6.day2.asignpages.Login;
import week6.day2.asignpages.Lonin1;
import week6day2TestNGpage.TestNgHooks;

 
	public class Deleteinci  extends TestNgHooks {
		@Test
		public void  login() {
			  
			   new Lonin1().typeuserName()
			               .typepassword()
			               .clicklogin()
			               .enterincident()
			               .clickincidents()
			               .switchtoframe()
			               .clickFirstincident()
			               .getincidentvalue()
			               .clickdelete()
			               .clickokdelete();
			              
			               
			               
			               
		}			               
			               
			               
			               
}
