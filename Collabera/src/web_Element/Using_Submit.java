package web_Element;

import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Submit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:/demo.actitime.com/login.do");
		

	}

}
