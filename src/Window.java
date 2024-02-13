import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window {
	public  static WebDriver driver;
	public static void main(String args[]) throws AWTException
	{
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions act = new Actions(driver);
		WebElement target =driver.findElement(By.xpath("//a[.='Gmail']"));
		act.contextClick(target).build().perform();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		String wh=driver.getWindowHandle();
		System.out.println(wh);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().newWindow(WindowType.TAB);
	    
	    
	}

}
