package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ranjitha kp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver drive=new ChromeDriver();
		drive.get("http://www.zomato.com");
		drive.get("http://www.swiggy.com");

	}

}
