package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData1.xlsx");
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet("validcreds");
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(2);
		cell.setCellValue("Link");

		FileOutputStream fos = new FileOutputStream("./data/ActiTimeTestData1.xlsx");
		wbf.write(fos);
	}

}
