package webDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Oopsa_Concept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.swiggy.com");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Screen=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(Screen);
		File dest=new File("./Error/newmethod.png");
		FileUtils.copyFile(Screen,dest);
		
		

	}

}
