package JenkinPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinTest 
{
	@Test
	public void jenkinTestMethod()
	{
	WebDriver driver = new FirefoxDriver();
	System.out.println("Browser Launched");
	driver.close();
	}
}
