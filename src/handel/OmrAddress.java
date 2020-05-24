package handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OmrAddress {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Winndowhandel\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	WebElement b = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
	Actions a = new Actions(driver);
	a.moveToElement(b).contextClick().perform();

}
}
