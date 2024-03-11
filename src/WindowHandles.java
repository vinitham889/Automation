import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement ele=driver.findElement(By.xpath("(//*[text()='FLIGHTS'])[position()=2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ele.click();
		Set<String>windowIDS = driver.getWindowHandles();
		Iterator it = windowIDS.iterator();
		String parentid = (String)it.next();
		String childid = (String)it.next();
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//*[@placeholder=\"Origin\"]")).click();
		
	   driver.switchTo().window(parentid);
	}

}
