package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//a['open popup window']")).click();
		Thread.sleep(2000);
		driver.close(); //close present window
		
		
		
	}

}
