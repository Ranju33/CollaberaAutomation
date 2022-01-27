package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_clear_click_sendkeys {
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http:/www.skillrary.com/user/login");
		Thread.sleep(2000);
		driver.findElement(By.linkText("X")).click();
		WebElement usernameTextField= driver.findElement(By.id("email"));
		usernameTextField.clear();
		
		usernameTextField.sendKeys("ran","ju","go","wda",Keys.CONTROL+"a");
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.CONTROL+"c");
		
		WebElement passwordTextField=driver.findElement(By.name("password"));
		passwordTextField.clear();
		Thread.sleep(2000);
		passwordTextField.sendKeys(Keys.CONTROL+"v");
	
		
	}

}
