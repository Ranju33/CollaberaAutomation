package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LunchingFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ranjitha kp\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver fire=new FirefoxDriver();


	}

}
