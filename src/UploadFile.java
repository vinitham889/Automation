import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
	@Test
	public void uploadDataFile() throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//*[text()='Login']")).submit();
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/div[2]/button")).click();
		driver.findElement(By.xpath("(//*[@class=\"MuiButtonBase-root css-1hytwp4\"])[position()=2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(4000);
		//uploading file using sendKeys
		WebElement ele=driver.findElement(By.xpath("//*[@class=\"MuiFormControl-root MuiTextField-root css-i44wyl\"]"));
		ele.click();
		Thread.sleep(2000);
		//ele.sendKeys("C:\\Users\\User\\Downloads\\git___git_hub.docx");
		//Using Robot class uploading
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", ele);
		Robot rb = new Robot();
		rb.delay(2000);
		//put path of file in a clipboard
		StringSelection ss = new StringSelection("C:\\Users\\User\\Downloads\\demo-data.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//control v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		//enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(2000);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Import']")).click();
		rb.delay(2000);
//		
		
	}

}
