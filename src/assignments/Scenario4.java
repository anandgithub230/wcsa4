package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario4 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.ebay.com/");

		WebElement sea = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
		sea.sendKeys("Apple Watches");
		Thread.sleep(2000);
		WebElement s1 = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Thread.sleep(2000);
		Select sel = new Select(s1);
		sel.selectByValue("281");
		driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();


		List<WebElement> fristpagelist = driver.findElements(By.xpath("//span[@role='heading']"));

		System.out.println(fristpagelist.size());
		for(int i=0;i<fristpagelist.size();i++)
		{ 
			WebElement value = fristpagelist.get(i);
			System.out.println(value.getText());
		}
	}
}
