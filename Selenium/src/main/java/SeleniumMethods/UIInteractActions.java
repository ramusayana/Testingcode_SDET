package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UIInteractActions {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dotclicklabs.blogspot.com/p/drag-and-drop-elements.html");
		
		Actions actions = new Actions(driver);
		
//		actions.doubleClick().contextClick().build();
//		actions.doubleClick().contextClick().build().perform();
		
//		driver.navigate().to("https://dotclicklabs.blogspot.com/p/drag-and-drop-elements.html");
		
		WebElement source = driver.findElement(By.id("item-5"));
		WebElement target = driver.findElement(By.id("item-2"));
		
		actions.dragAndDrop(source, target).build().perform();
		System.out.println("drag and drop done");
		driver.quit();
	}

}
