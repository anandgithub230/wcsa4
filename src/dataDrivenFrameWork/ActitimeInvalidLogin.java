package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeInvalidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=2m1n485bxg4s3");

		Flib flib = new Flib();
		int rc = flib.rowCount("./data/ActiTimeTestData1.xlsx", "invalidcreads");

		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData("./data/ActiTimeTestData1.xlsx", "invalidcreads", i, 0);
			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(2000);
			
			String password = flib.readExcelData("./data/ActiTimeTestData1.xlsx", "invalidcreads", i, 1);
			driver.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(2000);

			driver.findElement(By.id("loginButton")).click();

			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();

		}


	}
}
