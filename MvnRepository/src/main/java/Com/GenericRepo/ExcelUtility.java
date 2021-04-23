package Com.GenericRepo;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String getreaddata(String sheetname, int num,int cellnum) throws Exception
	{
		FileInputStream fii = new FileInputStream(Papa.Excelpath);
		Workbook b = WorkbookFactory.create(fii);
		Sheet sh = b.getSheet(sheetname);
		Row r = sh.getRow(num);
		Cell c = r.getCell(cellnum);
		String value = c.getStringCellValue();
		return value;
		
	}
}
