import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-xshop-container\"]//*[text()='Mobiles']")).click();
		Actions act = new Actions(driver);
		WebElement mobileAccessories = driver.findElement(By.xpath("(//*[@id=\"nav-subnav\"]//a[2])"));
		act.moveToElement(mobileAccessories).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img18/Electronics/Megamenu/megamenumar18f.json:subnav-sl-megamenu-1:0\"]/div[2]/div/div[2]/ul/li[5]/a")).click();
		
		
		

	}

}
