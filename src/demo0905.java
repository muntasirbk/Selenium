import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo0905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); //Hit on the browser
		System.out.println(driver.getTitle()); // Validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); //Validate if you are landed on correct URL
		
		//System.out.println(driver.getPageSource()); // print pagesource
		
		driver.get("https://www.yahoo.com/");//Hit another link
		
		driver.navigate().back();
		//driver.navigate().forward();
		
		driver.close(); //it closes current browser
		//driver.quit(); //it closes all browsers opened by selenium scripts
		
		
		
		
		

	}

}
