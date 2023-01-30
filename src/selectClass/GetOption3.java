package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOption3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");

		WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select sel = new Select(dropDownElement);

		List<WebElement> allOptions = sel.getOptions();
		for(WebElement opts:allOptions)
		{
			if(opts.getText().equals("Hyundai"))
			{
				opts.click();
				break;
			}
		}
	}
}
