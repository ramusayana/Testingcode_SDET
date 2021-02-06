package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dotclicklabs.blogspot.com/");
		
		driver.findElement(By.linkText("HOME")).click();
		
		Actions button = new Actions(driver);
		button.moveToElement(driver.findElement(By.xpath("//input[@value='Submit']"))).click().build().perform();
		
		
	}

}
