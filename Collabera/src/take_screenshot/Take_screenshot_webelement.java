package take_screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_screenshot_webelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com");
		
		File webScreenshot =driver.findElement(By.xpath("//div[@class='contents-wrapper']")).getScreenshotAs(OutputType.FILE);
			
			System.out.println(webScreenshot);
			File webscr=new File("./Error/webs.png");
			webScreenshot.renameTo(webscr);
			System.out.println(webScreenshot);
	}

}
