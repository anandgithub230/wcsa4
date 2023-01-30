package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenairo7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmBtn")).click();

		WebElement all = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(all).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("buy-now")).click();
		Thread.sleep(2000);
	}
}
