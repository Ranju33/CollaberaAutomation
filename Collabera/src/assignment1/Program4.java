package assignment1;


import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Point point= new Point(100,50);
		driver.manage().window().setPosition(point);
		
	}

}
