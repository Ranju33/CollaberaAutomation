package assignment1;

import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program6 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com");
			
			TreeSet<String> titles=new TreeSet<String>();
			
			Set<String> allWindowIds = driver.getWindowHandles();
			
		    for(String windowId: allWindowIds) {
		    driver.switchTo().window(windowId);
		    
		    titles.add(driver.getTitle());
			
		    }
		    for(String title:titles)
		    {
		    	System.out.println(title);
		    }
		    	
	}

}
