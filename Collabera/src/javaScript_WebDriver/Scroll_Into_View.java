package javaScript_WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Into_View {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https:/www.naukri.com");
		Thread.sleep(2000);
		
		WebElement elementScroll = driver.findElement(By.linkText("View all companies"));
		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(false);", elementScroll);


	}

}
