package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseParentWindow 
{
	public static void main(String[] args) 
	{

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.zomato.com");
	driver.close();


}
}
