package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");

		WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select sel = new Select(dropDownElement);
		for(int i=1;i<4;i++)
		{
			sel.selectByIndex(i);
		}
		List<WebElement> allOptions = sel.getAllSelectedOptions();
		for(WebElement opts:allOptions)
		{
			String values = opts.getText();
			System.out.println(values);
			Thread.sleep(3000);
		}
		driver.close();
	}
}

