import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aksha\\Desktop\\drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		
	List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
	for(WebElement option :options)
		
	{
		
		if(option.getText().equalsIgnoreCase("Indonesia"))
		{
			
			option.click();
			
			break;
			
			
		}
		
	}
		
		
		


	}
		
	
	
	

}



