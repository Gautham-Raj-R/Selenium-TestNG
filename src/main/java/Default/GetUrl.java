package Default;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetUrl extends BrowserLaunch

{
	@Test 
	public void url()
	{

		
//		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
//		String gotTitl = driver.getTitle();
		
//		SoftAssert so = new SoftAssert();

//		System.out.println(gotTitl);
		
//		so.assertEquals("Practice Page", gotTitl);
	}
}
