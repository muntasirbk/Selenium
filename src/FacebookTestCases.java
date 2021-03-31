import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTestCases {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/"); //Hit on the browser
		driver.findElement(By.id("email")).sendKeys("m@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345");
		Thread.sleep(2000L);
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		
		
		
		
		
		
		
	
		
	

	}

}
