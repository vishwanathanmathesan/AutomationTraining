package com.testdrive.constants;

import java.io.File;

public class ConstantFilePaths {
	
	public final static String USER_HOME = System.getProperty("user.dir") + File.separator;
	
	public final static String TESTDATA_HOME = USER_HOME +"testData"+File.separator;
	public final static String TESTDATA_FILE = TESTDATA_HOME + "TestData.xlsx"; 
	
	public static void main(String[] args) {
		System.out.println("File Path is: "+ TESTDATA_FILE );
	}

}
