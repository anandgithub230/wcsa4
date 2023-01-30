package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		for(int i=1;i<7;i++)
		{
			FileInputStream path = new FileInputStream("./data/TestData.xlsx");
			Workbook wbf = WorkbookFactory.create(path);
			Sheet sheet = wbf.getSheet("IPL");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			String data = cell.getStringCellValue();
			System.out.println(data);
		}

	}
}

