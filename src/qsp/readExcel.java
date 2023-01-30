package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream path = new FileInputStream("./data/TestData.xlsx");
		Workbook read = WorkbookFactory.create(path);
		Sheet sheet = read.getSheet("IPL");
		Row row = sheet.getRow(5);
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		System.out.println(data);

	}
}
