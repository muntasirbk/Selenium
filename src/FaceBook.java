import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("m@gmail.com");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123454");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("dnsnjsn");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("vjlsnvljsn");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).click();
		
		
	}

}
