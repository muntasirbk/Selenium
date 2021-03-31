import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://login.salesforce.com/?locale=in");
		//driver.findElement(By.name("pw")).sendKeys("12345");
		//driver.findElement(By.xpath("//*['@id=Login']")).click();
		
		//driver.findElement(By.cssSelector("#username")).sendKeys("EmailAddress");
		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Hello");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("asfs");
		//driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
		
	

	}

}
