import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\aksha\\Desktop\\drivers\\chromedriver-win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\aksha\\Desktop\\drivers\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");


		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).getText());
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click(); 
		
		driver.findElement(By.id("MultiCityModelAlert")).click();
		
		
		
		
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		System.out.println("TRIP ONE WAY SELECTED ");
		
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		
		
		
		 

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);

		for (int i = 1; i < 6; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(1000);
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");

		System.out.println((driver.findElement(By.id("divpaxinfo")).getText()));

	}
	
	
}
