package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {
	public static String readdata(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Testdata\\user.xlsx");
		Workbook w1 =WorkbookFactory.create(fis);
		String s = w1.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return s;
	}
	
	public static void writeData(String sheetname,int rownum,int cellnum,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Testdata\\user.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		w1.getSheet(sheetname).createRow(rownum).createCell(cellnum).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("C:\\Testdata\\user.xlsx");
		w1.write(fos);
		
	}

}
