package take_screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.zomato.com");
			File screenshot=driver.getScreenshotAs(OutputType.FILE);
			System.out.println(screenshot);
			
			File destFile=new File("./Error/screenshot1.png");
			screenshot.renameTo(destFile);
	}

}
