package assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMrthod {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			
			driver.switchTo().activeElement().sendKeys("mobile");
			Thread.sleep(4000);
			List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
			
			for(int i=0;i< suggestion.size();i++)
			{ 
			  WebElement suggestions = suggestion.get(i);
			  String textOfTheWebElement =suggestions.getText();
			  System.out.println(textOfTheWebElement);
			}
			driver.quit();		  
		}
	}


