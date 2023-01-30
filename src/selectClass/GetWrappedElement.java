package selectClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");

		WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select sel = new Select(dropDownElement);

		String options = sel.getWrappedElement().getText();
		System.out.println(options);
//		Thread.sleep(2000);
//		driver.close();
	}

}
