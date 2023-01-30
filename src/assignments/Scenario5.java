package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmBtn")).click();


		WebElement rings = driver.findElement(By.xpath("(//a[@title='Rings'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(rings).perform();
		driver.findElement(By.xpath("(//a[.='Diamond'])[1]")).click();
		
		System.out.println("Price List By Defaultlist");
		List<WebElement> defaultlist = driver.findElements(By.xpath("//span[@class='new-price']"));
		for( WebElement price:defaultlist)
		{  
			String value = price.getText();
			System.out.println(value);
		}
		Thread.sleep(2000);
		WebElement sortby = driver.findElement(By.xpath("//span[.=' Popular ']"));

		act.moveToElement(sortby).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
		
		System.out.println("Price List By Low To High");
		List<WebElement> pricelth = driver.findElements(By.xpath("//span[@class='new-price']"));
		for (int i=0;i<pricelth.size();i++)
		{
			WebElement opt = pricelth.get(i);
			String Values = opt.getText();
			System.out.println(Values);
		}
		




	}
}
