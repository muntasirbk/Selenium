import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ecommerceRahulShetty {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// Declare array for products As expect to get
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(driver, 5);
		
	String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		additems(driver,itemsNeeded);
		
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		//driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		

		
	}
	
	public static void additems(WebDriver driver, String[] itemsNeeded) 
	
	{
		
		int j=0; //3br jate loop kaj kore she jnno 3br jnno implement kora hoice
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		
		for (int i = 0; i < products.size(); i++)

		{
			// Brocolli - 1 Kg
			// Brocolli

			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();
			// trim er karone shudu 1st index Brocolli nibe

			// format actual vegetable name; Cucumber- 1 Kg to Cucumber
			// check whether name you extract is present in array or not
			// convert array to array list for easy search

			List itemsNeededList = Arrays.asList(itemsNeeded);

			
			if (itemsNeededList.contains(formatedName)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//if (j==3) shudu 3 products pick krbe
				
				if (j==itemsNeeded.length)
					
					//lenght deyar por j gula list e oigula ashbe automatically
				{
					break;
				}
				
			}
			
			

		}
	}

}
