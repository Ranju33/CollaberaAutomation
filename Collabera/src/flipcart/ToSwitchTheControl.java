package flipcart;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheControl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement a = driver.findElement(By.name("q"));
		a.clear();
		a.sendKeys("redmi",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='REDMI 9i Sport (Metallic Blue, 64 GB)']")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String ranju:allWindowIds) {
			driver.switchTo().window(ranju);
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
	}

}
