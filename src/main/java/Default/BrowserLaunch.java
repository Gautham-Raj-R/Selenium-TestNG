package Default;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class BrowserLaunch 
{
	public static WebDriver driver;
	
	@BeforeTest
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\attip\\OneDrive\\Desktop\\driver\\chromedriver.exe" );
		
		
		driver = new ChromeDriver();
		
		
	}
}
