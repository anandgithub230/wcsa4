package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Scenario3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://jqueryui.com/droppable/");	
		Thread.sleep(2000);

		WebElement b = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(b);

		WebElement source = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement target = driver.findElement(By.cssSelector("div[id='droppable']"));
		System.out.println("before text: "+target.getText());

		String e1 = target.getCssValue("color");
		System.out.println(e1);
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(source, target).build().perform();

		String e = target.getCssValue("color");
		System.out.println(e);

		System.out.println("after text: "+target.getText());
		Thread.sleep(2000);
		driver.close();
	}
}
