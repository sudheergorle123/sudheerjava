package Jantwo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xlread {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Testdata\\userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		String s2 = w1.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
		System.out.println("req o/p is:"+s2);

	}

}
