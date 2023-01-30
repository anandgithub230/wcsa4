package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
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
		String option = sel.getFirstSelectedOption().getText();
		System.out.println(option);  
	}
}

