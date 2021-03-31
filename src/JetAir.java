import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JetAir {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// driver.findElement(By.xpath("//a[contains(text(),'Amritsar
		// (ATQ)')]")).click();
		driver.findElement(By.xpath("//acam[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

	}
}
