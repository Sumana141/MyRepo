package excelreadPkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 
{
	static FileInputStream f; //FileInputStream is class used to read our file(where it is stored).
	static XSSFWorkbook wb;// Class to get details from our workbook.
	static XSSFSheet   sh;//To fetch details from sheet of the workbook.
	
	public static String getStringData(int a, int b) throws IOException
	{
		//a - row
		//b - cell value
		f=new FileInputStream("C:\\SUMANA\\Java\\ExcelReadProgram1.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1"); //getSheet used to get details from sheet
		XSSFRow r =sh.getRow(a); //getRow - to get row. sh.getRow as row is inside sheet.
		XSSFCell c = r.getCell(b); //getCell - to get cell value.
		return c.getStringCellValue(); //return as String cell value
	}
	
	public static String getIntegerData(int a, int b) throws IOException
	{
		f = new FileInputStream("C:\\SUMANA\\Java\\ExcelReadProgram1.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("sheet1");
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int x = (int)c.getNumericCellValue(); //for type conversion to integer.
		return String.valueOf(x);
	}
	
	public static String getFloatData(int a, int b) throws IOException
	{
		f = new FileInputStream("C:\\SUMANA\\Java\\ExcelReadProgram1.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("sheet1");
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		float i = (float)c.getNumericCellValue(); //type conversion to float.
		return String.valueOf(i);
	}
}
