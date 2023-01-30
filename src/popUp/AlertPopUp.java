package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///D:/html%20code/alert.html");

		WebElement click = driver.findElement(By.xpath("//button[.='Click']"));
		click.click();
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);

		a1.accept();
		//a1.dismiss();
		String text = a1.getText();
		System.out.println(text);
		
		//a1.sendKeys("sawant");
	}
}
