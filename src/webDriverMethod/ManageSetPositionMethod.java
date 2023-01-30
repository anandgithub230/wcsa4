package webDriverMethod;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageSetPositionMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 Dimension targetSize = new Dimension(450,230);
		 driver.manage().window().setSize(targetSize);
		 Point targetSize1= new Point (900,600);
         driver.manage().window().setPosition(targetSize1);
	}
}
	