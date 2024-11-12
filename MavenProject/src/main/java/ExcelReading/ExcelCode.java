package ExcelReading;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode 
{
	static FileInputStream f;	//inbuild class to read the file and giving a variable
	static XSSFWorkbook w;		//inbuild class to read the workbook giving a variable
	static XSSFSheet sh;        //inbuild class to read the sheet giving a variable
	
	public static String readStringData(int row,int col) throws IOException{   //method to read string data.so data ty is refered as string.Method name stringdata that we can give any name
    f=new FileInputStream("C:\\Users\\GOPIKA\\Desktop\\OBSQURA CLASS\\Book1.xlsx"); //give the file path to identify the file
    w=new XSSFWorkbook(f); //w is work book. work book of file f.so given as XSSFWorkbook(f)
	sh=w.getSheet("Sheet1"); //sh is the sheet.sheet of workbook w.so getting the workbooks sheet name. using getsheet method, so inside method sheet1 in double quotes
	XSSFRow r=sh.getRow(row);
	XSSFCell c=r.getCell(col);
	return c.getStringCellValue();
	
}

public static String readIntegerData(int row,int col) throws IOException{
	f=new FileInputStream("C:\\Users\\GOPIKA\\Desktop\\OBSQURA CLASS\\Book1.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1");
	XSSFRow r=sh.getRow(row);
	XSSFCell c=r.getCell(col);
	int val=(int) c.getNumericCellValue();//we need to convert it string into the int value. so type casting it .converting one data type to another data type
	return String.valueOf(val); //since return type is string we need to call as return String.valueOf(val)
}

	}
