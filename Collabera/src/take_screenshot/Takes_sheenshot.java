package take_screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takes_sheenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com");
		File screenshot=driver.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshot);
		
		File destFile=new File("./Error/shot.png");
		FileUtils.copyFile(screenshot,destFile);

	}

}
