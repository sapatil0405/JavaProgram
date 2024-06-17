package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\aksha\\Desktop\\drivers\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");


		driver.manage().window().maximize();

		driver.get("https://www.goibibo.com/");
//		driver.findElement(By.xpath("//span[@class='sc-gsFSXq bGTcbn']")).click();
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
	}

}
