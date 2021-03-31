import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoPracticeAjax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");

		WebDriverWait ExplicitWait = new WebDriverWait(driver, 5);

		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		ExplicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));
		System.out.println(driver.findElement(By.cssSelector("#results")).getText());

	}

}
