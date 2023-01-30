package methodsOfWebElements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.instagram.com/");
		WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(2000);
		name.sendKeys("Anand");
		pass.sendKeys("manager1245");
		Thread.sleep(2000);
		button.submit();
	}
}
