package flipcart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_In_Script {

	public static void main(String[] args) {
		//test data
		String testUrl="https://www.instagram.com/";
		String phoneno="ranju.p.gowda33@gmail.com";
		String password="7348890833";
		String expectedLoginTitle="";
		String expectedHomePageTitle="";
		
		//step 1:open the browser enter the url
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("browser maximized successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(testUrl);
		String ActualLoginPageTitle = driver.getTitle();
		if(ActualLoginPageTitle.equals(expectedLoginTitle))
		{
			System.out.println("login page is displayed successfully");
		}
		else
		{
			System.out.println("login page is displayed successfully");
		}
		
		//step 2:enter email or phone no into email or phone no text field
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		
		WebElement email = driver.findElement(By.name("username"));
		email.clear();
		email.sendKeys(phoneno);
		String actualPhonenoentered = email.getAttribute("value");
		if(actualPhonenoentered.equals(phoneno))
		{
			System.out.println("email is entered successfully");
		}
		else
		{
			System.out.println("email is not enetered successfully");
		}
		
		//step 3:enter password into password text field
		WebElement pswd = driver.findElement(By.name("password"));
		pswd.clear();
		pswd.sendKeys(password);
		String actualpasswordenter = pswd.getAttribute("value");
		if(actualpasswordenter.equals(password))
		{
			System.out.println("password is entered successfully");
		}
		else
		{
			System.out.println("password is not enetered successfully");
		}
		
		//step 4:click on the login button
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		String actualHomePage = driver.getTitle();
		if(actualHomePage.equals(expectedHomePageTitle))
		{
		System.out.println("login succefully");
		}
		else
		{
			System.out.println("login unsuccefully");
		}
}
}

