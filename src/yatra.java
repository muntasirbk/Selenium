import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yatra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com/flights");
		//driver.findElement(By.xpath("//*[@id=\"BE_flight_passengerBox\"]/div[1]/div[1]/div")).click();
		driver.findElement(By.xpath("//*[@id='BE_flight_paxInfoBox']/span/span[2]")).click();
		
	      /*int i =1;
		while (i<3) {
			
		 driver.findElement(By.xpath("//*[@id=\'BE_flight_passengerBox\']/div[1]/div[1]/div/div/span[2]")).click();
			i++;
		 } */
		
		 //driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		
		// or we can write this way very easily
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"BE_flight_passengerBox\"]/div[1]/div[1]/span/span[1]")).getText());
		for (int i=1; i<3; i++)
		{
			System.out.println(driver.findElement(By.xpath("//*[@id=\"BE_flight_passengerBox\"]/div[1]/div[1]/span/span[1]")).getText());
			driver.findElement(By.xpath("//*[@id=\'BE_flight_passengerBox\']/div[1]/div[1]/div/div/span[2]")).click();
			
		}
		//driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"BE_flight_passengerBox\"]/div[1]/div[1]/span/span[1]")).getText());
	    }

}
