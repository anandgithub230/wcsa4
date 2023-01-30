package frame;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		Thread.sleep(5000);
		
		WebElement frame = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(frame);
		
		//driver.switchTo().frame("fc_widget");
		Thread.sleep(5000);
		driver.findElement(By.id("chat-icon")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("chat-fc-name")).sendKeys("Admin");
	}
}
