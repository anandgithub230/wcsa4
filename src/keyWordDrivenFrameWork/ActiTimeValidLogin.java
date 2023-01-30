package keyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();

		Flib flib = new Flib();

		String username = flib.readPropertyData(PROP_PATH,"Username");
		String password = flib.readPropertyData(PROP_PATH,"Password");
       
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);

		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		bt.closeBrowser();
	}


}

