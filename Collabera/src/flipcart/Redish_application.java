package flipcart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redish_application {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https:/www.rediff.com");
		
		driver.findElement(By.linkText("Sign in")).click();
		WebElement userName = driver.findElement(By.id("login1"));
		userName.clear();
		userName.sendKeys("sumanthElfBatch@rediffmail.com");
		
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Testing@123");
		
		driver.findElement(By.name("proceed")).click();
		
		
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		
		WebElement email = driver.findElement(By.xpath("//input[@id=\"TO_IDcmp2\"]"));
		email.clear();
		email.sendKeys("sumanthElfBatch@rediffmail.com");
		
		//driver.findElement(By.xpath("//em[text()='sumanthelfbatch@rediffmail.com']")).click();
		
		WebElement sub = driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']"));
		sub.clear();
		sub.sendKeys("RANJITHA K P");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		
		driver.switchTo().frame(frameElement);
		WebElement body = driver.findElement(By.xpath("//body[@contenteditable='true']"));
		
		body.sendKeys("Hi GoodAfternoon sir,,,,");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Send")).click();
//		for(;;)
//		{
//			driver.findElement(By.;
			
//		}
		driver.navigate().refresh();		
		driver.navigate().refresh();
		
	}

}
