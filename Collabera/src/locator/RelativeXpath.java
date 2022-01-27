package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://skillrary.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()='Our Services']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='University & Institutions ']")).click();
		
		


	}

}
