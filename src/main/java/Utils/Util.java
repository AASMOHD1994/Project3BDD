package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Util {
	
	public static void main(String [] args) throws IOException
	{
		
		Object [][] arr =getData();
//		System.out.println(Arrays.deepToString(getData()));
//
		//hy there
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			
			System.out.println();
		}
		
		
	}
	
	public static Object [][] getData() throws IOException
	{
		FileInputStream fis = new FileInputStream(new File("C:\\Dell\\work\\Latest\\TestData\\Test1.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int Totalrows=sheet.getLastRowNum();
		int TotalColumns = sheet.getRow(0).getLastCellNum();
		Object [][] arr = new Object [Totalrows+1][TotalColumns+1];
	//	sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<=Totalrows;i++)
		{
			for(int j=0;j<TotalColumns;j++)
			{
				System.out.print(sheet.getRow(i).getCell(j).getRawValue()+"   ");
				arr[i][j]=sheet.getRow(i).getCell(j).getRawValue();
			}
			
			System.out.println();
			
			
			
		}
		
		return arr;
	
		
	//	System.out.println(	sheet.getLastRowNum() + "  " + sheet.getRow(0).getLastCellNum());
	}

}
