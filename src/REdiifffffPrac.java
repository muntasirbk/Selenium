import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class REdiifffffPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("fdfd");
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
	}

}
