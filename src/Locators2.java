import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Locators2 {
	
	

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		
		String Name = "Saurabh";
	
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aksha\\Desktop\\drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\aksha\\Desktop\\drivers\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");

//		WebDriver driver = new EdgeDriver();
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Desktop\\drivers\\edgedriver_win32\\msedgedriver.exe");
		
		driver.manage().window().maximize();
	
		String Password = getPassword(driver);

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(Name);
		
		driver.findElement(By.name("inputPassword")).sendKeys(Password);

		driver.findElement(By.className("submit")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
//		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), null)
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello Saurabh,");
		//Logout the page 
		driver.findElement(By.xpath("//*[text()='Log Out']")).click(); 
	
//		driver.close();
	}

public static String getPassword(WebDriver driver) throws InterruptedException 	
{
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click(); 
	Thread.sleep(1000);
	driver.findElement(By.className("reset-pwd-btn")).click();
	String PasswordText = driver.findElement(By.cssSelector("form p")).getText();
//	Please use temporary password 'rahulshettyacademy' to Login. 
	String[] Password1= PasswordText.split("'");
	
	String Password = Password1[1].split("'") [0];
	
	return Password; 
	
	
	
	
}
	
}
