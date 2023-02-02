package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExcelRead {
	
public static void ExcelRead() throws IOException {
	File filepath = new File("D:\\Eclipse_Project_Space\\Selenium\\Resources\\Sales Page Automation Source Data Matrix.xlsx");
	FileInputStream fis = new FileInputStream(filepath);
	XSSFWorkbook book = new XSSFWorkbook(fis);
	XSSFSheet sheet = book.getSheet("Sheet3");
	int rowEnd=sheet.getLastRowNum();
	String TestCaseName;
	String columnHeader;
	String columValue;
	int totalColum;
	Map<String ,Map<String,String>> TestcaseName = new HashMap<String ,Map<String,String>>();
	Map<String ,String> TestcaseValueHolder = new HashMap<String, String>();
	WebDriver driver ;
	WebElement element;

	Iterator<Row> rowIteratio = sheet.rowIterator();
	while(rowIteratio.hasNext()) {
	Row row= rowIteratio.next();
	//int columunValue=row.getPhysicalNumberOfCells();
//	System.out.println("Cell Number - "+columunValue);
	Iterator<Cell> cellIterator =row.cellIterator();
	while (cellIterator.hasNext()) {
		
		Cell cell =cellIterator.next();
		int columunValue=cell.getColumnIndex();
		int columnLastValue=cell.getRowIndex();
		final int RowStart=4;
		
		if(cell.getRowIndex()==RowStart) {
			totalColum=row.getLastCellNum();
		}
		if(columnLastValue==1) {
			
		}
		System.out.print("["+columnLastValue+"]"+"["+columunValue+"] ");
		//System.out.println(cell.getCellType());
		
		if(cell.getCellType().toString().equalsIgnoreCase("String")) {
		//	System.out.print(cell.getRichStringCellValue());
		}
		else if(cell.getCellType().toString().equalsIgnoreCase("NUMERIC")) {
			//System.out.print(cell.getNumericCellValue());
		}
		
	}
	System.out.println();
	}
	
}
public void addExcelData(XSSFRow row) {
	int getCelltoStart =0;
	int getCellEnd = row.getLastCellNum();
	Iterator<Cell> RowToIterate = row.cellIterator();
	while (RowToIterate.hasNext()) {
		Cell cell = RowToIterate.next();
	if(String.valueOf(cell.getStringCellValue()).equals("Test Case Name")) {
		
		//int rowToS
	}
	}
}
	
	public static void main(String args[]) throws IOException {
		ExcelRead();
	}
	
}
