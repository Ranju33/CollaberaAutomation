package flipcart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) {
		//step1:open the browser,enter the url
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https:/demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).click();
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton") ).click();		

	}

}
