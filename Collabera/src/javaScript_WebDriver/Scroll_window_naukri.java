package javaScript_WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_window_naukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https:/www.naukri.com");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(10,1120);");
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(10,-300);");
	}

}
