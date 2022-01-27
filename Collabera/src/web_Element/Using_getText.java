package web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_getText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		WebElement ToGetHW=driver.findElement(By.id("email"));
		System.out.println(ToGetHW.getSize());
		WebElement ToGetHW1=driver.findElement(By.id("passContainer"));
		System.out.println(ToGetHW1.getSize());
		

	}

}
