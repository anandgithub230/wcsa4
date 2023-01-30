package popUp;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Windowpopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=c8l65srqn30b");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");

		driver.findElement(By.xpath("//a[.='Login']")).click();// by using text.

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'content administration')]")).click();
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'uploadNewLogoOption')]")).click();
		WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));

		Actions act = new Actions(driver);
		act.doubleClick(target).perform();

		//File abs = new File("./autoIT/Auto1.exe");
		//		Runtime.getRuntime().exec("C:\\Users\\alsaw\\OneDrive\\Desktop\\selenium data\\Auto1.exe");
		//		Thread.sleep(4000);
		//		Runtime.getRuntime().exec("C:\\Users\\alsaw\\OneDrive\\Desktop\\selenium data\\Auto1.exe");


		File ab = new File("./autoit/Auto3.exe");
		String abs = ab.getAbsolutePath();
		//integrate vb script
		Thread.sleep(4000);
		Runtime.getRuntime().exec(abs);
		Thread.sleep(4000);
		Runtime.getRuntime().exec(abs);
		Thread.sleep(2000);

	}
}


