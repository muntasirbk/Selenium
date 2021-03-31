import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.biman-airlines.com/");
	driver.findElement(By.id("traveller-summary")).click();
	 Thread.sleep(2000L);
	 int i=1;
	 while(i<5);
	 {
		 driver.findElement(By.cssSelector("span[class=\"bui-button__text\"]")).click();
		 
	 }
	
	
	}

}
