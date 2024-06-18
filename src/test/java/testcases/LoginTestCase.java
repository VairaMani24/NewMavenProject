package testcases;

import org.testng.annotations.Test;

import commonactions.BaseClass;

public class LoginTestCase extends BaseClass {
	
	@Test
	public void hitUrl() {
		
		browserLaunch("chromee");
		
		login("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

}
