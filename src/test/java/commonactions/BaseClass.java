package commonactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	
	public static void browserLaunch(String browser) {
		
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			   driver=new ChromeDriver();
			   
		}
		
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
	}
	
	public static void login(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
	}

}
