package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertsacceptcookie {

	public static void main(String[] args) {
		

	   System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dotclicklabs.blogspot.com/");
		
		 Alert promptalert = driver.switchTo().alert();
		 
		 promptalert.accept();
		 
		 
	}
}
