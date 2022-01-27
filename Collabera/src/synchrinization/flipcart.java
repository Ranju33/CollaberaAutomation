package synchrinization;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			driver.findElement(By.name("q")).click();
			
			driver.findElement(By.name("q")).sendKeys("redmi",Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//div[@data-id])[3]")).click();
//			Thread.sleep(2000);
//			
//			String val=driver.findElement(By.xpath("//div@claa='_30jeq3 _1_WHN1']")).getText();
//			String price=val.toString();
//			String pric=price.replaceAll("[^\\d.]", "");
//			int val1 =Integer.parseInt(pric);
//			System.out.println(val1);
//			if(val1<=6000)
//			{
//				String parentWin=driver.getWindowHandle();
//				Set<String> allWin=driver.getWindowHandles();
//				allWin.remove(parentWin);
//				String expectTitle="baat storm Smartwatch Price in India - buy baAt StromSmartwatch online at Flipkart.com";
//				for(String s:allWin)
//				{
//					driver.switchTo().window(s);
//					String actuTitle=driver.getTitle();
//					if(expectTitle.equals(actuTitle))
//					{
//					System.out.println("driver switched control to a parent page");
//					}
//				}
//				driver.findElement(By.xpath("//button[text()='ADD TO CART]")).click();
//				driver.findElement(By.xpath("//span[text()='cart']")).click();
//			}
//			else
//			{
//				System.out.println("watch price is greater then 6000");
//				
//			}
	
			
	}

}
