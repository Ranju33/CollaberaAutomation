package assignment1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowsIds = driver.getWindowHandles();
		 allWindowsIds.remove(parentWindowId);
		 
		 for(String windowId :  allWindowsIds) {
			 driver.switchTo().window(windowId);
			driver.close();
		
		 }
		 }

}
