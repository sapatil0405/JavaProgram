import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aksha\\Desktop\\drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Sibling -child to parent
		//header/div/button[1]/following-siblings::button[1];
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[2]")).getText()); 
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		

	}

}
