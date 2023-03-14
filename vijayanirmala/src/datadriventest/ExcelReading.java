package datadriventest;


import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading {

	public static void main(String[] args) throws  IOException {
		FileInputStream fis = new FileInputStream("C:\\Testdata\\userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		/*Sheet s1 = w1.getSheet("Sheet1");
		Row r1 = s1.getRow(2);
		Cell c1 = r1.getCell(2);*/
		
		String s = w1.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(s);

	}

}
