package Default;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActualTests extends BrowserLaunch
{
	@Test (priority = 1)
	public void windowMax()
	{
		driver.manage().window().maximize();
	}
	@Test (priority = 2)
	public void radioButton()
	{
		WebElement radio = driver.findElement(By.xpath("//input[@value='radio3']"));
		radio.click();
		
		if(radio.isSelected())
		{
			System.out.println("Pass");
			assertTrue(true);
		}
		else
		{
			System.out.println("Failed");
			assertTrue(false);
		}
		
		
			
			
			
	}
}
