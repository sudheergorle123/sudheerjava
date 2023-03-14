package datadriventest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Testdata\\userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		Sheet s1 = w1.getSheet("Sheet1");
		Row r1 = s1.getRow(2);
		Cell c1 = r1.createCell(4);
		c1.setCellValue("selenium");
		FileOutputStream fos = new FileOutputStream("C:\\Testdata\\userdata.xlsx");
		w1.write(fos);
		System.out.println("executed successfully");
	}

}
