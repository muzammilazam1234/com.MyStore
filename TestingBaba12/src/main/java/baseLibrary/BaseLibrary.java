package baseLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLibrary 
{
	static WebElement driver = null;
public void launchUrl()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://testingbaba.com/old/");
}
	
}
