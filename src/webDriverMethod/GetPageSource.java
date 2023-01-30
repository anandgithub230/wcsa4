package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String sourcecode = driver.getPageSource(); // give the source code of current webpage
		System.out.println(sourcecode);             //print the given source code of current webpage
		 //driver.close();
	}
}
