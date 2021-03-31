import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);

		// driver.findElement(By.id("glsctl00_mainContent_ddl_destinationStation1_CTNR")).click();
		// driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("Style").contains(".5")) {

			System.out.println("Its Enabled");
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);

		}

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		dropdown.selectByVisibleText("5");

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		// Assert.assertEquals(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")),"5");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
