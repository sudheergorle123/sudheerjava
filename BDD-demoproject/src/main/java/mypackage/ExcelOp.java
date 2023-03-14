package mypackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOp {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Excel\\Book3.xlsx");
		Workbook w1 =WorkbookFactory.create(fis);
		Sheet s1 = w1.getSheet("Sheet1");
		Row r1 =s1.getRow(1);
		Cell c1 = r1.getCell(2);
		String s = c1.getStringCellValue();
		System.out.println(s);
		
		

	}

}
