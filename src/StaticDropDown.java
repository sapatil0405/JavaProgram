import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aksha\\Desktop\\drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Dropdown learning with select tag -Static (Means in which present select tag)
		
		WebElement Variable1 =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		
			Select jayant =new Select(Variable1);
			
			jayant.selectByIndex(3);
			System.out.println(jayant.getFirstSelectedOption().getText());
//			System.out.print

	}

}
