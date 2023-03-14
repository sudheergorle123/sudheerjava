package Amma;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteOperation {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Testdata\\userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		w1.getSheet("sheet1").createRow(2).createCell(0).setCellValue("amma");
		FileOutputStream fos = new FileOutputStream("C:\\Testdata\\userdata.xlsx");
		w1.write(fos);
		System.out.println("executed succesfully");

	}

}
