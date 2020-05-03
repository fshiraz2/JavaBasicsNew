package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelntro {

	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\Owner\\eclipse-workspace\\JavaBasics/testdata/Test.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		
		//accessing workbook
		Workbook wbook=new XSSFWorkbook(fis);
		
		//accessing sheet
		Sheet sheet=wbook.getSheet("Sheet3");//usee ss model not sl to import/export
		
		//accessing row
		Row row1=sheet.getRow(0);
		
		//accessing cell
		Cell cell=row1.getCell(1);
		
		//get value from cell
		String r1cell2=cell.toString();
		System.out.println(r1cell2);//LastName
		
		//how to get New York
		Row row3=sheet.getRow(2);//remember starts from 0
		Cell r3c3=row3.getCell(2);
		String cellValue=r3c3.toString();//convert to string
		System.out.println(cellValue);
		
		//access VA-->easiest way to do it
		cellValue=sheet.getRow(1).getCell(3).toString();//don't add String bc it is done before
		System.out.println(cellValue);
		
		//to retrieve values based on type(zipcode 20151)
		double cellv=sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println((int)cellv);//convert to int
		
		//how to get 20151 in a String format
		String valC=sheet.getRow(1).getCell(4).toString();
		System.out.println(valC);
		String[] arr=valC.split("\\.");//make into 2 strings bc 20151.0
		System.out.println(arr[0]);//to get without zero, remove 2nd string=0.
	}
}
