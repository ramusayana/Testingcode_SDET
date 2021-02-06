package devlabs.testng.lab1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC002 {
	
	@Test
	public void tc002(){
			
			 // open chrome browser
			 System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
			 
			 ChromeDriver driver = new ChromeDriver();
			 
			 driver.get("https://www.mailinator.com/");
			 
			 driver.manage().window().maximize();
			 
			  String title=driver.getTitle();
			 System.out.println(title);
		 }
		 

}
