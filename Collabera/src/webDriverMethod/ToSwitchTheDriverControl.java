package webDriverMethod;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverControl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		
		Set<String> allWindowIds=driver.getWindowHandles();
		String expectedWindowTitle="Tech Mahindra";
		
		for(String windowId :allWindowIds)
		{
			driver.switchTo().window(windowId);
			String actualWindowTitle=driver.getTitle();
			if(expectedWindowTitle.equals(actualWindowTitle))
			{
				driver.manage().window().maximize();
				break;
			}
		}

	}

}
