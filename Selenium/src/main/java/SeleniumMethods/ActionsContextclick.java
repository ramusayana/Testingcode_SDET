package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsContextclick {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dotclicklabs.blogspot.com/p/drag-and-drop-elements.html");
		
		Actions hold = new Actions(driver);
//		hold.contextClick(driver.findElement(By.id("draggable4"))).build().perform();
		hold.doubleClick(driver.findElement(By.id("draggable4"))).build().perform();
//		System.out.println("context click done");
		System.out.println("double click done");
		driver.quit();
	}

}
