package excelreadPkg;

import java.io.IOException;

public class ExcelRead2 
{

	public static void main(String[] args) throws IOException 
	{
		String m = ExcelRead1.getStringData(1, 0);
		System.out.println(m);
		
		System.out.println(ExcelRead1.getIntegerData(1, 1));
		
		System.out.println(ExcelRead1.getStringData(3, 0));
		System.out.println(ExcelRead1.getFloatData(3, 1));
	}

}
