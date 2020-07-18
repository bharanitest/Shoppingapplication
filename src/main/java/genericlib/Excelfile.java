package genericlib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excelfile implements Autoconstant{
	public static String getdata(String sheetname,int row,int cellnum)
	{
		String s1="";
		try {
		FileInputStream s=new FileInputStream(Excelsheet);
		Workbook wb = WorkbookFactory.create(s);
		s1=wb.getSheet(sheetname).getRow(row).getCell(cellnum).getStringCellValue();
		}
		catch(Exception e)
		{
			Reporter.log("data is not taken from excel",true);
		}
		return s1;
		
	}

}
