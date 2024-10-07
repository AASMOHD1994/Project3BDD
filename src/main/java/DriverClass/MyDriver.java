package DriverClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {

	private static MyDriver driver;
	
	private ThreadLocal<WebDriver> tl = new ThreadLocal<WebDriver>();

	private MyDriver() {

	}

	public static MyDriver getInstance() {

		if (driver == null) {
			driver = new MyDriver();
		}
		return driver;
	}
	
	public void setDriver()
	{
		tl.set(new ChromeDriver());
	}
	
	public WebDriver getDriver()
	{
		return tl.get();
	}

}
