package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

	public static void main(String[] args) {
		
		 // open chrome browser
		 System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://login.salesforce.com/?locale=uk");
		 
		 driver.findElement(By.cssSelector("input.username")).sendKeys("Ramsayana");
		 
		 driver.findElement(By.cssSelector("input.password")).sendKeys("tanush");
		 
		 driver.findElement(By.linkText("Forgot Your Password?")).click();
		 
		  String title=driver.getTitle();
		 System.out.println(title);

	}

}
