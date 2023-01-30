package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


// use to store only the generic reusable methods

public class Flib {
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream path = new FileInputStream(excelPath);
		Workbook wbf = WorkbookFactory.create(path);
		Sheet sheet = wbf.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}


	// to get last RowCount

	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;	
	}

	// Write Excel Data

	public void writeExcelData(String excelPath, String sheetName, int rowCount, int cellCont, String data ) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		//........................................
		Cell cell = row.getCell(cellCont);
		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(excelPath);
		wbf.write(fos);
	}
}




