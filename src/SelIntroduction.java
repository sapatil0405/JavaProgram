 import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) throws IOException {

//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");

////		*************Chrome Launch*********** 
//		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\aksha\\Desktop\\drivers\\chromedriver-win32\\chromedriver.exe");

//		******Firefox Launch *********

//		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\aksha\\Desktop\\drivers\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");

//		**********Microsoft Edge Browser Launch ***************
//		
//		WebDriver driver = new EdgeDriver();
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Desktop\\drivers\\edgedriver_win32\\msedgedriver.exe");
//		

//		getckodriver
//		webdriver.gecko.driver
//		WebDriver driver = new FirefoxDriver();
		
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		

		driver.get("https://www.google.com");		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());



	}

}
