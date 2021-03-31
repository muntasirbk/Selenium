import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       //System.setProperty("webdriver.chrome.driver", "C:\\work\\Chrome83.00\\chromedriver.exe");
	       //WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       //dropdown with select tag
	    WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    Select dropdown = new Select(StaticDropdown);
	    dropdown.selectByIndex(3);
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByVisibleText("AED");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByValue("INR");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	       
	   
	       
	       
	       
	       
	}

}
