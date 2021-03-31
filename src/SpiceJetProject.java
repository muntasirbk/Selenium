import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetProject {

public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\Users\\maknun\\eclipse-workspaceMaknun\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://www.spicejet.com/");
Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
s.selectByValue("2");


}
}