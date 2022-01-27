package synchrinization;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Waiting_explicitly {

	private static FluentWait explicitWait;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FluentWait fwait=new FluentWait(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(100,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		driver.get("https://www.instagram.com");
		fwait.until(ExpectedConditions.titleIs(""));
		explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("Ranju");
		
	}

}
