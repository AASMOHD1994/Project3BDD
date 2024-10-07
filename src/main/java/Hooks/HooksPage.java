package Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import DriverClass.MyDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksPage {
	
	MyDriver driver;
	WebDriver ldriver;
	int count=0;
	
	@Before
	public void setup()
	{
		driver=MyDriver.getInstance();
		driver.setDriver();
		ldriver=driver.getDriver();
		ldriver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		ldriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ldriver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown()
	{
		
	
	//	driver.getDriver().quit();
		
		
		
	}

}
