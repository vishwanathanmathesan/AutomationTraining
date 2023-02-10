package com.excelmanager.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {
	
	

	public static void updateSpecificCell(int row, int col) throws Exception {

		FileInputStream file = new FileInputStream(ConstantFilePaths.TESTDATA_FILE);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Cell cell = null;

		// Retrieve the row and check for null
		XSSFRow sheetrow = sheet.getRow(row);
		if (sheetrow == null) {
			System.out.println("Sheet has no row");
			sheetrow = sheet.createRow(row);
		}

		System.out.println("Sheet have rows with some data....");
		// Update the value of cell
		cell = sheetrow.getCell(col);
		if (cell == null) {
			System.out.println("Sheet has no column");
			cell = sheetrow.createCell(col);
		}

		cell.setCellValue("Abc");

		file.close();

		FileOutputStream outFile = new FileOutputStream(new File(ConstantFilePaths.TESTDATA_FILE));
		workbook.write(outFile);
		outFile.close();

		System.out.println("File Updated....");

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void createNewFileWithData() throws Exception {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("LogSheet");

		Object newData[][] = { 
				{ "S. No", "Name", "Role" }, 
				{ "1", "Besant", "Institute" },
				{ "2", "TCS", "Workplace" } ,
				{ "3", "Abc", "Alphabets" } 
				};

		int rows = newData.length;
		int cols = newData[0].length;

		System.out.println("Row count: " + rows);
		System.out.println("Column count: " + cols);

		for (int r = 0; r < rows; r++) {

			XSSFRow row = sheet.createRow(r);

			for (int c = 0; c < cols; c++) {

				XSSFCell cell = row.createCell(c);
				Object value = newData[r][c];

				if (value instanceof String)
					cell.setCellValue((String) value);
				if (value instanceof Integer)
					cell.setCellValue((Integer) value);
				if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);
			}
		}

//		XSSFCell cell = sheet.getRow(2).getCell(1);
//		cell.setCellValue("UpdatedNew");

		String filePath = ".\\testData\\personalDetails.xlsx";
		FileOutputStream outputStream = new FileOutputStream(filePath);
		workbook.write(outputStream);

		outputStream.close();

		System.out.println("File created successfully");

	}
	
	

	public static void main(String[] args) throws Exception {
		
//		updateSpecificCell(2, 1);
		createNewFileWithData();

	}

}
