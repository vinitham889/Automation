import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void browser() {
	System.setProperty("webdriver.chromeDriver","//Users//User//Desktop//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().fullscreen();
//	driver.findElement(By.xpath("(//*[@class=\"a-color-base headline truncate-2line\"])[1]")).click();
	driver.findElement(By.id("hQrLHzEecJyJotKoS9a_4g")).click();
	}

	
}
