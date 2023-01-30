package sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitOnActitime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver  =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=9f8gm7slged0r");
		String ActiTimeLoginPageTitle = driver.getTitle();
		if(ActiTimeLoginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("Login page title is matched: test case is pass");
		}
		else
		{
			System.out.println("Login page title is not matched: test case is failed");
		}
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		String ActiTimeHomePageTitle = driver.getTitle();
		if(ActiTimeHomePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Home page title is matched: test case is pass");
		}
		else
		{
			System.out.println("Home page title is not matched: test case is failed");
		}


	}
}
