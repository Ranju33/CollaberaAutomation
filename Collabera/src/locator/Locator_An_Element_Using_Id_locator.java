package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_An_Element_Using_Id_locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField=driver.findElement(By.name("username"));
		usernameTextField.sendKeys("ranju");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Abc123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();

		
	}

}
