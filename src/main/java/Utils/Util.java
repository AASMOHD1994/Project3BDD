package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Util {
	
	public static void main(String [] args) throws IOException
	{
		
		int [] arr = {0,1,2,4,6,7,3,9,8};
		
		test();
		
		//fibanocci();
		
	//	palindrome();
		
	//	armStrong();
		
	//	SumOfDigits();
		
	//	OddOrEven();
		
	//	factorial();
		
	//	factorialRec();
		
		//cal();
		
		//m1(arr);
	//	m2();
		
	//	Object [][] arr =getData();
//		System.out.println(Arrays.deepToString(getData()));

//
		//hy there

//		

//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				System.out.print(arr[i][j]+"  ");
//			}
//			
//			System.out.println();
//		}
		
		
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
	
	
	public static void m1(int [] arr)
	{
		//int [] arr = {0,1,2,4,6,7,3,9,8};
		int target = 10;
		int count =0;
       ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					//System.out.print(arr[i]+","+arr[j]);
					al.add(new ArrayList<Integer>(Arrays.asList(arr[i],arr[j])));

					
				}	
			}
			
			
			
		}
		
		System.out.println(al);
		
	}
	
	
	public static void m2()
	{
		int [] arr = {0,2,3,4,5,-1,-30,-6,4,5,-9,8};
		int [] arr2 = new int [arr.length];
		int count =0;
		
		for (int i=0;i<=1;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>=0 && i==0)
				{
					arr2[count]=arr[j];
					count++;
				}
				
				if(arr[j]<0 && i==1)
				{
					
					arr2[count]=arr[j];
					count++;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr2));
		
		
	}
	
	public static void fibanocci()
	{
		int count=0;
		int first =0;
		int sec=1;
		int result=1;
	
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

//		f=2
//	    s=3
//	    r=5(f+s)
//	    
//	    f=3 s
//	    s=5 r
//	    r=(f+s)		

		
		while(count<12)
		{
 
			 System.out.print(first+ " ");
			 first =sec;
			 sec= result;
			 result= first+sec;
			 count++;
		
		
		}
		
		
	}
	
	public static void test()
	{
		
		String k="aasmohd";
		
		String n=  k.substring(0,3);
		
		String g = k.substring(3);
		
		System.out.print(g);
	}
	
	
	public static void palindrome()
	{
		int originalNo=1234321;
		int num=originalNo;
		int rem=0;
		int rev=0;
		
		while(num>0)
		{
			rem=num%10;//0*10+1 //12  1*10+2  // 123   12*10+3
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println(rev==originalNo);
	
		
		
	}
	
	public static void armStrong()
	{
		int originalNo=153;
		int num=originalNo;
		int a,b,c=0;
		int sum=0;

		
		while(num>0)
		{

			a=num%10;
			num=num/10;
			sum=sum+a*a*a;  //0+3*3*3 // 3*3*3 + 5*5*5 // 3*3*3 + 5*5*5 + 1*1*1
			
		}
		
		System.out.println(sum==originalNo);
	
		
		
	}
	
	public static void SumOfDigits()
	{
		
		int num = 132344;
		int sum=0;
		int rem=0;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem; // 0+4 //4+
			num=num/10;
		}
		
		System.out.println(sum);
	}
	
	public static void OddOrEven()
	{
		
		int number =1;
		
		if(number%2==0) {System.out.println("Even");} else {System.out.println("odd"); } 
	}
	
	public static void factorial()
	{
		int num=5;
		int factorial=1;
		
		while(num>0)
		{
			factorial = factorial*num;
			num--;		
			
		}
		System.out.print(factorial);
		
	}
	
	public static void factorialRec()
	{
		int num=5;
		int factorial=1;
		
		factorial =factorialMethod(num);

		System.out.print(factorial);
		
	}
	
	public static int factorialMethod(int num)
	{
		
		if(num==0)
		{
			return 1;
		}
		
		else
		{
			return num*factorialMethod(num-1);
			
		}
		
		
	}
	
	public static void cal()
	{
		
		double timeTaken=24;
		
		System.out.println(pass(timeTaken));
		

			
		
	}
	
	public static double pass(double num)
	{
		double x=num;
		num=num*60;
		
		if(num>=0 && num<=15)
		{
			
			return 0.0;
		}
		else if(num>=16 && num<=120)
		{
			return 5.0;
		}
		
		else if(num>=121 && num<=300)
		{
			
			return 10.0;
		}
		
		else if(num>=300 && num<(60*x))
		{
			
			return (10+(x-5));
			
			
		}
		
		else
		{
			
				
				return (10+(x-5));
				
				
			
		}
			

		}
		
	}
	
	
	
	
