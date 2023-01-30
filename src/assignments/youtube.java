package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='style-scope ytd-rich-shelf-renderer'])[4]")).click();
		Thread.sleep(4000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']"));

		List<WebElement> Suggestion1 = driver.findElements(By.xpath("//h3[@class='style-scope ytd-rich-grid-slim-media']/ancestor::a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']//div[@id='metadata-line']"));

		for(WebElement rivew:Suggestion1)
		{
			System.out.println(rivew.getText());
			Thread.sleep(4000);
		}
		for(WebElement s:suggestions)
		{
			System.out.println(s.getText());
			Thread.sleep(6000);
		}

	}

}
