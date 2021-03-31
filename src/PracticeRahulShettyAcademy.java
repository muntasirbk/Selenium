import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class PracticeRahulShettyAcademy {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		
		
		// Count the all checkboxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox'")).size());
		
	}
}
