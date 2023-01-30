package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		String titleWebPage = driver.getTitle(); //give the title of current web page
		System.out.println(titleWebPage);       // print the title of current web page
		driver.close();

	}

}
