package flipcart;

import org.openqa.selenium.chrome.ChromeDriver;

public class MynthraBarElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("hettps://www.myntra.com");

	}

}
