package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Dimension dimension = driver.manage().window().getSize();
				
		dimension .getHeight();
		int height=dimension.getHeight();
		int width=dimension.getWidth();
		System.out.println("height: "+height +"width: " +width);
		

	}

}
