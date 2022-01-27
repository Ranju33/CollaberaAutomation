package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_tag_name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zomato.com");
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
		

	}

}
