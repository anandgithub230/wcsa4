package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
        Thread.sleep(2000);
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		usernameTextBox.sendKeys("Anand@123");
		Thread.sleep(2000);
		System.out.println(usernameTextBox);
		Thread.sleep(2000);
		driver.close();
	}
}

