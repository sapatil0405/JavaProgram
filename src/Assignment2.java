import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aksha\\Desktop\\drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Sai");
		driver.findElement(By.name("email")).sendKeys("sapatil@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Sap@123");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		//relative xpath  : /html[1]/body[1]/app-root[1]/form-comp[1]/div[1]/form[1]/div[5]/select[1]/option[1]
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/form-comp[1]/div[1]/form[1]/div[5]/select[1]/option[1]")).click();
		
		WebElement Variable1 =driver.findElement(By.id("exampleFormControlSelect1"));
		
		
		Select dropdown =new Select(Variable1);
		
		dropdown.selectByIndex(1);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("04-05-1995");
		
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible'] strong")).getText(),"Success!");
		
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible'] strong")).getText());

		

	} 

}
