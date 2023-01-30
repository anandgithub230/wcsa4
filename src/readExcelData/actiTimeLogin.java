package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimeLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://127.0.0.1/login.do;jsessionid=22ogmgai04t93");

		Thread.sleep(2000);
		FileInputStream path = new FileInputStream("./data/ActiTimeTestData1.xlsx");
		Workbook wbf = WorkbookFactory.create(path);
		Sheet sheet = wbf.getSheet("validcreads");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
       
		FileInputStream path1 = new FileInputStream("./data/ActiTimeTestData1.xlsx");
		Workbook wbf1 = WorkbookFactory.create(path1);
		Sheet sheet1 = wbf1.getSheet("validcreads");
		Row row1 = sheet1.getRow(1);
		Cell cell1 = row1.getCell(1);
		String password = cell1.getStringCellValue();

		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(2000);

		driver.findElement(By.id("loginButton")).click();

	}
}
