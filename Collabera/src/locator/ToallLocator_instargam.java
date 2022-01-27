package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToallLocator_instargam {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://instargam.com");

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("Ranju");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("12345675rd#21");
		driver.findElement(By.cssSelector("button[class='sqdOP  L3NKy   y3zKF     ']")).click();
	}

}
