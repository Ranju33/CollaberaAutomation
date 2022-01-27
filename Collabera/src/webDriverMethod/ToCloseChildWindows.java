package webDriverMethod;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseChildWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		
		String parentWindowId=driver.getWindowHandle();
		Set<String> allWindowIds=driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		
		for(String windowId :allWindowIds)
		{
			driver.switchTo().window(windowId);
			driver.close();
		}
	}

}
