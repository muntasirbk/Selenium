import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class REddit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\work\\Chrome83.00\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
//		driver.get("https://login.salesforce.com/?locale=in");
//		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("Khan");
//		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 password']")).sendKeys("12345");
		
		driver.get("http://www.spicejet.com/");
		
		WebElement flight=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		flight.clear();
		flight.sendKeys("MUM");
		//Thread.sleep(2000);

		
		WebElement arrive=driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		arrive.sendKeys("BE");
		arrive.sendKeys(Keys.ARROW_DOWN);
		arrive.sendKeys(Keys.ENTER);
		
	}

}
