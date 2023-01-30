package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartLoginXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
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
		//driver.findElement(By.xpath("//div[text()='Customer Ratings']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(2000);
		String LaptopPrice = driver.findElement(By.xpath("//div[.='HP Pavilion Gaming Core i5 11th Gen - (8 GB/1 TB HDD/256 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA G...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	    System.out.println(LaptopPrice + "price of Laptop");
		driver.quit();
	    
		
	}
}
