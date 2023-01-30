package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Anand@123");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Sawant@123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
		driver.close();

	}

}
