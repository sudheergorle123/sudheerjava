package Jantwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWriting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Testdata\\userdata.xlsx");
		Workbook w1 =WorkbookFactory.create(fis);
		w1.getSheet("Sheet1").createRow(0).createCell(7).setCellValue("sudheergorle");
		FileOutputStream fos = new FileOutputStream("C:\\Testdata\\userdata.xlsx");
		w1.write(fos);
		System.out.println("excuted successfully");

	}

}
