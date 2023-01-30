package mock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkartlaptop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hp laptops");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(4000);
		String LaptopPrice = driver.findElement(By.xpath("//div[.='HP 14 Core i5 10th Gen - (8 GB/512 GB SSD/Windows 10 Home) 14-ck2018TU Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	    System.out.println(LaptopPrice + "price of Laptop");
		driver.quit();
	    
	}
}
