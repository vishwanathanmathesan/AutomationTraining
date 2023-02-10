package com.excelmanager.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelManager {

	public static void getAllDataByForLoop() throws Exception {

		FileInputStream fileInput = new FileInputStream(ConstantFilePaths.TESTDATA_FILE);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(1).getLastCellNum();

		System.out.println(rows);
		System.out.println(columns);

		for (int r = 0; r <= rows; r++) {

			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < columns; c++) {

				XSSFCell cell = row.getCell(c);

//				System.out.println(cell.getCellType());

				switch (cell.getCellType()) {
				case 1:
					System.out.print(cell.getStringCellValue());
					break;
				case 0:
					System.out.print(cell.getNumericCellValue());
					break;
				case 2:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print(" | ");

			}
			System.out.println();
		}

	}

	public static void getAllDataByIterator() throws Exception {

		FileInputStream fileInput = new FileInputStream(ConstantFilePaths.TESTDATA_FILE);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator rowIterator = sheet.iterator();

		while (rowIterator.hasNext()) {

			XSSFRow row = (XSSFRow) rowIterator.next();

			Iterator cellIterator = row.iterator();

			while (cellIterator.hasNext()) {

				XSSFCell cell = (XSSFCell) cellIterator.next();

				switch (cell.getCellType()) {
				case 1:
					System.out.print(cell.getStringCellValue());
					break;
				case 0:
					System.out.print(cell.getNumericCellValue());
					break;
				case 2:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print(" | ");

			}
			System.out.println();
		}

	}

	public static void readData() throws Exception {

		FileInputStream fileInput = new FileInputStream(ConstantFilePaths.TESTDATA_FILE);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(1).getLastCellNum();

		for (int r = 0; r <= rows; r++) {

			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < columns; c++) {

				XSSFCell cell = row.getCell(c);

				System.out.println(cell.getCellType());

				switch (cell.getCellType()) {
				case 1:
					System.out.print(cell.getStringCellValue());
					break;
				case 0:
					System.out.println("Date is here");
					double data= cell.getNumericCellValue();
					System.out.print(data);
					break;
				
				}
			}
		}

	}

	public static void main(String[] args) throws Exception {

		getAllDataByForLoop();
//		getAllDataByIterator();
		
//		readData();

	}

}
