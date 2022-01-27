package flipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.amazon.com");
		
//		driver.findElement(By.id("twotabsearchtextbox")).click();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung galaxy A30s",Keys.ENTER);
//		
//		
//		
//		driver.findElement(By.name("a-size-medium a-color-base a-text-normal")).click();
	
	}

}
