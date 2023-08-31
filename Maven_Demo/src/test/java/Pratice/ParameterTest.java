package Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {
	
	public void ParameterTest()
	{
		WebDriver driver;
		String Browser=System.getProperty("browser");
		String URL=System.getProperty("url");
		if(Browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
			}
			else if(Browser.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				
			}
			else if(Browser.equalsIgnoreCase("msedge"))
			{
				WebDriverManager.edgedriver().setup();
				 driver=new EdgeDriver();
			}
			else
			{
				driver=new ChromeDriver();
			}
	 driver.get(URL);
	}

}
