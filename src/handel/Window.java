package handel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Winndowhandel\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https:www.snapdeal.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement a = driver.findElement(By.xpath("input[@placeholder='Search products & brands']"));
a.sendKeys("Iphone 7");
WebElement b = driver.findElement(By.xpath("span[text()='Search']"));
b.click();
WebElement c = driver.findElement(By.xpath("p[@title='Apple iPhone 7 ( 32GB , 2 GB ) Rose Gold']"));
c.click();
//String a1 = driver.getWindowHandle();
//Set<String> a2 = driver.getWindowHandles();
//for (String s : a2) {
	//if (!a1.equals(s)) {
		//driver.switchTo().window(s);
	//driver.findElement(By.xpath("span[text()='add to cart']")).click();

	}
//}
}
//}