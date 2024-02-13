import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class Youtube {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		// driver.manage().deleteAllCookies();
		WebElement frame1 = driver.findElement(By.xpath("(//iframe[@role='presentation'])[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
//		Actions act = new Actions(driver);
//		WebElement target = driver.findElement(By.cssSelector("svg.gb_i"));
		WebElement target = driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]"));
		target.click();
		//act.moveToElement(target).click();
		Thread.sleep(2000);
//		Robot rb = new Robot();
//        rb.keyPress(KeyEvent.VK_TAB);
		WebElement frame2=driver.findElement(By.xpath("//iframe[@name=\"app\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//span[@data-text=\"YouTube\"]")).click();

	}

}
