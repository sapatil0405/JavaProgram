import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//implicit wait -5sec timeout
		 
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aksha\\Desktop\\drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Jayant");
		
		driver.findElement(By.name("inputPassword")).sendKeys("Karanjkar@4595");
		driver.findElement(By.id("chkboxOne")).click();
				
		driver.findElement(By.className("submit")).click();
//		 
		driver.findElement(By.cssSelector("p.error")).getText();
		driver.findElement(By.linkText("Forgot your password?")).click(); 
		
		//Due to single page application it transit one page so we require little more time for selenium
		Thread.sleep(1000);
		
//		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jayant");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jayant@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jayant2@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7767928391");
		driver.findElement(By.className("reset-pwd-btn")).click();
		 
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
				
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Jayant");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();  	
		 driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
				 

//		System.out.println(driver.getCurrentUrl());
//		driver.close();
		
		
 

}
}
