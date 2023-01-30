package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(4000);
		/*driver.findElement(By.name("password")).sendKeys("Anand123");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("span[class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0']")).click();
		Thread.sleep(4000);
		driver.close();*/

	}

}
