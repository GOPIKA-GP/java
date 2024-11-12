package ExcelReading;

import java.io.IOException;

public class ExcelCode2 {
	

	public static void main(String[] args) throws IOException{
		String s=ExcelCode.readStringData(0, 1);
		System.out.println(s);
		String s1=ExcelCode.readIntegerData(1, 1);
		System.out.println(s1);
		
}
}