package using_Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_Drop_drag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver,10);
		
		
		
		driver.get("https:/www.trello.com/login");
		
		driver.findElement(By.id("user")).sendKeys("ranjupsgowda77@gmail.com");
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("7348890833");
		driver.findElement(By.id("login-submit")).click();
		
		driver.findElement(By.xpath("//div[text()='Ranjitha']")).click();
		
		Actions actions=new Actions(driver);
		WebElement srcElement=driver.findElement(By.xpath("//span[text()='WBT']"));
		WebElement destElement=driver.findElement("")
		
		

	}

}
