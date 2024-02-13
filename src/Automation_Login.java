import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Automation_Login {
	
       public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.id("userEmail")).sendKeys("vinitha.m@moolya.com");;
		driver.findElement(By.id("userPassword")).sendKeys("Rahul@123");
		driver.findElement(By.id("login")).click();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement addCart=driver.findElement(By.xpath("//*[contains(text(),'zara coat 3')]/../../button[@class=\"btn w-10 rounded\"]"));
		addCart.click();
		WebElement item1=driver.findElement(By.xpath("//*[contains(text(),'zara coat 3')]"));
		if(item1.isDisplayed()) {
			System.out.println(item1.getText());
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//app-sidebar/nav/ul/li[4]/button/i")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@class=\"subtotal cf ng-star-inserted\"]/ul//button")).click();
		WebElement country=driver.findElement(By.xpath("//div[@class=\"payment__shipping\"]//*[@class=\"input txt text-validated\"]"));
		country.sendKeys("India");
		Thread.sleep(2000);
		country.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		country.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		country.sendKeys(Keys.ENTER);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Place Order ')]")).click();
        
		
	}

}




















